package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker is able to create symlinks to sensitive files while the target application is operating on the file.

public class targetapplicationoperatesoncreatedsymlinkstosensitivefiles {
@Given("prepare to Target application operates on created symlinks to sensitive files")
public void pretargetapplicationoperatesoncreatedsymlinkstosensitivefiles(){
// No special resources are required beyond the ability to create the necessary symbolic link.
// The targeted application must perform the desired activities on a file without checking whether the file is a symbolic link or not. The attacker must be able to predict the name of the file the target application is modifying and be able to create a new symbolic link where that file would appear.
}
@When("Try to Target application operates on created symlinks to sensitive files")
public void trytargetapplicationoperatesoncreatedsymlinkstosensitivefiles(){
//  Try one of the following techniques :
   //1.  Create the symlink to the sensitive file such as configuration files, etc.
}@Then("Assert the success of Target application operates on created symlinks to sensitive files")
public void asstargetapplicationoperatesoncreatedsymlinkstosensitivefiles(){
//  Assert one of the following indications :
   //  -The attacker creates symlinks to sensitive files and the target application operates on them leading to a breach in the security assumptions of the target application.
}
}