package de.dfki.cos.basys.aas.services;


import java.util.Properties;

import org.eclipse.basyx.aas.aggregator.AASAggregator;
import org.eclipse.basyx.aas.aggregator.restapi.AASAggregatorProvider;
import org.eclipse.basyx.vab.protocol.http.server.AASHTTPServer;
import org.eclipse.basyx.vab.protocol.http.server.BaSyxContext;
import org.eclipse.basyx.vab.protocol.http.server.VABHTTPInterface;
import de.dfki.cos.basys.common.component.ComponentContext;
import de.dfki.cos.basys.common.component.ComponentException;
import de.dfki.cos.basys.common.component.ServiceProvider;
import de.dfki.cos.basys.common.component.impl.ServiceComponent;
import de.dfki.cos.basys.common.component.impl.ServiceManagerImpl;

public class AasAggregatorComponent extends ServiceComponent<AASAggregator> {

	// The server with the servlet that will be created
	private AASHTTPServer server;
	private VABHTTPInterface<AASAggregatorProvider> servlet;
	private AASAggregatorProvider provider = null; 
	
	public AasAggregatorComponent(Properties config) {
		super(config);

		ServiceProvider<AASAggregator> serviceProvider =  new ServiceProvider<AASAggregator>() {
			AASAggregator service = null;
			
			@Override
			public boolean isConnected() {
				return service != null;
			}
			
			@Override
			public AASAggregator getService() {				
				return service;
			}
			
			@Override
			public void disconnect() {
				service = null;				
			}
			
			@Override
			public boolean connect(ComponentContext context, String connectionString) {
				service = new AASAggregator();
				return service != null;
			}
		};

		serviceManager = new ServiceManagerImpl<AASAggregator>(config, serviceProvider);	
	}

	@Override
	protected void doActivate() throws ComponentException {
		super.doActivate();
		
		provider = new AASAggregatorProvider(getService());		
		servlet = new VABHTTPInterface<AASAggregatorProvider>(provider);
		
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
        defaultConfig.setProperty("port", "5080");
        defaultConfig.setProperty("path", "");
        defaultConfig.setProperty("docBasePath", "");
    	return defaultConfig;
	}


}
