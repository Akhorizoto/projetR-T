import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// When the attacker targets the current application or another one (through CSRF vulnerabilities), the user will then be the one who perform the attacks without being aware of it. These attacks are mostly targeting application logic flaws, but it can also be used to create a widespread attack against a particular website on the user's current network (Internet or not).

public class forcefulbrowsing {
@Given("prepare to Forceful browsing")
public void preforcefulbrowsing(){
// Ability to send HTTP request to a web application
// Target client software must allow scripting such as JavaScript and allows executable content delivered using a data URI scheme.
}
@When("Try to Forceful browsing")
public void tryforcefulbrowsing(){
//  Try one of the following techniques :
   //1.  Develop malicious JavaScript that is injected through vectors identified during the Experiment Phase and loaded by the victim's browser and performs actions on the same web site
   //2.  Develop malicious JavaScript that injected through vectors identified during the Experiment Phase and takes commands from an attacker's server and then causes the browser to execute request to other web sites (especially the web applications that have CSRF vulnerabilities).
}@Then("Assert the success of Forceful browsing")
public void assforcefulbrowsing(){
//  Assert one of the following indications :
   //  -The attacker indirectly controls the user's browser and makes it performing actions exploiting CSRF.
}
}