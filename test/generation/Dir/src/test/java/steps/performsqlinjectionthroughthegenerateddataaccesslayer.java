package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// An attacker proceeds to exploit a weakness in the generated data access methods that does not properly separate control plane from the data plan, or potentially a particular way in which developer might have misused the generated code, to modify the structure of the executed SQL queries and/or inject entirely new SQL queries.

public class performsqlinjectionthroughthegenerateddataaccesslayer {
@Given("prepare to Perform SQL Injection through the generated data access layer")
public void preperformsqlinjectionthroughthegenerateddataaccesslayer(){
// No specialized resources are required.
// The separation between data plane and control plane is not ensured, through either developer error or an underlying weakness in the data access layer code generation framework
}
@When("Try to Perform SQL Injection through the generated data access layer")
public void tryperformsqlinjectionthroughthegenerateddataaccesslayer(){
//  Try one of the following techniques :
   //1.  An attacker uses normal SQL injection techniques and adjusts them to reflect the type of data access layer generation framework used by the application.
}@Then("Assert the success of Perform SQL Injection through the generated data access layer")
public void assperformsqlinjectionthroughthegenerateddataaccesslayer(){
//  Assert one of the following indications :
   //  -Attacker achieves goal of unauthorized system access, denial of service, etc.
}
}