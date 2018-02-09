package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Attacker sends malformed HTTP Requests to the application looking for differences in the ways that individual layers in the parsing chain parse requests. When differences are identified, the attacker crafts specially malformed HTTP requests to determine if the identified parsing differences will allow extra requests to be smuggled through parsing layers.

public class probeforvulnerabledifferencesinhttpparsingchain {
@Given("prepare to Probe for vulnerable differences in HTTP parsing chain")
public void preprobeforvulnerabledifferencesinhttpparsingchain(){
// None
// Differences in the way the two HTTP entities parse HTTP requests
}
@When("Try to Probe for vulnerable differences in HTTP parsing chain")
public void tryprobeforvulnerabledifferencesinhttpparsingchain(){
//  Try one of the following techniques :
   //1.  Create many consecutive requests to the server. Some of which must be malformed.
   //2.  Use a proxy tool to record the HTTP responses headers.
}@Then("Assert the success of Probe for vulnerable differences in HTTP parsing chain")
public void assprobeforvulnerabledifferencesinhttpparsingchain(){
//  Assert one of the following indications :
   //  -One layer in the application's HTTP parsing chain processes HTTP Requests that other layers do not. The server smuggles the user request into the last attacker's request and transport data such as cookie, etc.
}
}