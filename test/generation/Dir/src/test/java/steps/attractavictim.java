package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Fixate the session: The attacker now needs to transfer the session identifier from the trap session to the victim by introducing the session identifier into the victim's browser. This is known as fixating the session. The session identifier can be introduced into the victim's browser by leveraging cross site scripting vulnerability, using META tags or setting HTTP response headers in a variety of ways.

public class attractavictim {
@Given("prepare to Attract a Victim")
public void preattractavictim(){
// None
// Predictable session identifiers
}
@When("Try to Attract a Victim")
public void tryattractavictim(){
//  Try one of the following techniques :
   //1.  Attackers can put links on web sites (such as forums, blogs, or comment forms).
   //2.  Attackers can establish rogue proxy servers for network protocols that give out the session ID and then redirect the connection to the legitimate service.
   //3.  Attackers can email attack URLs to potential victims through spam and phishing techniques.
}@Then("Assert the success of Attract a Victim")
public void assattractavictim(){
//  Assert one of the following indications :
   //  -A victim makes a connection according to the attackers' design.
}
}