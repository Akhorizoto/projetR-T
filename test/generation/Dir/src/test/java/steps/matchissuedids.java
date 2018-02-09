package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker brute forces different values of session ID and manages to predict a valid session ID.

public class matchissuedids {
@Given("prepare to Match issued IDs")
public void prematchissuedids(){
// 
// The session IDs used by the target host are predictable. For example, the session IDs are generated using predictable information (e.g., time).
}
@When("Try to Match issued IDs")
public void trymatchissuedids(){
//  Try one of the following techniques :
   //1.  The attacker models the session ID algorithm enough to produce a compatible session IDs, or just one match.
}@Then("Assert the success of Match issued IDs")
public void assmatchissuedids(){
//  Assert one of the following indications :
   //  -Session identifiers successfully spoofed
}
}