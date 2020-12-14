package de.dfki.cos.basys.aas.services;


import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.servlet.http.HttpServlet;

import org.eclipse.basyx.aas.aggregator.AASAggregator;
import org.eclipse.basyx.aas.aggregator.restapi.AASAggregatorProvider;
import org.eclipse.basyx.aas.manager.ConnectedAssetAdministrationShellManager;
import org.eclipse.basyx.aas.metamodel.api.IAssetAdministrationShell;
import org.eclipse.basyx.aas.metamodel.map.descriptor.AASDescriptor;
import org.eclipse.basyx.aas.metamodel.map.descriptor.SubmodelDescriptor;
import org.eclipse.basyx.submodel.metamodel.map.SubModel;
import org.eclipse.basyx.vab.modelprovider.api.IModelProvider;
import org.eclipse.basyx.vab.protocol.http.server.AASHTTPServer;
import org.eclipse.basyx.vab.protocol.http.server.BaSyxContext;
import org.eclipse.basyx.vab.protocol.http.server.VABHTTPInterface;

import com.google.common.eventbus.Subscribe;

import de.dfki.cos.basys.aas.component.AasComponent;
import de.dfki.cos.basys.aas.component.AasComponentContext;
import de.dfki.cos.basys.aas.component.SubmodelComponent;
import de.dfki.cos.basys.common.component.Component;
import de.dfki.cos.basys.common.component.ComponentContext;
import de.dfki.cos.basys.common.component.ComponentException;
import de.dfki.cos.basys.common.component.ServiceProvider;
import de.dfki.cos.basys.common.component.impl.ServiceComponent;
import de.dfki.cos.basys.common.component.impl.ServiceManagerImpl;
import de.dfki.cos.basys.common.component.manager.impl.ComponentManagerEvent;
import de.dfki.cos.basys.common.component.manager.impl.ComponentManagerEvent.Type;

public class AasAggregatorComponent extends ServiceComponent<AASAggregator> {

	// The server with the servlet that will be created
	private AASHTTPServer server;
	private VABHTTPInterface<AASAggregatorProvider> servlet;
	private AASAggregatorProvider provider = null; 

	private String accessibleEndpoint = null;
	
	public AasAggregatorComponent(Properties config) {
		super(config);

		accessibleEndpoint = config.getProperty("accessibleEndpoint",getDefaultConfig().getProperty("accessibleEndpoint"));
		if (System.getenv("AAS_AGGREGATOR_ACCESSIBLE_ENDPOINT") != null) {
			LOGGER.info("Using environment variable AAS_AGGREGATOR_ACCESSIBLE_ENDPOINT");			
			accessibleEndpoint = System.getenv("AAS_AGGREGATOR_ACCESSIBLE_ENDPOINT");			
		}
		accessibleEndpoint += "/aasList";
		LOGGER.info("advertisedEndpoint = " + accessibleEndpoint);
		
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
		servlet = new VABHTTPCorsInterface<AASAggregatorProvider>(provider);
		
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


	@Subscribe
	public void onComponentManagerEvent(ComponentManagerEvent ev) {		
		if (ev.getType() == Type.COMPONENT_ADDED) {
			Component component = ev.getComponent();
			if (component instanceof AasComponent) {				
				AasComponent aasComponent = (AasComponent)component;
				
				getService().createAAS(aasComponent.getAas());				
				
				// register AAS
				AASDescriptor desc = aasComponent.getModelDescriptor(accessibleEndpoint);
				((AasComponentContext) context).getAasRegistry().register(desc);	
			}
			
//			else if (component instanceof SubmodelComponent) {
//				SubmodelComponent smComponent = (SubmodelComponent)component;
//				SubmodelDescriptor desc = smComponent.getModelDescriptor(accessibleEndpoint);
//				
//				IAssetAdministrationShell aas = getService().getAAS(smComponent.getAasId());
//				aas.addSubModel(smComponent.getSubmodel());
//				
//				
//				// Create a ConnectedAASManager with the registry created above
//				ConnectedAssetAdministrationShellManager aasManager = new ConnectedAssetAdministrationShellManager(((AasComponentContext) context).getAasRegistry());
//				
//				
//				// Push the AAS to the cloud server
//				// The manager automatically registers it in the registry
//				aasManager.createAAS(ComponentBuilder.getAAS(), aasIdentifier, "http://localhost:8081/cloud");
//				
//				
//				// Get the docuSubmodel from the ComponentBuilder
//				SubModel docuSubmodel = ComponentBuilder.getDocuSM();
//				
//				// Push the docuSubmodel to the cloud
//				// The manager automatically registers it in the registry
//				aasManager.createSubModel(aasIdentifier, docuSubmodel);
//				
//				
//				
//				getService().updateAAS(aas);
//				
//				HttpServlet servlet = new VABHTTPInterface<IModelProvider>(smComponent.getModelProvider());
//				
//				// add new servlet and mapping to tomcat environment
//				Tomcat.addServlet(rootCtx, String.valueOf(servlet.hashCode()), servlet);				
//				rootCtx.addServletMappingDecoded("/" + desc.getIdShort() + "/*", String.valueOf(servlet.hashCode()));
//
//				// register submodel
//				((AasComponentContext) context).getAasRegistry().register(smComponent.getAasId(), desc);
//			}
		}
		else if (ev.getType() == Type.COMPONENT_DELETED) {		
			Component component = ev.getComponent();
			if (component instanceof AasComponent) {	
				AasComponent aasComponent = (AasComponent)component;
				
				getService().deleteAAS(aasComponent.getAas().getIdentification());
				
				// unregister submodel
				AASDescriptor desc = aasComponent.getModelDescriptor(accessibleEndpoint);
				((AasComponentContext) context).getAasRegistry().delete(desc.getIdentifier());				
			}	
//			else if (component instanceof SubmodelComponent) {
//				SubmodelComponent smComponent = (SubmodelComponent)component;
//				SubmodelDescriptor desc = smComponent.getModelDescriptor(accessibleEndpoint);
//				
//				// remove servlet
//				rootCtx.removeServletMapping("/" + desc.getIdShort() + "/*");
//
//				// unregister submodel
//				((AasComponentContext) context).getAasRegistry().delete(smComponent.getAasId(), desc.getIdentifier());		
//				
//			}
		}
	}
	
	public static Properties getDefaultConfig() {
    	Properties defaultConfig = new Properties();
        defaultConfig.setProperty("hostname", "0.0.0.0");
        defaultConfig.setProperty("port", "5080");
        defaultConfig.setProperty("path", "");
        defaultConfig.setProperty("docBasePath", "");
        defaultConfig.setProperty("accessibleEndpoint", "http://localhost:5080");
    	return defaultConfig;
	}


}
