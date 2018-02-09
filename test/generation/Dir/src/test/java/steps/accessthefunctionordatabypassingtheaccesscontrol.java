package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker executes the function or accesses the data identified in the Explore phase bypassing the access control.

public class accessthefunctionordatabypassingtheaccesscontrol {
@Given("prepare to Access the function or data bypassing the access control")
public void preaccessthefunctionordatabypassingtheaccesscontrol(){
// No special resources are required for this attack.
// The target must apply access controls, but incorrectly configure them. However, not all incorrect configurations can be exploited by an attacker. If the incorrect configuration applies too little security to some functionality, then the attacker may be able to exploit it if the access control would be the only thing preventing an attacker's access and it no longer does so. If the incorrect configuration applies too much security, it must prevent legitimate activity and the attacker must be able to force others to require this activity..
}
@When("Try to Access the function or data bypassing the access control")
public void tryaccessthefunctionordatabypassingtheaccesscontrol(){
//  Try one of the following techniques :
   //1.  The attacker executes the function or accesses the data not authorized to him.
}@Then("Assert the success of Access the function or data bypassing the access control")
public void assaccessthefunctionordatabypassingtheaccesscontrol(){
//  Assert one of the following indications :
   //  -Functionality is accessible to unauthorized users.
}
}