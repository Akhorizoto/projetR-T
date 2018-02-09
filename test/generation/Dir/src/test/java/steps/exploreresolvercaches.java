package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Check DNS caches on local DNS server and client's browser with DNS cache enabled.

public class exploreresolvercaches {
@Given("prepare to Explore resolver caches")
public void preexploreresolvercaches(){
// The attacker must have the resources to modify the targeted cache. In addition, in most cases the attacker will wish to host the sites to which users will be redirected, although in some cases redirecting to a third party site will accomplish the attackers' goals.
// A DNS cache must be vulnerable to some attack that allows the attacker to replace addresses in its lookup table.
}
@When("Try to Explore resolver caches")
public void tryexploreresolvercaches(){
//  Try one of the following techniques :
   //1.  Run tools that check the resolver cache in the memory to see if it contains a target DNS entry.
   //2.  Figure out if the client's browser has DNS cache enabled.
}@Then("Assert the success of Explore resolver caches")
public void assexploreresolvercaches(){
//  Assert one of the following indications :
   //  -A list of DNS server information. No target entry found in the resolver cache.
}
}