package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.continuumsecurity.proxy.ZAProxyScanner;


// Try to feed overly long data to the system. This can be done manually or a dynamic tool (black box) can be used to automate this. An attacker can also use a custom script for that purpose.

public class attemptinjections {
@Given("prepare to Attempt injections")
public void preattemptinjections(){
// 
// Ability to control the length of data passed to an active filter.
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	j.deleteAlerts();
	j.disableAllScanners();
	j.setEnableScanners("30001", true);
}
@When("Try to Attempt injections")
public void tryattemptinjections(){
//  Try one of the following techniques :
   //1.  Brute force attack through black box penetration test tool.
   //2.  Fuzzing of communications protocols
   //3.  Manual testing of possible inputs with attack data.
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
}@Then("Assert the success of Attempt injections")
public void assattemptinjections(){
//  Assert one of the following indications :
   //  -Unexpected output from the application.
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	int x = j.getAlertsCount();
	assert(x>0);
}
}