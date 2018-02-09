package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// An attacker publishes content on their own server with their own name and DNS server. Attract HTTP traffic and explore rebinding vulnerabilities in browsers, flash players of old version.

public class identifypotentialdnsrebindingtargets {
@Given("prepare to Identify potential DNS rebinding targets")
public void preidentifypotentialdnsrebindingtargets(){
// The attacker must serve some web content that a victim accesses initially. This content must include executable content that queries the attackers' DNS name (to provide the second DNS resolution) and then performs the follow-on attack against the internal system. The attacker also requires a customized DNS server that serves an IP address for their registered DNS name, but which resolves subsequent requests by a single client to addresses internal to that client's network.
// The target browser must access content server from the attacker controlled DNS name. Web advertisements are often used for this purpose. The target browser must honor the TTL value returned by the attacker and re-resolve the attackers' DNS name after initial contact.
}
@When("Try to Identify potential DNS rebinding targets")
public void tryidentifypotentialdnsrebindingtargets(){
//  Try one of the following techniques :
   //1.  Attacker uses Web advertisements to attract the victim to access attacker's DNS. Explore the versions of web browser or flash players in HTTP request.
}@Then("Assert the success of Identify potential DNS rebinding targets")
public void assidentifypotentialdnsrebindingtargets(){
//  Assert one of the following indications :
   //  -A list of browser's information.
}
}