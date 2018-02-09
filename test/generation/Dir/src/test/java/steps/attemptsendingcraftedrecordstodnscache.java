package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// A request is sent to the authoritative server for target website and wait for the iterative name resolver. An attacker sends bogus request to the DNS local server, and then floods responses that trick a DNS cache to remember malicious responses, which are wrong answers of DNS query.

public class attemptsendingcraftedrecordstodnscache {
@Given("prepare to Attempt sending crafted records to DNS cache")
public void preattemptsendingcraftedrecordstodnscache(){
// The attacker must have the resources to modify the targeted cache. In addition, in most cases the attacker will wish to host the sites to which users will be redirected, although in some cases redirecting to a third party site will accomplish the attackers' goals.
// A DNS cache must be vulnerable to some attack that allows the attacker to replace addresses in its lookup table.
}
@When("Try to Attempt sending crafted records to DNS cache")
public void tryattemptsendingcraftedrecordstodnscache(){
//  Try one of the following techniques :
   //1.  Attacker must know the transaction ID by intercepting a DNS query, or sending a bogus query with known transaction ID.
   //2.  If the transaction ID used to identify each query instance is randomized in some new DNS software, the attack must guess the transaction ID. Slow the response of the real DNS server by causing Denial-of-service. This gives attacker enough time to guess transaction
   //3.  Attacker crafts DNS response with the same transaction ID as in the request. The attacker sends out DNS responses before the authorized DNS server. This forces DNS local cache stores fake DNS response (wrong answer). The fake DNS responses usually include a malicious website's IP address.
}@Then("Assert the success of Attempt sending crafted records to DNS cache")
public void assattemptsendingcraftedrecordstodnscache(){
//  Assert one of the following indications :
   //  -Any local machine that types names of the good server is redirected to a malicious server.
}
}