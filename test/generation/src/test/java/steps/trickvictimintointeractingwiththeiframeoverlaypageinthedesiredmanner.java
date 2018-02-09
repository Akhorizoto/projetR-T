package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker tricks the victim into clicking on the areas of the UI which contain the hidden action controls and thereby interacts with the target system maliciously with the victim's level of privilege.

public class trickvictimintointeractingwiththeiframeoverlaypageinthedesiredmanner {
@Given("prepare to Trick victim into interacting with the iFrame overlay page in the desired manner")
public void pretrickvictimintointeractingwiththeiframeoverlaypageinthedesiredmanner(){
// No special resource required.
// The victim is communicating with the target application via a web based UI and not a thick client. The victim's browser security policies allow iFrames. The victim uses a modern browser that supports UI elements like clickable buttons (i.e. not using an old text only browser). The victim has an active session with the target system. The target system's interaction window is open in the victim's browser and supports the ability for initiating sensitive actions on behalf of the user in the target system.
}
@When("Try to Trick victim into interacting with the iFrame overlay page in the desired manner")
public void trytrickvictimintointeractingwiththeiframeoverlaypageinthedesiredmanner(){
//  Try one of the following techniques :
   //1.  Hide action controls over very commonly used functionality.
   //2.  Hide action controls over very psychologically tempting content.
}@Then("Assert the success of Trick victim into interacting with the iFrame overlay page in the desired manner")
public void asstrickvictimintointeractingwiththeiframeoverlaypageinthedesiredmanner(){
//  Assert one of the following indications :
}
}