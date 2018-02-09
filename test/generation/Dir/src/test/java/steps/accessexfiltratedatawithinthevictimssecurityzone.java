package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker can then use scripts in the content the target retrieved from the attacker in the original message to exfiltrate data from the internal addresses. This allows attackers to discover sensitive information about the internal network of an enterprise.

public class accessexfiltratedatawithinthevictimssecurityzone {
@Given("prepare to Access & exfiltrate data within the victim's security zone")
public void preaccessexfiltratedatawithinthevictimssecurityzone(){
// The attacker must serve some web content that a victim accesses initially. This content must include executable content that queries the attackers' DNS name (to provide the second DNS resolution) and then performs the follow-on attack against the internal system. The attacker also requires a customized DNS server that serves an IP address for their registered DNS name, but which resolves subsequent requests by a single client to addresses internal to that client's network.
// The target browser must access content server from the attacker controlled DNS name. Web advertisements are often used for this purpose. The target browser must honor the TTL value returned by the attacker and re-resolve the attackers' DNS name after initial contact.
}
@When("Try to Access & exfiltrate data within the victim's security zone")
public void tryaccessexfiltratedatawithinthevictimssecurityzone(){
//  Try one of the following techniques :
   //1.  Attacker attempts to use victim's browser as an HTTP proxy to other resources inside the target's security zone. This allows two IP addresses placed in the same security zone.
   //2.  Attacker tries to scan and access all internal hosts in victim's local network by sending multiple short-lived IP addresses.
}@Then("Assert the success of Access & exfiltrate data within the victim's security zone")
public void assaccessexfiltratedatawithinthevictimssecurityzone(){
//  Assert one of the following indications :
   //  -Two IP addresses placed in the same security zone communicating each other.
}
}