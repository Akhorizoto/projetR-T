package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker first takes an inventory of the entry points of the application.

public class findinjectionentrypoints {
@Given("prepare to Find Injection Entry Points")
public void prefindinjectionentrypoints(){
// The attacker may need to be able to serve the injected Flash content, but otherwise no special resources are required.
// The target must be capable of running Flash applications. In some cases, the victim must follow an attacker-supplied link.
}
@When("Try to Find Injection Entry Points")
public void tryfindinjectionentrypoints(){
//  Try one of the following techniques :
   //1.  Spider the website for all available URLs that reference a Flash application.
   //2.  List all uninitialized global variables (such as _root.*, _global.*, _level0.*) in ActionScript, registered global variables in included files, load variables to external movies.
}@Then("Assert the success of Find Injection Entry Points")
public void assfindinjectionentrypoints(){
//  Assert one of the following indications :
   //  -A list of URLs which has embedded Flash movies and the list of global uninitialized global variables, load variables to external movies.
}
}