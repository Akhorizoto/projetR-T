package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker needs to create a link that will execute some interesting functionality such as transfer money, change a password, etc.

public class createalinkthatwhenclickedonwillexecutetheinterestingfunctionality {
@Given("prepare to Create a link that when clicked on, will execute the interesting functionality.")
public void precreatealinkthatwhenclickedonwillexecutetheinterestingfunctionality(){
// All the attacker needs is the exact representation of requests to be made to the application and to be able to get the malicious link across to a victim.
// 
}
@When("Try to Create a link that when clicked on, will execute the interesting functionality.")
public void trycreatealinkthatwhenclickedonwillexecutetheinterestingfunctionality(){
//  Try one of the following techniques :
   //1.  Create a GET request containing all required parameters (e.g. https://www.somebank.com/members/transfer.asp?to=012345678901&amt=10000)
   //2.  Create a form that will submit a POST request (e.g. <form method="POST" action="https://www.somebank.com/members/transfer.asp"><input type="hidden" Name="to" value="012345678901"/><input type="hidden" Name="amt" value="10000"/><input type="submit" src="clickhere.jpg"/></form>
}@Then("Assert the success of Create a link that when clicked on, will execute the interesting functionality.")
public void asscreatealinkthatwhenclickedonwillexecutetheinterestingfunctionality(){
//  Assert one of the following indications :
   //  -A link that performs an operation that the attacker desires when it is clicked.
}
}