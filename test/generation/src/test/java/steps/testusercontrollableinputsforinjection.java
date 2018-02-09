package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.continuumsecurity.proxy.ZAProxyScanner;


// If the target program has a deadlock condition, the program waits indefinitely resulting in a denial of service.

public class testusercontrollableinputsforinjection {
@Given("prepare to Test user-controllable inputs for injection")
public void pretestusercontrollableinputsforinjection(){
// None
// User-controllable input not properly sanitized
	
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	j.deleteAlerts();
	j.disableAllScanners();
	j.setEnableScanners("90029", true);
}
@When("Try to Test user-controllable inputs for injection")
public void trytestusercontrollableinputsforinjection(){
//  Try one of the following techniques :
   //1.  Use XML reserved characters or words, possibly with other input data to attempt to cause unexpected results
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
}@Then("Assert the success of Test user-controllable inputs for injection")
public void asstestusercontrollableinputsforinjection(){
//  Assert one of the following indications :
   //  -At least one user-controllable input susceptible to injection found.
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	int x = j.getAlertsCount();
	assert(x>0);
}
}