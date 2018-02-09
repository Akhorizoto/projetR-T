package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker discovers and views unprotected sensitive data.

public class viewunauthorizeddata {
@Given("prepare to View unauthorized data")
public void previewunauthorizeddata(){
// A directory listing is helpful but not a requirement. No special resources are required.
// The forcibly browseable pages or accessible resources must be discoverable and improperly protected.
}
@When("Try to View unauthorized data")
public void tryviewunauthorizeddata(){
//  Try one of the following techniques :
   //1.  Direct request of protected pages that directly access database back-ends. (e.g., list.jsp, accounts.jsp, status.jsp, etc.)
}@Then("Assert the success of View unauthorized data")
public void assviewunauthorizeddata(){
//  Assert one of the following indications :
    //  -Dynamic pages (JSP, ASP, PHP, etc.) exist that divulge sensitive data without first checking authorization.
}
}