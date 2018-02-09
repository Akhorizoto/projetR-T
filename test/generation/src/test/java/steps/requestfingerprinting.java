package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Use automated tools or send web server specific commands to web server and wait for server's response.

public class requestfingerprinting {
@Given("prepare to Request fingerprinting")
public void prerequestfingerprinting(){
// While simple fingerprinting can be accomplished with only a web browser, for more thorough fingerprinting an attacker requires a variety of tools to collect information about the target. These tools might include protocol analyzers, web-site crawlers, and fuzzing tools. Footprinting a service adequately may also take a few days if the attacker wishes the footprinting attempt to go undetected.
// Any web application can be fingerprinted. However, some configuration choices can limit the useful information an attacker may collect during a fingerprinting attack.
}
@When("Try to Request fingerprinting")
public void tryrequestfingerprinting(){
//  Try one of the following techniques :
   //1.  Use automated tools or send web server specific commands to web server and then receive server's response.
}@Then("Assert the success of Request fingerprinting")
public void assrequestfingerprinting(){
//  Assert one of the following indications :
   //  -A list of fingerprinting sensitive information from HTTP response headers.
}
}