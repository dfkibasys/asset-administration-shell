package de.dfki.cos.basys.aas.registry.rest.api.dto;

import org.eclipse.basyx.submodel.metamodel.api.ISubModel;
import org.eclipse.basyx.submodel.metamodel.api.reference.IReference;

public class SubmodelDescriptor extends Descriptor {

	IReference semanticId;

	public SubmodelDescriptor() {
	}

	public SubmodelDescriptor(ISubModel submodel) {
		this.idShort = submodel.getIdShort();
		this.identification = new Identifier(submodel.getIdentification());
		this.semanticId = new Reference(submodel.getSemanticId());
	}

	public SubmodelDescriptor(ISubModel submodel, Endpoint endpoint) {
		this(submodel);
		this.endpoints.add(endpoint);
	}

	public IReference getSemanticId() {
		return semanticId;
	}

	public void setSemanticId(IReference semanticId) {
		this.semanticId = semanticId;
	}

}
