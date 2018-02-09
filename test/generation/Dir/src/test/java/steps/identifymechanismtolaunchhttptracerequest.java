package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker attempts to force the victim to issue an HTTP Trace request to the targeted application.

public class identifymechanismtolaunchhttptracerequest {
@Given("prepare to Identify mechanism to launch HTTP Trace request")
public void preidentifymechanismtolaunchhttptracerequest(){
// No specialized resources are needed
// HTTP is used as the communication protocol between the server and the client
}
@When("Try to Identify mechanism to launch HTTP Trace request")
public void tryidentifymechanismtolaunchhttptracerequest(){
//  Try one of the following techniques :
   //1.  The attacker probes for cross-site scripting vulnerabilities to force the victim into issuing an HTTP Trace request.
}@Then("Assert the success of Identify mechanism to launch HTTP Trace request")
public void assidentifymechanismtolaunchhttptracerequest(){
//  Assert one of the following indications :
   //  -Attacker's script is executed within the browser context.
}
}