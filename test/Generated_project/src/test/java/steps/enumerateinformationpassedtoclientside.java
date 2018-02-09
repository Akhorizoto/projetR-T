package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker identifies the parameters used as part of tokens to take business or security decisions

public class enumerateinformationpassedtoclientside {
@Given("prepare to Enumerate information passed to client side")
public void preenumerateinformationpassedtoclientside(){
// The Attacker needs no special hardware-based resources in order to conduct this attack. Software plugins, such as Tamper Data for Firefox, may help in manipulating URL- or cookie-based data.
// For an Attacker to viably execute this attack, some data (later interpreted by the application) must be held client-side in a way that can be manipulated without detection. This means that the data or tokens are not CRCd as part of their value or through a separate meta-data store elsewhere.
}
@When("Try to Enumerate information passed to client side")
public void tryenumerateinformationpassedtoclientside(){
//  Try one of the following techniques :
   //1.  Use WebScarab to reveal hidden fields while browsing.
   //2.  Use a sniffer to capture packets
   //3.  View source of web page to find hidden fields
   //4.  Examine URL to see if any opaque tokens are in it
   //5.  Disassemble or decompile client-side application
   //6.  Use debugging tools such as File Monitor, Registry Monitor, Debuggers, etc.
}@Then("Assert the success of Enumerate information passed to client side")
public void assenumerateinformationpassedtoclientside(){
//  Assert one of the following indications :
   //  -At least one opaque client-side token found
    //  -Opaque Resource Locator
}
}