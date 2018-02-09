package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Leverage SQL injection to inject data in the database that could later be used to achieve command injection if ever used as a command line argument

public class injectmaliciousdatainthedatabase {
@Given("prepare to Inject malicious data in the database")
public void preinjectmaliciousdatainthedatabase(){
// No specialized resources are required
// Malicious data is used on the backend as a command line argument
}
@When("Try to Inject malicious data in the database")
public void tryinjectmaliciousdatainthedatabase(){
//  Try one of the following techniques :
   //.  
}@Then("Assert the success of Inject malicious data in the database")
public void assinjectmaliciousdatainthedatabase(){
//  Assert one of the following indications :
}
}