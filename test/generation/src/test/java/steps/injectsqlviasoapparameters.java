package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker injects SQL via SOAP parameters identified as vulnerable during Explore phase to launch a first or second order SQL injection attack.

public class injectsqlviasoapparameters {
@Given("prepare to Inject SQL via SOAP Parameters")
public void preinjectsqlviasoapparameters(){
// No specialized hardware resources are required
// The service provider does not properly utilize parameter binding when building SQL queries
}
@When("Try to Inject SQL via SOAP Parameters")
public void tryinjectsqlviasoapparameters(){
//  Try one of the following techniques :
   //1.  An attacker performs a SQL injection attack via the usual methods leveraging SOAP parameters as the injection vector. An attacker has to be careful not to break the XML parser at the service provider which may prevent the payload getting through to the SQL query. The attacker may also look at the WSDL for the web service (if available) to better understand what is expected by the service provider.
}@Then("Assert the success of Inject SQL via SOAP Parameters")
public void assinjectsqlviasoapparameters(){
//  Assert one of the following indications :
   //  -Attacker achieves goal of unauthorized system access, denial of service, etc.
}
}