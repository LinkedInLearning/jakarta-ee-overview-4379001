package dukes.greeting;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

import java.time.LocalDate;

@Stateless
public class GreetingService {

    @Inject
    private GreetingRepository greetingRepository;

    public GreetingRecord getGreeting() {

        return greetingRepository.getAllGreetings().stream()
                .findFirst()
                .map(greeting -> new GreetingRecord(greeting.getMessage(), LocalDate.now()))
                .orElse(new GreetingRecord("Hello, World", LocalDate.now()));

    }

    public void saveGreeting(GreetingRecord greetingRecord) {

        Greeting greeting = new Greeting(greetingRecord.message());
        greetingRepository.saveGreeting(greeting);
    }

}
