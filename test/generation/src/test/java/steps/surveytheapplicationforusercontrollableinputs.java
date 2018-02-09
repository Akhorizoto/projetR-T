package steps;
import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.continuumsecurity.proxy.ZAProxyScanner;


// Using a browser or an automated tool, an attacker follows all public links and actions on a web site. He records all the links, the forms, the resources accessed and all other potential entry-points for the web application.

public class surveytheapplicationforusercontrollableinputs {
@Given("prepare to Survey the application for user-controllable inputs")
public void presurveytheapplicationforusercontrollableinputs(){
// 
// The XQL must execute unvalidated data
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	j.clear();
	j.disableAllScanners();
}
@When("Try to Survey the application for user-controllable inputs")
public void trysurveytheapplicationforusercontrollableinputs(){
//  Try one of the following techniques :
   //1.  Use a spidering tool to follow and record all links and analyze the web pages to find entry points. Make special note of any links that include parameters in the URL.
   //2.  Use a proxy tool to record all user input entry points visited during a manual traversal of the web application.
   //3.  Use a browser to manually explore the website and analyze how it is constructed. Many browsers' plugins are available to facilitate the analysis or automate the discovery.
	String url ="http://192.168.83.227:8080/bodgeit/";
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	j.spider(url);
}@Then("Assert the success of Survey the application for user-controllable inputs")
public void asssurveytheapplicationforusercontrollableinputs(){
//  Assert one of the following indications :
   //  -A list of URLs, with their corresponding parameters (POST, GET, COOKIE, etc.) is created by the attacker.
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	int x = j.getSpiderResults(j.getLastSpiderScanId()).size();
	Assert.assertTrue(x>0);
}
}