package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Use a password cracking tool that will leverage the dictionary to feed passwords to the system and see if they work.

public class usedictionarytocrackpasswords {
@Given("prepare to Use dictionary to crack passwords.")
public void preusedictionarytocrackpasswords(){
// A machine with sufficient resources for the job (e.g. CPU, RAM, HD). Applicable dictionaries are required. Also a password cracking tool or a custom script that leverages the dictionary database to launch the attack.
// The system does not implement an effective password throttling mechanism.
}
@When("Try to Use dictionary to crack passwords.")
public void tryusedictionarytocrackpasswords(){
//  Try one of the following techniques :
   //1.  Try all words in the dictionary, as well as common misspellings of the words as passwords for the chosen username(s).
   //2.  Try common combinations of words in the dictionary, as well as common misspellings of the combinations as passwords for the chosen username(s).
}@Then("Assert the success of Use dictionary to crack passwords.")
public void assusedictionarytocrackpasswords(){
//  Assert one of the following indications :
   //  -Attacker determines correct password for a user ID and obtains access to application or system.
}
}