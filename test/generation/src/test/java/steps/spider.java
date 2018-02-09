package steps;
import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.continuumsecurity.proxy.ZAProxyScanner;


// Using a browser , an attacker is looking at the application to figure out if it allows to specify images, upload them, etc.

public class spider {
@Given("prepare to Spider")
public void prespider(){
// None
// Application permitting the inclusion or use of IMG tags
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	j.clear();
	j.disableAllScanners();
}
@When("Try to Spider")
public void tryspider(){
//  Try one of the following techniques :
   //1.  Use a browser to manually explore the website and identify entry points where the application allows the upload (or other means of specification) of images. Many browsers' plugins are available to facilitate the analysis or automate the discovery.
	String url ="http://192.168.83.227:8080/bodgeit/";
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	j.spider(url);
}@Then("Assert the success of Spider")
public void assspider(){
//  Assert one of the following indications :
   //  -A list entry points where images can be specified.
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	int x = j.getSpiderResults(j.getLastSpiderScanId()).size();
	Assert.assertTrue(x>0);
}
}