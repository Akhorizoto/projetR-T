package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker probes the access control for functions and data identified in the Explore phase to identify potential weaknesses in how the access controls are configured.

public class identifyweakpointsinaccesscontrolconfigurations {
@Given("prepare to Identify weak points in access control configurations")
public void preidentifyweakpointsinaccesscontrolconfigurations(){
// No special resources are required for this attack.
// The target must apply access controls, but incorrectly configure them. However, not all incorrect configurations can be exploited by an attacker. If the incorrect configuration applies too little security to some functionality, then the attacker may be able to exploit it if the access control would be the only thing preventing an attacker's access and it no longer does so. If the incorrect configuration applies too much security, it must prevent legitimate activity and the attacker must be able to force others to require this activity..
}
@When("Try to Identify weak points in access control configurations")
public void tryidentifyweakpointsinaccesscontrolconfigurations(){
//  Try one of the following techniques :
   //1.  The attacker attempts authenticated access to targeted functions and data.
   //2.  The attacker attempts unauthenticated access to targeted functions and data.
   //1.  The attacker attempts indirect and side channel access to targeted functions and data.
}@Then("Assert the success of Identify weak points in access control configurations")
public void assidentifyweakpointsinaccesscontrolconfigurations(){
//  Assert one of the following indications :
}
}