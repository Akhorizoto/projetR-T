package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.continuumsecurity.proxy.ZAProxyScanner;


// The attacker injects the entry points identified in the Explore Phase with response splitting syntax and variations of payloads to be acted on in the additional response. He records all the responses from the server that include unmodified versions of his payload.

public class attemptvariationsoninputparameters {
	@Given("prepare to Attempt variations on input parameters")
	public void preattemptvariationsoninputparameters(){
		// None
		// Insufficient input validation in application to check for input sanity before using it as part of response header
		//"crlf-injection": scannerIds = "40003";
		//"remote-file-inclusion": scannerIds = "7";
		//"Path Traversal" : scannerIds = "6";
		String scannerIds = null;
		ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
		j.deleteAlerts();
		j.disableAllScanners();
		j.setEnableScanners(scannerIds, true);
	}
	@When("Try to Attempt variations on input parameters")
	public void tryattemptvariationsoninputparameters(){
		//  Try one of the following techniques :
		//1.  Use CR\LF characters (encoded or not) in the payloads in order to see if the HTTP header can be split.
		//2.  Use a proxy tool to record the HTTP responses headers.
		String url = "http://192.168.83.227:8080/";
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
	}@Then("Assert the success of Attempt variations on input parameters")
	public void assattemptvariationsoninputparameters(){
		//  Assert one of the following indications :
		//  -The CR\LF characters are passed in the HTTP header and two responses are generated for a single request.
		//  -The web server uses unvalidated user-controlled input as part of the response headers
		ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
		int x = j.getAlertsCount();
		assert(x>0);
	}
}