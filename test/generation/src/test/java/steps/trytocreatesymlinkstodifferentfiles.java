package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker then uses a variety of techniques, such as monitoring or guessing to create symlinks to the files accessed by the target application in the directories which are identified in the explore phase.

public class trytocreatesymlinkstodifferentfiles {
@Given("prepare to Try to create symlinks to different files")
public void pretrytocreatesymlinkstodifferentfiles(){
// No special resources are required beyond the ability to create the necessary symbolic link.
// The targeted application must perform the desired activities on a file without checking whether the file is a symbolic link or not. The attacker must be able to predict the name of the file the target application is modifying and be able to create a new symbolic link where that file would appear.
}
@When("Try to Try to create symlinks to different files")
public void trytrytocreatesymlinkstodifferentfiles(){
//  Try one of the following techniques :
   //1.  The attacker monitors the file operations performed by the target application using a tool like dtrace or FileMon. And the attacker can delay the operations by using "sleep(2)" and "usleep()" to prepare the appropriate conditions for the attack, or make the application perform expansive tasks (large files parsing, etc.) depending on the purpose of the application.
   //2.  The attacker may need a little guesswork on the filenames on which the target application would operate.
   //3.  The attacker tries to create symlinks to the various filenames.
}@Then("Assert the success of Try to create symlinks to different files")
public void asstrytocreatesymlinkstodifferentfiles(){
//  Assert one of the following indications :
   //  -The attacker creates symlink to the files while the target application is operating on the file.
    //  -The attacker can create symlinks to the files in the target directories.
}
}