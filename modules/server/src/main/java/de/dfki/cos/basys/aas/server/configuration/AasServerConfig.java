package de.dfki.cos.basys.aas.server.configuration;

import de.dfki.cos.basys.aas.server.util.AASAggregatorServlet;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.servlets.DefaultServlet;
import org.eclipse.basyx.aas.aggregator.AASAggregator;
import org.eclipse.basyx.aas.aggregator.api.IAASAggregator;
import org.eclipse.basyx.aas.aggregator.restapi.AASAggregatorProvider;
import org.eclipse.basyx.aas.metamodel.map.descriptor.AASDescriptor;
import org.eclipse.basyx.aas.metamodel.map.descriptor.SubmodelDescriptor;
import org.eclipse.basyx.aas.registration.api.IAASRegistry;
import org.eclipse.basyx.aas.restapi.api.IAASAPIFactory;
import org.eclipse.basyx.aas.restapi.vab.VABAASAPIFactory;
import org.eclipse.basyx.components.aas.configuration.AASServerBackend;
import org.eclipse.basyx.components.aas.mongodb.MongoDBAASAggregator;
import org.eclipse.basyx.components.aas.mqtt.MqttSubmodelAPIFactory;
import org.eclipse.basyx.components.configuration.BaSyxMongoDBConfiguration;
import org.eclipse.basyx.submodel.restapi.api.ISubmodelAPIFactory;
import org.eclipse.basyx.support.bundle.AASBundle;
import org.eclipse.basyx.support.bundle.AASBundleDescriptorFactory;
import org.eclipse.basyx.support.bundle.AASBundleHelper;
import org.eclipse.basyx.vab.modelprovider.VABPathTools;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.http.HttpServlet;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

@Configuration
@Slf4j
public class AasServerConfig implements DisposableBean {

    @Autowired
    private BaSyxContextConfiguration contextConfig;

    @Autowired(required = false)
    private BaSyxMqttConfiguration mqttConfig;

    @Autowired(required = false)
    private BaSyxMongoDBConfiguration mongoDBConfig;

    @Autowired
    private IAASRegistry aasRegistry;

    @Autowired
    private Collection<AASBundle> aasBundles;

    @Bean
    public ServletRegistrationBean aasAggregatorServlet(IAASAggregator aasAggregator, Collection<AASBundle> aasBundles) {

        AASBundleHelper.integrate(aasAggregator, aasBundles);

        Set<AASDescriptor> descriptors = retrieveDescriptors(aasBundles, contextConfig.toLegacyConfig().getUrl());
        descriptors.stream().forEach(aasRegistry::register);

        HttpServlet servlet = new AASAggregatorServlet(aasAggregator);
        ServletRegistrationBean bean = new ServletRegistrationBean(servlet, "/shells/*");
        bean.setName("aasAggregatorServlet"); // important to avoid overriding, see https://stackoverflow.com/questions/30670327/spring-boot-with-multiple-dispatcherservlet-each-having-their-own-controllers/30686733
        bean.setLoadOnStartup(1);
        return bean;
    }

   /**
     * Loads an aas aggregator with a backend according to the configuration
     *
     * @return
     */
    @Bean
    public IAASAggregator aasAggregator(@Value("${basys.aas-server.backend}") String aasServerBackendType) {
        // Get aggregator according to backend config

        AASServerBackend backendType = AASServerBackend.fromString(aasServerBackendType);
        IAASAggregator aggregator = null;
        if (backendType == AASServerBackend.INMEMORY && !mqttConfig.isEnabled()) {
            log.info("Using InMemory backend");
            aggregator = new AASAggregator(aasRegistry);
        } else if (backendType == AASServerBackend.INMEMORY && mqttConfig.isEnabled()) {
            log.info("Using InMemory backend with MQTT providers");
            IAASAPIFactory aasApiProvider = new VABAASAPIFactory();
            ISubmodelAPIFactory smApiProvider = new MqttSubmodelAPIFactory(mqttConfig.toLegacyConfig());
            aggregator = new AASAggregator(aasApiProvider, smApiProvider, aasRegistry);
        }
//        else if ( backendType == AASServerBackend.MONGODB ) {
//            log.info("Using MongoDB backend");
//            aggregator = loadMongoDBAggregator();
//        }

        return aggregator;
    }

    private IAASAggregator loadMongoDBAggregator() {
        BaSyxMongoDBConfiguration config;
        if (this.mongoDBConfig == null) {
            config = new BaSyxMongoDBConfiguration();
            config.loadFromDefaultSource();
        } else {
            config = this.mongoDBConfig;
        }
        MongoDBAASAggregator aggregator = new MongoDBAASAggregator(config, aasRegistry);
        return aggregator;
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

    @Override
    public void destroy() throws Exception {
        AASBundleHelper.deregister(aasRegistry, aasBundles);
    }
}
