package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Determine the technologies used in the target environment such as types of web servers, application firewalls, proxies, etc.

public class identifyhttpparsingchain {
@Given("prepare to Identify HTTP parsing chain")
public void preidentifyhttpparsingchain(){
// None
// Differences in the way the two HTTP entities parse HTTP requests
}
@When("Try to Identify HTTP parsing chain")
public void tryidentifyhttpparsingchain(){
//  Try one of the following techniques :
   //1.  Investigation of the target environment to determine the types of technologies used to parse the incoming HTTP requests. Attempt to understand the parsing chain traversed by the incoming HTTP request.
}@Then("Assert the success of Identify HTTP parsing chain")
public void assidentifyhttpparsingchain(){
//  Assert one of the following indications :
   //  -Full HTTP parsing chain for the application has been identified
}
}