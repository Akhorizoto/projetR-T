package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker may be able to get sensitive information from the cookie. The web application developers may have assumed that cookies are not accessible by end users, and thus, may have put potentially sensitive information in them.

public class obtainsensitiveinformationfromcookie {
@Given("prepare to Obtain sensitive information from cookie")
public void preobtainsensitiveinformationfromcookie(){
// Ability to send HTTP request containing cookie to server
// Target server software must be a HTTP daemon that relies on cookies.
}
@When("Try to Obtain sensitive information from cookie")
public void tryobtainsensitiveinformationfromcookie(){
//  Try one of the following techniques :
   //1.  If cookie shows any signs of being encoded using a standard scheme such as base64, decode it.
   //2.  Analyze the cookie's contents to determine whether it contains any sensitive information.
}@Then("Assert the success of Obtain sensitive information from cookie")
public void assobtainsensitiveinformationfromcookie(){
//  Assert one of the following indications :
   //  -Cookie contains sensitive information that developer did not intent the end user to see.
}
}