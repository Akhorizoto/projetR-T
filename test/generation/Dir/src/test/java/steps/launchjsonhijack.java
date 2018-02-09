package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// An attacker lures the victim to the malicious website or leverages other means to get his malicious code executing in the victim's browser. Once that happens, the malicious code makes a request to the victim target system to retrieve a JSON object with sensitive information. The request includes the victim's session cookie if the victim is logged in.

public class launchjsonhijack {
@Given("prepare to Launch JSON hijack")
public void prelaunchjsonhijack(){
// No specialized hardware resources are required. The attacker needs to have knowledge of the URLs that need to be accessed on the target system to request the JSON objects.
// The JSON object returned from the server can be accessed by the attackers' malicious code via a script tag
}
@When("Try to Launch JSON hijack")
public void trylaunchjsonhijack(){
//  Try one of the following techniques :
   //1.  An attacker employs a myriad of standard techniques to get the victim to visit his or her malicious site or by some other means get the attackers' malicious code executing in the victim's browser.
}@Then("Assert the success of Launch JSON hijack")
public void asslaunchjsonhijack(){
//  Assert one of the following indications :
   //  -The sensitive contents of captured JSON objects are readable by the attacker.
}
}