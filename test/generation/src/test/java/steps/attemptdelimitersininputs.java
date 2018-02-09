package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.continuumsecurity.proxy.ZAProxyScanner;


// The attacker systematically attempts variations of delimiters on known inputs, observing the application's response each time.

public class attemptdelimitersininputs {
	@Given("prepare to Attempt delimiters in inputs")
	public void preattemptdelimitersininputs(){
		// Ability to communicate synchronously or asynchronously with server. Optionally, ability to capture output directly through synchronous communication or other method such as FTP.
		// Software's input validation or filtering must not detect and block presence of additional malicious command.
		//"sql-injection": scannerIds = "40018,90018";
		//"XPath Injection": scannerIds = "90021";
		//"cross-site-scripting":  scannerIds = "40012,40014,40016,40017";
		//"path-traversal": scannerIds = "6";
		//"crlf-injection": scannerIds = "40003";
		//"ldap-injection": scannerIds = "40015";
		//

		String scannerIds = null;
		ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
		j.deleteAlerts();
		j.disableAllScanners();
		j.setEnableScanners(scannerIds, true);
	}
	@When("Try to Attempt delimiters in inputs")
	public void tryattemptdelimitersininputs(){
		//  Try one of the following techniques :
		//1.  Inject command delimiters using network packet injection tools (netcat, nemesis, etc.)
		//2.  Inject command delimiters using web test frameworks (proxies, TamperData, custom programs, etc.)
		//3.  Enter command delimiters directly in input fields.
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
	}@Then("Assert the success of Attempt delimiters in inputs")
	public void assattemptdelimitersininputs(){
		//  Assert one of the following indications :
		//  -One or more command delimiters for the platform provokes an unexpected response from the software, which can be varied by the attacker based on the input.
		//  -Attack step 2 is successful.
		ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
		int x = j.getAlertsCount();
		assert(x>0);
	}
}