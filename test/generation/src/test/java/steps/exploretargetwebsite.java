package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker first explores the target website to determine pieces of functionality that are of interest to him (e.g. money transfers). The attacker will need a legitimate user account on the target website. It would help to have two accounts.

public class exploretargetwebsite {
@Given("prepare to Explore target website")
public void preexploretargetwebsite(){
// All the attacker needs is the exact representation of requests to be made to the application and to be able to get the malicious link across to a victim.
// 
}
@When("Try to Explore target website")
public void tryexploretargetwebsite(){
//  Try one of the following techniques :
   //1.  Use web application debugging tool such as WebScarab, Tamper Data or TamperIE to analyze the information exchanged between the client and the server
   //2.  Use network sniffing tool such as Wireshark to analyze the information exchanged between the client and the server
   //3.  View HTML source of web pages that contain links or buttons that perform actions of interest.
}@Then("Assert the success of Explore target website")
public void assexploretargetwebsite(){
//  Assert one of the following indications :
   //  -Attacker identifies at least one piece of interesting functionality that can be executed by making a single HTTP GET or POST request containing no session-specific parameters.
}
}