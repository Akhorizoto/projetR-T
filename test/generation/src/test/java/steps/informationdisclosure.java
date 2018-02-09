package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker crafts and injects an XQuery payload which is acted on by an XQL query leading to inappropriate disclosure of information.

public class informationdisclosure {
@Given("prepare to Information Disclosure")
public void preinformationdisclosure(){
// 
// The XQL must execute unvalidated data
}
@When("Try to Information Disclosure")
public void tryinformationdisclosure(){
//  Try one of the following techniques :
   //1.  Leveraging one of the vulnerable inputs identified during the Experiment phase, inject malicious XQuery payload. The payload aims to get information on the structure of the underlying XML database and/or the content in it.
}@Then("Assert the success of Information Disclosure")
public void assinformationdisclosure(){
//  Assert one of the following indications :
   //  -The attacker gets information from the XML database.
}
}