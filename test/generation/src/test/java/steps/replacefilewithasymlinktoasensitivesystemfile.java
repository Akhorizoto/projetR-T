package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Between the time that the application checks to see if a file exists (or if the user has access to it) and the time the application actually opens the file, the attacker replaces the file with a symlink to a sensitive system file.

public class replacefilewithasymlinktoasensitivesystemfile {
@Given("prepare to Replace file with a symlink to a sensitive system file.")
public void prereplacefilewithasymlinktoasensitivesystemfile(){
// 
// The target host does insecure temporary file creation.
}
@When("Try to Replace file with a symlink to a sensitive system file.")
public void tryreplacefilewithasymlinktoasensitivesystemfile(){
//  Try one of the following techniques :
   //1.  Create an infinite loop containing commands such as "rm -f tempfile.dat; ln -s /etc/shadow tempfile.dat". Wait for an instance where the following steps occur in the given order: (1) Application ensures that tempfile.dat exists and that the user has access to it, (2) "rm -f tempfile.dat; ln -s /etc/shadow tempfile.dat", and (3) Application opens tempfile.dat for writing, and inadvertently opens /etc/shadow for writing instead.
   //2.  Use other techniques with debugging tools to replace the file between the time the application checks the file and the time the application opens it.
}@Then("Assert the success of Replace file with a symlink to a sensitive system file.")
public void assreplacefilewithasymlinktoasensitivesystemfile(){
//  Assert one of the following indications :
   //  -Sensitive file tampered with successfully.
}
}