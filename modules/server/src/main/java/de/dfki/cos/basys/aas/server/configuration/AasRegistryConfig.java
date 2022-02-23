package de.dfki.cos.basys.aas.server.configuration;

import org.eclipse.basyx.aas.registration.api.IAASRegistry;
import org.eclipse.basyx.aas.registration.proxy.AASRegistryProxy;
import org.eclipse.basyx.aas.registry.compatibility.DotAASRegistryProxy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

@Configuration
public class AasRegistryConfig {

    @Value("${basys.aas-registry.type:basyx}")
    private String aasRegistryType;

    @Value("${basys.aas-registry.service.connectionString:http://localhost:4000}")
    private String arServiceConnectionString;

    @Bean
    public IAASRegistry aasRegistry() {
        IAASRegistry aasRegistry = null;
        if ("dotaas".equals(aasRegistryType)) {
            aasRegistry = new DotAASRegistryProxy(arServiceConnectionString);
        } else if ("basyx".equals(aasRegistryType)) {
            aasRegistry = new AASRegistryProxy(arServiceConnectionString);
        } else { // defaulting to none
            //FIXME: returning null lets the bean creation fail!
        }
        return aasRegistry;
    }

}
