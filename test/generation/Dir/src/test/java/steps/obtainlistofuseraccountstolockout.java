package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Generate a list of valid user accounts to lock out

public class obtainlistofuseraccountstolockout {
@Given("prepare to Obtain list of user accounts to lock out")
public void preobtainlistofuseraccountstolockout(){
// Computer with access to the login portion of the target system
// An attacker must be able to reproduce behavior that would result in an account being locked.
}
@When("Try to Obtain list of user accounts to lock out")
public void tryobtainlistofuseraccountstolockout(){
//  Try one of the following techniques :
   //1.  Obtain list of authorized users using another attack pattern, such as SQL Injection.
   //2.  Attempt to create accounts if possible; system should indicate if a user ID is already taken.
   //3.  Attempt to brute force user IDs if system reveals whether a given user ID is valid or not upon failed login attempts.
}@Then("Assert the success of Obtain list of user accounts to lock out")
public void assobtainlistofuseraccountstolockout(){
//  Assert one of the following indications :
   //  -Attacker gathers list of user IDs
    //  -System indicates which user IDs are valid and which are not to unauthenticated users.
}
}