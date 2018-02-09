package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker may steal information, install a back door access mechanism, elevate privileges or compromise the system in some other way.

public class executemaliciouscommands {
@Given("prepare to Execute malicious commands")
public void preexecutemaliciouscommands(){
// 
// User controllable input used as part of commands to the underlying operating system.
}
@When("Try to Execute malicious commands")
public void tryexecutemaliciouscommands(){
//  Try one of the following techniques :
   //1.  The attacker executes a command that stores sensitive information into a location where he can retrieve it later (perhaps using a different command injection).
}@Then("Assert the success of Execute malicious commands")
public void assexecutemaliciouscommands(){
//  Assert one of the following indications :
   //  -The software performs an action the attacker desires. This might be displaying information, storing a program, executing a command, or some other malicious activity.
}
}