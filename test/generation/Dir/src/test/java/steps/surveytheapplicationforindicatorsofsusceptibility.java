package steps;
import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.continuumsecurity.proxy.ZAProxyScanner;


// Using a variety of methods, until one is found that applies to the target system. the attacker probes for credentials, session tokens, or entry points that bypass credentials altogether.

public class surveytheapplicationforindicatorsofsusceptibility {
@Given("prepare to Survey the application for Indicators of Susceptibility")
public void presurveytheapplicationforindicatorsofsusceptibility(){
// Ability to deploy software on network. Ability to communicate synchronously or asynchronously with server
// Server software must rely on weak session IDs proof and/or verification schemes
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	j.clear();
	j.disableAllScanners();
}
@When("Try to Survey the application for Indicators of Susceptibility")
public void trysurveytheapplicationforindicatorsofsusceptibility(){
//  Try one of the following techniques :
   //1.  Spider all available pages
   //2.  Attack known bad interfaces
	String url ="http://192.168.83.227:8080/bodgeit/";
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	j.spider(url);
}@Then("Assert the success of Survey the application for Indicators of Susceptibility")
public void asssurveytheapplicationforindicatorsofsusceptibility(){
//  Assert one of the following indications :
   //  -Session IDs are identifiable
    //  -Open access points exist that use no user IDs or passwords, but determine authorization based on message content
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	int x = j.getSpiderResults(j.getLastSpiderScanId()).size();
	Assert.assertTrue(x>0);
}
}