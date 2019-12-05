package de.dfki.cos.basys.aas.registry.rest.api;

import java.util.List;

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

import de.dfki.cos.basys.aas.IDataElement;
import de.dfki.cos.basys.aas.IEvent;
import de.dfki.cos.basys.aas.IOperation;

@Path("/submodel")
public interface SubmodelProvider {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	Response getSubmodel();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/dataElements")
	Response getDataElements();

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/dataElements")
	Response addDataElement(IDataElement data);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/dataElements/{dataElementId}")
	Response getDataElement(@PathParam("dataElementId") String dataElementId);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/dataElements/{dataElementId}/value")
	Response getDataElementValue(@PathParam("dataElementId") String dataElementId);

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/dataElements/{dataElementId}/value")
	Response updateDataElementValue(@PathParam("dataElementId") String dataElementId, Object value);

	@DELETE
	@Path("/dataElements/{dataElementId}")
	Response deleteDataElement(@PathParam("dataElementId") String dataElementId);

	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/events")
	Response getEvents();

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/events")
	Response addEvent(IEvent event);
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/events/{eventId}")
	Response getEvent(@PathParam("eventId") String eventId);

	@DELETE
	@Path("/events/{eventId}")
	Response deleteEvent(@PathParam("eventId") String eventId);

	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/operations")
	Response getOperations();

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/operations")
	Response addOperation(IOperation operation);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/operations/{operationId}")
	Response getOperation(@PathParam("operationId") String operationId);

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/operations/{operationId}")
	Response invokeOperation(@PathParam("operationId") String operationId, List<Object> inputArguments);

	@DELETE
	@Path("/operations/{operationId}")
	Response deleteOperation(@PathParam("operationId") String operationId);

}
