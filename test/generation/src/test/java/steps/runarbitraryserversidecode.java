package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// As the attacker succeeds in exploiting the vulnerability, he is able to execute server-side code within the application. The malicious code has virtual access to the same resources as the targeted application. Note that the attacker might include shell code in his script and execute commands on the server under the same privileges as the PHP runtime is running with.

public class runarbitraryserversidecode {
@Given("prepare to Run arbitrary server-side code")
public void prerunarbitraryserversidecode(){
// Ability to send HTTP request to a web application Ability to store PHP scripts on a server
// Target application server must allow remote files to be included in the "require", "include", etc. PHP directives
}
@When("Try to Run arbitrary server-side code")
public void tryrunarbitraryserversidecode(){
//  Try one of the following techniques :
   //1.  Develop malicious PHP script that is injected through vectors identified during the Experiment Phase and executed by the application server to execute a custom PHP script.
}@Then("Assert the success of Run arbitrary server-side code")
public void assrunarbitraryserversidecode(){
//  Assert one of the following indications :
   //  -The attacker's script is being executed on the application server
}
}