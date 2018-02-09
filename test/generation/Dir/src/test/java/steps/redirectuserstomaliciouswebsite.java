package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// As the attacker succeeds in exploiting the vulnerability, the victim connects to a malicious site using a good web site's domain name.

public class redirectuserstomaliciouswebsite {
@Given("prepare to Redirect users to malicious website")
public void preredirectuserstomaliciouswebsite(){
// The attacker must have the resources to modify the targeted cache. In addition, in most cases the attacker will wish to host the sites to which users will be redirected, although in some cases redirecting to a third party site will accomplish the attackers' goals.
// A DNS cache must be vulnerable to some attack that allows the attacker to replace addresses in its lookup table.
}
@When("Try to Redirect users to malicious website")
public void tryredirectuserstomaliciouswebsite(){
//  Try one of the following techniques :
   //1.  Redirecting Web traffic to a site that looks enough like the original so as to not raise any suspicion.
   //2.  Man-in-the-Middle intercepts secure communication between two parties.
}@Then("Assert the success of Redirect users to malicious website")
public void assredirectuserstomaliciouswebsite(){
//  Assert one of the following indications :
   //  -Any local machine that types names of the good server is redirected to a malicious server.
}
}