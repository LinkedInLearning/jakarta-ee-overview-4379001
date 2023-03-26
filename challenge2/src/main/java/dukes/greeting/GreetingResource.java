package dukes.greeting;

import jakarta.ejb.EJB;
import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@RequestScoped
@Path("/greeting")
public class GreetingResource {

    @EJB
    private GreetingService greetingService;

    @GET
    public GreetingRecord greeting() {
        return greetingService.getGreeting();
    }
}
