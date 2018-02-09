package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// An attacker injects path traversal syntax into identified vulnerable inputs to cause inappropriate reading, writing or execution of files. An attacker could be able to read directories or files which they are normally not allowed to read. The attacker could also access data outside the web document root, or include scripts, source code and other kinds of files from external websites. Once the attacker accesses arbitrary files, he/she could also modify files. In particular situations, the attacker could also execute arbitrary code or system commands.

public class accessmodifyorexecutearbitraryfiles {
@Given("prepare to Access, modify, or execute arbitrary files.")
public void preaccessmodifyorexecutearbitraryfiles(){
// 
// The target application must accept a string as user input, fail to sanitize combinations of characters in the input that have a special meaning in the context of path navigation, and insert the user-supplied string into path navigation commands.
}
@When("Try to Access, modify, or execute arbitrary files.")
public void tryaccessmodifyorexecutearbitraryfiles(){
//  Try one of the following techniques :
   //1.  Manipulate file and its path by injecting relative path sequences (e.g. "../").
   //2.  Download files, modify files, or try to execute shell commands (with binary files).
}@Then("Assert the success of Access, modify, or execute arbitrary files.")
public void assaccessmodifyorexecutearbitraryfiles(){
//  Assert one of the following indications :
   //  -The attacker accesses the content of restricted files.
}
}