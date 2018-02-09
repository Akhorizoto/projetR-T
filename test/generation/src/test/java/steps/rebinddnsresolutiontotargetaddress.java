package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// the target makes a subsequent request to the attackers' content the attackers' DNS server must again be queried, but this time the DNS server returns an address internal to the target's organization that would not be accessible from an outside source.

public class rebinddnsresolutiontotargetaddress {
@Given("prepare to Rebind DNS resolution to target address")
public void prerebinddnsresolutiontotargetaddress(){
// The attacker must serve some web content that a victim accesses initially. This content must include executable content that queries the attackers' DNS name (to provide the second DNS resolution) and then performs the follow-on attack against the internal system. The attacker also requires a customized DNS server that serves an IP address for their registered DNS name, but which resolves subsequent requests by a single client to addresses internal to that client's network.
// The target browser must access content server from the attacker controlled DNS name. Web advertisements are often used for this purpose. The target browser must honor the TTL value returned by the attacker and re-resolve the attackers' DNS name after initial contact.
}
@When("Try to Rebind DNS resolution to target address")
public void tryrebinddnsresolutiontotargetaddress(){
//  Try one of the following techniques :
   //.  
}@Then("Assert the success of Rebind DNS resolution to target address")
public void assrebinddnsresolutiontotargetaddress(){
//  Assert one of the following indications :
   //  -Attacker rebinds victim's internal IP address of these servers with his server name.
}
}