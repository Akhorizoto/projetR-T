package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker uses the falsified session ID to access the target system.

public class usematchedsessionid {
@Given("prepare to Use matched Session ID")
public void preusematchedsessionid(){
// 
// The session IDs used by the target host are predictable. For example, the session IDs are generated using predictable information (e.g., time).
}
@When("Try to Use matched Session ID")
public void tryusematchedsessionid(){
//  Try one of the following techniques :
   //1.  The attacker loads the session ID into his web browser and browses to restricted data or functionality.
   //2.  The attacker loads the session ID into his network communications and impersonates a legitimate user to gain access to data or functionality.
}@Then("Assert the success of Use matched Session ID")
public void assusematchedsessionid(){
//  Assert one of the following indications :
}
}