package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Trying each parameter in turn, the attacker modifies the values

public class modifyparametertokenvalues {
@Given("prepare to Modify parameter/token values")
public void premodifyparametertokenvalues(){
// The Attacker needs no special hardware-based resources in order to conduct this attack. Software plugins, such as Tamper Data for Firefox, may help in manipulating URL- or cookie-based data.
// For an Attacker to viably execute this attack, some data (later interpreted by the application) must be held client-side in a way that can be manipulated without detection. This means that the data or tokens are not CRCd as part of their value or through a separate meta-data store elsewhere.
}
@When("Try to Modify parameter/token values")
public void trymodifyparametertokenvalues(){
//  Try one of the following techniques :
   //1.  Modify tokens logically
   //2.  Modify tokens arithmetically
   //3.  Modify tokens bitwise
   //4.  Modify structural components of tokens
   //5.  Modify order of parameters/tokens
}@Then("Assert the success of Modify parameter/token values")
public void assmodifyparametertokenvalues(){
//  Assert one of the following indications :
}
}