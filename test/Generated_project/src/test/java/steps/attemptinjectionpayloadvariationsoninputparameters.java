package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.continuumsecurity.proxy.ZAProxyScanner;


// Possibly using an automated tool, an attacker requests variations on the inputs he surveyed before. He sends parameters that include variations of payloads. He records all the responses from the server that include unmodified versions of his script.

public class attemptinjectionpayloadvariationsoninputparameters {
@Given("prepare to Attempt injection payload variations on input parameters")
public void preattemptinjectionpayloadvariationsoninputparameters(){
// Ability to send HTTP request to a web application
// Target client software must allow scripting such as JavaScript and allows executable content delivered using a data URI scheme.
	
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	j.deleteAlerts();
	j.disableAllScanners();
	j.setEnableScanners("40012,40014,40016,40017", true);
	
}
@When("Try to Attempt injection payload variations on input parameters")
public void tryattemptinjectionpayloadvariationsoninputparameters(){
//  Try one of the following techniques :
   //1.  Use a list of XSS probe strings using different URI schemes to inject in parameters of known URLs. If possible, the probe strings contain a unique identifier to trace the injected string back to the entry point.
   //2.  Use a proxy tool to record results of manual input of XSS probes in known URLs.
	String url = "http://192.168.83.236:8080/";
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	
    j.scan(url);
    int complete = 0;
    int scanId = j.getLastScannerScanId();
    while (complete < 100) {
        complete = j.getScanProgress(scanId);
        
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}

@Then("Assert the success of Attempt injection payload variations on input parameters")
public void assattemptinjectionpayloadvariationsoninputparameters(){
//  Assert one of the following indications :
   //  -The attacker's cross-site scripting string is included in the URI scheme content and can be triggered by a user (a victim in this case).
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	int x = j.getAlertsCount();
	assert(x>0);
}
}