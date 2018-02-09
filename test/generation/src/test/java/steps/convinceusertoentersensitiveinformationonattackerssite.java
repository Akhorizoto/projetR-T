package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// An attacker sends an e-mail to the victim that has some sort of a call to action to get the user to click on the link included in the e-mail (which takes the victim to attacker's website) and log in. The key is to get the victim to believe that the e-mail is coming from a legitimate entity with which the victim does business and that the website pointed to by the URL in the e-mail is the legitimate website. A call to action will usually need to sound legitimate and urgent enough to prompt action from the user.

public class convinceusertoentersensitiveinformationonattackerssite {
@Given("prepare to Convince user to enter sensitive information on attacker's site.")
public void preconvinceusertoentersensitiveinformationonattackerssite(){
// Some web development tools to put up a fake website.
// The replicated website needs to look extremely similar to the original website and the URL used to get to that website needs to look like the real URL of the said business entity.
}
@When("Try to Convince user to enter sensitive information on attacker's site.")
public void tryconvinceusertoentersensitiveinformationonattackerssite(){
//  Try one of the following techniques :
   //1.  Send the user a message from a spoofed legitimate-looking e-mail address that asks the user to click on the included link.
   //2.  Place phishing link in post to online forum.
}@Then("Assert the success of Convince user to enter sensitive information on attacker's site.")
public void assconvinceusertoentersensitiveinformationonattackerssite(){
//  Assert one of the following indications :
   //  -Legitimate user clicks on link supplied by attacker and enters the requested information.
}
}