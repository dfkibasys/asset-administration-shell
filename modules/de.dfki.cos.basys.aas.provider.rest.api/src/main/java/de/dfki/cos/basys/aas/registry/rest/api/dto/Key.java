package de.dfki.cos.basys.aas.registry.rest.api.dto;

import org.eclipse.basyx.submodel.metamodel.api.reference.IKey;

public class Key implements IKey {

	String type;
	boolean local;
	String value;
	String idType;

	public Key() {
	}

	public Key(IKey key) {
		this.type = key.getType();
		this.local = key.isLocal();
		this.value = key.getValue();
		this.idType = key.getidType();
	}

	public String getIdType() {
		return idType;
	}

	public String getType() {
		return type;
	}

	public String getValue() {
		return value;
	}

	public boolean isLocal() {
		return local;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public void setLocal(boolean local) {
		this.local = local;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String getidType() {
		return idType;
	}
}
