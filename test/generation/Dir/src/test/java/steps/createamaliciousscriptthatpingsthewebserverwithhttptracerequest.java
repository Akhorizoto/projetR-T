package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Create a malicious script that will induce the victim's browser to issue an HTTP TRACE request to the destination system's web server. The script will further intercept the response from the web server, pick up sensitive information out of it, and forward to the site controlled by the attacker.

public class createamaliciousscriptthatpingsthewebserverwithhttptracerequest {
@Given("prepare to Create a malicious script that pings the web server with HTTP TRACE request")
public void precreateamaliciousscriptthatpingsthewebserverwithhttptracerequest(){
// No specialized resources are needed
// HTTP is used as the communication protocol between the server and the client
}
@When("Try to Create a malicious script that pings the web server with HTTP TRACE request")
public void trycreateamaliciousscriptthatpingsthewebserverwithhttptracerequest(){
//  Try one of the following techniques :
   //1.  The attacker's malicious script circumvents the httpOnly cookie attribute that prevents from hijacking the victim's session cookie directly using document.cookie and instead leverages the HTTP TRACE to catch this information from the header of the HTTP request once it is echoed back from the web server in the body of the HTTP TRACE response.
}@Then("Assert the success of Create a malicious script that pings the web server with HTTP TRACE request")
public void asscreateamaliciousscriptthatpingsthewebserverwithhttptracerequest(){
//  Assert one of the following indications :
}
}