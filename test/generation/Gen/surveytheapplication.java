import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Using a browser or an automated tool, an attacker follows all public links on a web site. He records all the links he finds.

public class surveytheapplication {
@Given("prepare to Survey the application")
public void presurveytheapplication(){
// Ability to send HTTP request to a web application
// Target client software must allow scripting such as JavaScript and allows executable content delivered using a data URI scheme.
}
@When("Try to Survey the application")
public void trysurveytheapplication(){
//  Try one of the following techniques :
   //1.  Use a spidering tool to follow and record all links. Make special note of any links that include parameters in the URL.
   //2.  Use a proxy tool to record all links visited during a manual traversal of the web application. Make special note of any links that include parameters in the URL. Manual traversal of this type is frequently necessary to identify forms that are GET method forms rather than POST forms.
   //3.  Use a browser to manually explore the website and analyze how it is constructed. Many browser's plugins are available to facilitate the analysis or automate the URL discovery.
}@Then("Assert the success of Survey the application")
public void asssurveytheapplication(){
//  Assert one of the following indications :
}
}