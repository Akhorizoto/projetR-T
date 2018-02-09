package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker decides to target the web server by crafting a malicious HTTP Request containing a second HTTP Request using syntax that will not be processed and acted on by an outer "filter" parsing layer but will be acted on by the inner web server/application processing layers. The application/web server will then act on the malicious HTTP Request as if it is a valid request from the client potentially subverting session management.

public class sessionhijacking {
@Given("prepare to Session Hijacking")
public void presessionhijacking(){
// None
// Differences in the way the two HTTP entities parse HTTP requests
}
@When("Try to Session Hijacking")
public void trysessionhijacking(){
//  Try one of the following techniques :
   //1.  Leverage the vulnerabilities identified in the Experiment Phase to inject malicious HTTP request that contains HTTP Request syntax that will not be processed and acted on by the outer parsing layer of the malicious content filters but will be by the inner application/web server layer. In this way it will be acted on by the application/web server as if it is a valid request from the client.
}@Then("Assert the success of Session Hijacking")
public void asssessionhijacking(){
//  Assert one of the following indications :
   //  -The attacker gets the application/web server to act on the malicious HTTP request and allows the attacker to gain control of the target user's session.
}
}