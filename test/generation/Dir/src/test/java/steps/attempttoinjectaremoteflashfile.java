package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker makes use of a remotely available flash file (SWF) that generates a uniquely identifiable output when executed inside the targeted flash file.

public class attempttoinjectaremoteflashfile {
@Given("prepare to Attempt to inject a remote flash file")
public void preattempttoinjectaremoteflashfile(){
// 
// The targeted Flash application must reference external URLs and the locations thus referenced must be controllable through parameters. The Flash application must fail to sanitize such parameters against malicious manipulation. The victim must follow a crafted link created by the attacker.
}
@When("Try to Attempt to inject a remote flash file")
public void tryattempttoinjectaremoteflashfile(){
//  Try one of the following techniques :
   //1.  Modify the variable of the SWF file that contains the remote movie URL to the attacker controlled flash file.
}@Then("Assert the success of Attempt to inject a remote flash file")
public void assattempttoinjectaremoteflashfile(){
//  Assert one of the following indications :
   //  -The attacker's flash movie can access the targeted flash movie internal variables
}
}