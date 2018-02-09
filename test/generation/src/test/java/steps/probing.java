package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker probes the target application to see whether calling signed code from another language is allowed within a sandbox.

public class probing {
@Given("prepare to Probing")
public void preprobing(){
// No special resource is required.
// A framework-based language that supports code signing and sandbox (such as Java, .Net, JavaScript, and Flash) Deployed code that has been signed by its authoring vendor, or a partner
}
@When("Try to Probing")
public void tryprobing(){
//  Try one of the following techniques :
   //1.  The attacker probes the target application to see whether calling signed code from another language is allowed within a sandbox.
}@Then("Assert the success of Probing")
public void assprobing(){
//  Assert one of the following indications :
   //  -The attacker knows that the target application is calling signed code from another language within a sandbox.
    //  -The target application allows calling signed code from another language within a sandbox.
}
}