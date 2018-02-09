import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Determine the user-controllable input susceptible to injection. For each user-controllable input that the attacker suspects is vulnerable to SQL injection, attempt to inject characters that have special meaning in SQL (such as a single quote character, a double quote character, two hyphens, a parenthesis, etc.). The goal is to create a SQL query with an invalid syntax.

public class determineusercontrollableinputsusceptibletoinjection {
@Given("prepare to Determine user-controllable input susceptible to injection")
public void predetermineusercontrollableinputsusceptibletoinjection(){
// None
// User-controllable input that is not properly validated by the application as part of SQL queries.
}
@When("Try to Determine user-controllable input susceptible to injection")
public void trydetermineusercontrollableinputsusceptibletoinjection(){
//  Try one of the following techniques :
   //1.  Use web browser to inject input through text fields or through HTTP GET parameters.
   //2.  Use a web application debugging tool such as Tamper Data, TamperIE, WebScarab,etc. to modify HTTP POST parameters, hidden fields, non-freeform fields, etc.
   //3.  Use network-level packet injection tools such as netcat to inject input
   //4.  Use modified client (modified by reverse engineering) to inject input.
}@Then("Assert the success of Determine user-controllable input susceptible to injection")
public void assdetermineusercontrollableinputsusceptibletoinjection(){
//  Assert one of the following indications :
   //  -At least one user-controllable input susceptible to injection found.
}
}