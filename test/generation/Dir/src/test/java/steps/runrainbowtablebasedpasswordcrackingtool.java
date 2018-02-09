package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// An attacker finds or writes a password cracking tool that uses a previously computed rainbow table for the right hashing algorithm. It helps if the attacker knows what hashing algorithm was used by the password system.

public class runrainbowtablebasedpasswordcrackingtool {
@Given("prepare to Run rainbow table-based password cracking tool")
public void prerunrainbowtablebasedpasswordcrackingtool(){
// Rainbow table of password hash chains with the right algorithm used. A password cracking tool that leverages this rainbow table will also be required. Hash(es) of the password is required.
// The system uses one factor password based authentication.
}
@When("Try to Run rainbow table-based password cracking tool")
public void tryrunrainbowtablebasedpasswordcrackingtool(){
//  Try one of the following techniques :
   //1.  Run rainbow table-based password cracking tool such as Ophcrack or RainbowCrack. Reduction function must depend on application's/system's password policy.
}@Then("Assert the success of Run rainbow table-based password cracking tool")
public void assrunrainbowtablebasedpasswordcrackingtool(){
//  Assert one of the following indications :
   //  -A password corresponding to the hash recovered.
}
}