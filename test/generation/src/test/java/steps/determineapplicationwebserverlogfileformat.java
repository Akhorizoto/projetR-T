package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker observes the system and looks for indicators of which logging utility is being used by the web server.

public class determineapplicationwebserverlogfileformat {
@Given("prepare to Determine Application Web Server Log File Format")
public void predetermineapplicationwebserverlogfileformat(){
// Ability to send specially formatted HTTP request to web server
// Target server software must be a HTTP server that performs web logging.
}
@When("Try to Determine Application Web Server Log File Format")
public void trydetermineapplicationwebserverlogfileformat(){
//  Try one of the following techniques :
   //1.  Determine logging utility being used by application web server (e.g. log4j), only possible if the application is known by the attacker or if the application returns error messages with logging utility information.
}@Then("Assert the success of Determine Application Web Server Log File Format")
public void assdetermineapplicationwebserverlogfileformat(){
//  Assert one of the following indications :
   //  -Attacker determines log file format used by application web server.
}
}