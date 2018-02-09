package steps;


import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.continuumsecurity.proxy.ZAProxyScanner;


// Determine the user-controllable input susceptible to injection. For each user-controllable input that the attacker suspects is vulnerable to XQL injection, attempt to inject characters that have special meaning in XQL. The goal is to create an XQL query with an invalid syntax.

public class determineusercontrollableinputsusceptibletoinjection {
@Given("prepare to Determine user-controllable input susceptible to injection")
public void predetermineusercontrollableinputsusceptibletoinjection(){
// 
// The XQL must execute unvalidated data
	
	//"sql-injection": scannerIds = "40018,90018";
	//"XPath Injection": scannerIds = "90021";
	String scannerIds = null;
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	j.deleteAlerts();
	j.disableAllScanners();
	j.setEnableScanners(scannerIds, true);
}
@When("Try to Determine user-controllable input susceptible to injection")
public void trydetermineusercontrollableinputsusceptibletoinjection(){
//  Try one of the following techniques :
   //1.  Use web browser to inject input through text fields or through HTTP GET parameters.
   //2.  Use a web application debugging tool such as Tamper Data, TamperIE, WebScarab,etc. to modify HTTP POST parameters, hidden fields, non-freeform fields, etc.
   //3.  Use XML files to inject input.
   //4.  Use network-level packet injection tools such as netcat to inject input
   //5.  Use modified client (modified by reverse engineering) to inject input.
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
}@Then("Assert the success of Determine user-controllable input susceptible to injection")
public void assdetermineusercontrollableinputsusceptibletoinjection(){
//  Assert one of the following indications :
   //  -At least one user-controllable input susceptible to injection found.
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	
	
	int x = j.getAlertsCount();
	assert(x>0);
}
}