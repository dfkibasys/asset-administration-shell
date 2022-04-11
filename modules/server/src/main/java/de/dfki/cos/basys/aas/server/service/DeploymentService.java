package de.dfki.cos.basys.aas.server.service;

import de.dfki.cos.basys.aas.server.configuration.BaSyxContextConfiguration;
import de.dfki.cos.basys.aas.server.util.SubmodelFileEndpointLoader;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.filefilter.SuffixFileFilter;
import org.eclipse.basyx.aas.aggregator.api.IAASAggregator;
import org.eclipse.basyx.aas.aggregator.restapi.AASAggregatorProvider;
import org.eclipse.basyx.aas.metamodel.map.descriptor.AASDescriptor;
import org.eclipse.basyx.aas.metamodel.map.descriptor.SubmodelDescriptor;
import org.eclipse.basyx.aas.registration.api.IAASRegistry;
import org.eclipse.basyx.submodel.metamodel.api.ISubmodel;
import org.eclipse.basyx.submodel.metamodel.api.identifier.IdentifierType;
import org.eclipse.basyx.submodel.metamodel.map.identifier.Identifier;
import org.eclipse.basyx.support.bundle.AASBundle;
import org.eclipse.basyx.support.bundle.AASBundleHelper;
import org.eclipse.basyx.vab.modelprovider.VABPathTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.availability.ReadinessState;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class DeploymentService {

    @Autowired
    private BaSyxContextConfiguration context;

    @Value("${basys.aas-server.source}")
    private String sourcePath;

    @Value("${basys.aas-server.file-suffixes}")
    private String fileSuffixes;

    @Value("${basys.aas-server.recursive}")
    private boolean recursive;

    @Value("${basys.aas-server.watch:false}")
    private boolean watch;

    @Autowired
    private IAASRegistry aasRegistry;

    @Autowired
    private AasBundleService aasBundleService;

    @Autowired
    private IAASAggregator aasAggregator;

    private WatchService watchService = null;

    private Map<String,List<String>> fileToIdMap = new HashMap<>();

    @Async()
    public void recreateDeployments() {
        log.info("recreateDeployments");
        clearDeployments();
        for (String filePath : getFilePaths()) {
            createDeployment(filePath);
        }
    }

    @Async()
    public void startMonitoring() {
        log.info("startMonitoring");
        if (!watch) return;
        watchService = createWatchService();
        Path path = Paths.get(sourcePath);
        try {
            WatchKey key;
            while ((key = watchService.take()) != null) {
                for (WatchEvent<?> ev : key.pollEvents()) {
                    log.debug("Event kind: {}; File affected: {}", ev.kind(), ev.context());
                    Path name = (Path) ev.context();
                    Path filePath = path.resolve(name);
                    if (Files.isDirectory(filePath)) {
                        log.debug(ev.kind() + " -> " + filePath.toString() + " <dir>");
                    } else {
                        log.debug(ev.kind() + " -> " + filePath.toString() + " <file>");
                        if (ev.kind() == StandardWatchEventKinds.ENTRY_CREATE) {
                            createDeployment(filePath.toString());
                        }
                        else if (ev.kind() == StandardWatchEventKinds.ENTRY_DELETE) {
                            deleteDeployment(filePath.toString());
                        }
                        else if (ev.kind() == StandardWatchEventKinds.ENTRY_MODIFY) {
                            deleteDeployment(filePath.toString());
                            createDeployment(filePath.toString());
                        }
                        else {
                            //unknown
                        }

                    }
                }
                boolean valid = key.reset();
                if (!valid) {
                    break;
                }
            }
        } catch (InterruptedException e) {
            log.warn("interrupted exception for monitoring service");
        }
    }

    @PreDestroy
    public void unregisterAndStopMonitoring() {
        log.info("unregisterAndStopMonitoring");

        fileToIdMap.values().stream()
                .flatMap(List::stream).
                forEach(id -> aasRegistry.delete(new Identifier(IdentifierType.CUSTOM, id)));

        if (watchService != null) {
            try {
                watchService.close();
            } catch (IOException e) {
                log.error("exception while closing the monitoring service");
            }
        }
    }

    public List<String> getFilePaths() {

        if (Files.isRegularFile(Paths.get(sourcePath))) {
            //don't watch a single file -> override config property
            watch = false;
            return Collections.singletonList(sourcePath);
        }

        String[] suffixes = fileSuffixes.split(" ");
        FileFilter filter = new SuffixFileFilter(suffixes);

        List<String> paths = new LinkedList<String>();

        int depth = 1;
        if (recursive)
            depth = Integer.MAX_VALUE;

        try {
            Files.find(Paths.get(sourcePath), depth, (filePath, fileAttr) -> filter.accept(filePath.toFile())).map(p -> p.toString()).forEach(paths::add);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return paths;
    }

    public void createDeployment(String filePath) {
        log.info("createDeployment {}", filePath);

        List<String> ids = new ArrayList<>();

        var bundles = aasBundleService.loadAASFromSource(filePath);
        modifyFilePaths(bundles, context.getHostname(), context.getPort(), context.getContextPath());

        bundles.stream().forEach(aasBundle -> ids.add(aasBundle.getAAS().getIdentification().getId()));
        fileToIdMap.put(filePath, ids);

        AASBundleHelper.integrate(aasAggregator, bundles);

        Set<AASDescriptor> descriptors = retrieveDescriptors(bundles, context.toLegacyConfig().getUrl());
        descriptors.stream().forEach(aasRegistry::register);

    }

    public void deleteDeployment(String filePath) {
        log.info("deleteDeployment {}", filePath);

        List<String> ids = fileToIdMap.remove(filePath);
        if (ids != null) {
            ids.stream().forEach(id -> {
                var identifier = new Identifier(IdentifierType.CUSTOM,id);
                aasAggregator.deleteAAS(identifier);
                aasRegistry.delete(identifier);
            });
        }
    }

    public void clearDeployments() {
        log.info("clearDeployments");
    }


    public WatchService createWatchService() {
        log.debug("watch folder: {}", sourcePath);
        try {
            final WatchService watchService = FileSystems.getDefault().newWatchService();

            //don't configure if not needed.
            if (!watch) return watchService;

            Path path = Paths.get(sourcePath);

            log.info("watch folder: {}", path.toAbsolutePath());
            if (!Files.isDirectory(path)) {
                throw new RuntimeException("folder to watch is not a folder: " + path);
            }

            if (recursive) {
                Files.walkFileTree(path, new SimpleFileVisitor<Path>() {
                    @Override
                    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                        dir.register(
                                watchService,
                                StandardWatchEventKinds.ENTRY_DELETE,
                                StandardWatchEventKinds.ENTRY_MODIFY,
                                StandardWatchEventKinds.ENTRY_CREATE);
                        return FileVisitResult.CONTINUE;
                    }
                });
            } else {
                path.register(
                        watchService,
                        StandardWatchEventKinds.ENTRY_DELETE,
                        StandardWatchEventKinds.ENTRY_MODIFY,
                        StandardWatchEventKinds.ENTRY_CREATE
                );
            }
            return watchService;
        } catch (IOException e) {
            log.error("could not create watch service:", e);
        }
        return null;
    }


    /**
     * Fixes the File submodel element value paths according to the given endpoint configuration
     */
    private void modifyFilePaths(Collection<AASBundle> aasBundles, String hostName, int port, String rootPath) {
        //rootPath = rootPath + "/files";
        for (AASBundle bundle : aasBundles) {
            Set<ISubmodel> submodels = bundle.getSubmodels();
            for (ISubmodel sm : submodels) {
                SubmodelFileEndpointLoader.setRelativeFileEndpoints(sm, hostName, port, rootPath);
            }
        }
    }

    /**
     * Returns the set of AAS descriptors for the AAS contained in the AASX
     *
     * @param hostBasePath
     *                     the path to the server; helper method for e.g. virtualization
     *                     environments
     * @return
     */
    private Set<AASDescriptor> retrieveDescriptors(Collection<AASBundle> aasBundles, String hostBasePath) {
        // Base path + aggregator accessor
        final String fullBasePath = hostBasePath + "/" + AASAggregatorProvider.PREFIX;

        return aasBundles.stream().map(b -> createAASDescriptor(b, fullBasePath))
                .collect(Collectors.toSet());
    }

    public AASDescriptor createAASDescriptor(AASBundle bundle, String hostBasePath) {
        // Normalize hostBasePath to ensure consistent usage of /
        String nHostBasePath = VABPathTools.stripSlashes(hostBasePath);

        // Create AASDescriptor
        String endpointId = encodeId(bundle.getAAS().getIdentification().getId());
        //endpointId = VABPathTools.encodePathElement(endpointId);
        String aasBase = VABPathTools.concatenatePaths(nHostBasePath, endpointId, "aas");
        AASDescriptor desc = new AASDescriptor(bundle.getAAS(), aasBase);
        bundle.getSubmodels().stream().forEach(s -> {
            SubmodelDescriptor smDesc = new SubmodelDescriptor(s, VABPathTools.concatenatePaths(aasBase, "submodels", s.getIdShort(), "submodel"));
            desc.addSubmodelDescriptor(smDesc);
        });
        return desc;
    }

    private String encodeId(String id) {
        return Base64.getUrlEncoder().encodeToString(id.getBytes(StandardCharsets.UTF_8));
    }

}
