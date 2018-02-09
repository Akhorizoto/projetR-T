package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// When the attacker targets the current flash application, he can choose to inject JavaScript in the client's DOM and therefore execute cross-site scripting attack.

public class executejavascriptinvictimsbrowser {
@Given("prepare to Execute JavaScript in victim's browser")
public void preexecutejavascriptinvictimsbrowser(){
// 
// The targeted Flash application must reference external URLs and the locations thus referenced must be controllable through parameters. The Flash application must fail to sanitize such parameters against malicious manipulation. The victim must follow a crafted link created by the attacker.
}
@When("Try to Execute JavaScript in victim's browser")
public void tryexecutejavascriptinvictimsbrowser(){
//  Try one of the following techniques :
   //1.  Develop malicious JavaScript that is injected from the rogue flash movie to the targeted flash application through vectors identified during the Experiment Phase and loaded by the victim's browser.
}@Then("Assert the success of Execute JavaScript in victim's browser")
public void assexecutejavascriptinvictimsbrowser(){
//  Assert one of the following indications :
   //  -The attacker is able to execute a DOM based cross-site scripting attack on the victim.
}
}