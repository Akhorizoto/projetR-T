package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// As the attacker succeeds in exploiting the vulnerability, he can choose to steal user's credentials in order to reuse or to analyze them later on.

public class stealsessionidscredentialspagecontentetc {
@Given("prepare to Steal session IDs, credentials, page content, etc.")
public void prestealsessionidscredentialspagecontentetc(){
// None
// Application permitting the inclusion or use of IMG tags
}
@When("Try to Steal session IDs, credentials, page content, etc.")
public void trystealsessionidscredentialspagecontentetc(){
//  Try one of the following techniques :
   //1.  Develop malicious JavaScript that is injected through vectors identified during the Experiment Phase and loaded by the victim's browser and sends document information to the attacker.
   //2.  Develop malicious JavaScript that injected through vectors identified during the Experiment Phase and takes commands from an attacker's server and then causes the browser to execute appropriately.
}@Then("Assert the success of Steal session IDs, credentials, page content, etc.")
public void assstealsessionidscredentialspagecontentetc(){
//  Assert one of the following indications :
   //  -The attacker gets the user's cookies or other session identifiers.
}
}