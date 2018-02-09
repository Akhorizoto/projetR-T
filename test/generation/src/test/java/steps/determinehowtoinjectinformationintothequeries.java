package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Determine how to inject information into the queries from the previous step such that the injection does not impact their logic. For example, the following are possible injections for those queries:

public class determinehowtoinjectinformationintothequeries {
@Given("prepare to Determine how to inject information into the queries")
public void predeterminehowtoinjectinformationintothequeries(){
// None
// User-controllable input that is not properly validated by the application as part of SQL queries.
}
@When("Try to Determine how to inject information into the queries")
public void trydeterminehowtoinjectinformationintothequeries(){
//  Try one of the following techniques :
   //1.  Add clauses to the SQL queries such that the query logic does not change.
   //2.  Add delays to the SQL queries in case server does not provide clear error messages (e.g. WAITFOR DELAY '0:0:10' in SQL Server or BENCHMARK(1000000000,MD5(1) in MySQL). If these can be injected into the queries, then the length of time that the server takes to respond reveals whether the query is injectable or not.
}@Then("Assert the success of Determine how to inject information into the queries")
public void assdeterminehowtoinjectinformationintothequeries(){
//  Assert one of the following indications :
   //  -At least one way to complete a hypothesized SQL query that would violate the application developer's assumptions.
}
}