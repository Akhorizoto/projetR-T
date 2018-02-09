package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Takeover the fixated session: Once the victim has achieved a higher level of privilege, possibly by logging into the application, the attacker can now take over the session using the fixated session identifier.

public class abusethevictimssession {
@Given("prepare to Abuse the Victim's Session")
public void preabusethevictimssession(){
// None
// Predictable session identifiers
}
@When("Try to Abuse the Victim's Session")
public void tryabusethevictimssession(){
//  Try one of the following techniques :
   //1.  The attacker loads the predefined session ID into his browser and browses to protected data or functionality.
   //2.  The attacker loads the predefined session ID into his software and utilizes functionality with the rights of the victim.
}@Then("Assert the success of Abuse the Victim's Session")
public void assabusethevictimssession(){
//  Assert one of the following indications :
   //  -The attacker gains access to data or functionality with the rights of the victim.
}
}