package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker, by manipulating a file extension or MIME type is able to make the web server return raw information (not executed).

public class discloseinformation {
@Given("prepare to Disclose information")
public void prediscloseinformation(){
// Ability to execute HTTP request to Web server
// Web server software must rely on file name or file extension for processing.
}
@When("Try to Disclose information")
public void trydiscloseinformation(){
//  Try one of the following techniques :
   //1.  Manipulate the file names that are explicitly sent to the server.
   //2.  Manipulate the MIME sent in order to confuse the web server.
}@Then("Assert the success of Disclose information")
public void assdiscloseinformation(){
//  Assert one of the following indications :
   //  -The attacker gets the information from the server
}
}