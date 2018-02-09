package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// An attacker sends bogus request to the target, and then floods responses that trick a cache to remember malicious responses, which are wrong answers of queries.

public class causespecificdatatobecached {
@Given("prepare to Cause specific data to be cached")
public void precausespecificdatatobecached(){
// 
// The targeted application must not be able to detect the illicit modification of the cache and must trust the cache value in its calculations.
}
@When("Try to Cause specific data to be cached")
public void trycausespecificdatatobecached(){
//  Try one of the following techniques :
   //1.  Intercept or modify a query, or send a bogus query with known credentials (such as transaction ID).
}@Then("Assert the success of Cause specific data to be cached")
public void asscausespecificdatatobecached(){
//  Assert one of the following indications :
   //  -Any request of the targeted form results in the seeded response.
}
}