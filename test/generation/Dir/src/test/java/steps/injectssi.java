package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker may then need to view a particular page in order to have the server execute the include directive and run a command or open a file on behalf of the attacker

public class injectssi {
@Given("prepare to Inject SSI")
public void preinjectssi(){
// None: Determining whether the server supports SSI does not require special tools, and nor does injecting directives that get executed.
// User controllable input that can carry include directives to the web server
}
@When("Try to Inject SSI")
public void tryinjectssi(){
//  Try one of the following techniques :
   //.  
}@Then("Assert the success of Inject SSI")
public void assinjectssi(){
//  Assert one of the following indications :
   //  -The attacker views data (perhaps from a file) that he normally should not see.
}
}