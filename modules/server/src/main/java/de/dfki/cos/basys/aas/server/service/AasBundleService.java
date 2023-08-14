package de.dfki.cos.basys.aas.server.service;

import de.dfki.cos.basys.aas.server.configuration.BaSyxContextConfiguration;
import de.dfki.cos.basys.aas.server.util.SubmodelFileEndpointLoader;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.filefilter.SuffixFileFilter;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.eclipse.basyx.aas.factory.aasx.AASXToMetamodelConverter;
import org.eclipse.basyx.aas.factory.aasx.FileLoaderHelper;
import org.eclipse.basyx.aas.factory.json.JSONAASBundleFactory;
import org.eclipse.basyx.aas.factory.xml.XMLAASBundleFactory;
import org.eclipse.basyx.components.aas.aasx.AASXPackageManager;
import org.eclipse.basyx.components.configuration.BaSyxConfiguration;
import org.eclipse.basyx.submodel.metamodel.api.ISubmodel;
import org.eclipse.basyx.aas.bundle.AASBundle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

@Service
@Slf4j
public class AasBundleService {

    @Value("${basys.aas-server.unzip-folder:#{null}}")
    Optional<String> unzipFolder;

    public Set<AASBundle> loadAASFromSource(String aasSource) {
        if (aasSource == null || aasSource.isEmpty()) {
            return Collections.emptySet();
        }

        try {
            if (aasSource.endsWith(".aasx")) {
                return loadBundleFromAASX(aasSource);
            } else if (aasSource.endsWith(".json")) {
                return loadBundleFromJSON(aasSource);
            } else if (aasSource.endsWith(".xml")) {
                return loadBundleFromXML(aasSource);
            } else {
                return Collections.emptySet();
            }
        } catch (IOException | ParserConfigurationException | SAXException | URISyntaxException | InvalidFormatException e) {
            log.error("Could not load initial AAS from source '" + aasSource + "'");
            log.info("Starting empty server instead");
            return Collections.emptySet();
        }
    }


    private Set<AASBundle> loadBundleFromXML(String xmlPath) throws IOException, ParserConfigurationException, SAXException {
        log.info("Loading aas from xml \"" + xmlPath + "\"");
        String xmlContent = loadBundleString(xmlPath);
        return new XMLAASBundleFactory(xmlContent).create();
    }

    private Set<AASBundle> loadBundleFromJSON(String jsonPath) throws IOException {
        log.info("Loading aas from json \"" + jsonPath + "\"");
        String jsonContent = loadBundleString(jsonPath);
        return new JSONAASBundleFactory(jsonContent).create();
    }

    private Set<AASBundle> loadBundleFromAASX(String aasxPath) throws IOException, ParserConfigurationException, SAXException, InvalidFormatException, URISyntaxException {
        log.info("Loading aas from aasx \"" + aasxPath + "\"");

        // Instantiate the aasx package manager
        AASXToMetamodelConverter packageManager = new AASXPackageManager(aasxPath);

        // Unpack the files referenced by the aas
        Path targetPath =  Path.of(aasxPath).getParent();
        if (unzipFolder.isPresent()) {
            targetPath = Path.of(unzipFolder.get());
        }
        packageManager.unzipRelatedFiles(targetPath);

        // Retrieve the aas from the package
        return packageManager.retrieveAASBundles();
    }

    private String loadBundleString(String filePath) throws IOException {
        String content;
        try {
            content = IOUtils.toString(FileLoaderHelper.getInputStream(filePath), StandardCharsets.UTF_8.name());
        } catch (IOException e) {
            log.info("Could not find a corresponding file. Loading from default resource.");
            content = BaSyxConfiguration.getResourceString(filePath);
        }
        return content;
    }

}
