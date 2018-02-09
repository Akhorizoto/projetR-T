package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Finally, the attacker needs to convince a user that is logged into the target website to click on a link to execute the CSRF attack.

public class convinceusertoclickonlink {
@Given("prepare to Convince user to click on link")
public void preconvinceusertoclickonlink(){
// All the attacker needs is the exact representation of requests to be made to the application and to be able to get the malicious link across to a victim.
// 
}
@When("Try to Convince user to click on link")
public void tryconvinceusertoclickonlink(){
//  Try one of the following techniques :
   //1.  Execute a phishing attack and send the user an e-mail convincing him to click on a link.
   //2.  Execute a stored XSS attack on a website to permanently embed the malicious link into the website.
   //3.  Execute a stored XSS attack on a website where an XMLHTTPRequest object will automatically execute the attack as soon as a user visits the page. This removes the step of convincing a user to click on a link.
   //4.  Include the malicious link on the attackers' own website where the user may have to click on the link, or where an XMLHTTPRequest object may automatically execute the attack when a user visits the site.
}@Then("Assert the success of Convince user to click on link")
public void assconvinceusertoclickonlink(){
//  Assert one of the following indications :
   //  -A user executes the malicious link crafted by the attacker.
}
}