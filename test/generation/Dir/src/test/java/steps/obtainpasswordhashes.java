package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// An attacker gets access to the database table storing hashes of passwords or potentially just discovers a hash of an individual password.

public class obtainpasswordhashes {
@Given("prepare to Obtain password hashes")
public void preobtainpasswordhashes(){
// Rainbow table of password hash chains with the right algorithm used. A password cracking tool that leverages this rainbow table will also be required. Hash(es) of the password is required.
// The system uses one factor password based authentication.
}
@When("Try to Obtain password hashes")
public void tryobtainpasswordhashes(){
//  Try one of the following techniques :
   //1.  Obtain copy of database table or flat file containing password hashes (by breaking access controls, using SQL Injection, etc.)
   //2.  Obtain password hashes from platform-specific storage locations (e.g. Windows registry)
   //3.  Sniff network packets containing password hashes.
}@Then("Assert the success of Obtain password hashes")
public void assobtainpasswordhashes(){
//  Assert one of the following indications :
   //  -At least one (unsalted) password hash obtained.
}
}