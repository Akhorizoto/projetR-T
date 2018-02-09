package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Create a malicious script to run in the administrator's web based interface and inject it in the system's logs through one of the user controlled fields that are being logged.

public class injectsystemlogswithmaliciousscripts {
@Given("prepare to Inject System Logs with Malicious Scripts")
public void preinjectsystemlogswithmaliciousscripts(){
// No specialized hardware is required
// The web based log interface does not HTML output encode the log data prior to displaying it in the administrator console.
}
@When("Try to Inject System Logs with Malicious Scripts")
public void tryinjectsystemlogswithmaliciousscripts(){
//  Try one of the following techniques :
   //1.  Inject the vulnerable fields by tampering with their values to contain the malicious scripts. Possibly trigger another event that makes it more likely that injected logs are viewed in the vulnerable UI as soon as possible.
}@Then("Assert the success of Inject System Logs with Malicious Scripts")
public void assinjectsystemlogswithmaliciousscripts(){
//  Assert one of the following indications :
}
}