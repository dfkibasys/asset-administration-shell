package de.dfki.cos.basys.aas.registry.rest.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import de.dfki.cos.basys.aas.registry.rest.api.dto.AasDescriptor;
import de.dfki.cos.basys.aas.registry.rest.api.dto.SubmodelDescriptor;

@Path("/registry")
public interface AasRegistry {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	Response getRegistry();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	Response registerAas(AasDescriptor aasDescriptor);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{aasId}")
	Response getAas(@PathParam("aasId") String aasId);	
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/{aasId}")
	Response updateAas(@PathParam("aasId") String aasId, AasDescriptor aasDescriptor);
	
	@DELETE
	@Path("/{aasId}")
	Response deleteAas(@PathParam("aasId") String aasId);
		
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{aasId}/submodels")
	Response getAasSubmodels(@PathParam("aasId") String aasId);

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/{aasId}/submodels")
	Response registerAasSubmodel(@PathParam("aasId") String aasId, SubmodelDescriptor submodelDescriptor);
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{aasId}/submodels/{submodelId}")
	Response getAasSubmodel(@PathParam("aasId") String aasId, @PathParam("submodelId") String submodelId);
	
	@DELETE
	@Path("/{aasId}/submodels/{submodelId}")
	Response deleteAasSubmodel(@PathParam("aasId") String aasId,  @PathParam("submodelId") String submodelId);
	
	
	
	
}
