package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// An attacker writes a script to consistently induce the filter failure.

public class abusethesystemthroughfilterfailure {
@Given("prepare to Abuse the system through filter failure")
public void preabusethesystemthroughfilterfailure(){
// 
// Ability to control the length of data passed to an active filter.
}
@When("Try to Abuse the system through filter failure")
public void tryabusethesystemthroughfilterfailure(){
//  Try one of the following techniques :
   //1.  DoS through filter failure. The attacker causes the system to crash or stay down because of its failure to filter properly.
   //2.  Malicious code execution. An attacker introduces a malicious payload and executes arbitrary code on the target system.
   //3.  An attacker can use the filter failure to introduce malicious data into the system and leverage a subsequent SQL injection, Cross Site Scripting, Command Injection or similar weakness if it exists.
}@Then("Assert the success of Abuse the system through filter failure")
public void assabusethesystemthroughfilterfailure(){
//  Assert one of the following indications :
   //  -Attacker-supplied code is executed on the target system.
}
}