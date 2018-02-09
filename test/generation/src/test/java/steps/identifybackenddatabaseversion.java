package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Determining the database engine type can assist attackers' attempt to successfully execute SQL injection. Some database API such as ODBC will show a database type as part of the driver information when reporting an error.

public class identifybackenddatabaseversion {
@Given("prepare to Identify Backend Database Version")
public void preidentifybackenddatabaseversion(){
// While simple fingerprinting can be accomplished with only a web browser, for more thorough fingerprinting an attacker requires a variety of tools to collect information about the target. These tools might include protocol analyzers, web-site crawlers, and fuzzing tools. Footprinting a service adequately may also take a few days if the attacker wishes the footprinting attempt to go undetected.
// Any web application can be fingerprinted. However, some configuration choices can limit the useful information an attacker may collect during a fingerprinting attack.
}
@When("Try to Identify Backend Database Version")
public void tryidentifybackenddatabaseversion(){
//  Try one of the following techniques :
   //1.  Use tools to send bogus SQL query to the server and check error pages.
}@Then("Assert the success of Identify Backend Database Version")
public void assidentifybackenddatabaseversion(){
//  Assert one of the following indications :
   //  -The attacker successfully identifies database type from error messages.
}
}