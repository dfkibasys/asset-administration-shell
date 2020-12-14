package de.dfki.cos.basys.aas.services;


import java.util.Properties;

import org.eclipse.basyx.aas.registration.api.IAASRegistryService;
import org.eclipse.basyx.aas.registration.memory.AASRegistry;
import org.eclipse.basyx.aas.registration.restapi.DirectoryModelProvider;
import org.eclipse.basyx.vab.protocol.http.server.AASHTTPServer;
import org.eclipse.basyx.vab.protocol.http.server.BaSyxContext;
import org.eclipse.basyx.vab.protocol.http.server.VABHTTPInterface;
import de.dfki.cos.basys.aas.registry.zookeeper.ZookeeperRegistryHandler;
import de.dfki.cos.basys.common.component.ComponentContext;
import de.dfki.cos.basys.common.component.ComponentException;
import de.dfki.cos.basys.common.component.ServiceProvider;
import de.dfki.cos.basys.common.component.impl.ServiceComponent;
import de.dfki.cos.basys.common.component.impl.ServiceManagerImpl;

public class AasRegistryComponent extends ServiceComponent<IAASRegistryService> {

	// The server with the servlet that will be created
	private AASHTTPServer server;
	private VABHTTPInterface<DirectoryModelProvider> servlet;
	private DirectoryModelProvider provider = null; 
	
	public AasRegistryComponent(Properties config) {
		super(config);
		
		ServiceProvider<IAASRegistryService> serviceProvider =  new ServiceProvider<IAASRegistryService>() {
			IAASRegistryService service = null;
			ZookeeperRegistryHandler handler = null;
			
			@Override
			public boolean isConnected() {
				return service != null;
			}
			
			@Override
			public IAASRegistryService getService() {				
				return service;
			}
			
			@Override
			public void disconnect() {
				if (handler != null)
					handler.disconnect();
				service = null;				
			}
			
			@Override
			public boolean connect(ComponentContext context, String connectionString) {
				handler = new ZookeeperRegistryHandler(connectionString);
				if (Boolean.parseBoolean(config.getProperty("cleanOnStartup"))) {
					handler.clean();
				}
				service = new AASRegistry(handler);
				return service != null;
			}
		};

		serviceManager = new ServiceManagerImpl<IAASRegistryService>(config, serviceProvider);	
	}

	@Override
	protected void doActivate() throws ComponentException {
		super.doActivate();
				
		provider = new DirectoryModelProvider(getService());		
		servlet = new VABHTTPCorsInterface<DirectoryModelProvider>(provider);
		
		BaSyxContext context = new BaSyxContext(config.getProperty("path"), config.getProperty("docBasePath"), config.getProperty("hostname"), Integer.parseInt(config.getProperty("port")));
		context.addServletMapping("/*", servlet);
		server = new AASHTTPServer(context);		

		LOGGER.info("Start the server...");
		server.start();		
	}
	
	@Override
	protected void doDeactivate() throws ComponentException {
		super.doDeactivate();
		
		LOGGER.info("Shutdown the server...");
		server.shutdown();
	}

	public static Properties getDefaultConfig() {
    	Properties defaultConfig = new Properties();
        defaultConfig.setProperty("hostname", "0.0.0.0");
        defaultConfig.setProperty("port", "4999");
        defaultConfig.setProperty("path", "");
        defaultConfig.setProperty("docBasePath", "");
        defaultConfig.setProperty("serviceConnectionString", "localhost:2181");
        defaultConfig.setProperty("cleanOnStartup", "false");
    	return defaultConfig;
	}


}
