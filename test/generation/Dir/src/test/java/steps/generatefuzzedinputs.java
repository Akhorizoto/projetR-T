package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Given a fuzzing tool, a target input or protocol, and limits on time, complexity, and input variety, generate a list of inputs to try. Although fuzzing is random, it is not exhaustive. Parameters like length, composition, and how many variations to try are important to get the most cost-effective impact from the fuzzer.

public class generatefuzzedinputs {
@Given("prepare to Generate fuzzed inputs")
public void pregeneratefuzzedinputs(){
// Fuzzing tools.
// 
}
@When("Try to Generate fuzzed inputs")
public void trygeneratefuzzedinputs(){
//  Try one of the following techniques :
   //1.  Boundary cases. Generate fuzz inputs that attack boundary cases of protocol fields, inputs, or other communications limits. Examples include 0xff and 0x00 for single-byte inputs. In binary situations, approach each bit of an individual field with on and off (e.g., 0x80).
   //2.  Attempt arguments to system calls or APIs. The variations include payloads that, if they were successful, could lead to a compromise on the system.
}@Then("Assert the success of Generate fuzzed inputs")
public void assgeneratefuzzedinputs(){
//  Assert one of the following indications :
}
}