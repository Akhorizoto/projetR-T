package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Understanding how certain file types are processed by web servers, an attacker crafts varying file payloads and modifies their file extension or MIME type to be that of the targeted type to see if the web server is vulnerable to misclassification of that type.

public class filemisclassificationsniping {
@Given("prepare to File misclassification sniping")
public void prefilemisclassificationsniping(){
// Ability to execute HTTP request to Web server
// Web server software must rely on file name or file extension for processing.
}
@When("Try to File misclassification sniping")
public void tryfilemisclassificationsniping(){
//  Try one of the following techniques :
   //1.  Craft a malicious file payload, modify file extension to the targeted file type and submit it to the web server.
   //2.  Craft a malicious file payload, modify its associated MIME type to the targeted file type and submit it to the web server.
}@Then("Assert the success of File misclassification sniping")
public void assfilemisclassificationsniping(){
//  Assert one of the following indications :
   //  -Attacker's payload is acted on by web server.
}
}