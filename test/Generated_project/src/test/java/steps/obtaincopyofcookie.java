package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker first needs to obtain a copy of the cookie. The attacker may be a legitimate end user wanting to escalate privilege, or could be somebody sniffing on a network to get a copy of HTTP cookies.

public class obtaincopyofcookie {
@Given("prepare to Obtain copy of cookie")
public void preobtaincopyofcookie(){
// Ability to send HTTP request containing cookie to server
// Target server software must be a HTTP daemon that relies on cookies.
}
@When("Try to Obtain copy of cookie")
public void tryobtaincopyofcookie(){
//  Try one of the following techniques :
   //1.  Obtain cookie from local filesystem (e.g. C:\Documents and Settings\*\Cookies and C:\Documents and Settings\*\Application Data\Mozilla\Firefox\Profiles\*\cookies.txt in Windows)
   //2.  Sniff cookie using a network sniffer such as Wireshark
   //3.  Obtain cookie from local memory or filesystem using a utility such as the Firefox Cookie Manager or AnEC Cookie Editor.
   //4.  Steal cookie via a cross-site scripting attack.
   //5.  Guess cookie contents if it contains predictable information.
}@Then("Assert the success of Obtain copy of cookie")
public void assobtaincopyofcookie(){
//  Assert one of the following indications :
   //  -Cookie captured by attacker.
}
}