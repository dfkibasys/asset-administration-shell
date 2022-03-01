package de.dfki.cos.basys.aas.server.util;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import org.eclipse.basyx.submodel.metamodel.api.ISubmodel;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.ISubmodelElement;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.ISubmodelElementCollection;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.SubmodelElementCollection;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.dataelement.File;

/**
 * A utility class for configuring file endpoints in submodels
 *
 * @author espen
 *
 */
public class SubmodelFileEndpointLoader {
    /**
     * Sets all file and blob submodelElements inside of the submodel to an endpoint at a given host relative
     * to its original path.
     *
     * @param submodel
     * @param host     e.g. localhost
     * @param port     port for the host
     * @param path     path at which the files are hosted on the host (e.g. "/files")
     */
    public static void setRelativeFileEndpoints(ISubmodel submodel, String host, int port, String path) {
        String fileRoot = "http://" + host + ":" + port + path;
        setRelativeFileEndpoints(submodel, fileRoot);
    }

    /**
     * Sets all file and blob submodelElements inside of the submodel to an endpoint at a given host relative
     * to its original path.
     *
     * @param submodel
     * @param fileRoot the full root path for the files (e.g. "http://localhost:1234/myFiles")
     */
    public static void setRelativeFileEndpoints(ISubmodel submodel, String fileRoot) {
        Map<String, ISubmodelElement> elements = submodel.getSubmodelElements();
        setMapEndpoints(elements, fileRoot);
    }

    /**
     * Fixes endpoints in a Map of submodel elements (applicable for Submodels and SubmodelElementCollections)
     *
     * @param elements
     * @param fileRoot
     */
    private static void setMapEndpoints(Map<String, ISubmodelElement> elements, String fileRoot) {
        elements.values().stream().forEach(e -> {
            if (e instanceof File) {
                File file = (File) e;
                setFileEndpoint(file, fileRoot);
            } else if (e instanceof ISubmodelElementCollection) {
                SubmodelElementCollection col = (SubmodelElementCollection) e;
                setMapEndpoints(col.getSubmodelElements(), fileRoot);
            }
        });
    }

    /**
     * Modifies the file value endpoint in a single given file according to a new file root path
     *
     * @param file
     * @param fileRoot
     */
    private static void setFileEndpoint(File file, String fileRoot) {
        String fileValue = file.getValue();
        if (fileValue.startsWith("https://") || fileValue.startsWith("http://")) {
            return; // do nothing
        } else {
            String newEndpoint = fileRoot + fileValue;
            file.setValue(newEndpoint);
        }
//        try {
//            URL url = new URL(fileValue);
//            String relativePath = url.getPath();
//            String newEndpoint = fileRoot + relativePath;
//            file.setValue(newEndpoint);
//        } catch (MalformedURLException e) {
//            // assume that the file value is already a relative path
//            e.printStackTrace();
//        }

//        String relativePath = file.getValue();
//        URL url;
//        try {
//            url = new URL(file.getValue());
//            relativePath = url.getPath();
//        } catch (MalformedURLException e1) {
//            // assume that the file value is already a relative path
//        }
//        String newEndpoint = fileRoot + relativePath;
//        file.setValue(newEndpoint);

    }
}

