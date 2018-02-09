package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker studies the characteristics of the session ID (size, format, etc.). As a results the attacker finds that legitimate session IDs are predictable.

public class characterizeids {
@Given("prepare to Characterize IDs")
public void precharacterizeids(){
// 
// The session IDs used by the target host are predictable. For example, the session IDs are generated using predictable information (e.g., time).
}
@When("Try to Characterize IDs")
public void trycharacterizeids(){
//  Try one of the following techniques :
   //1.  Cryptanalysis. The attacker uses cryptanalysis to determine if the session IDs contain any cryptographic protections.
   //2.  Pattern tests. The attacker looks for patterns (odd/even, repetition, multiples, or other arithmetic relationships) between IDs
   //3.  Comparison against time. The attacker plots or compares the issued IDs to the time they were issued to check for correlation.
}@Then("Assert the success of Characterize IDs")
public void asscharacterizeids(){
//  Assert one of the following indications :
   //  -Patterns are detectable in session IDs
}
}