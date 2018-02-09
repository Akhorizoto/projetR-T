package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Use tools to sniff traffic and scan a network in order to locate application's cache (e.g. a web browser cache) or a public cache (e.g. a DNS or ARP cache) that may have vulnerabilities. Look for poisoning point in cache table entries.

public class identifyandexplorecaches {
@Given("prepare to Identify and explore caches")
public void preidentifyandexplorecaches(){
// 
// The targeted application must not be able to detect the illicit modification of the cache and must trust the cache value in its calculations.
}
@When("Try to Identify and explore caches")
public void tryidentifyandexplorecaches(){
//  Try one of the following techniques :
   //1.  Run tools that check available entries in the cache.
}@Then("Assert the success of Identify and explore caches")
public void assidentifyandexplorecaches(){
//  Assert one of the following indications :
   //  -A list of server's information. No target entry found in the cache.
}
}