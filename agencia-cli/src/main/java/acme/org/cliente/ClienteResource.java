package acme.org.cliente;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/cliente-cli")
public class ClienteResource {
    
    @Inject
    @RestClient
    ClienteService clienteService;

    @GET
    @Path("newCliente")
    public String newCliente(){
        Cliente cliente = Cliente.of(99, "cli-Remoto");
        return clienteService.newCliente(cliente);
    }
}
