package de.dfki.cos.basys.aas.services;

import org.eclipse.basyx.aas.metamodel.map.descriptor.ModelDescriptor;
import org.eclipse.basyx.vab.modelprovider.api.IModelProvider;

import de.dfki.cos.basys.common.component.Component;

public interface ModelProviderComponent extends Component {

	IModelProvider getModelProvider();
	ModelDescriptor getModelDescriptor(String endpoint);
}
