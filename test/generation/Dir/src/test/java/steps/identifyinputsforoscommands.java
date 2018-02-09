package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.continuumsecurity.proxy.ZAProxyScanner;


// The attacker determines user controllable input that gets passed as part of a command to the underlying operating system.

public class identifyinputsforoscommands {
@Given("prepare to Identify inputs for OS commands")
public void preidentifyinputsforoscommands(){
// 
// User controllable input used as part of commands to the underlying operating system.
	
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	j.deleteAlerts();
	j.disableAllScanners();
	j.setEnableScanners("90020", true);
}
@When("Try to Identify inputs for OS commands")
public void tryidentifyinputsforoscommands(){
//  Try one of the following techniques :
   //1.  Port mapping. Identify ports that the system is listening on, and attempt to identify inputs and protocol types on those ports.
   //2.  TCP/IP Fingerprinting. The attacker uses various software to make connections or partial connections and observe idiosyncratic responses from the operating system. Using those responses, he attempts to guess the actual operating system.
   //3.  Induce errors to find informative error messages
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
}@Then("Assert the success of Identify inputs for OS commands")
public void assidentifyinputsforoscommands(){
//  Assert one of the following indications :
   //  -Operating environment (operating system, language, and/or middleware) is correctly identified.
    //  -The target software accepts connections via the network.
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	int x = j.getAlertsCount();
	assert(x>0);
}
}