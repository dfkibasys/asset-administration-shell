package de.dfki.cos.basys.aas.server.configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.util.Strings;
import org.eclipse.basyx.vab.modelprovider.VABPathTools;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "basys.aas-server.context")
public class BaSyxContextConfiguration {
    
    private String contextPath = org.eclipse.basyx.components.configuration.BaSyxContextConfiguration.DEFAULT_CONTEXTPATH;
    private String docBase = org.eclipse.basyx.components.configuration.BaSyxContextConfiguration.DEFAULT_DOCBASE;
    private String hostname = org.eclipse.basyx.components.configuration.BaSyxContextConfiguration.DEFAULT_HOSTNAME;
    private int port = org.eclipse.basyx.components.configuration.BaSyxContextConfiguration.DEFAULT_PORT;
    private String protocol = "http";
    private List<ServerLocation> extraLocations = List.of();

    public org.eclipse.basyx.components.configuration.BaSyxContextConfiguration toLegacyConfig() {
        return new org.eclipse.basyx.components.configuration.BaSyxContextConfiguration(contextPath, docBase, hostname,
                port);
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static class ServerLocation {
        private String contextPath = org.eclipse.basyx.components.configuration.BaSyxContextConfiguration.DEFAULT_CONTEXTPATH;
        private String hostname = org.eclipse.basyx.components.configuration.BaSyxContextConfiguration.DEFAULT_HOSTNAME;
        private int port = org.eclipse.basyx.components.configuration.BaSyxContextConfiguration.DEFAULT_PORT;
        private String protocol = "http";
        

        public String getUrl() {
            String url = protocol + "://" + hostname + ":" + port;
            if (Strings.isNotEmpty(contextPath)) {
                if (contextPath.startsWith("/")) {
                    return url + contextPath;
                } else {
                    return url + "/" + contextPath;
                }
            }
            return url;
        }
    }

    public List<ServerLocation> getAllLocations() {
        ArrayList<ServerLocation> locations = new ArrayList<>(extraLocations.size() + 1);
        locations.add(new ServerLocation(contextPath, hostname, port, protocol));
        locations.addAll(extraLocations);
        return locations;
    }
}