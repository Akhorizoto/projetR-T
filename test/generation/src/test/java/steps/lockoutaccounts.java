package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Perform lockout procedure for all accounts that the attacker wants to lock out.

public class lockoutaccounts {
@Given("prepare to Lock Out Accounts")
public void prelockoutaccounts(){
// Computer with access to the login portion of the target system
// An attacker must be able to reproduce behavior that would result in an account being locked.
}
@When("Try to Lock Out Accounts")
public void trylockoutaccounts(){
//  Try one of the following techniques :
   //1.  For each user ID to be locked out, perform the lockout procedure discovered in the first step.
}@Then("Assert the success of Lock Out Accounts")
public void asslockoutaccounts(){
//  Assert one of the following indications :
   //  -Amount of work required by an attacker to lock out a large number of accounts is at least an order of magnitude smaller than the amount of work required to unlock the accounts thereafter.
}
}