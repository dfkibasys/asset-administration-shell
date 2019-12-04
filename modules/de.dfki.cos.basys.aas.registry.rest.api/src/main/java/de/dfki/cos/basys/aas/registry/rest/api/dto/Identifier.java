package de.dfki.cos.basys.aas.registry.rest.api.dto;

import org.eclipse.basyx.submodel.metamodel.api.identifier.IIdentifier;

public class Identifier implements IIdentifier {

	String idType;
	String id;

	public Identifier() {
	}

	public Identifier(String idType, String id) {
		this.idType = idType;
		this.id = id;
	}

	public Identifier(IIdentifier identification) {
		this.idType = identification.getIdType();
		this.id = identification.getId();
	}

	@Override
	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	@Override
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
