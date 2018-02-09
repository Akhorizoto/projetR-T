package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// This optional step can be used to help the attacker impersonate the legitimate site more convincingly. The attacker can use homograph attacks to convince users that they are using the legitimate website. Note that this step is not required for phishing attacks, and many phishing attacks simply supply URLs containing an IP address and no SSL certificate.

public class obtaindomainnameandcertificatetospooflegitimatesite {
@Given("prepare to Obtain domain name and certificate to spoof legitimate site")
public void preobtaindomainnameandcertificatetospooflegitimatesite(){
// Some web development tools to put up a fake website.
// The replicated website needs to look extremely similar to the original website and the URL used to get to that website needs to look like the real URL of the said business entity.
}
@When("Try to Obtain domain name and certificate to spoof legitimate site")
public void tryobtaindomainnameandcertificatetospooflegitimatesite(){
//  Try one of the following techniques :
   //1.  Optionally obtain a domain name that visually looks similar to the legitimate site's domain name. An example is www.paypaI.com vs. www.paypal.com (the first one contains a capital i, instead of a lower case L)
   //2.  Optionally obtain a legitimate SSL certificate for the new domain name.
}@Then("Assert the success of Obtain domain name and certificate to spoof legitimate site")
public void assobtaindomainnameandcertificatetospooflegitimatesite(){
//  Assert one of the following indications :
}
}