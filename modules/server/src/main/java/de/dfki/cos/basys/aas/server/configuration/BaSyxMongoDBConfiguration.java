package de.dfki.cos.basys.aas.server.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "basys.aas-server.mongodb")
public class BaSyxMongoDBConfiguration {
    public boolean enabled = false;
    public String conmnectionurl = org.eclipse.basyx.components.configuration.BaSyxMongoDBConfiguration.DEFAULT_CONNECTIONURL;
    public String database = org.eclipse.basyx.components.configuration.BaSyxMongoDBConfiguration.DEFAULT_DATABASE;
    public String registryCollection = org.eclipse.basyx.components.configuration.BaSyxMongoDBConfiguration.DEFAULT_REGISTRY_COLLECTION;
    public String aasCollection = org.eclipse.basyx.components.configuration.BaSyxMongoDBConfiguration.DEFAULT_AAS_COLLECTION;
    public String submodelCollection = org.eclipse.basyx.components.configuration.BaSyxMongoDBConfiguration.DEFAULT_SUBMODEL_COLLECTION;

    public org.eclipse.basyx.components.configuration.BaSyxMongoDBConfiguration toLegacyConfig() {
        return new org.eclipse.basyx.components.configuration.BaSyxMongoDBConfiguration(conmnectionurl, database, registryCollection, aasCollection, submodelCollection);
    }
}
