package steps;
import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.continuumsecurity.proxy.ZAProxyScanner;


// Using command line or an automated tool, an attacker records all instances of web services to process XML requests.

public class surveythetarget {
@Given("prepare to Survey the target")
public void presurveythetarget(){
// The attacker must be able to insert or compromise a system into the processing path for the transaction.
// The targeted system must have multiple stages processing of XML content.
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	j.clear();
	j.disableAllScanners();
}
@When("Try to Survey the target")
public void trysurveythetarget(){
//  Try one of the following techniques :
   //1.  Use automated tool to record all instances to process XML requests or find exposed WSDL.
   //2.  Use tools to crawl WSDL
	String url ="http://192.168.83.236:8080/bodgeit/";
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	j.spider(url);
}@Then("Assert the success of Survey the target")
public void asssurveythetarget(){
//  Assert one of the following indications :
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	int x = j.getSpiderResults(j.getLastSpiderScanId()).size();
	Assert.assertTrue(x>0);
}
}