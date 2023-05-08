package dukes.greeting;

import java.time.LocalDate;

// The response from the Greeting resource.
public record GreetingRecord(String message, LocalDate date) {
}
