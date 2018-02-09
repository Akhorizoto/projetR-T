package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker utilizes web page layering techniques to try to craft a malicious clickjacking page

public class craftaclickjackingpage {
@Given("prepare to Craft a clickjacking page")
public void precraftaclickjackingpage(){
// Low: A computer connected to the internet.
// The target system's interaction window is open in the victim's browser and supports the ability for initiating sensitive actions on behalf of the user in the target system
}
@When("Try to Craft a clickjacking page")
public void trycraftaclickjackingpage(){
//  Try one of the following techniques :
   //1.  The attacker leveraged iframe overlay capabilities to craft a malicious clickjacking page
   //2.  The attacker leveraged Flash file overlay capabilities to craft a malicious clickjacking page
   //3.  The attacker leveraged Silverlight overlay capabilities to craft a malicious clickjacking page
   //4.  The attacker leveraged cross-frame scripting to craft a malicious clickjacking page
}@Then("Assert the success of Craft a clickjacking page")
public void asscraftaclickjackingpage(){
//  Assert one of the following indications :
   //  -A page is created that performs unseen actions when the user interacts with the visible UI
    //  -Overlay capabilities are enabled in the browser
}
}