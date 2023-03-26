package dukes.greeting;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class GreetingService {

    @Inject
    private GreetingRepository greetingRepository;

    public Greeting getGreeting() {

        return greetingRepository.getAllGreetings().stream()
                .findFirst()
                .orElse(new Greeting("Hello, World"));
    }
}
