package dukes.greeting;

// The GreetingService should be a Stateless session bean
// Hint: Check out the @Stateless annotation
public class GreetingService {

    /**
     * Helpful documentation:
     * https://jakarta.ee/specifications/platform/10/apidocs/jakarta/ejb/stateless
     * https://jakarta.ee/specifications/platform/10/apidocs/jakarta/inject/package-summary.html
     * https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/package-summary.html
     */

    // inject the GreetingRepository

    // Create a method that calls the GreetingRepository to find all greetings and chooses the first one
    // If no greetings are returned from the repository, return a hard coded one with the text "Hello, World!"

}
