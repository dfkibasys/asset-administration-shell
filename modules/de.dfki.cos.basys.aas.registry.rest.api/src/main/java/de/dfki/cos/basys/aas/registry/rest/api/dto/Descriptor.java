package de.dfki.cos.basys.aas.registry.rest.api.dto;

import java.util.ArrayList;
import java.util.List;

public abstract class Descriptor {

	String idShort;
	Identifier identification;
	List<Endpoint> endpoints = new ArrayList<>();

	public String getIdShort() {
		return idShort;
	}

	public void setIdShort(String idShort) {
		this.idShort = idShort;
	}

	public Identifier getIdentification() {
		return identification;
	}

	public void setIdentification(Identifier identification) {
		this.identification = identification;
	}

	public List<Endpoint> getEndpoints() {
		return endpoints;
	}

	public void setEndpoints(List<Endpoint> endpoints) {
		this.endpoints = endpoints;
	}
}
