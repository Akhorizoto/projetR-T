import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker tries to determine which functionality to disable or remove through reverse-engineering from the list of functionality identified in the Explore phase.

public class determinewhichfunctionalitytodisableorremove {
@Given("prepare to Determine which functionality to disable or remove")
public void predeterminewhichfunctionalitytodisableorremove(){
// The attacker must have access to a client and be able to modify the client behavior, often through reverse engineering. If the server is assuming specific client functionality, this usually means the server only recognizes a specific client application, rather than a broad class of client applications. Reverse engineering tools would likely be necessary.
// The targeted server must assume the client performs important actions to protect the server or the server functionality. For example, the server may assume the client filters outbound traffic or that the client performs all price calculations correctly. Moreover, the server must fail to detect when these assumptions are violated by a client.
}
@When("Try to Determine which functionality to disable or remove")
public void trydeterminewhichfunctionalitytodisableorremove(){
//  Try one of the following techniques :
   //1.  The attacker reverse engineers the client-side code to determine which functionality to disable or remove.
}@Then("Assert the success of Determine which functionality to disable or remove")
public void assdeterminewhichfunctionalitytodisableorremove(){
//  Assert one of the following indications :
   //  -The attacker understands and can disable or remove the critical functionality from the client code.
}
}