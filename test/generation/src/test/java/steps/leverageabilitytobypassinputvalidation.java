package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.continuumsecurity.proxy.ZAProxyScanner;


// Attacker leverages his ability to bypass input validation to gain unauthorized access to system. There are many attacks possible, and a few examples are mentioned here.

public class leverageabilitytobypassinputvalidation {
@Given("prepare to Leverage ability to bypass input validation")
public void preleverageabilitytobypassinputvalidation(){
// 
// Multiple parser passes are performed on the data supplied by the user.
	
	//"sql-injection": scannerIds = "40018,90018";
	//"cross-site-scripting": scannerIds = "40012,40014,40016,40017";
	//"remote-os-command-injection": scannerIds = "90020";
	
	String scannerIds = null;
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	j.deleteAlerts();
	j.disableAllScanners();
	j.setEnableScanners(scannerIds, true);
}
@When("Try to Leverage ability to bypass input validation")
public void tryleverageabilitytobypassinputvalidation(){
//  Try one of the following techniques :
   //1.  Gain access to sensitive files.
   //2.  Perform command injection.
   //3.  Perform SQL injection.
   //4.  Perform XSS attacks.
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
}@Then("Assert the success of Leverage ability to bypass input validation")
public void assleverageabilitytobypassinputvalidation(){
//  Assert one of the following indications :
   //  -Gaining unauthorized access to system functionality.
	
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	int x = j.getAlertsCount();
	assert(x>0);
}
}