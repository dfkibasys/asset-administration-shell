package de.dfki.cos.basys.aas.services.experimental;

import org.eclipse.basyx.aas.metamodel.map.descriptor.SubmodelDescriptor;

import de.dfki.cos.basys.common.component.Component;
import de.dfki.cos.basys.common.component.ComponentInfo;
import de.dfki.cos.basys.common.component.registry.ComponentRegistration;
import de.dfki.cos.basys.common.component.registry.ComponentRegistrationException;

public class SubmodelComponentRegistration implements ComponentRegistration {

	private final Component registeredComponent;
	private SubmodelDescriptor descriptor; 
	
	public SubmodelComponentRegistration(Component component) {
		registeredComponent = component;
	}
	
	@Override
	public void register() throws ComponentRegistrationException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() throws ComponentRegistrationException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unregister() throws ComponentRegistrationException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ComponentInfo getComponentInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
