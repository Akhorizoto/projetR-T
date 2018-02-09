package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Investigate the security features present in the system that may trigger an account lockout

public class investigateaccountlockoutbehaviorofsystem {
@Given("prepare to Investigate account lockout behavior of system")
public void preinvestigateaccountlockoutbehaviorofsystem(){
// Computer with access to the login portion of the target system
// An attacker must be able to reproduce behavior that would result in an account being locked.
}
@When("Try to Investigate account lockout behavior of system")
public void tryinvestigateaccountlockoutbehaviorofsystem(){
//  Try one of the following techniques :
   //1.  Analyze system documentation to find list of events that could potentially cause account lockout
   //2.  Obtain user account in system and attempt to lock it out by sending malformed or incorrect data repeatedly
   //3.  Determine another user's login ID, and attempt to brute force the password (or other credentials) for it a predetermined number of times, or until the system provides an indication that the account is locked out.
}@Then("Assert the success of Investigate account lockout behavior of system")
public void assinvestigateaccountlockoutbehaviorofsystem(){
//  Assert one of the following indications :
   //  -Attacker determines at least one way to lock out accounts.
}
}