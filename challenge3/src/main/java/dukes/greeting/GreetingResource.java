package dukes.greeting;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@RequestScoped
@Path("greeting")
public class GreetingResource {

    @Inject
    private GreetingService greetingService;

    @GET
    public GreetingRecord getGreeting() {
        return greetingService.getGreeting();
    }
}
