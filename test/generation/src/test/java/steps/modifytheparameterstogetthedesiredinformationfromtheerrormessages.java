package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Attacker usually needs to modify the fuzzing parameters according to the observed error messages to get the desired sensitive information for the application. To defeat correlation, the attacker may try changing the origin IP addresses or client browser identification strings or start a new session from where he left off in obfuscating the attack.

public class modifytheparameterstogetthedesiredinformationfromtheerrormessages {
@Given("prepare to Modify the parameters to get the desired information from the error messages.")
public void premodifytheparameterstogetthedesiredinformationfromtheerrormessages(){
// Fuzzing tools, which automatically generate and send message variants, are necessary for this attack. The attacker must have sufficient access to send messages to the target. The attacker must also have the ability to observe the target application's log and/or error messages in order to collect information about the target.
// The target application must fail to sanitize incoming messages adequately before processing.
}
@When("Try to Modify the parameters to get the desired information from the error messages.")
public void trymodifytheparameterstogetthedesiredinformationfromtheerrormessages(){
//  Try one of the following techniques :
   //1.  Modify the parameters in the fuzzing tool according to the observed error messages. Repeat with enough parameters until the application has been sufficiently mapped.
   //2.  If the application rejects the large amount of fuzzing messages from the same host machine, the attacker needs to hide the attacks by changing the IP addresses or other credentials.
}@Then("Assert the success of Modify the parameters to get the desired information from the error messages.")
public void assmodifytheparameterstogetthedesiredinformationfromtheerrormessages(){
//  Assert one of the following indications :
   //  -The attacker gets a list of sensitive information mapping the application.
}
}