package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker finds that the targeted application use session credentials to identify legitimate users.

public class analyzeandunderstandsessionids {
@Given("prepare to Analyze and Understand Session IDs")
public void preanalyzeandunderstandsessionids(){
// Attackers may require tools to craft messages containing their forged credentials, and ability to send HTTP request to a web application.
// The targeted application must use session credentials to identify legitimate users. Session identifiers that remains unchanged when the privilege levels change. Predictable session identifiers.
}
@When("Try to Analyze and Understand Session IDs")
public void tryanalyzeandunderstandsessionids(){
//  Try one of the following techniques :
   //1.  An attacker makes many anonymous connections and records the session IDs.
   //2.  An attacker makes authorized connections and records the session tokens or credentials.
}@Then("Assert the success of Analyze and Understand Session IDs")
public void assanalyzeandunderstandsessionids(){
//  Assert one of the following indications :
   //  -The attacker models the session ID algorithm enough to produce a compatible series or IDs, or just one match. (When IDs are predictable)
}
}