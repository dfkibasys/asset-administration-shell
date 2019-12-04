package de.dfki.cos.basys.common.aas.registry.server;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.dfki.cos.basys.aas.registry.rest.api.AasRegistry;
import de.dfki.cos.basys.aas.registry.rest.api.dto.AasDescriptor;
import de.dfki.cos.basys.aas.registry.rest.api.dto.SubmodelDescriptor;

public class ZookeeperAasRegistry implements AasRegistry  {
	public final Logger LOGGER;
	public static final String PREFIX = "/basys/aas-registry";

	private ObjectMapper mapper = new ObjectMapper();
	
	@Context
	private Application app;
	
	@Inject
	private ZookeeperClient client;
	
	public ZookeeperAasRegistry() {
		LOGGER = LoggerFactory.getLogger(getClass().getName());
	}
	
	@Inject
	public ZookeeperAasRegistry(ZookeeperClient client) {
		LOGGER = LoggerFactory.getLogger(getClass().getName());
		this.client = client;
	}
	
	@Override
	public Response getRegistry() {
		try {
			
			if (!client.isConnected()) {
				// 502: Bad Gateway
				return Response.status(Status.BAD_GATEWAY).build();
			}
			
			String path = getPath();
			if (!client.existsPath(path)) {
				// 404: No Asset Administration Shells found  
				return Response.status(Status.OK).entity("[]").build();
			}

			List<String> aasPaths = client.getChildren(path);
			List<AasDescriptor> aasDescriptors = new ArrayList<>(aasPaths.size());
			for (String aasPath : aasPaths) {
				String content = client.getData(getPath(aasPath));
				
				AasDescriptor aasDescriptor = mapper.readValue(content, AasDescriptor.class);
				
				//AasDescriptor aasDescriptor = gson.fromJson(content, AasDescriptor.class);
				aasDescriptors.add(aasDescriptor);	
				
				List<String> submodelPaths = client.getChildren(getPath(aasPath));
				List<SubmodelDescriptor> submodels = new ArrayList<SubmodelDescriptor>(submodelPaths.size());
				for (String smPath : submodelPaths) {
					content = client.getData(getPath(aasPath, smPath));
										
					SubmodelDescriptor submodelDescriptor = mapper.readValue(content, SubmodelDescriptor.class);
					submodels.add(submodelDescriptor);	
				}
				aasDescriptor.setSubmodels(submodels);
			}		
			
			return Response.ok().entity(aasDescriptors).build();
		
		} catch (Exception e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}

	@Override
	public Response registerAas(AasDescriptor aasDescriptor) {
		try {
			if (!client.isConnected()) {
				// 502: Bad Gateway
				return Response.status(Status.BAD_GATEWAY).build();
			}
			String path = getPath(aasDescriptor);
			if (client.existsPath(path)) {
				// 422: The passed Asset Administration Shell conflicts with already registered Asset Administration Shells  
				return Response.status(422).build();
			}
			if (!check(aasDescriptor)) {
				// 400: The syntax of the passed Asset Administration Shell is not valid or malformed request
				return Response.status(Status.BAD_REQUEST).build();
			}		
			List<SubmodelDescriptor> submodels = aasDescriptor.getSubmodels();
			aasDescriptor.setSubmodels(null);
			
			String content = mapper.writeValueAsString(aasDescriptor);
			client.createPath(path, content);

			for (SubmodelDescriptor submodelDescriptor : submodels) {
				path = getPath(aasDescriptor.getIdShort(), submodelDescriptor);
				
				content = mapper.writeValueAsString(submodelDescriptor);			
				client.createPath(path, content);				
			}

			// 201: The Asset Administration Shell was created successfully
			return Response.status(Status.CREATED).build();
			
		} catch (Exception e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}

	@Override
	public Response getAas(String aasId) {
		try {
			if (!client.isConnected()) {
				// 502: Bad Gateway
				return Response.status(Status.BAD_GATEWAY).build();
			}
			String path = getPath(aasId);
			if (!client.existsPath(path)) {
				// 404: No Asset Administration Shell with passed id found  
				return Response.status(Status.NOT_FOUND).build();
			}
			
			String content = client.getData(path);
			AasDescriptor aasDescriptor = mapper.readValue(content, AasDescriptor.class);
			
			List<String> children = client.getChildren(path);
			List<SubmodelDescriptor> submodels = new ArrayList<SubmodelDescriptor>(children.size());
			for (String smPath : children) {
				content = client.getData(getPath(aasId, smPath));
				SubmodelDescriptor submodelDescriptor = mapper.readValue(content, SubmodelDescriptor.class);
				submodels.add(submodelDescriptor);	
			}
			aasDescriptor.setSubmodels(submodels);
			
			return Response.ok().entity(aasDescriptor).build();
		
		} catch (Exception e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}

	@Override
	public Response updateAas(String aasId, AasDescriptor aasDescriptor) {
		return Response.serverError().build();
	}

	@Override
	public Response deleteAas(String aasId) {
		try {
			if (!client.isConnected()) {
				// 502: Bad Gateway
				return Response.status(Status.BAD_GATEWAY).build();
			}
			String path = getPath(aasId);
			if (!client.existsPath(path)) {
				// 404: No Asset Administration Shell with passed id found  
				return Response.status(Status.NOT_FOUND).build();
			}
			
			client.deletePath(path);
			
			return Response.status(Status.NO_CONTENT).build();
		
		} catch (Exception e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}

	@Override
	public Response getAasSubmodels(String aasId) {
		try {
			if (!client.isConnected()) {
				// 502: Bad Gateway
				return Response.status(Status.BAD_GATEWAY).build();
			}
			String path = getPath(aasId);
			if (!client.existsPath(path)) {
				// 404: No Asset Administration Shell with passed id found  
				return Response.status(Status.NOT_FOUND).build();
			}
			
			List<String> children = client.getChildren(path);
			List<SubmodelDescriptor> submodels = new ArrayList<SubmodelDescriptor>(children.size());
			for (String smPath : children) {
				String content = client.getData(getPath(aasId, smPath));
				SubmodelDescriptor submodelDescriptor = mapper.readValue(content, SubmodelDescriptor.class);
				submodels.add(submodelDescriptor);	
			}
			
			return Response.ok().entity(submodels).build();
		
		} catch (Exception e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}

	@Override
	public Response registerAasSubmodel(String aasId, SubmodelDescriptor submodelDescriptor) {
		try {
			if (!client.isConnected()) {
				// 502: Bad Gateway
				return Response.status(Status.BAD_GATEWAY).build();
			}
			String path = getPath(aasId);
			if (!client.existsPath(path)) {
				// 404: No Asset Administration Shell with passed id found  
				return Response.status(Status.NOT_FOUND).build();
			}
			path = getPath(aasId, submodelDescriptor);
			if (client.existsPath(path)) {
				// 422: The passed Asset Administration Shell conflicts with already registered Asset Administration Shells  
				return Response.status(422).build();
			}
			if (!check(submodelDescriptor)) {
				// 400: The syntax of the passed Asset Administration Shell is not valid or malformed request
				return Response.status(Status.BAD_REQUEST).build();
			}		
			String content = mapper.writeValueAsString(submodelDescriptor);		
			client.createPath(path, content);
			
			// 201: The Asset Administration Shell was created successfully
			return Response.status(Status.CREATED).build();
			
		} catch (Exception e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}

	@Override
	public Response getAasSubmodel(String aasId, String submodelId) {
		try {
			if (!client.isConnected()) {
				// 502: Bad Gateway
				return Response.status(Status.BAD_GATEWAY).build();
			}
			String path = getPath(aasId);
			if (!client.existsPath(path)) {
				// 404: No Asset Administration Shell with passed id found  
				return Response.status(Status.NOT_FOUND).build();
			}
			path = getPath(aasId, submodelId);
			if (!client.existsPath(path)) {
				// 404: No Submodel with passed id found  
				return Response.status(Status.NOT_FOUND).build();
			}
			
			String content = client.getData(path);
			SubmodelDescriptor submodelDescriptor = mapper.readValue(content, SubmodelDescriptor.class);
			
			return Response.ok().entity(submodelDescriptor).build();
		
		} catch (Exception e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}

	@Override
	public Response deleteAasSubmodel(String aasId, String submodelId) {
		try {
			if (!client.isConnected()) {
				// 502: Bad Gateway
				return Response.status(Status.BAD_GATEWAY).build();
			}
			String path = getPath(aasId);
			if (!client.existsPath(path)) {
				// 404: No Asset Administration Shell with passed id found  
				return Response.status(Status.NOT_FOUND).build();
			}
			path = getPath(aasId, submodelId);
			if (!client.existsPath(path)) {
				// 404: No Submodel with passed id found  
				return Response.status(Status.NOT_FOUND).build();
			}
			client.deletePath(path);
			
			return Response.status(Status.NO_CONTENT).build();
		
		} catch (Exception e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
	
	private String getPath() {
		return PREFIX;
	}
	
	private String getPath(AasDescriptor aas) {
		return PREFIX + "/" + aas.getIdShort();
	}
	
	private String getPath(String aasId) {
		return PREFIX + "/" + aasId;
	}
	
	private String getPath(String aasId, SubmodelDescriptor sm) {
		return PREFIX + "/" + aasId + "/" + sm.getIdShort();
	}
	
	private String getPath(String aasId, String smId) {
		return PREFIX + "/" + aasId + "/" + smId;
	}

	private boolean check(AasDescriptor aasDescriptor) {
		// TODO Auto-generated method stub
		return true;
	}
	
	private boolean check(SubmodelDescriptor aasDescriptor) {
		// TODO Auto-generated method stub
		return true;
	}

}
