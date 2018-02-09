package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker delivers a large number of small XML messages to the target URLs found in the explore phase at a sufficiently rapid rate. It causes denial of service to the target application.

public class launcharesourcedepletionattack {
@Given("prepare to Launch a resource depletion attack")
public void prelauncharesourcedepletionattack(){
// Transaction generator(s)/source(s) and ability to cause arrival of messages at the target with sufficient rapidity to overload target. Larger targets may be able to handle large volumes of requests so the attacker may require significant resources (such as a distributed network) to affect the target. However, the resources required of the attacker would be less than in the case of a simple flooding attack against the same target.
// The target must receive and process XML transactions.
}
@When("Try to Launch a resource depletion attack")
public void trylauncharesourcedepletionattack(){
//  Try one of the following techniques :
   //1.  Send a large number of crafted small XML messages to the target URL.
}@Then("Assert the success of Launch a resource depletion attack")
public void asslauncharesourcedepletionattack(){
//  Assert one of the following indications :
   //  -The attacker causes the target application denial of service.
}
}