package de.dfki.cos.basys.aas.knowledgegraph.configuration;

import org.eclipse.basyx.aas.manager.ConnectedAssetAdministrationShellManager;
import org.eclipse.basyx.aas.manager.api.IAssetAdministrationShellManager;
import org.eclipse.basyx.aas.registration.api.IAASRegistry;
import org.eclipse.basyx.aas.registration.proxy.AASRegistryProxy;
import org.eclipse.basyx.aas.registry.client.api.RegistryAndDiscoveryInterfaceApi;
import org.eclipse.basyx.aas.registry.compatibility.DotAASRegistryProxy;
import org.eclipse.basyx.vab.factory.java.ModelProxyFactory;
import org.eclipse.basyx.vab.protocol.api.IConnectorFactory;
import org.eclipse.basyx.vab.protocol.http.connector.HTTPConnectorFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AasConfig {

    @Value("${basys.aasRegistry.type:basyx}")
    private String aasRegistryType;

    @Value("${basys.aasRegistry.service.connectionString:http://localhost:4000}")
    private String arServiceConnectionString;

    @Bean
    public RegistryAndDiscoveryInterfaceApi registryApi() {
        RegistryAndDiscoveryInterfaceApi apiInstance = new RegistryAndDiscoveryInterfaceApi();
        apiInstance.getApiClient().setBasePath(arServiceConnectionString);
        return apiInstance;
    }

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

    @Bean
    public IConnectorFactory connectorFactory() { return new HTTPConnectorFactory(); }

    @Bean
    public ModelProxyFactory proxyFactory(IConnectorFactory connectorFactory) { return  new ModelProxyFactory(connectorFactory); }

    @Bean
    public IAssetAdministrationShellManager aasManager(IConnectorFactory connectorFactory) {
        return new ConnectedAssetAdministrationShellManager(aasRegistry(), connectorFactory);
    }


}
