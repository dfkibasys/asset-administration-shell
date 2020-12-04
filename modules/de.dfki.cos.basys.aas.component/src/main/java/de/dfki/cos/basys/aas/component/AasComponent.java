package de.dfki.cos.basys.aas.component;

import org.eclipse.basyx.aas.metamodel.map.AssetAdministrationShell;
import org.eclipse.basyx.aas.metamodel.map.descriptor.AASDescriptor;

public interface AasComponent extends ModelProviderComponent<AASDescriptor> {
	
	AssetAdministrationShell getAas();
	
}
