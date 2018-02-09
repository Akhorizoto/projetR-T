import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker probes, through brute-forcing, reverse-engineering or other similar means, the functionality on the client that server assumes to be present and trustworthy.

public class probing {
@Given("prepare to Probing")
public void preprobing(){
// The attacker must have access to a client and be able to modify the client behavior, often through reverse engineering. If the server is assuming specific client functionality, this usually means the server only recognizes a specific client application, rather than a broad class of client applications. Reverse engineering tools would likely be necessary.
// The targeted server must assume the client performs important actions to protect the server or the server functionality. For example, the server may assume the client filters outbound traffic or that the client performs all price calculations correctly. Moreover, the server must fail to detect when these assumptions are violated by a client.
}
@When("Try to Probing")
public void tryprobing(){
//  Try one of the following techniques :
   //1.  The attacker probes by exploring an application's functionality and its underlying mapping to server-side components.
   //2.  The attacker reverse engineers client-side code to identify the functionality that the server relies on for the proper or secure operation.
}@Then("Assert the success of Probing")
public void assprobing(){
//  Assert one of the following indications :
   //  -A list of functionality on the client that the server assumes to be present and trustworthy.
}
}