package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker then needs to provide various character encodings to the application/system and determine which ones are accepted. The attacker will need to observe the application's/system's response to the encoded data to determine whether the data was interpreted properly.

public class determinewhichcharacterencodingsareacceptedbytheapplicationsystem {
@Given("prepare to Determine which character encodings are accepted by the application/system")
public void predeterminewhichcharacterencodingsareacceptedbytheapplicationsystem(){
// 
// Multiple parser passes are performed on the data supplied by the user.
}
@When("Try to Determine which character encodings are accepted by the application/system")
public void trydeterminewhichcharacterencodingsareacceptedbytheapplicationsystem(){
//  Try one of the following techniques :
   //1.  Determine which escape characters are accepted by the application/system. A common escape character is the backslash character, '\'
   //2.  Determine whether URL encoding is accepted by the application/system.
   //3.  Determine whether UTF-8 encoding is accepted by the application/system.
   //4.  Determine whether UTF-16 encoding is accepted by the application/system.
   //5.  Determine if any other encodings are accepted by the application/system.
}@Then("Assert the success of Determine which character encodings are accepted by the application/system")
public void assdeterminewhichcharacterencodingsareacceptedbytheapplicationsystem(){
//  Assert one of the following indications :
   //  -Application/system accepts at least one high level character encoding where characters can be represented with multiple ASCII characters.
    //  -System provides error message similar to the one it provided when a positive indicator was received for the first step.
}
}