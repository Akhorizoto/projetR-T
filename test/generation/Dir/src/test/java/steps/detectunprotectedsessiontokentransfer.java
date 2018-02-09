package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker sniffs on the wireless network to detect unencrypted traffic that contains session tokens.

public class detectunprotectedsessiontokentransfer {
@Given("prepare to Detect Unprotected Session Token Transfer")
public void predetectunprotectedsessiontokentransfer(){
// Low: A laptop and access to a public WiFi network.
// The victim initiated communication with a target system that requires transfer of the session token or the target application uses AJAX and thereby periodically "rings home" asynchronously using the session token
}
@When("Try to Detect Unprotected Session Token Transfer")
public void trydetectunprotectedsessiontokentransfer(){
//  Try one of the following techniques :
   //1.  The attacker uses a network sniffer tool like ferret or hamster to monitor the wireless traffic at a WiFi hotspot while examining it for evidence of transmittal of session tokens in unencrypted or recognizably encrypted form. An attacker applies his knowledge of the manner by which session tokens are generated and transmitted by various target systems to identify the session tokens.
}@Then("Assert the success of Detect Unprotected Session Token Transfer")
public void assdetectunprotectedsessiontokentransfer(){
//  Assert one of the following indications :
   //  -The attacker sees session tokens in the unencrypted traffic
    //  -Traffic between the victim and targeted application is unencrypted.
}
}