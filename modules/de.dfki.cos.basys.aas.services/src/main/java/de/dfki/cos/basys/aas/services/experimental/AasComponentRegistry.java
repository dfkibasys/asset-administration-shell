package de.dfki.cos.basys.aas.services.experimental;

import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.eclipse.basyx.aas.registration.api.IAASRegistry;
import org.eclipse.basyx.aas.registration.proxy.AASRegistryProxy;

import de.dfki.cos.basys.common.component.Component;
import de.dfki.cos.basys.common.component.ComponentContext;
import de.dfki.cos.basys.common.component.ComponentInfo;
import de.dfki.cos.basys.common.component.ServiceProvider;
import de.dfki.cos.basys.common.component.StringConstants;
import de.dfki.cos.basys.common.component.impl.ServiceComponent;
import de.dfki.cos.basys.common.component.impl.ServiceManagerImpl;
import de.dfki.cos.basys.common.component.registry.ComponentRegistration;
import de.dfki.cos.basys.common.component.registry.ComponentRegistrationException;
import de.dfki.cos.basys.common.component.registry.ComponentRegistry;
import de.dfki.cos.basys.common.component.util.CommUtils;

public class AasComponentRegistry extends ServiceComponent<IAASRegistry> implements ComponentRegistry {

	public static String defaultConnectionString;

	
	static {
		try {
			String serverName = CommUtils.getPreferredDockerStack();
			defaultConnectionString = String.format("%s:4999", serverName);			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}	

	public AasComponentRegistry(Properties config) {
		super(config);
		if (!config.containsKey(StringConstants.serviceConnectionString)) {
			config.setProperty(StringConstants.serviceConnectionString, defaultConnectionString);			
			LOGGER.warn("External connection string not provided. Defaulting to " + defaultConnectionString);
		}
				
		ServiceProvider<IAASRegistry> serviceProvider =  new ServiceProvider<IAASRegistry>() {
			IAASRegistry service = null;
			
			@Override
			public boolean isConnected() {
				return service != null;
			}
			
			@Override
			public IAASRegistry getService() {				
				return service;
			}
			
			@Override
			public void disconnect() {
				service = null;				
			}
			
			@Override
			public boolean connect(ComponentContext context, String connectionString) {
				service = new AASRegistryProxy(connectionString);
				return service != null;
			}
		};

		serviceManager = new ServiceManagerImpl<IAASRegistry>(config, serviceProvider);	
	}
	

	@Override
	public ComponentRegistration createRegistration(Component instance) throws ComponentRegistrationException {
		IAASRegistry service = getService();		
		ComponentRegistration registration = new AasComponentRegistration(instance, service);		
		return registration;
	}

	@Override
	public List<ComponentInfo> getComponents(String category) {
		throw new UnsupportedOperationException("method not yet implemented");
	}

	@Override
	public ComponentInfo getComponentById(String category, String id) {
		throw new UnsupportedOperationException("method not yet implemented");
	}

	@Override
	public ComponentInfo getComponentByName(String category, String name) {
		throw new UnsupportedOperationException("method not yet implemented");
	}
	
}
