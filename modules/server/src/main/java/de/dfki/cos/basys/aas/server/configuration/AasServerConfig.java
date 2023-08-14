package de.dfki.cos.basys.aas.server.configuration;

import de.dfki.cos.basys.aas.server.util.AASAggregatorServlet;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.basyx.aas.aggregator.AASAggregator;
import org.eclipse.basyx.aas.aggregator.api.IAASAggregator;
import org.eclipse.basyx.aas.registration.api.IAASRegistry;
import org.eclipse.basyx.aas.restapi.api.IAASAPIFactory;
import org.eclipse.basyx.aas.restapi.vab.VABAASAPIFactory;
import org.eclipse.basyx.components.aas.configuration.AASServerBackend;
import org.eclipse.basyx.components.aas.mongodb.MongoDBAASAggregator;
import org.eclipse.basyx.components.aas.mqtt.MqttSubmodelAPIFactory;
import org.eclipse.basyx.components.configuration.BaSyxMongoDBConfiguration;
import org.eclipse.basyx.submodel.restapi.api.ISubmodelAPIFactory;
import org.eclipse.basyx.support.bundle.AASBundle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.http.HttpServlet;
import java.util.Collection;

@Configuration
@Slf4j
public class AasServerConfig {

    @Autowired(required = false)
    private BaSyxMqttConfiguration mqttConfig;

    @Autowired(required = false)
    private BaSyxMongoDBConfiguration mongoDBConfig;

    @Autowired
    private IAASRegistry aasRegistry;

    @Bean
    public ServletRegistrationBean aasAggregatorServlet(IAASAggregator aasAggregator, Collection<AASBundle> aasBundles) {

        //AASBundleHelper.integrate(aasAggregator, aasBundles);

        //Set<AASDescriptor> descriptors = retrieveDescriptors(aasBundles, contextConfig.toLegacyConfig().getUrl());
        //descriptors.stream().forEach(aasRegistry::register);

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

}
