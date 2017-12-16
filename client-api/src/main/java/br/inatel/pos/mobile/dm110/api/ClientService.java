 package br.inatel.pos.mobile.dm110.api;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/client")
public interface ClientService {

	// Add client
	@POST
	@Path("/add/{clientName}/{clientEmail}")
	@Produces(MediaType.APPLICATION_JSON)
	void addNewclient(@PathParam("clientName") String clientName,@PathParam("clientEmail") String clientEmail);
    // List all clients
	@GET
	@Path("/listall")
	@Produces(MediaType.APPLICATION_JSON)
	String[] listclient();
    // Delete client
	@DELETE
	@Path("/remove/{clientId}")
	@Produces(MediaType.APPLICATION_JSON)
	void deleteClient(@PathParam("clientId") int clientId);
	
	// List client by Id
		@GET
		@Path("/listclientbyid/{clientId}")
		@Produces(MediaType.APPLICATION_JSON)
		void listClientById(@PathParam("clientId") int id);
}
