package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Given the finite space of possible passwords dictated by the password policy determined in the previous step, try all possible passwords for a known user ID until application/system grants access.

public class bruteforcepassword {
@Given("prepare to Brute force password")
public void prebruteforcepassword(){
// A powerful enough computer for the job with sufficient CPU, RAM and HD. Exact requirements will depend on the size of the brute force job and the time requirement for completion. Some brute forcing jobs may require grid or distributed computing (e.g. DES Challenge).
// An application does not have a password throttling mechanism in place. A good password throttling mechanism will make it almost impossible computationally to brute force a password as it may either lock out the user after a certain number of incorrect attempts or introduce time out periods. Both of these would make a brute force attack impractical.
}
@When("Try to Brute force password")
public void trybruteforcepassword(){
//  Try one of the following techniques :
   //1.  Manually or automatically enter all possible passwords through the application/system's interface. In most systems, start with the shortest and simplest possible passwords, because most users tend to select such passwords if allowed to do so.
   //2.  Perform an offline dictionary attack or a rainbow table attack against a known password hash.
}@Then("Assert the success of Brute force password")
public void assbruteforcepassword(){
//  Assert one of the following indications :
   //  -Attacker determines correct password for a user ID and obtains access to application or system.
}
}