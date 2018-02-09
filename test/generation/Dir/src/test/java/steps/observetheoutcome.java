package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Observe the outputs to the inputs fed into the system by fuzzers and see if anything interesting happens. If failure occurs, determine why that happened. Figure out the underlying assumption that was invalidated by the input.

public class observetheoutcome {
@Given("prepare to Observe the outcome")
public void preobservetheoutcome(){
// Fuzzing tools.
// 
}
@When("Try to Observe the outcome")
public void tryobservetheoutcome(){
//  Try one of the following techniques :
   //.  
}@Then("Assert the success of Observe the outcome")
public void assobservetheoutcome(){
//  Assert one of the following indications :
   //  -If the software's indicators (error messages, etc.) vary clearly based on the attackers' input, then the attacker has a sufficient starting point for customizing his attack.
    //  -The previous step led to plausible, practical fuzz inputs.
}
}