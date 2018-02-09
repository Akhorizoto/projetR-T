package steps;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.continuumsecurity.proxy.ZAProxyScanner;

// The attacker first takes an inventory of the functionality exposed by the application.

public class surveyapplication {
@Given("prepare to Survey application")
public void presurveyapplication(){
// None
// User-controllable input that is not properly validated by the application as part of SQL queries.
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	j.clear();
	j.disableAllScanners();
	
	
}
@When("Try to Survey application")
public void trysurveyapplication(){
//  Try one of the following techniques :
   //1.  Spider web sites for all available links
   //2.  Sniff network communications with application using a utility such as WireShark.
	String url ="http://192.168.83.227:8080/bodgeit/";
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	j.spider(url);
}@Then("Assert the success of Survey application")
public void asssurveyapplication(){
//  Assert one of the following indications :
   //  -At least one data input to application identified.
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	int x = j.getSpiderResults(j.getLastSpiderScanId()).size();
	Assert.assertTrue(x>0);
}
}