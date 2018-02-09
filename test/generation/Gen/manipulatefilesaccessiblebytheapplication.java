import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker may steal information or directly manipulate files (delete, copy, flush, etc.)

public class manipulatefilesaccessiblebytheapplication {
@Given("prepare to Manipulate files accessible by the application")
public void premanipulatefilesaccessiblebytheapplication(){
// 
// Program must allow for user controlled variables to be applied directly to the filesystem
}
@When("Try to Manipulate files accessible by the application")
public void trymanipulatefilesaccessiblebytheapplication(){
//  Try one of the following techniques :
   //1.  The attacker injects context-appropriate malicious file path to access the content of the targeted file.
   //2.  The attacker injects context-appropriate malicious file system control syntax to access the content of the targeted file.
   //3.  The attacker injects context-appropriate malicious file path to cause the application to create, delete a targeted file.
   //4.  The attacker injects context-appropriate malicious file system control syntax to cause the application to create, delete a targeted file.
   //5.  The attacker injects context-appropriate malicious file path in order to manipulate the meta-data of the targeted file.
   //6.  The attacker injects context-appropriate malicious file system control syntax in order to manipulate the meta-data of the targeted file.
}@Then("Assert the success of Manipulate files accessible by the application")
public void assmanipulatefilesaccessiblebytheapplication(){
//  Assert one of the following indications :
   //  -The software performs an action the attacker desires. This might be displaying information, storing information in a file, delete a file or some other malicious activity.
}
}