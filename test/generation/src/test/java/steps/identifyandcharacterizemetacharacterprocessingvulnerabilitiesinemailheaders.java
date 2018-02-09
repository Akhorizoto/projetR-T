package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// An attacker creates emails with headers containing various metacharacter-based malicious payloads in order to determine whether the target application processes the malicious content and in what manner it does so.

public class identifyandcharacterizemetacharacterprocessingvulnerabilitiesinemailheaders {
@Given("prepare to Identify and characterize metacharacter-processing vulnerabilities in email headers")
public void preidentifyandcharacterizemetacharacterprocessingvulnerabilitiesinemailheaders(){
// 
// This attack targets most widely deployed feature rich email applications, including web based email programs.
}
@When("Try to Identify and characterize metacharacter-processing vulnerabilities in email headers")
public void tryidentifyandcharacterizemetacharacterprocessingvulnerabilitiesinemailheaders(){
//  Try one of the following techniques :
   //1.  Use an automated tool (fuzzer) to create malicious emails headers containing metacharacter-based payloads.
   //2.  Manually tampering email headers to inject malicious metacharacter-based payload content in them.
}@Then("Assert the success of Identify and characterize metacharacter-processing vulnerabilities in email headers")
public void assidentifyandcharacterizemetacharacterprocessingvulnerabilitiesinemailheaders(){
//  Assert one of the following indications :
   //  -The email client executes the malicious payload.
}
}