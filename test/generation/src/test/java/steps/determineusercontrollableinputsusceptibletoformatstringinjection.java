package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.continuumsecurity.proxy.ZAProxyScanner;


// Determine the user-controllable input susceptible to format string injection. For each user-controllable input that the attacker suspects is vulnerable to format string injection, attempt to inject formatting characters such as %n, %s, etc.. The goal is to manipulate the string creation using these formatting characters.

public class determineusercontrollableinputsusceptibletoformatstringinjection {
@Given("prepare to Determine user-controllable input susceptible to format string injection")
public void predetermineusercontrollableinputsusceptibletoformatstringinjection(){
// No special resources are required beyond the ability to provide string input to the target.
// The target application must accept a strings as user input, fail to sanitize string formatting characters in the user input, and process this string using functions that interpret string formatting characters.
	
	
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	j.deleteAlerts();
	j.disableAllScanners();
	j.setEnableScanners("30002", true);

}
@When("Try to Determine user-controllable input susceptible to format string injection")
public void trydetermineusercontrollableinputsusceptibletoformatstringinjection(){
//  Try one of the following techniques :
   //1.  Inject probe payload which contains formatting characters (%s, %d, %n, etc.) through input parameters.
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
}@Then("Assert the success of Determine user-controllable input susceptible to format string injection")
public void assdetermineusercontrollableinputsusceptibletoformatstringinjection(){
//  Assert one of the following indications :
   //  -At least one user-controllable input susceptible to injection found.
    //  -Attacker receives an abnormal message (let's say with a partial dump of the memory) from the application which indicates that the format string was successfully manipulated.
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	int x = j.getAlertsCount();
	assert(x>0);
}
}