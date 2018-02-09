package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Extract information about database schema by getting the database to answer yes/no questions about the schema.

public class extractinformationaboutdatabaseschema {
@Given("prepare to Extract information about database schema")
public void preextractinformationaboutdatabaseschema(){
// None
// User-controllable input that is not properly validated by the application as part of SQL queries.
}
@When("Try to Extract information about database schema")
public void tryextractinformationaboutdatabaseschema(){
//  Try one of the following techniques :
   //1.  Automatically extract database schema using a tool such as Absinthe.
   //2.  Manually perform the blind SQL Injection to extract desired information about the database schema.
}@Then("Assert the success of Extract information about database schema")
public void assextractinformationaboutdatabaseschema(){
//  Assert one of the following indications :
   //  -Desired information about database schema extracted.
}
}