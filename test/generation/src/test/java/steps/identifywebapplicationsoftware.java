package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// After the web server platform software has been identified, the attacker start to identify web application technologies such as ASP, .NET, PHP and Java on the server.

public class identifywebapplicationsoftware {
@Given("prepare to Identify Web Application Software")
public void preidentifywebapplicationsoftware(){
// While simple fingerprinting can be accomplished with only a web browser, for more thorough fingerprinting an attacker requires a variety of tools to collect information about the target. These tools might include protocol analyzers, web-site crawlers, and fuzzing tools. Footprinting a service adequately may also take a few days if the attacker wishes the footprinting attempt to go undetected.
// Any web application can be fingerprinted. However, some configuration choices can limit the useful information an attacker may collect during a fingerprinting attack.
}
@When("Try to Identify Web Application Software")
public void tryidentifywebapplicationsoftware(){
//  Try one of the following techniques :
   //1.  Examine the file name extensions in URL, for example .php indicates PHP script interfaced with Apache server.
   //2.  Examine the HTTP Response Headers. This may leak information about software signatures
   //3.  Examine Cookies that may contain server's software information.
   //4.  Check error pages.
}@Then("Assert the success of Identify Web Application Software")
public void assidentifywebapplicationsoftware(){
//  Assert one of the following indications :
   //  -File name extensions can be found in the URL.
    //  -From error messages, the stack trace of errors and exceptions may also explicitly tell application software information.
}
}