package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// An attacker tries to determine what persistence framework is used by the application in order to leverage a weakness in the generated data access layer code or a weakness in a way that the data access layer may have been used by the developer.

public class determinepersistenceframeworkused {
@Given("prepare to Determine Persistence Framework Used")
public void predeterminepersistenceframeworkused(){
// No specialized resources are required.
// The separation between data plane and control plane is not ensured, through either developer error or an underlying weakness in the data access layer code generation framework
}
@When("Try to Determine Persistence Framework Used")
public void trydeterminepersistenceframeworkused(){
//  Try one of the following techniques :
   //1.  An attacker provides input to the application in an attempt to induce an error screen that reveals a stack trace that gives an indication of the automated data access layer used. Or an attacker may simply make some educated guesses and assume, for instance, that Hibernate is used and try to craft an attack from there.
}@Then("Assert the success of Determine Persistence Framework Used")
public void assdeterminepersistenceframeworkused(){
//  Assert one of the following indications :
}
}