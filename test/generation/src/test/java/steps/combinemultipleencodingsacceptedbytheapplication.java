package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker now combines encodings accepted by the application. The attacker may combine different encodings or apply the same encoding multiple times.

public class combinemultipleencodingsacceptedbytheapplication {
@Given("prepare to Combine multiple encodings accepted by the application.")
public void precombinemultipleencodingsacceptedbytheapplication(){
// 
// Multiple parser passes are performed on the data supplied by the user.
}
@When("Try to Combine multiple encodings accepted by the application.")
public void trycombinemultipleencodingsacceptedbytheapplication(){
//  Try one of the following techniques :
   //1.  Combine same encoding multiple times and observe its effects. For example, if special characters are encoded with a leading backslash, then the following encoding may be accepted by the application/system: "\\\.". With two parsing layers, this may get converted to "\." after the first parsing layer, and then, to "." after the second. If the input validation layer is between the two parsing layers, then "\\\.\\\." might pass a test for ".." but still get converted to ".." afterwards. This may enable directory traversal attacks.
   //2.  Combine multiple encodings and observe the effects. For example, the attacker might encode "." as "\.", and then, encode "\." as "&#92;&#46;", and then, encode that using URL encoding to "%26%2392%3B%26%2346%3B"
}@Then("Assert the success of Combine multiple encodings accepted by the application.")
public void asscombinemultipleencodingsacceptedbytheapplication(){
//  Assert one of the following indications :
   //  -Attacker bypasses input validation layer(s) and passes data to application that it does not expect.
    //  -Application/System interprets the multiple encodings properly.
}
}