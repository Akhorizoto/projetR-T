package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Attacker knows that the computer/OS/application can install additional components or full applications as requested by the user, loads the sniffer set up during Explore phase, and extracts the downloaded code from subsequent communication. The attacker then proceeds to reverse engineer the captured code and the communication protocols used.

public class capturingapplicationcodeboundduringpatching {
@Given("prepare to Capturing Application Code Bound During Patching")
public void precapturingapplicationcodeboundduringpatching(){
// The Attacker needs the ability to capture communications between the client and server during an initial installation. In the case that encryption obscures client/server communication the attacker needs to lift key material from the client.
// The attacker must be able to employ a sniffer in the path between the server and client without being detected. The targeted operating system or application must be configured to allow for end users to request new components and applications from the server.
}
@When("Try to Capturing Application Code Bound During Patching")
public void trycapturingapplicationcodeboundduringpatching(){
//  Try one of the following techniques :
   //1.  Attacker loads the sniffer to capture the application code bound during an initial installation.
   //2.  The attacker proceeds to reverse engineer the captured code.
}@Then("Assert the success of Capturing Application Code Bound During Patching")
public void asscapturingapplicationcodeboundduringpatching(){
//  Assert one of the following indications :
   //  -The attacker captures the application code bound for the target and reverse engineers the captured code.
}
}