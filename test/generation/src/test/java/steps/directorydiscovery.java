package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Use a method, either manual, scripted, or automated to discover the directories on the server by making requests for directories that may possibly exist. During this phase the adversary is less concerned with whether a directory can be accessed or indexed and more focused on simply discovering what directories do exist on the target.

public class directorydiscovery {
@Given("prepare to Directory Discovery")
public void predirectorydiscovery(){
// Ability to send HTTP requests to a web application.
// The server version or patch level must not inherently prevent known directory listing attacks from working.
}
@When("Try to Directory Discovery")
public void trydirectorydiscovery(){
//  Try one of the following techniques :
   //1.  Send requests to the web server for common directory names
   //2.  If directories are discovered that are native to a server type further refine the directory search to include directories usually present on those types of servers.
   //3.  Search for uncommon or potentially user created directories that may be present.
}@Then("Assert the success of Directory Discovery")
public void assdirectorydiscovery(){
//  Assert one of the following indications :
   //  -The adversary compiles a list of one or more directories that exist on the server. Some of these directories may not be immediately accessible but they are present.
}
}