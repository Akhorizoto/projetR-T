package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker interacts with the target host and finds that session IDs are used to authenticate users.

public class findsessionids {
@Given("prepare to Find Session IDs")
public void prefindsessionids(){
// 
// The session IDs used by the target host are predictable. For example, the session IDs are generated using predictable information (e.g., time).
}
@When("Try to Find Session IDs")
public void tryfindsessionids(){
//  Try one of the following techniques :
   //1.  An attacker makes many anonymous connections and records the session IDs assigned.
   //2.  An attacker makes authorized connections and records the session tokens or credentials issued.
}@Then("Assert the success of Find Session IDs")
public void assfindsessionids(){
//  Assert one of the following indications :
    //  -Network systems issue session IDs or connection IDs
}
}