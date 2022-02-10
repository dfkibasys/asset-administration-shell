package de.dfki.cos.basys.aas.registry.rest.api.dto;

import org.eclipse.basyx.submodel.metamodel.api.reference.IKey;
import org.eclipse.basyx.submodel.metamodel.api.reference.enums.KeyElements;
import org.eclipse.basyx.submodel.metamodel.api.reference.enums.KeyType;

public class Key implements IKey {

	KeyElements type;
	boolean local;
	String value;
	KeyType idType;

	public Key() {
	}

	public Key(IKey key) {
		this.type = key.getType();
		this.local = key.isLocal();
		this.value = key.getValue();
		this.idType = key.getIdType();
	}

	@Override
	public KeyType getIdType() {
		return idType;
	}

	public KeyElements getType() {
		return type;
	}

	public String getValue() {
		return value;
	}

	public boolean isLocal() {
		return local;
	}

	public void setIdType(KeyType idType) {
		this.idType = idType;
	}

	public void setLocal(boolean local) {
		this.local = local;
	}

	public void setType(KeyElements type) {
		this.type = type;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
