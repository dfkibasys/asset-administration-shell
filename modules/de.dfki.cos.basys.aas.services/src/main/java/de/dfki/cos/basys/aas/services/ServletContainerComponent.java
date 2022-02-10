package de.dfki.cos.basys.aas.services;


import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.servlet.http.HttpServlet;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleEvent;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.LifecycleListener;
import org.apache.catalina.LifecycleState;
import org.apache.catalina.startup.Tomcat;
import org.eclipse.basyx.aas.metamodel.api.parts.asset.IAsset;
import org.eclipse.basyx.aas.metamodel.map.descriptor.AASDescriptor;
import org.eclipse.basyx.aas.metamodel.map.descriptor.SubmodelDescriptor;
import org.eclipse.basyx.submodel.metamodel.api.ISubmodel;
import org.eclipse.basyx.submodel.metamodel.api.identifier.IdentifierType;
import org.eclipse.basyx.submodel.metamodel.map.Submodel;
import org.eclipse.basyx.submodel.metamodel.map.identifier.Identifier;
import org.eclipse.basyx.submodel.restapi.SubmodelProvider;
import org.eclipse.basyx.vab.exception.provider.ProviderException;
import org.eclipse.basyx.vab.modelprovider.api.IModelProvider;

import com.google.common.eventbus.Subscribe;

import de.dfki.cos.basys.aas.component.AasComponentContext;
import de.dfki.cos.basys.aas.component.SubmodelComponent;
import de.dfki.cos.basys.common.component.Component;
import de.dfki.cos.basys.common.component.ComponentException;
import de.dfki.cos.basys.common.component.impl.BaseComponent;
import de.dfki.cos.basys.common.component.manager.impl.ComponentManagerEvent;
import de.dfki.cos.basys.common.component.manager.impl.ComponentManagerEvent.Type;

public class ServletContainerComponent extends BaseComponent {

	
	private Tomcat tomcat;	
	  
	private Map<String, HttpServlet> servletMapping = new HashMap<>();
	private Context rootCtx = null;
	private String accessibleEndpoint = null;
	/**
	 * Constructor
	 * 
	 * Create new Tomcat instance and add the provided servlet mappings
	 * 
	 * @param context
	 *            Basyx context with of url mappings to HTTPServlet
	 */
	public ServletContainerComponent(Properties config) {
		super(config);
				
		accessibleEndpoint = config.getProperty("accessibleEndpoint",getDefaultConfig().getProperty("accessibleEndpoint"));
		if (System.getenv("AAS_HOST_ACCESSIBLE_ENDPOINT") != null) {
			LOGGER.info("Using environment variable AAS_HOST_ACCESSIBLE_ENDPOINT");			
			accessibleEndpoint = System.getenv("AAS_HOST_ACCESSIBLE_ENDPOINT");			
		}
		LOGGER.info("advertisedEndpoint = " + accessibleEndpoint);
		
		// Instantiate and setup Tomcat server
		tomcat = new Tomcat();
		tomcat.setPort(Integer.parseInt(config.getProperty("port",getDefaultConfig().getProperty("port"))));
		tomcat.setHostname(config.getProperty("hostname",getDefaultConfig().getProperty("hostname")));
		tomcat.getHost().setAppBase(".");

		// Create servlet context
		//rootCtx = tomcat.addContext("", new File("").getAbsolutePath());
		rootCtx = tomcat.addContext(config.getProperty("path"), config.getProperty("docBasePath"));
	}

	@Override
	protected void doActivate() throws ComponentException {
		super.doActivate();
		    	
		Thread serverThread = new Thread(() -> {
			try {
				tomcat.stop();

				// Adds listener that notifies the tomcat object when the server has started
				tomcat.getServer().addLifecycleListener(new LifecycleListener() {
					@Override
					public void lifecycleEvent(LifecycleEvent event) {
						if (event.getLifecycle().getState() == LifecycleState.STARTED) {
							synchronized (tomcat) {
								tomcat.notifyAll();
							}
						}
					}
				});

				tomcat.start();
				
				// Keeps the server thread alive until the server is shut down
				tomcat.getServer().await();
			} catch (LifecycleException e) {
				LOGGER.error("Exception in doActivate", e);
			}
		});
		serverThread.start();

    	//ComponentContext.getStaticContext().getEventBus().register(this);	
		
		synchronized (tomcat) {
			try {
				tomcat.wait();
			} catch (InterruptedException e) {
				LOGGER.error("Exception in doActivate", e);
			}
		}
	}
	
	@Override
	protected void doDeactivate() throws ComponentException {
		//ComponentContext.getStaticContext().getEventBus().unregister(this);	
		
		try {
			tomcat.stop();
			tomcat.destroy();
		} catch (LifecycleException e) {
			LOGGER.error("Exception in doDeactivate", e);
		}
	}

