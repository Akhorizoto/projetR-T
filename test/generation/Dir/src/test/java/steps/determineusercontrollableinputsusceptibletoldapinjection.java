package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.continuumsecurity.proxy.ZAProxyScanner;


// For each user-controllable input that the attacker suspects is vulnerable to LDAP injection, attempt to inject characters that have special meaning in LDAP (such as a single quote character, etc.). The goal is to create a LDAP query with an invalid syntax

public class determineusercontrollableinputsusceptibletoldapinjection {
@Given("prepare to Determine user-controllable input susceptible to LDAP injection")
public void predetermineusercontrollableinputsusceptibletoldapinjection(){
// 
// The target application must accept a string as user input, fail to sanitize characters that have a special meaning in LDAP queries in the user input, and insert the user-supplied string in an LDAP query which is then processed.
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	j.deleteAlerts();
	j.disableAllScanners();
	j.setEnableScanners("40015", true);
}
@When("Try to Determine user-controllable input susceptible to LDAP injection")
public void trydetermineusercontrollableinputsusceptibletoldapinjection(){
//  Try one of the following techniques :
   //1.  Use web browser to inject input through text fields or through HTTP GET parameters
   //2.  Use a web application debugging tool such as Tamper Data, TamperIE, WebScarab,etc. to modify HTTP POST parameters, hidden fields, non-freeform fields, or other HTTP header.
   //3.  Use modified client (modified by reverse engineering) to inject input.
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
}@Then("Assert the success of Determine user-controllable input susceptible to LDAP injection")
public void assdetermineusercontrollableinputsusceptibletoldapinjection(){
//  Assert one of the following indications :
   //  -At least user controllable data input to application identified.
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	int x = j.getAlertsCount();
	assert(x>0);
}
}