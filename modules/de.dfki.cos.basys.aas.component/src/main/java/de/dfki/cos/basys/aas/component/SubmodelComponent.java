package de.dfki.cos.basys.aas.component;

import org.eclipse.basyx.aas.metamodel.map.descriptor.SubmodelDescriptor;
import org.eclipse.basyx.submodel.metamodel.map.Submodel;
import org.eclipse.basyx.submodel.metamodel.map.identifier.Identifier;

public interface SubmodelComponent extends ModelProviderComponent<SubmodelDescriptor> {

	Submodel getSubmodel();
	Identifier getSubmodelId();
}
