package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Find systems that contain functionality that is accessed from both the internet zone and the local zone. There needs to be a way to supply input to that functionality from the internet zone and that original input needs to be used later on a page from a local zone.

public class findsystemssusceptibletotheattack {
@Given("prepare to Find systems susceptible to the attack")
public void prefindsystemssusceptibletotheattack(){
// No specialized equipment is needed
// The target must be using a zone-aware browser.
}
@When("Try to Find systems susceptible to the attack")
public void tryfindsystemssusceptibletotheattack(){
//  Try one of the following techniques :
   //1.  Leverage knowledge of common local zone functionality on targeted platforms to guide attempted injection of code through relevant internet zone mechanisms. In some cases this may be due to standard system configurations enabling shared functionality between internet and local zones. The attacker can search for indicators that these standard configurations are in place.
}@Then("Assert the success of Find systems susceptible to the attack")
public void assfindsystemssusceptibletotheattack(){
//  Assert one of the following indications :
}
}