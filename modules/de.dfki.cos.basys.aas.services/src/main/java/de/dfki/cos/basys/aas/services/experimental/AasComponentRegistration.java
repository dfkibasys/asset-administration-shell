package de.dfki.cos.basys.aas.services.experimental;

import org.eclipse.basyx.aas.metamodel.api.IAssetAdministrationShell;
import org.eclipse.basyx.aas.metamodel.map.AssetAdministrationShell;
import org.eclipse.basyx.aas.metamodel.map.descriptor.AASDescriptor;
import org.eclipse.basyx.aas.metamodel.map.descriptor.SubmodelDescriptor;
import org.eclipse.basyx.aas.registration.api.IAASRegistryService;
import org.eclipse.basyx.submodel.metamodel.api.ISubModel;
import org.eclipse.basyx.submodel.metamodel.map.SubModel;

import de.dfki.cos.basys.aas.component.impl.BaseAasComponent;
import de.dfki.cos.basys.common.component.Component;
import de.dfki.cos.basys.common.component.ComponentInfo;
import de.dfki.cos.basys.common.component.registry.ComponentRegistration;
import de.dfki.cos.basys.common.component.registry.ComponentRegistrationException;

public class AasComponentRegistration implements ComponentRegistration {

	private final BaseAasComponent component;
	private AASDescriptor descriptor; 
	private IAASRegistryService service;
	
	public AasComponentRegistration(Component component, IAASRegistryService service) {
		this.component = (BaseAasComponent)component;
		this.service = service;
	}
	
	@Override
	public void register() throws ComponentRegistrationException {	
		//TODO: provide real endpoint of the hosted aas
		descriptor = (AASDescriptor) component.getModelDescriptor("<some endpoint>");
		service.register(descriptor);
	}

	@Override
	public void update() throws ComponentRegistrationException {		
		register();
	}

	@Override
	public void unregister() throws ComponentRegistrationException {
		service.delete(descriptor.getIdentifier());		
	}

	@Override
	public ComponentInfo getComponentInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
