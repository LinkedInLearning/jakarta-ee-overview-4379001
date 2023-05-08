package dukes.greeting;

// Give the repository an appropriate CDI scope. Hint: You can also use the pseudo-scope @Dependent
public class GreetingRepository {

    /**
     * Helpful documentation:
     * https://jakarta.ee/specifications/platform/10/apidocs/jakarta/persistence/entitymanager
     */

    // define an EntityManager
    // Hint: Use the @PersistenceContext qualifier
    // Hint: Check the persistence.xml file for the unitName

    // Create a method that retrieves all greetings from the database. Return type should be List<Greeting>

    // Hint: Check out the Criteria Language for building queries
    // CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
    // cq.select(cq.from(Greeting.class));
    // return em.createQuery(cq).getResultList();

    // Create a method called saveGreeting that persists a greeting to the database
    // Hint: Use the persist(Object entity)-method on the EntityManager
}
