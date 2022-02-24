package de.dfki.cos.basys.aas.server.configuration;

import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.servlets.DefaultServlet;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.eclipse.basyx.aas.aggregator.AASAggregator;
import org.eclipse.basyx.aas.aggregator.api.IAASAggregator;
import org.eclipse.basyx.aas.aggregator.restapi.AASAggregatorProvider;
import org.eclipse.basyx.aas.metamodel.map.descriptor.AASDescriptor;
import org.eclipse.basyx.aas.registration.api.IAASRegistry;
import org.eclipse.basyx.aas.restapi.api.IAASAPIFactory;
import org.eclipse.basyx.aas.restapi.vab.VABAASAPIFactory;
import org.eclipse.basyx.components.aas.aasx.AASXPackageManager;
import org.eclipse.basyx.components.aas.aasx.SubmodelFileEndpointLoader;
import org.eclipse.basyx.components.aas.configuration.AASServerBackend;
import org.eclipse.basyx.components.aas.mqtt.MqttSubmodelAPIFactory;
import org.eclipse.basyx.components.aas.servlet.AASAggregatorServlet;
import org.eclipse.basyx.components.configuration.BaSyxConfiguration;
import org.eclipse.basyx.components.json.JSONAASBundleFactory;
import org.eclipse.basyx.components.xml.XMLAASBundleFactory;
import org.eclipse.basyx.submodel.metamodel.api.ISubmodel;
import org.eclipse.basyx.submodel.restapi.api.ISubmodelAPIFactory;
import org.eclipse.basyx.support.bundle.AASBundle;
import org.eclipse.basyx.support.bundle.AASBundleDescriptorFactory;
import org.eclipse.basyx.support.bundle.AASBundleHelper;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.xml.sax.SAXException;

import javax.servlet.http.HttpServlet;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

@Configuration
@Slf4j
public class AasBundleConfig {

    @Autowired
    private BaSyxContextConfiguration contextConfig;

    @Bean
    public Collection<AASBundle> aasBundles(@Value("${basys.aas-server.source}") String aasSource) {
        Collection<AASBundle> result = loadAASFromSource(aasSource);
        modifyFilePaths(result, contextConfig.getHostname(), contextConfig.getPort(), contextConfig.getContextPath());
        return result;
    }

    private Collection<AASBundle> loadAASFromSource(String aasSource) {
        if (aasSource == null || aasSource.isEmpty()) {
            return Collections.emptyList();
        }

        try {
            if (aasSource.endsWith(".aasx")) {
                return loadBundleFromAASX(aasSource);
            } else if (aasSource.endsWith(".json")) {
                return loadBundleFromJSON(aasSource);
            } else if (aasSource.endsWith(".xml")) {
                return loadBundleFromXML(aasSource);
            } else {
                return Collections.emptyList();
            }
        } catch (IOException | ParserConfigurationException | SAXException | URISyntaxException | InvalidFormatException e) {
            log.error("Could not load initial AAS from source '" + aasSource + "'");
            log.info("Starting empty server instead");
            return Collections.emptyList();
        }
    }

    private Collection<AASBundle> loadBundleFromXML(String xmlPath) throws IOException, ParserConfigurationException, SAXException {
        log.info("Loading aas from xml \"" + xmlPath + "\"");
        String xmlContent = loadBundleString(xmlPath);
        return new XMLAASBundleFactory(xmlContent).create();
    }

    private Collection<AASBundle> loadBundleFromJSON(String jsonPath) throws IOException {
        log.info("Loading aas from json \"" + jsonPath + "\"");
        String jsonContent = loadBundleString(jsonPath);
        return new JSONAASBundleFactory(jsonContent).create();
    }

    private Collection<AASBundle> loadBundleFromAASX(String aasxPath)
            throws IOException, ParserConfigurationException, SAXException, URISyntaxException, InvalidFormatException {
        log.info("Loading aas from aasx \"" + aasxPath + "\"");

        // Instantiate the aasx package manager
        AASXPackageManager packageManager = new AASXPackageManager(aasxPath);

        // Unpack the files referenced by the aas
        packageManager.unzipRelatedFiles();

        // Retrieve the aas from the package
        return packageManager.retrieveAASBundles();
    }

    private String loadBundleString(String filePath) throws IOException {
        String content;
        try {
            content = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            log.info("Could not find a corresponding file. Loading from default resource.");
            content = BaSyxConfiguration.getResourceString(filePath);
        }
        return content;
    }

    /**
     * Fixes the File submodel element value paths according to the given endpoint configuration
     */
    private void modifyFilePaths(Collection<AASBundle> aasBundles, String hostName, int port, String rootPath) {
        rootPath = rootPath + "/files";
        for (AASBundle bundle : aasBundles) {
            Set<ISubmodel> submodels = bundle.getSubmodels();
            for (ISubmodel sm : submodels) {
                SubmodelFileEndpointLoader.setRelativeFileEndpoints(sm, hostName, port, rootPath);
            }
        }
    }
}