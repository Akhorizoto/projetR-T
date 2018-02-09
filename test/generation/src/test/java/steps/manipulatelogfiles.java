package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker alters the log contents either directly through manipulation or forging or indirectly through injection of specially crafted input that the target software will write to the logs. This type of attack typically follows another attack and is used to try to cover the traces of the previous attack.

public class manipulatelogfiles {
@Given("prepare to Manipulate Log Files")
public void premanipulatelogfiles(){
// 
// The target host insufficiently protects access to the logs or logging mechanisms.
}
@When("Try to Manipulate Log Files")
public void trymanipulatelogfiles(){
//  Try one of the following techniques :
   //1.  Use carriage return and/or line feed characters to start a new line in the log file, and then, add a fake entry. For example:
   //2.  Insert a script into the log file such that if it is viewed using a web browser, the attacker will get a copy of the operator/administrator's cookie and will be able to gain access as that user. For example, a log file entry could contain
}@Then("Assert the success of Manipulate Log Files")
public void assmanipulatelogfiles(){
//  Assert one of the following indications :
   //  -Forged entry or other malicious data inserted into application's logs.
}
}