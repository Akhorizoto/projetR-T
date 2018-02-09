package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Determine username(s) whose passwords to crack.

public class determineusernamestotarget {
@Given("prepare to Determine username(s) to target")
public void predetermineusernamestotarget(){
// A machine with sufficient resources for the job (e.g. CPU, RAM, HD). Applicable dictionaries are required. Also a password cracking tool or a custom script that leverages the dictionary database to launch the attack.
// The system does not implement an effective password throttling mechanism.
}
@When("Try to Determine username(s) to target")
public void trydetermineusernamestotarget(){
//  Try one of the following techniques :
   //1.  Obtain username(s) by sniffing network packets.
   //2.  Obtain username(s) by querying application/system (e.g. if upon a failed login attempt, the system indicates whether the entered username was valid or not)
   //3.  Obtain usernames from filesystem (e.g. list of directories in C:\Documents and Settings\ in Windows, and list in /etc/passwd in UNIX-like systems)
}@Then("Assert the success of Determine username(s) to target")
public void assdetermineusernamestotarget(){
//  Assert one of the following indications :
   //  -At least one valid username found.
}
}