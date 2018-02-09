package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Determines the type of the database, such as MS SQL Server or Oracle or MySQL, using logical conditions as part of the injected queries

public class determinedatabasetype {
@Given("prepare to Determine database type")
public void predeterminedatabasetype(){
// None
// User-controllable input that is not properly validated by the application as part of SQL queries.
}
@When("Try to Determine database type")
public void trydeterminedatabasetype(){
//  Try one of the following techniques :
   //1.  Try injecting a string containing char(0x31)=char(0x31) (this evaluates to 1=1 in SQL Server only)
   //2.  Try injecting a string containing 0x313D31 (this evaluates to 1=1 in MySQL only)
   //3.  Inject other database-specific commands into input fields susceptible to SQL Injection. The attacker can determine the type of database that is running by checking whether the query executed successfully or not (i.e. whether the attacker received a normal response from the server or not).
}@Then("Assert the success of Determine database type")
public void assdeterminedatabasetype(){
//  Assert one of the following indications :
   //  -Database platform in use discovered.
}
}