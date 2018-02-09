package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// An attacker makes changes to file extensions and MIME types typically processed by web servers and looks for abnormal behavior.

public class filemisclassificationshotgunning {
@Given("prepare to File misclassification shotgunning")
public void prefilemisclassificationshotgunning(){
// Ability to execute HTTP request to Web server
// Web server software must rely on file name or file extension for processing.
}
@When("Try to File misclassification shotgunning")
public void tryfilemisclassificationshotgunning(){
//  Try one of the following techniques :
   //1.  Attacker submits files with switched extensions (e.g. .php on a .jsp file) to web server.
   //2.  Attacker adds extra characters (e.g. adding an extra . after the file extension) to filenames of files submitted to web server.
}@Then("Assert the success of File misclassification shotgunning")
public void assfilemisclassificationshotgunning(){
//  Assert one of the following indications :
   //  -Web server exhibits unexpected behavior.
}
}