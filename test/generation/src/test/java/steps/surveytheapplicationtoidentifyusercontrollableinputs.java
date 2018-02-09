package steps;
import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.continuumsecurity.proxy.ZAProxyScanner;


// The attacker surveys the target application to identify all user-controllable inputs, possibly as a valid and authenticated user

public class surveytheapplicationtoidentifyusercontrollableinputs {
@Given("prepare to Survey the Application to Identify User-controllable Inputs")
public void presurveytheapplicationtoidentifyusercontrollableinputs(){
// 
// Program must allow for user controlled variables to be applied directly to the filesystem
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	j.clear();
	j.disableAllScanners();
}
@When("Try to Survey the Application to Identify User-controllable Inputs")
public void trysurveytheapplicationtoidentifyusercontrollableinputs(){
//  Try one of the following techniques :
   //1.  Spider web sites for all available links, entry points to the web site.
   //2.  Manually explore application and inventory all application inputs
	String url ="http://192.168.83.227:8080/bodgeit/";
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	j.spider(url);
}@Then("Assert the success of Survey the Application to Identify User-controllable Inputs")
public void asssurveytheapplicationtoidentifyusercontrollableinputs(){
//  Assert one of the following indications :
   //  -The attacker develops a list of likely interesting path (application or OS related)
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	int x = j.getSpiderResults(j.getLastSpiderScanId()).size();
	Assert.assertTrue(x>0);
}
}