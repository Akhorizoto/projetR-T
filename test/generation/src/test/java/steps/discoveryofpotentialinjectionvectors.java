package steps;
import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.continuumsecurity.proxy.ZAProxyScanner;


// Using an automated tool or manual discovery, the attacker identifies services or methods with arguments that could potentially be used as injection vectors (OS, API, SQL procedures, etc.).

public class discoveryofpotentialinjectionvectors {
@Given("prepare to Discovery of potential injection vectors")
public void prediscoveryofpotentialinjectionvectors(){
// Ability to communicate synchronously or asynchronously with server. Optionally, ability to capture output directly through synchronous communication or other method such as FTP.
// Software must allow for unvalidated or unfiltered input to be executed on operating system shell, and, optionally, the system configuration must allow for output to be sent back to client.
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	j.clear();
	j.disableAllScanners();
}
@When("Try to Discovery of potential injection vectors")
public void trydiscoveryofpotentialinjectionvectors(){
//  Try one of the following techniques :
   //1.  Manually cover the application and record the possible places where arguments could be passed into external systems.
   //2.  Use a spider, for web applications, to create a list of URLs and associated inputs.
	String url ="http://192.168.83.227:8080/bodgeit/";
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	j.spider(url);
}@Then("Assert the success of Discovery of potential injection vectors")
public void assdiscoveryofpotentialinjectionvectors(){
//  Assert one of the following indications :
   //  -A list of parameters, arguments to modify is identified.
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	int x = j.getSpiderResults(j.getLastSpiderScanId()).size();
	Assert.assertTrue(x>0);
}
}