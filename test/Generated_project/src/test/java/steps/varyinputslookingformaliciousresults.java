package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.continuumsecurity.proxy.ZAProxyScanner;


// Depending on whether the application being exploited is a remote or local one the attacker crafts the appropriate malicious input, containing OS commands, to be passed to the application

public class varyinputslookingformaliciousresults {
@Given("prepare to Vary inputs, looking for malicious results.")
public void prevaryinputslookingformaliciousresults(){
// 
// User controllable input used as part of commands to the underlying operating system.
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	j.deleteAlerts();
	j.disableAllScanners();
	j.setEnableScanners("90020", true);
}
@When("Try to Vary inputs, looking for malicious results.")
public void tryvaryinputslookingformaliciousresults(){
//  Try one of the following techniques :
   //1.  Inject command delimiters using network packet injection tools (netcat, nemesis, etc.)
   //2.  Inject command delimiters using web test frameworks (proxies, TamperData, custom programs, etc.)
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
}@Then("Assert the success of Vary inputs, looking for malicious results.")
public void assvaryinputslookingformaliciousresults(){
//  Assert one of the following indications :
   //  -One or more injections that are appropriate to the platform provokes an unexpected response from the software, which can be varied by the attacker based on the input.
    //  -Inventorying in prior step is successful.
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	int x = j.getAlertsCount();
	assert(x>0);
}
}