package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Determine the SWF file susceptibility to XSS. For each SWF file identified in the Explore phase, the attacker attempts to use various techniques such as reverse engineering and various XSS attacks to determine the vulnerability of the file.

public class determinetheswffilesusceptibilitytoxss {
@Given("prepare to Determine the SWF file susceptibility to XSS")
public void predeterminetheswffilesusceptibilitytoxss(){
// 
// 
}
@When("Try to Determine the SWF file susceptibility to XSS")
public void trydeterminetheswffilesusceptibilitytoxss(){
//  Try one of the following techniques :
   //1.  Compile a list of all variables, both global and specific to the file, that might invoke the getURL function.
   //2.  Test each variable by overwriting the variable amount via the URL, by adding "javascript:" followed by a simple JavaScript command such as "alert('xss')".
}@Then("Assert the success of Determine the SWF file susceptibility to XSS")
public void assdeterminetheswffilesusceptibilitytoxss(){
//  Assert one of the following indications :
   //  -At least one variable is found susceptible to flash cross-site scripting.
}
}