package dukes.greeting;

import jakarta.ejb.EJB;
import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.time.LocalDate;

@RequestScoped
@Path("/greeting")
public class GreetingResource {

    @EJB
    private GreetingService greetingService;

    @GET
    public GreetingRecord greeting() {
        return greetingService.getGreeting();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response newGreeting(GreetingRecord greeting) {

        greetingService.saveGreeting(greeting);
        return Response.ok().build();
    }
}
