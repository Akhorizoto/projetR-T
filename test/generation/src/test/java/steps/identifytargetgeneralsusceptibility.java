package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// An attacker uses an automated tool or manually finds whether the target application uses dynamically linked libraries and the configuration file or look up table (such as Procedure Linkage Table) which contains the entries for dynamically linked libraries.

public class identifytargetgeneralsusceptibility {
@Given("prepare to Identify target general susceptibility")
public void preidentifytargetgeneralsusceptibility(){
// 
// The target must utilize external libraries and must fail to verify the integrity of these libraries before using them.
}
@When("Try to Identify target general susceptibility")
public void tryidentifytargetgeneralsusceptibility(){
//  Try one of the following techniques :
   //1.  The attacker uses a tool such as the OSX "otool" utility or manually probes whether the target application uses dynamically linked libraries.
   //2.  The attacker finds the configuration files containing the entries to the dynamically linked libraries and modifies the entries to point to the malicious libraries the attacker crafted.
}@Then("Assert the success of Identify target general susceptibility")
public void assidentifytargetgeneralsusceptibility(){
//  Assert one of the following indications :
   //  -The attacker can successfully redirect or control access to libraries leveraged by the target.
}
}