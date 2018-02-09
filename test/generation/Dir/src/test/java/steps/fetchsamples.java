package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// An attacker fetches many samples of a session ID. This may be through legitimate access (logging in, legitimate connections, etc) or just systematic probing.

public class fetchsamples {
@Given("prepare to Fetch samples")
public void prefetchsamples(){
// Ability to deploy software on network. Ability to communicate synchronously or asynchronously with server
// Server software must rely on weak session IDs proof and/or verification schemes
}
@When("Try to Fetch samples")
public void tryfetchsamples(){
//  Try one of the following techniques :
   //1.  An attacker makes many anonymous connections and records the session IDs assigned.
   //2.  An attacker makes authorized connections and records the session tokens or credentials issued.
   //3.  An attacker gains access to (legitimately or illegitimately) a nearby system (e.g., in the same operations network, DMZ, or local network) and makes a connections from it, attempting to gain the same privileges as a trusted system.
}@Then("Assert the success of Fetch samples")
public void assfetchsamples(){
//  Assert one of the following indications :
   //  -Systems or applications grant trust based on logical or physical network locality.
    //  -Network systems issue session IDs or connection IDs
}
}