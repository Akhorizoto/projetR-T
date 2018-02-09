package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Manually or using an automated tool, an attacker searches for all input locations where a user has control over the filenames or MIME types of files submitted to the web server.

public class footprintfileinputvectors {
@Given("prepare to Footprint file input vectors")
public void prefootprintfileinputvectors(){
// Ability to execute HTTP request to Web server
// Web server software must rely on file name or file extension for processing.
}
@When("Try to Footprint file input vectors")
public void tryfootprintfileinputvectors(){
//  Try one of the following techniques :
   //1.  Attacker manually crawls application to identify file inputs
   //2.  Attacker uses an automated tool to crawl application identify file inputs
   //3.  Attacker manually assesses strength of access control protecting native application files from user control
   //4.  Attacker explores potential for submitting files directly to the web server via independently constructed HTTP Requests
}@Then("Assert the success of Footprint file input vectors")
public void assfootprintfileinputvectors(){
//  Assert one of the following indications :
   //  -User-controllable files are identified
}
}