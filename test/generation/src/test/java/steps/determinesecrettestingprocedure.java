package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Determine how a potential guess of the secret may be tested. This may be accomplished by comparing some manipulation of the secret to a known value, use of the secret to manipulate some known set of data and determining if the result displays specific characteristics (for example, turning cryptotext into plaintext), or by submitting the secret to some external authority and having the external authority respond as to whether the value was the correct secret. Ideally, the attacker will want to determine the correctness of their guess independently since involvement of an external authority is usually slower and can provide an indication to the defender that a brute-force attack is being attempted.

public class determinesecrettestingprocedure {
@Given("prepare to Determine secret testing procedure")
public void predeterminesecrettestingprocedure(){
// Ultimately, the speed with which an attacker discovers a secret is directly proportional to the computational resources the attacker has at their disposal. This attack method is resource expensive: having large amounts of computational power do not guarantee timely success, but having only minimal resources makes the problem intractable against all but the weakest secret selection procedures.
// The attacker must be able to determine when they have successfully guessed the secret. As such, one-time pads are immune to this type of attack since there is no way to determine when a guess is correct.
}
@When("Try to Determine secret testing procedure")
public void trydeterminesecrettestingprocedure(){
//  Try one of the following techniques :
   //1.  Determine if there is a way to parallelize the attack. Most brute force attacks can take advantage of parallel techniques by dividing the search space among available resources, thus dividing the average time to success by the number of resources available. If there is a single choke point, such as a need to check answers with an external authority, the attackers' position is significantly degraded.
}@Then("Assert the success of Determine secret testing procedure")
public void assdeterminesecrettestingprocedure(){
//  Assert one of the following indications :
}
}