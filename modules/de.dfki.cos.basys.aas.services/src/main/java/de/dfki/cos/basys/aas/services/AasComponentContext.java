package de.dfki.cos.basys.aas.services;

import org.eclipse.basyx.aas.registration.api.IAASRegistryService;

import de.dfki.cos.basys.common.component.ComponentContext;

public class AasComponentContext  extends ComponentContext {

	//protected ServletContainer servletContainer = null;
	protected IAASRegistryService aasRegistry = null;
	
	private static AasComponentContext staticContext = null;

	public static AasComponentContext getStaticContext() {
		if (staticContext == null) {
			staticContext = new AasComponentContext();
			staticContext.setEventBus(ComponentContext.getStaticContext().getEventBus());
			staticContext.setScheduledExecutorService(ComponentContext.getStaticContext().getScheduledExecutorService());		
		}
		return staticContext;
	}

	public AasComponentContext() {
	}

	public AasComponentContext(AasComponentContext context) {
		super(context);
//		this.servletContainer = context.getServletContainer();
		this.aasRegistry = context.getAasRegistry();
	}
	
//	public ServletContainer getServletContainer() {
//		return servletContainer;
//	}
//	
//	public void setServletCoontainer(ServletContainer servletContainer) {
//		this.servletContainer = servletContainer;
//	}
	
	public IAASRegistryService getAasRegistry() {
		return aasRegistry;
	}
	
	public void setAasRegistry(IAASRegistryService aasRegistry) {
		this.aasRegistry = aasRegistry;
	}
}