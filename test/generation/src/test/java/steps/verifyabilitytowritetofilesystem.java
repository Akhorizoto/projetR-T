package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker verifies ability to write to the target host's file system.

public class verifyabilitytowritetofilesystem {
@Given("prepare to Verify ability to write to filesystem")
public void preverifyabilitytowritetofilesystem(){
// 
// The target host does insecure temporary file creation.
}
@When("Try to Verify ability to write to filesystem")
public void tryverifyabilitytowritetofilesystem(){
//  Try one of the following techniques :
   //1.  Create a file that does not exist in the target directory (e.g. "touch temp.txt" in UNIX-like systems)
   //2.  On platforms that differentiate between file creation and file modification, if the target file that the application writes to already exists, attempt to modify it.
   //3.  Verify permissions on target directory
}@Then("Assert the success of Verify ability to write to filesystem")
public void assverifyabilitytowritetofilesystem(){
//  Assert one of the following indications :
   //  -Attacker can create and modify files in the target directory.
    //  -Target directory is writable by the attackers' effective user ID.
}
}