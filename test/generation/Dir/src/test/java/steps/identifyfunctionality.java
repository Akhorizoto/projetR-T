package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// At each step, the attacker notes the resource or functionality access mechanism invoked upon performing specific actions

public class identifyfunctionality {
@Given("prepare to Identify Functionality")
public void preidentifyfunctionality(){
// No special resources are required for the exploit of this pattern.
// The administrator must have forgotten to associate an ACL or has associated an inappropriately permissive ACL with a particular navigable resource.
}
@When("Try to Identify Functionality")
public void tryidentifyfunctionality(){
//  Try one of the following techniques :
   //1.  Use the web inventory of all forms and inputs and apply attack data to those inputs.
   //2.  Use a packet sniffer to capture and record network traffic
   //3.  Execute the software in a debugger and record API calls into the operating system or important libraries. This might occur in an environment other than a production environment, in order to find weaknesses that can be exploited in a production environment.
}@Then("Assert the success of Identify Functionality")
public void assidentifyfunctionality(){
//  Assert one of the following indications :
   //  -The attacker produces a list of functionality or data that can be accessed through the system.
}
}