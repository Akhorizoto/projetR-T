package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.continuumsecurity.proxy.ZAProxyScanner;
import net.continuumsecurity.scanner.FileUtils;

import static java.nio.file.StandardCopyOption.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.zaproxy.clientapi.core.*;


// The attacker uses sniffing tools to capture a session token from traffic.

public class capturesessiontoken {
	@Given("prepare to Capture session token")
	public void precapturesessiontoken(){
		// Low: A laptop and access to a public WiFi network.
		// The victim initiated communication with a target system that requires transfer of the session token or the target application uses AJAX and thereby periodically "rings home" asynchronously using the session token
		ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
		j.clear();
		j.disableAllScanners(); 
		j.setEnablePassiveScan(true);
		j.setEnableScanners("10104", true);
		j.spider("http://192.168.83.227:8080/bodgeit");
		while (j.getSpiderProgress(j.getLastSpiderScanId())<100) {System.out.println(j.getSpiderProgress(j.getLastSpiderScanId()));}
		File sFile = new File("pom.xml");
		File dFile = new File("pom2.xml");
		try {
			org.apache.commons.io.FileUtils.copyFile(sFile, dFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@When("Try to Capture session token")
	public void trycapturesessiontoken(){
		//  Try one of the following techniques :
		//.
		
		
		
		String url = "http://192.168.83.227:8080/bodgeit";
		ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
		j.scan(url);
		while (j.getScanProgress(j.getLastScannerScanId())<100){System.out.println(j.getScanProgress(j.getLastScannerScanId()));}
		ClientApi clientApi = new ClientApi("localhost", 8080);
		
			
			
	}@Then("Assert the success of Capture session token")
	public void asscapturesessiontoken(){
		//  Assert one of the following indications :
	}
}