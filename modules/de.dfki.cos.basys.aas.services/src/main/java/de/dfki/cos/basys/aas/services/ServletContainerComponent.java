package de.dfki.cos.basys.aas.services;


import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import javax.servlet.Servlet;
import javax.servlet.http.HttpServlet;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleEvent;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.LifecycleListener;
import org.apache.catalina.LifecycleState;
import org.apache.catalina.Wrapper;
import org.apache.catalina.startup.Tomcat;
import org.eclipse.basyx.aas.metamodel.api.IAssetAdministrationShell;
import org.eclipse.basyx.aas.metamodel.map.AssetAdministrationShell;
import org.eclipse.basyx.aas.metamodel.map.descriptor.AASDescriptor;
import org.eclipse.basyx.aas.metamodel.map.descriptor.ModelUrn;
import org.eclipse.basyx.aas.metamodel.map.descriptor.SubmodelDescriptor;
import org.eclipse.basyx.aas.restapi.AASModelProvider;
import org.eclipse.basyx.submodel.metamodel.api.ISubModel;
import org.eclipse.basyx.submodel.metamodel.map.SubModel;
import org.eclipse.basyx.submodel.restapi.SubModelProvider;
import org.eclipse.basyx.vab.modelprovider.api.IModelProvider;
import org.eclipse.basyx.vab.protocol.http.server.AASHTTPServer;
import org.eclipse.basyx.vab.protocol.http.server.BaSyxContext;
import org.eclipse.basyx.vab.protocol.http.server.VABHTTPInterface;
import org.eclipse.milo.opcua.sdk.server.AbstractLifecycle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.eventbus.Subscribe;

import de.dfki.cos.basys.aas.component.AasComponent;
import de.dfki.cos.basys.aas.component.AasComponentContext;
import de.dfki.cos.basys.aas.component.SubmodelComponent;
import de.dfki.cos.basys.aas.component.impl.BaseAasComponent;
import de.dfki.cos.basys.common.component.Component;
import de.dfki.cos.basys.common.component.ComponentContext;
import de.dfki.cos.basys.common.component.ComponentException;
import de.dfki.cos.basys.common.component.impl.BaseComponent;
import de.dfki.cos.basys.common.component.manager.impl.ComponentManagerEvent;
import de.dfki.cos.basys.common.component.manager.impl.ComponentManagerEvent.Type;

public class ServletContainerComponent extends BaseComponent {

	
	private Tomcat tomcat;	
	  
	private Map<String, HttpServlet> servletMapping = new HashMap<>();
	private Context rootCtx = null;
	private String advertisedEndpoint = "http://localhost:5081";
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
			if (component instanceof AasComponent) {				
				AasComponent aasComponent = (AasComponent)component;
				AASDescriptor desc = aasComponent.getModelDescriptor(advertisedEndpoint);
				HttpServlet servlet = new VABHTTPInterface<IModelProvider>(aasComponent.getModelProvider());
				
				// add new servlet and mapping to tomcat environment
				Tomcat.addServlet(rootCtx, String.valueOf(servlet.hashCode()), servlet);				
				rootCtx.addServletMappingDecoded("/" + desc.getIdShort() + "/*", String.valueOf(servlet.hashCode()));
				
				// register AAS
				((AasComponentContext) context).getAasRegistry().register(desc);	
			}
			else if (component instanceof SubmodelComponent) {
				SubmodelComponent smComponent = (SubmodelComponent)component;
				SubmodelDescriptor desc = smComponent.getModelDescriptor(advertisedEndpoint);
				HttpServlet servlet = new VABHTTPInterface<IModelProvider>(smComponent.getModelProvider());
				
				// add new servlet and mapping to tomcat environment
				Tomcat.addServlet(rootCtx, String.valueOf(servlet.hashCode()), servlet);				
				rootCtx.addServletMappingDecoded("/" + desc.getIdShort() + "/*", String.valueOf(servlet.hashCode()));

				// register submodel
				((AasComponentContext) context).getAasRegistry().register(smComponent.getAasId(), desc);
			} 
		}
		else if (ev.getType() == Type.COMPONENT_DELETED) {		
			Component component = ev.getComponent();
			if (component instanceof AasComponent) {	
				AasComponent aasComponent = (AasComponent)component;
				AASDescriptor desc = aasComponent.getModelDescriptor(advertisedEndpoint);				
				
				// remove servlet
				rootCtx.removeServletMapping("/" + desc.getIdShort() + "/*");
				
				// unregister submodel
				((AasComponentContext) context).getAasRegistry().delete(desc.getIdentifier());				
			}			
			else if (component instanceof SubmodelComponent) {
				SubmodelComponent smComponent = (SubmodelComponent)component;
				SubmodelDescriptor desc = smComponent.getModelDescriptor(advertisedEndpoint);
				
				// remove servlet
				rootCtx.removeServletMapping("/" + desc.getIdShort() + "/*");

				// unregister submodel
				((AasComponentContext) context).getAasRegistry().delete(smComponent.getAasId(), desc.getIdentifier());		
				
			}
		}
	}
	
	public static Properties getDefaultConfig() {
    	Properties defaultConfig = new Properties();
        defaultConfig.setProperty("hostname", "0.0.0.0");
        defaultConfig.setProperty("port", "5081");
        defaultConfig.setProperty("path", "");
        defaultConfig.setProperty("docBasePath", "");
    	return defaultConfig;
	}


}
