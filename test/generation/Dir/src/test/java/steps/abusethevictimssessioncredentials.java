package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker fixates falsified session ID to the victim when victim access the system. Once the victim has achieved a higher level of privilege, possibly by logging into the application, the attacker can now take over the session using the forged session identifier.

public class abusethevictimssessioncredentials {
@Given("prepare to Abuse the Victim's Session Credentials")
public void preabusethevictimssessioncredentials(){
// Attackers may require tools to craft messages containing their forged credentials, and ability to send HTTP request to a web application.
// The targeted application must use session credentials to identify legitimate users. Session identifiers that remains unchanged when the privilege levels change. Predictable session identifiers.
}
@When("Try to Abuse the Victim's Session Credentials")
public void tryabusethevictimssessioncredentials(){
//  Try one of the following techniques :
   //1.  The attacker loads the predefined or predicted session ID into his browser and browses to protected data or functionality.
   //2.  The attacker loads the predefined or predicted session ID into his software and utilizes functionality with the rights of the victim.
}@Then("Assert the success of Abuse the Victim's Session Credentials")
public void assabusethevictimssessioncredentials(){
//  Assert one of the following indications :
   //  -The attacker gains access to data or functionality with the rights of the victim.
}
}