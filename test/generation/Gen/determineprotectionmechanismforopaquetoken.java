import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker determines the protection mechanism used to protect the confidentiality and integrity of these data tokens. They may be obfuscated or a full blown encryption may be used.

public class determineprotectionmechanismforopaquetoken {
@Given("prepare to Determine protection mechanism for opaque token")
public void predetermineprotectionmechanismforopaquetoken(){
// The Attacker needs no special hardware-based resources in order to conduct this attack. Software plugins, such as Tamper Data for Firefox, may help in manipulating URL- or cookie-based data.
// For an Attacker to viably execute this attack, some data (later interpreted by the application) must be held client-side in a way that can be manipulated without detection. This means that the data or tokens are not CRCd as part of their value or through a separate meta-data store elsewhere.
}
@When("Try to Determine protection mechanism for opaque token")
public void trydetermineprotectionmechanismforopaquetoken(){
//  Try one of the following techniques :
   //1.  Look for signs of well-known character encodings
   //2.  Look for cryptographic signatures
   //3.  Look for delimiters or other indicators of structure
}@Then("Assert the success of Determine protection mechanism for opaque token")
public void assdetermineprotectionmechanismforopaquetoken(){
//  Assert one of the following indications :
   //  -Protection/encoding scheme identified
}
}