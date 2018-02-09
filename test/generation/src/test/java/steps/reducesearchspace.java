package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Find ways to reduce the secret space. The smaller the attacker can make the space they need to search for the secret value, the greater their chances for success. There are a great many ways in which the search space may be reduced.

public class reducesearchspace {
@Given("prepare to Reduce search space")
public void prereducesearchspace(){
// Ultimately, the speed with which an attacker discovers a secret is directly proportional to the computational resources the attacker has at their disposal. This attack method is resource expensive: having large amounts of computational power do not guarantee timely success, but having only minimal resources makes the problem intractable against all but the weakest secret selection procedures.
// The attacker must be able to determine when they have successfully guessed the secret. As such, one-time pads are immune to this type of attack since there is no way to determine when a guess is correct.
}
@When("Try to Reduce search space")
public void tryreducesearchspace(){
//  Try one of the following techniques :
   //1.  If possible, determine how the secret was selected. If the secret was determined algorithmically (such as by a random number generator) the algorithm may have patterns or dependencies that reduce the size of the secret space. If the secret was created by a human, behavioral factors may, if not completely reduce the space, make some types of secrets more likely than others. (For example, humans may use the same secrets in multiple places or use secrets that look or sound familiar for ease of recall.)
   //2.  If the secret was chosen algorithmically, cryptanalysis can be applied to the algorithm to discover patterns in this algorithm. (This is true even if the secret is not used in cryptography.) Periodicity, the need for seed values, or weaknesses in the generator all can result in a significantly smaller secret space.
   //3.  If the secret was chosen by a person, social engineering and simple espionage can indicate patterns in their secret selection. If old secrets can be learned (and a target may feel they have little need to protect a secret that has been replaced) hints as to their selection preferences can be gleaned. These can include character substitutions a target employs, patterns in sources (dates, famous phrases, music lyrics, family members, etc.). Once these patterns have been determined, the initial efforts of a brute-force attack can focus on these areas.
   //4.  Some algorithmic techniques for secret selection may leave indicators that can be tested for relatively easily and which could then be used to eliminate large areas of the search space for consideration. For example, it may be possible to determine that a secret does or does not start with a given character after a relatively small number of tests. Alternatively, it might be possible to discover the length of the secret relatively easily. These discoveries would significantly reduce the search space, thus increasing speed with which the attacker discovers the secret.
}@Then("Assert the success of Reduce search space")
public void assreducesearchspace(){
//  Assert one of the following indications :
}
}