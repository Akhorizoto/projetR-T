import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Depending on whether the application being exploited is a remote or local one the attacker crafts the appropriate malicious input containing the path of the targeted file or other file system control syntax to be passed to the application

public class varyinputslookingformaliciousresults {
@Given("prepare to Vary inputs, looking for malicious results")
public void prevaryinputslookingformaliciousresults(){
// 
// Program must allow for user controlled variables to be applied directly to the filesystem
}
@When("Try to Vary inputs, looking for malicious results")
public void tryvaryinputslookingformaliciousresults(){
//  Try one of the following techniques :
   //1.  Inject context-appropriate malicious file path using network packet injection tools (netcat, nemesis, etc.)
   //2.  Inject context-appropriate malicious file path using web test frameworks (proxies, TamperData, custom programs, etc.) or simple HTTP requests
   //3.  Inject context-appropriate malicious file system control syntax
}@Then("Assert the success of Vary inputs, looking for malicious results")
public void assvaryinputslookingformaliciousresults(){
//  Assert one of the following indications :
   //  -One or more injections that are appropriate to the platform provoke an unexpected response from the software, which can be varied by the attacker based on the input.
    //  -Inventorying in prior step is successful.
}
}