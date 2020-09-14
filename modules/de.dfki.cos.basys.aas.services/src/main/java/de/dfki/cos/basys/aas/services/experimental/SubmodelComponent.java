package de.dfki.cos.basys.aas.services.experimental;

import java.util.Properties;

import org.eclipse.basyx.aas.metamodel.map.AssetAdministrationShell;
import org.eclipse.basyx.submodel.metamodel.map.SubModel;

import de.dfki.cos.basys.common.component.impl.BaseComponent;

public class SubmodelComponent extends BaseComponent {
	
	protected SubModel submodel = null;
	
	public SubmodelComponent(Properties config) {
		super(config);
		// TODO Auto-generated constructor stub
	}

	public SubModel getSubmodel() {
		return submodel;
	}
	
}
