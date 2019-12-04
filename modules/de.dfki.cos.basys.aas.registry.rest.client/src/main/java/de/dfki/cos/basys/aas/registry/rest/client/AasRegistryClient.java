package de.dfki.cos.basys.aas.registry.rest.client;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dfki.cos.basys.aas.registry.rest.api.dto.AasDescriptor;
import de.dfki.cos.basys.aas.registry.rest.api.dto.SubmodelDescriptor;


public class AasRegistryClient {

	protected final Logger LOGGER = LoggerFactory.getLogger(AasRegistryClient.class.getName());

	private final String rootSegment = "/api/v1";
	protected Client client = ClientBuilder.newClient();
	protected WebTarget endpoint = null;
	
	
	public AasRegistryClient(String host, String auth) {
		this.endpoint = client.target(host).path(rootSegment);	
	}
	
	public AasRegistryClient(WebTarget endpoint, String auth) {
		this.endpoint = endpoint.path(rootSegment);	
	}

	public List<AasDescriptor> getRegistry() {
		List<AasDescriptor> result = endpoint.path("/registry")
				.request(MediaType.APPLICATION_JSON_TYPE)
				.get(new GenericType<List<AasDescriptor>>() {});
		return result;
	}

	public boolean registerAas(AasDescriptor aasDescriptor) {
		Response response = endpoint.path("/registry")
				.request(MediaType.APPLICATION_JSON_TYPE)
				.post(Entity.entity(aasDescriptor, MediaType.APPLICATION_JSON));
	
		if (response.getStatus() == Status.CREATED.getStatusCode())
			return true;
		
		return false;
	}

	public AasDescriptor getAas(String aasId) {
		AasDescriptor result = endpoint.path("/registry/{aasId}")
				.resolveTemplate("aasId", aasId)
				.request(MediaType.APPLICATION_JSON_TYPE)
				.get(AasDescriptor.class);
		return result;
	}

	public boolean updateAas(String aasId, AasDescriptor aasDescriptor) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteAas(String aasId) {
		Response response = endpoint.path("/registry/{aasId}")
				.resolveTemplate("aasId", aasId)
				.request()
				.delete();
		
		if (response.getStatus() == Status.NO_CONTENT.getStatusCode())
			return true;
		
		return false;
	}

	public List<SubmodelDescriptor> getAasSubmodels(String aasId) {
		List<SubmodelDescriptor> result = endpoint.path("/registry/{aasId}/submodels")
				.resolveTemplate("aasId", aasId)
				.request(MediaType.APPLICATION_JSON_TYPE)
				.get(new GenericType<List<SubmodelDescriptor>>() {});
		return result;
	}

	public boolean registerAasSubmodel(String aasId, SubmodelDescriptor submodelDescriptor) {
		Response response = endpoint.path("/registry/{aasId}/submodels")
				.resolveTemplate("aasId", aasId)
				.request(MediaType.APPLICATION_JSON_TYPE)
				.post(Entity.entity(submodelDescriptor, MediaType.APPLICATION_JSON));
	
		if (response.getStatus() == Status.CREATED.getStatusCode())
			return true;
		
		return false;
	}

	public SubmodelDescriptor getAasSubmodel(String aasId, String submodelId) {
		SubmodelDescriptor result = endpoint.path("/registry/{aasId}/submodels/{submodelId}")
				.resolveTemplate("aasId", aasId)
				.resolveTemplate("submodelId", submodelId)
				.request(MediaType.APPLICATION_JSON_TYPE)
				.get(SubmodelDescriptor.class);
		return result;
	}

	public boolean deleteAasSubmodel(String aasId, String submodelId) {
		Response response = endpoint.path("/registry/{aasId}/submodels/{submodelId}")
				.resolveTemplate("aasId", aasId)
				.resolveTemplate("submodelId", submodelId)
				.request()
				.delete();
		
		if (response.getStatus() == Status.NO_CONTENT.getStatusCode())
			return true;
		
		return false;
	}
	
}
