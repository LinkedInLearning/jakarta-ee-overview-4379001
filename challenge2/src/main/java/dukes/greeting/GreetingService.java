package dukes.greeting;

// The GreetingService should be a Stateless session bean
// Hint: Check out the @Stateless annotation
public class GreetingService {

    // inject the GreetingRepository

    // Create a method that calls the GreetingRepository to find all greetings, chooses the first one,
    // and maps it to a DTO in the form of a Record
    // If no greetings are returned from the repository, return a hard coded one with the text "Hello, World!"
    // and today's date.

    // Add a method that takes a GreetingRecord as parameter, maps it to a Greeting,
    // and calls the save method on the GreetingRepository
}
