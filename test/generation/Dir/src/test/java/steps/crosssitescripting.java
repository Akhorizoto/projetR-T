package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.continuumsecurity.proxy.ZAProxyScanner;


// As the attacker succeeds in exploiting the vulnerability, he can choose to attack the user with Cross-Site Scripting. The possible outcomes of such an attack are described in the Cross-Site Scripting related attack patterns.

public class crosssitescripting {
@Given("prepare to Cross-Site Scripting")
public void precrosssitescripting(){
// None
// Insufficient input validation in application to check for input sanity before using it as part of response header
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	j.deleteAlerts();
	j.disableAllScanners();
	j.setEnableScanners("40012,40014,40016,40017", true);
	
}
@When("Try to Cross-Site Scripting")
public void trycrosssitescripting(){
//  Try one of the following techniques :
   //1.  Inject cross-site scripting payload preceded by response splitting syntax (CR/LF) into user-controllable input identified as vulnerable in the Experiment Phase.
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
}@Then("Assert the success of Cross-Site Scripting")
public void asscrosssitescripting(){
//  Assert one of the following indications :
   //  -The malicious script is executed within the user's context.
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	int x = j.getAlertsCount();
	assert(x>0);
}
}