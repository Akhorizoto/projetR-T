package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker uses the entry points gathered in the "Explore" phase as a target list and injects various UTF-8 encoded payloads to determine if an entry point actually represents a vulnerability with insufficient validation logic and to characterize the extent to which the vulnerability can be exploited.

public class probeentrypointstolocatevulnerabilities {
@Given("prepare to Probe entry points to locate vulnerabilities")
public void preprobeentrypointstolocatevulnerabilities(){
// 
// Input filtering and validating is not done properly leaving the door open to harmful characters for the target host.
}
@When("Try to Probe entry points to locate vulnerabilities")
public void tryprobeentrypointstolocatevulnerabilities(){
//  Try one of the following techniques :
   //1.  Try to use UTF-8 encoding of content in Scripts in order to bypass validation routines.
   //2.  Try to use UTF-8 encoding of content in HTML in order to bypass validation routines.
   //3.  Try to use UTF-8 encoding of content in CSS in order to bypass validation routines.
}@Then("Assert the success of Probe entry points to locate vulnerabilities")
public void assprobeentrypointstolocatevulnerabilities(){
//  Assert one of the following indications :
   //  -The attacker's UTF-8 encoded payload is processed and acted on by the application without filtering or transcoding
    //  -The application accepts user-controllable input.
}
}