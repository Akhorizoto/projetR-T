package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The first step is exploratory meaning the attacker observes the system. The attacker looks for action and data that are likely to be logged. The attacker may be familiar with the log format of the system.

public class determineapplicationslogfileformat {
@Given("prepare to Determine Application's Log File Format")
public void predetermineapplicationslogfileformat(){
// 
// The target host insufficiently protects access to the logs or logging mechanisms.
}
@When("Try to Determine Application's Log File Format")
public void trydetermineapplicationslogfileformat(){
//  Try one of the following techniques :
   //1.  Determine logging utility being used by application (e.g. log4j)
   //2.  Gain access to application's source code to determine log file formats.
   //3.  Install or obtain access to instance of application and observe its log file format.
}@Then("Assert the success of Determine Application's Log File Format")
public void assdetermineapplicationslogfileformat(){
//  Assert one of the following indications :
   //  -Attacker determines log file format used by application.
}
}