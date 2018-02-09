package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker redirects the target to the malicious libraries he crafted in the Experiment phase. The attacker will be able to force the targeted application to execute arbitrary code when the application attempts to access the legitimate libraries.

public class redirecttheaccesstolibrariestothemaliciouslibraries {
@Given("prepare to Redirect the access to libraries to the malicious libraries")
public void preredirecttheaccesstolibrariestothemaliciouslibraries(){
// 
// The target must utilize external libraries and must fail to verify the integrity of these libraries before using them.
}
@When("Try to Redirect the access to libraries to the malicious libraries")
public void tryredirecttheaccesstolibrariestothemaliciouslibraries(){
//  Try one of the following techniques :
   //1.  The attacker modifies the entries in the configuration files pointing to the malicious libraries he crafted.
   //2.  The attacker leverages symlink/timing issues to redirect the target to access the malicious libraries he crafted.
   //3.  The attacker leverages file search path order issues to redirect the target to access the malicious libraries he crafted.
}@Then("Assert the success of Redirect the access to libraries to the malicious libraries")
public void assredirecttheaccesstolibrariestothemaliciouslibraries(){
//  Assert one of the following indications :
   //  -The application is redirected to the malicious libraries the attacker crafted when the application attempts to call the legitimate libraries.
}
}