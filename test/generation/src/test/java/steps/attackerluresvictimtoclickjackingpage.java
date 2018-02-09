package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Attacker utilizes some form of temptation, misdirection or coercion to lure the victim to loading and interacting with the clickjacking page in a way that increases the chances that the victim will click in the right areas.

public class attackerluresvictimtoclickjackingpage {
@Given("prepare to Attacker lures victim to clickjacking page")
public void preattackerluresvictimtoclickjackingpage(){
// Low: A computer connected to the internet.
// The target system's interaction window is open in the victim's browser and supports the ability for initiating sensitive actions on behalf of the user in the target system
}
@When("Try to Attacker lures victim to clickjacking page")
public void tryattackerluresvictimtoclickjackingpage(){
//  Try one of the following techniques :
   //1.  Lure the victim to the malicious site by sending the victim an e-mail with a URL to the site.
   //2.  Lure the victim to the malicious site by manipulating URLs on a site trusted by the victim.
   //3.  Lure the victim to the malicious site through a cross-site scripting attack.
}@Then("Assert the success of Attacker lures victim to clickjacking page")
public void assattackerluresvictimtoclickjackingpage(){
//  Assert one of the following indications :
   //  -The victim loads the clickjacking page.
}
}