package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker tampers with the SOAP message parameters and looks for indications that the tampering caused a change in behavior of the targeted application.

public class detectincorrectsoapparameterhandling {
@Given("prepare to Detect Incorrect SOAP Parameter Handling")
public void predetectincorrectsoapparameterhandling(){
// No specialized hardware resources are required
// The service provider does not properly utilize parameter binding when building SQL queries
}
@When("Try to Detect Incorrect SOAP Parameter Handling")
public void trydetectincorrectsoapparameterhandling(){
//  Try one of the following techniques :
   //1.  The attacker tampers with the SOAP message parameters by injecting some special characters such as single quotes, double quotes, semi columns, etc. The attacker observes system behavior.
}@Then("Assert the success of Detect Incorrect SOAP Parameter Handling")
public void assdetectincorrectsoapparameterhandling(){
//  Assert one of the following indications :
   //  -Any indication that the injected input is causing system trouble (e.g. stack traces are produced, the system does not respond, etc.) then the attacker may come to conclude that the system is vulnerable to SQL injection through SOAP parameter tampering.
    //  -SOAP messages are used as a communication mechanism in the system
}
}