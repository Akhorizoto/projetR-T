import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker may be able to modify or replace cookies to bypass security controls in the application.

public class modifycookietosubvertsecuritycontrols {
@Given("prepare to Modify cookie to subvert security controls.")
public void premodifycookietosubvertsecuritycontrols(){
// Ability to send HTTP request containing cookie to server
// Target server software must be a HTTP daemon that relies on cookies.
}
@When("Try to Modify cookie to subvert security controls.")
public void trymodifycookietosubvertsecuritycontrols(){
//  Try one of the following techniques :
   //1.  Modify logical parts of cookie and send it back to server to observe the effects.
   //2.  Modify numeric parts of cookie arithmetically and send it back to server to observe the effects.
   //3.  Modify cookie bitwise and send it back to server to observe the effects.
   //4.  Replace cookie with an older legitimate cookie and send it back to server to observe the effects. This technique would be helpful in cases where the cookie contains a "points balance" for a given user where the points have some value. The user may spend his points and then replace his cookie with an older one to restore his balance.
}@Then("Assert the success of Modify cookie to subvert security controls.")
public void assmodifycookietosubvertsecuritycontrols(){
//  Assert one of the following indications :
   //  -Subversion of security controls on server
}
}