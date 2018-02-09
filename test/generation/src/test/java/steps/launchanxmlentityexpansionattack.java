package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker crafts malicious XML message to force recursive entity expansion (or other repeated processing) that completely uses up available server resource.

public class launchanxmlentityexpansionattack {
@Given("prepare to Launch an XML Entity Expansion attack")
public void prelaunchanxmlentityexpansionattack(){
// No special resource required.
// This type of attack requires that the target must receive XML input but either fail to provide an upper limit for entity expansion or provide a limit that is so large that it does not preclude significant resource consumption.
}
@When("Try to Launch an XML Entity Expansion attack")
public void trylaunchanxmlentityexpansionattack(){
//  Try one of the following techniques :
   //1.  Send the malicious crafted XML message containing recursive entity uses to the target URL.
}@Then("Assert the success of Launch an XML Entity Expansion attack")
public void asslaunchanxmlentityexpansionattack(){
//  Assert one of the following indications :
   //  -The attacker causes the target application denial of service.
}
}