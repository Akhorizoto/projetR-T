package steps;
import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.continuumsecurity.proxy.ZAProxyScanner;


// Look for user controllable input, including HTTP headers, that can carry server side include directives to the web server

public class attemptssi {
@Given("prepare to Attempt SSI")
public void preattemptssi(){
// None: Determining whether the server supports SSI does not require special tools, and nor does injecting directives that get executed.
// User controllable input that can carry include directives to the web server
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	j.clear();
	j.disableAllScanners();
	
}
@When("Try to Attempt SSI")
public void tryattemptssi(){
//  Try one of the following techniques :
   //1.  Use a spidering tool to follow and record all links. Make special note of any links that include parameters in the URL.
   //2.  Use a proxy tool to record all links visited during a manual traversal of the web application. Make special note of any links that include parameters in the URL. Manual traversal of this type is frequently necessary to identify forms that are GET method forms rather than POST forms.
	String url ="http://192.168.83.227:8080/bodgeit/";
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	j.spider(url);
}@Then("Assert the success of Attempt SSI")
public void assattemptssi(){
//  Assert one of the following indications :
   //  -A list of URLs, with their corresponding parameters is created by the attacker.
	ZAProxyScanner j = new ZAProxyScanner("localhost", 8080, "zap");
	int x = j.getSpiderResults(j.getLastSpiderScanId()).size();
	Assert.assertTrue(x>0);
}
}