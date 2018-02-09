package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker uses knowledge gained in the Explore phase to craft malicious libraries that he will redirect the target to leverage. These malicious libraries could have the same APIs as the legitimate library and additional malicious code.

public class craftmaliciouslibraries {
@Given("prepare to Craft malicious libraries")
public void precraftmaliciouslibraries(){
// 
// The target must utilize external libraries and must fail to verify the integrity of these libraries before using them.
}
@When("Try to Craft malicious libraries")
public void trycraftmaliciouslibraries(){
//  Try one of the following techniques :
   //1.  The attacker monitors the file operations performed by the target application using a tool like dtrace or FileMon. And the attacker can delay the operations by using "sleep(2)" and "usleep()" to prepare the appropriate conditions for the attack, or make the application perform expansive tasks (large files parsing, etc.) depending on the purpose of the application.
}@Then("Assert the success of Craft malicious libraries")
public void asscraftmaliciouslibraries(){
//  Assert one of the following indications :
   //  -The entries in the configuration file points to the malicious libraries he crafted.
}
}