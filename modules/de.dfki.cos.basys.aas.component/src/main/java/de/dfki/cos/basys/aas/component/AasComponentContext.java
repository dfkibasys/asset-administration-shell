package de.dfki.cos.basys.aas.component;

import org.eclipse.basyx.aas.aggregator.api.IAASAggregator;
import org.eclipse.basyx.aas.registration.api.IAASRegistry;

import de.dfki.cos.basys.common.component.ComponentContext;

public class AasComponentContext  extends ComponentContext {

	//protected ServletContainer servletContainer = null;
	protected IAASRegistry aasRegistry = null;
	protected IAASAggregator aasAggregator = null;
	
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
		this.aasAggregator = context.getAasAggregator();
		
	}
	
//	public ServletContainer getServletContainer() {
//		return servletContainer;
//	}
//	
//	public void setServletCoontainer(ServletContainer servletContainer) {
//		this.servletContainer = servletContainer;
//	}
	
	public IAASRegistry getAasRegistry() {
		return aasRegistry;
	}
	
	public void setAasRegistry(IAASRegistry aasRegistry) {
		this.aasRegistry = aasRegistry;
	}
	
	public IAASAggregator getAasAggregator() {
		return aasAggregator;
	}
	
	public void setAasAggregator(IAASAggregator aasAggregator) {
		this.aasAggregator = aasAggregator;
	}
}