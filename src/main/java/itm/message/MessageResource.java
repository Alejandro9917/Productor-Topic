package itm.message;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

@Path("/message")
public class MessageResource
{
    @Inject
    MessageGenerator generator;


    @POST
    @Path("/{message}")
    @Produces(MediaType.TEXT_PLAIN)
    public void send(@PathParam("message") String message)
    {
        generator.generate(message);
    }
}