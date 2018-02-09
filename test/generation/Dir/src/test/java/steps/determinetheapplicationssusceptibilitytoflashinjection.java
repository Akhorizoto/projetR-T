package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Determine the application's susceptibility to Flash injection. For each URL identified in the explore phase, the attacker attempts to use various techniques such as direct load asfunction, controlled evil page/host, Flash HTML injection, and DOM injection to determine whether the application is susceptible to Flash injection.

public class determinetheapplicationssusceptibilitytoflashinjection {
@Given("prepare to Determine the application's susceptibility to Flash injection")
public void predeterminetheapplicationssusceptibilitytoflashinjection(){
// The attacker may need to be able to serve the injected Flash content, but otherwise no special resources are required.
// The target must be capable of running Flash applications. In some cases, the victim must follow an attacker-supplied link.
}
@When("Try to Determine the application's susceptibility to Flash injection")
public void trydeterminetheapplicationssusceptibilitytoflashinjection(){
//  Try one of the following techniques :
   //1.  Test the page using direct load asfunction, getURL,javascript:gotRoot("")///d.jpg
   //2.  Test the page using controlled evil page/host, http://example.com/evil.swf
   //3.  Test the page using Flash HTML injection, "'><img src='asfunction:getURL,javascript:gotRoot("")//.jpg' >
   //4.  Test the page using DOM injection, (gotRoot(''))
}@Then("Assert the success of Determine the application's susceptibility to Flash injection")
public void assdeterminetheapplicationssusceptibilitytoflashinjection(){
//  Assert one of the following indications :
   //  -Find at least one URL is susceptible to Flash injection.
}
}