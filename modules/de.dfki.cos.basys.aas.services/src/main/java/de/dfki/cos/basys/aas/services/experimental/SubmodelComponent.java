package de.dfki.cos.basys.aas.services.experimental;

import java.util.Properties;

import org.eclipse.basyx.submodel.metamodel.map.Submodel;

import de.dfki.cos.basys.common.component.impl.BaseComponent;

public class SubmodelComponent extends BaseComponent {
	
	protected Submodel submodel = null;
	
	public SubmodelComponent(Properties config) {
		super(config);
		// TODO Auto-generated constructor stub
	}

	public Submodel getSubmodel() {
		return submodel;
	}
	
}
