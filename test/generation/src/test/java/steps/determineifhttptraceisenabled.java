package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Determine if HTTP Trace is enabled at the web server with which the victim has a an active session

public class determineifhttptraceisenabled {
@Given("prepare to Determine if HTTP Trace is enabled")
public void predetermineifhttptraceisenabled(){
// No specialized resources are needed
// HTTP is used as the communication protocol between the server and the client
}
@When("Try to Determine if HTTP Trace is enabled")
public void trydetermineifhttptraceisenabled(){
//  Try one of the following techniques :
   //1.  An attacker may issue an HTTP Trace request to the target web server and observe if the response arrives with the original request in the body of the response.
}@Then("Assert the success of Determine if HTTP Trace is enabled")
public void assdetermineifhttptraceisenabled(){
//  Assert one of the following indications :
   //  -The original request is returned after the HTTP Trace request.
    //  -HTTP Trace is enabled on the web server
}
}