package de.dfki.cos.basys.aas.server.configuration;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "basys.aas-server.context")
public class BaSyxContextConfiguration {
    public String contextPath = org.eclipse.basyx.components.configuration.BaSyxContextConfiguration.DEFAULT_CONTEXTPATH;
    public String docBase = org.eclipse.basyx.components.configuration.BaSyxContextConfiguration.DEFAULT_DOCBASE;
    public String hostname = org.eclipse.basyx.components.configuration.BaSyxContextConfiguration.DEFAULT_HOSTNAME;
    public int port = org.eclipse.basyx.components.configuration.BaSyxContextConfiguration.DEFAULT_PORT;
    public boolean tlsEnabled = false;
    

    public org.eclipse.basyx.components.configuration.BaSyxContextConfiguration toLegacyConfig() {
        return new org.eclipse.basyx.components.configuration.BaSyxContextConfiguration(contextPath, docBase, hostname, port);
    }
}
