package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The fuzzing attacker observes the target system looking for inputs and communications between modules, subsystems, or systems.

public class observecommunicationandinputs {
@Given("prepare to Observe communication and inputs")
public void preobservecommunicationandinputs(){
// Fuzzing tools.
// 
}
@When("Try to Observe communication and inputs")
public void tryobservecommunicationandinputs(){
//  Try one of the following techniques :
   //1.  Network sniffing. Using a network sniffer such as wireshark, the attacker observes communications into and out of the target system.
   //2.  Monitor API execution. Using a tool such as ktrace, strace, APISpy, or another debugging tool, the attacker observes the system calls and API calls that are made by the target system, and the nature of their parameters.
   //3.  Observe inputs using web inspection tools (OWASP's WebScarab, Paros, TamperData, TamperIE, etc.)
}@Then("Assert the success of Observe communication and inputs")
public void assobservecommunicationandinputs(){
//  Assert one of the following indications :
   //  -The attacker creates a list of unique communications packets, messages, inputs, API calls or other actions the software takes.
}
}