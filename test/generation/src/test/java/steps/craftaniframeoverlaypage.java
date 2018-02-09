package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker crafts a malicious iFrame overlay page.

public class craftaniframeoverlaypage {
@Given("prepare to Craft an iFrame Overlay page")
public void precraftaniframeoverlaypage(){
// No special resource required.
// The victim is communicating with the target application via a web based UI and not a thick client. The victim's browser security policies allow iFrames. The victim uses a modern browser that supports UI elements like clickable buttons (i.e. not using an old text only browser). The victim has an active session with the target system. The target system's interaction window is open in the victim's browser and supports the ability for initiating sensitive actions on behalf of the user in the target system.
}
@When("Try to Craft an iFrame Overlay page")
public void trycraftaniframeoverlaypage(){
//  Try one of the following techniques :
   //1.  The attacker leverages iFrame overlay capabilities to craft a malicious iFrame overlay page.
}@Then("Assert the success of Craft an iFrame Overlay page")
public void asscraftaniframeoverlaypage(){
//  Assert one of the following indications :
   //  -A page is created that performs unseen actions when the user interacts with the visible UI.
}
}