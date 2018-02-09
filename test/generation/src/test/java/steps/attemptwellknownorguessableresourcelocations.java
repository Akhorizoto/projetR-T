package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Using an automated tool, an attacker requests a variety of well-known URLs that correspond to administrative, debugging, or other useful internal actions. He records all the positive responses from the server.

public class attemptwellknownorguessableresourcelocations {
@Given("prepare to Attempt well-known or guessable resource locations")
public void preattemptwellknownorguessableresourcelocations(){
// A directory listing is helpful but not a requirement. No special resources are required.
// The forcibly browseable pages or accessible resources must be discoverable and improperly protected.
}
@When("Try to Attempt well-known or guessable resource locations")
public void tryattemptwellknownorguessableresourcelocations(){
//  Try one of the following techniques :
   //1.  Use a spidering tool to follow and record attempts on well-known URLs
   //2.  Use a proxy tool to record all links visited during a manual traversal of attempts on well-known URLs.
}@Then("Assert the success of Attempt well-known or guessable resource locations")
public void assattemptwellknownorguessableresourcelocations(){
//  Assert one of the following indications :
   //  -The attacker discovers one or more unprotected resources.
    //  -Well-known middleware or application platforms are used (e.g., Cold Fusion, WebSphere, WebLogic, JBoss, etc.)
}
}