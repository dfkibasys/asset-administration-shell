package de.dfki.cos.basys.aas.registry.rest.api.dto;

import org.eclipse.basyx.submodel.metamodel.api.identifier.IIdentifier;
import org.eclipse.basyx.submodel.metamodel.api.identifier.IdentifierType;

public class Identifier implements IIdentifier {

	IdentifierType idType;
	String id;

	public Identifier() {
	}

	public Identifier(IdentifierType idType, String id) {
		this.idType = idType;
		this.id = id;
	}

	public Identifier(IIdentifier identification) {
		this.idType = identification.getIdType();
		this.id = identification.getId();
	}

	@Override
	public IdentifierType getIdType() {
		return idType;
	}

	public void setIdType(IdentifierType idType) {
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
