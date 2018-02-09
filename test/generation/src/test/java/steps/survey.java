package steps;
import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.continuumsecurity.proxy.ZAProxyScanner;


// The attacker surveys the target application, possibly as a valid and authenticated user

public class survey {
@Given("prepare to Survey")
public void presurvey(){
// 
// Ability to control the length of data passed to an active filter.
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	j.clear();
	j.disableAllScanners();
}
@When("Try to Survey")
public void trysurvey(){
//  Try one of the following techniques :
   //1.  Spidering web sites for inputs that involve potential filtering
   //2.  Brute force guessing of filtered inputs
	String url ="http://192.168.83.227:8080/bodgeit/";
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	j.spider(url);
}@Then("Assert the success of Survey")
public void asssurvey(){
//  Assert one of the following indications :
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	int x = j.getSpiderResults(j.getLastSpiderScanId()).size();
	Assert.assertTrue(x>0);
}
}