package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker sets up a sniffer in the path between the server and the client and watches the traffic.

public class setupasniffer {
@Given("prepare to Set up a sniffer")
public void presetupasniffer(){
// The Attacker needs the ability to capture communications between the client and server during an initial installation. In the case that encryption obscures client/server communication the attacker needs to lift key material from the client.
// The attacker must be able to employ a sniffer in the path between the server and client without being detected. The targeted operating system or application must be configured to allow for end users to request new components and applications from the server.
}
@When("Try to Set up a sniffer")
public void trysetupasniffer(){
//  Try one of the following techniques :
   //1.  The attacker sets up a sniffer in the path between the server and the client.
}@Then("Assert the success of Set up a sniffer")
public void asssetupasniffer(){
//  Assert one of the following indications :
   //  -The attacker successfully sets up a sniffer in the path between the server and client.
}
}