	@Subscribe
	public void onComponentManagerEvent(ComponentManagerEvent ev) {		
		if (ev.getType() == Type.COMPONENT_ADDED) {
			Component component = ev.getComponent();
//			if (component instanceof AasComponent) {				
//				AasComponent aasComponent = (AasComponent)component;
//				AASDescriptor desc = aasComponent.getModelDescriptor(accessibleEndpoint);
//				HttpServlet servlet = new VABHTTPInterface<IModelProvider>(aasComponent.getModelProvider());
//				
//				// add new servlet and mapping to tomcat environment
//				Tomcat.addServlet(rootCtx, String.valueOf(servlet.hashCode()), servlet);				
//				rootCtx.addServletMappingDecoded("/" + desc.getIdShort() + "/*", String.valueOf(servlet.hashCode()));
//				
//				// register AAS
//				((AasComponentContext) context).getAasRegistry().register(desc);	
//			}
//			else 
			if (component instanceof SubmodelComponent) {
				SubmodelComponent smComponent = (SubmodelComponent)component;
				Identifier aasId = smComponent.getAasId();
				Submodel sm = smComponent.getSubmodel();

				hostSubmodel(aasId.getId(), sm);
								
			} 
		}
		else if (ev.getType() == Type.COMPONENT_DELETED) {		
			Component component = ev.getComponent();
//			if (component instanceof AasComponent) {	
//				AasComponent aasComponent = (AasComponent)component;
//				AASDescriptor desc = aasComponent.getModelDescriptor(accessibleEndpoint);				
//				
//				// remove servlet
//				rootCtx.removeServletMapping("/" + desc.getIdShort() + "/*");
//				
//				// unregister submodel
//				((AasComponentContext) context).getAasRegistry().delete(desc.getIdentifier());				
//			}			
//			else 
				if (component instanceof SubmodelComponent) {
				SubmodelComponent smComponent = (SubmodelComponent)component;
				Identifier aasId = smComponent.getAasId();
				Submodel sm = smComponent.getSubmodel();				
				
				deleteSubmodel(aasId.getId(), sm);
				
				
			}
		}
	}
	
	public void hostSubmodel(String aasId, Submodel sm)	{
		hostSubmodel(aasId, sm, 0);
	}
	
	public void hostSubmodel(String aasId, Submodel sm, int delayRegistration) {
		HttpServlet servlet = new VABHTTPCorsInterface<IModelProvider>(new SubmodelProvider(sm));
				
		// add new servlet and mapping to tomcat environment
		Tomcat.addServlet(rootCtx, String.valueOf(servlet.hashCode()), servlet);				
		rootCtx.addServletMappingDecoded("/" + sm.getIdShort() + "/*", String.valueOf(servlet.hashCode()));
		
		if (delayRegistration > 0) {				
			context.getScheduledExecutorService().schedule(new Runnable() {
				@Override
				public void run() {
					registerSubmodel(aasId, sm);					
				}
			}, delayRegistration, TimeUnit.MILLISECONDS);				
		} else {
			registerSubmodel(aasId, sm);
		}
	}
	
	public void registerSubmodel(String aasId, Submodel sm) {
		if (((AasComponentContext) context).getAasRegistry() == null) {
			LOGGER.info("registry is null, skip");
			return;
		}
		
		// try to delete old submodel first 
		try {
			((AasComponentContext) context).getAasRegistry().delete(new Identifier(IdentifierType.CUSTOM, aasId), sm.getIdentification());
		} catch (ProviderException e) {					
			//e.printStackTrace();
		}
		
		// register new submodel 
		try {
			SubmodelDescriptor smDescriptor =  new SubmodelDescriptor(sm, accessibleEndpoint + "/" + sm.getIdShort() + "/submodel");
			((AasComponentContext) context).getAasRegistry().register(new Identifier(IdentifierType.CUSTOM, aasId), smDescriptor);
		} catch (ProviderException e) {
			LOGGER.error("AAS with id " + aasId + " not registered");
			e.printStackTrace();
		}
	}
	
	public void deleteSubmodel(String aasId, Submodel sm) {
		
		// remove servlet
		rootCtx.removeServletMapping("/" + sm.getIdShort() + "/*");

		// unregister submodel
		((AasComponentContext) context).getAasRegistry().delete(new Identifier(IdentifierType.CUSTOM, aasId), sm.getIdentification());		
		
	}	
	
	public static Properties getDefaultConfig() {
    	Properties defaultConfig = new Properties();
        defaultConfig.setProperty("hostname", "localhost");
        defaultConfig.setProperty("port", "5081");
        defaultConfig.setProperty("path", "");
        defaultConfig.setProperty("docBasePath", "");
        defaultConfig.setProperty("accessibleEndpoint", "http://localhost:5081");
    	return defaultConfig;
	}


}
