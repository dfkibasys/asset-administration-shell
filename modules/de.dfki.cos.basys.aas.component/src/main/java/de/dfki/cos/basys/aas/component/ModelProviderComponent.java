package de.dfki.cos.basys.aas.component;

import org.eclipse.basyx.aas.metamodel.map.descriptor.ModelDescriptor;
import org.eclipse.basyx.submodel.metamodel.map.identifier.Identifier;
import org.eclipse.basyx.vab.modelprovider.api.IModelProvider;

import de.dfki.cos.basys.common.component.Component;

public interface ModelProviderComponent<T extends ModelDescriptor> extends Component {

	Identifier getAssetId();
	Identifier getAasId();
	//IModelProvider getModelProvider();
	T getModelDescriptor(String endpoint);
}
