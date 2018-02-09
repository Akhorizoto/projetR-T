package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker determines whether server side includes are enabled on the target web server.

public class determineapplicability {
@Given("prepare to Determine applicability")
public void predetermineapplicability(){
// None: Determining whether the server supports SSI does not require special tools, and nor does injecting directives that get executed.
// User controllable input that can carry include directives to the web server
}
@When("Try to Determine applicability")
public void trydetermineapplicability(){
//  Try one of the following techniques :
   //1.  Look for popular page file names. The attacker will look for .shtml, .shtm, .asp, .aspx, and other well-known strings in URLs to help determine whether SSI functionality is enabled.
   //2.  Fetch .htaccess file. In Apache web server installations, the .htaccess file may enable server side includes in specific locations. In those cases, the .htaccess file lives inside the directory where SSI is enabled, and is theoretically fetchable from the web server. Although most web servers deny fetching the .htaccess file, a misconfigured server will allow it. Thus, an attacker will frequently try it.
}@Then("Assert the success of Determine applicability")
public void assdetermineapplicability(){
//  Assert one of the following indications :
}
}