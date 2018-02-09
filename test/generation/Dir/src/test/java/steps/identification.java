package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Using a browser or an automated tool, an attacker records all instances of URLs (or partial URL such as domain) passed to a flash file (SWF).

public class identification {
@Given("prepare to Identification")
public void preidentification(){
// 
// The targeted Flash application must reference external URLs and the locations thus referenced must be controllable through parameters. The Flash application must fail to sanitize such parameters against malicious manipulation. The victim must follow a crafted link created by the attacker.
}
@When("Try to Identification")
public void tryidentification(){
//  Try one of the following techniques :
   //1.  Use an automated tool to record the variables passed to a flash file.
   //2.  Use a browser to manually explore the website and analyze how the flash file receive variables, e.g. JavaScript using SetVariable/GetVariable, HTML FlashVars param tag, etc.
   //3.  Use decompilers to retrieve the flash source code and record all user-controllable variables passed to a loadMovie* directive.
}@Then("Assert the success of Identification")
public void assidentification(){
//  Assert one of the following indications :
   //  -A list of flash files, with their corresponding parameters is created by the attacker.
}
}