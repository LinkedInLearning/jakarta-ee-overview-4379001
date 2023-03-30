package dukes.greeting;

// The GreetingServlet should be an HttpServlet
// Hint: Check the @WebServlet annotation, URL pattern for the servlet should be "/greeting"
// Hint: extend HttpServlet
public class GreetingServlet {

    // Inject the GreetingService EJB
    // Hint: Check out the @EJB annotation

    // override the doGet method from HttpServlet
    // get the message from the greeting and display it
    // Hint: resp.getWriter().println("text");
}
