package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// As the attacker succeeds in exploiting the vulnerability, he can choose to attack the user with Cross-Site Scripting. The possible outcomes of such an attack are described in the Cross-Site Scripting related attack patterns.

public class cachepoisoning {
@Given("prepare to Cache poisoning")
public void precachepoisoning(){
// None
// Insufficient input validation in application to check for input sanity before using it as part of response header
}
@When("Try to Cache poisoning")
public void trycachepoisoning(){
//  Try one of the following techniques :
   //1.  The attacker decides to target the cache server by forging new responses. The server will then cache the second request and response. The cached response has most likely an attack vector like Cross-Site Scripting; this attack will then be serve to many clients due to the caching system.
}@Then("Assert the success of Cache poisoning")
public void asscachepoisoning(){
//  Assert one of the following indications :
   //  -The attacker gets the users to be served with this cached malicious HTTP response.
    //  -System performs caching of HTTP responses
}
}