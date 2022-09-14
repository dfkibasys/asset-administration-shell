package de.dfki.cos.basys.common.aas.registry.server;

import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;


import javax.ws.rs.ApplicationPath;

@ApplicationPath("/api/v1")
public class AasRegistryApplication extends ResourceConfig {
	
    public AasRegistryApplication() {
    	register(ZookeeperAasRegistry.class);
        register(new AbstractBinder() {
            @Override
            protected void configure() {
            	Object s = getConfiguration();
            	Object p = getProperties();
            	bind(new ZookeeperClient((String)getProperty("zookeeperConnectionString"))).to(ZookeeperClient.class);
            }
        });
    }
	
}
