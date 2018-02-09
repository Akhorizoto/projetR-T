package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Attackers craft messages containing their forged credentials in GET, POST request, HTTP headers or cookies.

public class createsessionids {
@Given("prepare to Create Session IDs.")
public void precreatesessionids(){
// Attackers may require tools to craft messages containing their forged credentials, and ability to send HTTP request to a web application.
// The targeted application must use session credentials to identify legitimate users. Session identifiers that remains unchanged when the privilege levels change. Predictable session identifiers.
}
@When("Try to Create Session IDs.")
public void trycreatesessionids(){
//  Try one of the following techniques :
   //1.  The attacker manipulates the HTTP request message and adds his forged session IDs in to the requests or cookies.
}@Then("Assert the success of Create Session IDs.")
public void asscreatesessionids(){
//  Assert one of the following indications :
   //  -Victim application accepts attackers' session credentials.
}
}