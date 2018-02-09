package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// As the attacker succeeds in exploiting the vulnerability, he targets the content of the flash application to steal variable content, password, etc.

public class accessormodifyflashapplicationvariables {
@Given("prepare to Access or Modify Flash Application Variables")
public void preaccessormodifyflashapplicationvariables(){
// 
// The targeted Flash application must reference external URLs and the locations thus referenced must be controllable through parameters. The Flash application must fail to sanitize such parameters against malicious manipulation. The victim must follow a crafted link created by the attacker.
}
@When("Try to Access or Modify Flash Application Variables")
public void tryaccessormodifyflashapplicationvariables(){
//  Try one of the following techniques :
   //1.  Develop malicious Flash application that is injected through vectors identified during the Experiment Phase and loaded by the victim browser's flash plugin and sends document information to the attacker.
   //2.  Develop malicious Flash application that is injected through vectors identified during the Experiment Phase and takes commands from an attacker's server and then causes the flash application to execute appropriately.
}@Then("Assert the success of Access or Modify Flash Application Variables")
public void assaccessormodifyflashapplicationvariables(){
//  Assert one of the following indications :
   //  -The attacker gets the user's session identifiers or other type of credentials
}
}