package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Setup a session: The attacker has to setup a trap session that provides a valid session identifier, or select an arbitrary identifier, depending on the mechanism employed by the application. A trap session is a dummy session established with the application by the attacker and is used solely for the purpose of obtaining valid session identifiers. The attacker may also be required to periodically refresh the trap session in order to obtain valid session identifiers.

public class setuptheattack {
@Given("prepare to Setup the Attack")
public void presetuptheattack(){
// None
// Predictable session identifiers
}
@When("Try to Setup the Attack")
public void trysetuptheattack(){
//  Try one of the following techniques :
   //1.  The attacker chooses a predefined identifier that he knows.
   //2.  The attacker creates a trap session for the victim.
}@Then("Assert the success of Setup the Attack")
public void asssetuptheattack(){
//  Assert one of the following indications :
   //  -A trap session or a predefined session ID is established.
}
}