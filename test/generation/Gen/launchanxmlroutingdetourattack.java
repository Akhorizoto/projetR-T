import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker injects a bogus routing node (using a WS-Referral service) into the routing table of the XML header of the SOAP message identified in the Explore phase. Thus, the attacker can route the XML message to the attacker controlled node (and access the message contents).

public class launchanxmlroutingdetourattack {
@Given("prepare to Launch an XML routing detour attack")
public void prelaunchanxmlroutingdetourattack(){
// The attacker must be able to insert or compromise a system into the processing path for the transaction.
// The targeted system must have multiple stages processing of XML content.
}
@When("Try to Launch an XML routing detour attack")
public void trylaunchanxmlroutingdetourattack(){
//  Try one of the following techniques :
   //1.  The attacker injects a bogus routing node (using a WS-Referral service) into the routing table of the XML header of the SOAP message
}@Then("Assert the success of Launch an XML routing detour attack")
public void asslaunchanxmlroutingdetourattack(){
//  Assert one of the following indications :
   //  -The XML message is routed to the attacker controlled node.
}
}