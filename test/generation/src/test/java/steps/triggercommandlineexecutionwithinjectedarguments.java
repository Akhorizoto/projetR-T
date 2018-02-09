package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker causes execution of command line functionality which leverages previously injected database content as arguments.

public class triggercommandlineexecutionwithinjectedarguments {
@Given("prepare to Trigger command line execution with injected arguments")
public void pretriggercommandlineexecutionwithinjectedarguments(){
// No specialized resources are required
// Malicious data is used on the backend as a command line argument
}
@When("Try to Trigger command line execution with injected arguments")
public void trytriggercommandlineexecutionwithinjectedarguments(){
//  Try one of the following techniques :
   //.  
}@Then("Assert the success of Trigger command line execution with injected arguments")
public void asstriggercommandlineexecutionwithinjectedarguments(){
//  Assert one of the following indications :
   //  -Attacker's injected code is executed.
}
}