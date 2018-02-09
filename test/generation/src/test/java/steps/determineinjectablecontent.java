package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker launches various logged actions with malicious data to determine what sort of log injection is possible.

public class determineinjectablecontent {
@Given("prepare to Determine Injectable Content")
public void predetermineinjectablecontent(){
// Ability to send specially formatted HTTP request to web server
// Target server software must be a HTTP server that performs web logging.
}
@When("Try to Determine Injectable Content")
public void trydetermineinjectablecontent(){
//  Try one of the following techniques :
   //1.  Attacker triggers logged actions with maliciously crafted data as inputs, parameters, arguments, etc.
}@Then("Assert the success of Determine Injectable Content")
public void assdetermineinjectablecontent(){
//  Assert one of the following indications :
   //  -Attacker observes content successfully injected into web logs.
}
}