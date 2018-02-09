package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Attacker identifies client components to extract information from. These may be binary executables, class files, shared libraries (e.g., DLLs), configuration files, or other system files.

public class identifytarget {
@Given("prepare to Identify Target")
public void preidentifytarget(){
// The attacker must possess access to the system or code being exploited. Such access, for this set of attacks, will likely be physical. The attacker will make use of reverse engineering technologies, perhaps for data or to extract functionality from the binary. Such tool use may be as simple as "Strings" or a hex editor. Removing functionality may require the use of only a hex editor, or may require aspects of the toolchain used to construct the application: for instance the Adobe Flash development environment. Attacks of this nature do not require network access or undue CPU, memory, or other hardware-based resources.
// Additionally, this information must be unprotected, or protected in a flawed fashion, or through a mechanism that fails to resist reverse engineering, statistical, or other attack.
}
@When("Try to Identify Target")
public void tryidentifytarget(){
//  Try one of the following techniques :
   //1.  Binary file extraction. The attacker extracts binary files from zips, jars, wars, PDFs or other composite formats.
   //2.  Package listing. The attacker uses a package manifest provided with the software installer, or the filesystem itself, to identify component files suitable for attack.
}@Then("Assert the success of Identify Target")
public void assidentifytarget(){
//  Assert one of the following indications :
   //  -The attacker identifies one or more files in the system to examine.
}
}