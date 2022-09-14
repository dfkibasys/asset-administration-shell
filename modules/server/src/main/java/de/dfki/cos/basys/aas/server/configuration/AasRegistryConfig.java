package de.dfki.cos.basys.aas.server.configuration;

import org.eclipse.basyx.aas.registration.api.IAASRegistry;
import org.eclipse.basyx.aas.registration.proxy.AASRegistryProxy;
import org.eclipse.basyx.aas.registry.compatibility.DotAASRegistryProxy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import de.dfki.cos.basys.aas.server.util.RetryableAasRegistryDecorator;

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
           throw new IllegalRegistryTypeException(aasRegistryType);
        }
        return new RetryableAasRegistryDecorator(aasRegistry);
    }
    
    private static final class IllegalRegistryTypeException extends IllegalArgumentException {

		private static final long serialVersionUID = 1L;

		public IllegalRegistryTypeException(String aasRegistryType) {
			super("Illegal registry type " + aasRegistryType + "!");
		}
    }

}
