package dukes.greeting;

import jakarta.enterprise.context.RequestScoped;

import java.time.LocalDate;

@RequestScoped
public class GreetingService {

    public GreetingRecord getGreeting() {

        return new GreetingRecord("Hello, World", LocalDate.now());
    }
}
