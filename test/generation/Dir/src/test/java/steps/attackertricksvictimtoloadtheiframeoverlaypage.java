package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Attacker utilizes some form of temptation, misdirection or coercion to trick the victim to loading and interacting with the iFrame overlay page in a way that increases the chances that the victim will visit the malicious page.

public class attackertricksvictimtoloadtheiframeoverlaypage {
@Given("prepare to Attacker tricks victim to load the iFrame overlay page")
public void preattackertricksvictimtoloadtheiframeoverlaypage(){
// No special resource required.
// The victim is communicating with the target application via a web based UI and not a thick client. The victim's browser security policies allow iFrames. The victim uses a modern browser that supports UI elements like clickable buttons (i.e. not using an old text only browser). The victim has an active session with the target system. The target system's interaction window is open in the victim's browser and supports the ability for initiating sensitive actions on behalf of the user in the target system.
}
@When("Try to Attacker tricks victim to load the iFrame overlay page")
public void tryattackertricksvictimtoloadtheiframeoverlaypage(){
//  Try one of the following techniques :
   //1.  Trick the victim to the malicious site by sending the victim an e-mail with a URL to the site.
   //2.  Trick the victim to the malicious site by manipulating URLs on a site trusted by the victim.
   //3.  Trick the victim to the malicious site through a cross-site scripting attack.
}@Then("Assert the success of Attacker tricks victim to load the iFrame overlay page")
public void assattackertricksvictimtoloadtheiframeoverlaypage(){
//  Assert one of the following indications :
   //  -The victim loads the iFrame overlay page.
}
}