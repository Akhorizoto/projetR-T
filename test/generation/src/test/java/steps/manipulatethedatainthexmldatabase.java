package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker crafts and injects an XQuery payload which is acted on by an XQL query leading to modification of application data.

public class manipulatethedatainthexmldatabase {
@Given("prepare to Manipulate the data in the XML database")
public void premanipulatethedatainthexmldatabase(){
// 
// The XQL must execute unvalidated data
}
@When("Try to Manipulate the data in the XML database")
public void trymanipulatethedatainthexmldatabase(){
//  Try one of the following techniques :
   //1.  Leveraging one of the vulnerable inputs identified during the Experiment phase, inject malicious XQuery payload.. The payload tries to insert or replace data in the XML database.
}@Then("Assert the success of Manipulate the data in the XML database")
public void assmanipulatethedatainthexmldatabase(){
//  Assert one of the following indications :
   //  -The attacker gets the XQuery engine to insert or modify data in the database. This is mainly used to either insert wrong data or to insert persistent attack payloads (XSS for instance) that will be sent to other users' browser.
}
}