package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The first time the target accesses the attackers' content, the attackers' name must be resolved to an IP address. The attacker's DNS server performs this resolution, providing a short Time-To-Live (TTL) in order to prevent the target from caching the value.

public class establishinitialtargetaccesstoattackerdns {
@Given("prepare to Establish initial target access to attacker DNS")
public void preestablishinitialtargetaccesstoattackerdns(){
// The attacker must serve some web content that a victim accesses initially. This content must include executable content that queries the attackers' DNS name (to provide the second DNS resolution) and then performs the follow-on attack against the internal system. The attacker also requires a customized DNS server that serves an IP address for their registered DNS name, but which resolves subsequent requests by a single client to addresses internal to that client's network.
// The target browser must access content server from the attacker controlled DNS name. Web advertisements are often used for this purpose. The target browser must honor the TTL value returned by the attacker and re-resolve the attackers' DNS name after initial contact.
}
@When("Try to Establish initial target access to attacker DNS")
public void tryestablishinitialtargetaccesstoattackerdns(){
//  Try one of the following techniques :
   //.  
}@Then("Assert the success of Establish initial target access to attacker DNS")
public void assestablishinitialtargetaccesstoattackerdns(){
//  Assert one of the following indications :
   //  -The attacker finds some local active servers.
}
}