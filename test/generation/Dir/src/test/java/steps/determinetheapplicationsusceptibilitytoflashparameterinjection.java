package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Determine the application susceptibility to Flash parameter injection. For each URL identified in the Explore phase, the attack attempts to use various techniques such as DOM based, reflected, flashvars, persistent attacks depending on the type of parameter passed to the embedded Flash movie.

public class determinetheapplicationsusceptibilitytoflashparameterinjection {
@Given("prepare to Determine the application susceptibility to Flash parameter injection")
public void predeterminetheapplicationsusceptibilitytoflashparameterinjection(){
// The attacker must convince the victim to click their crafted link.
// 
}
@When("Try to Determine the application susceptibility to Flash parameter injection")
public void trydeterminetheapplicationsusceptibilitytoflashparameterinjection(){
//  Try one of the following techniques :
   //1.  When the JavaScript 'document.location' variable is used as part of parameter, inject '#' and payload into the parameter in the URL.
   //2.  When the name of the Flash movie is exposed as a form or a URL parameter, the attacker injects '?' and payload after the movie name in the URL to overrides some global value.
   //3.  When the arguments passed in the 'flashvars' attributes, the attacker injects '&' and payload in the URL.
   //4.  If some of the attributes of the <object> tag are received as parameters, the 'flashvars' attribute is injected into the <object> tag without the creator of the Web page ever intending to allow arguments to be passed into the Flash file.
   //5.  If shared objects are used to save data that is entered by the user persistent Flash parameter injection may occur, with malicious code being injected into the Flash file and executed, every time the Flash movie is loaded.
}@Then("Assert the success of Determine the application susceptibility to Flash parameter injection")
public void assdeterminetheapplicationsusceptibilitytoflashparameterinjection(){
//  Assert one of the following indications :
   //  -At least one URL is found susceptible to flash parameter injection.
}
}