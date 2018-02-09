package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The attacker examines the website information and source code of the website and uses automated tools to get as much information as possible about the system and organization.

public class requestfootprinting {
@Given("prepare to Request Footprinting")
public void prerequestfootprinting(){
// The attacker requires a variety of tools to collect information about the target. These include port and network scanners and tools to analyze responses from applications to determine version and configuration information. Footprinting a system adequately may also take a few days if the attacker wishes the footprinting attempt to go undetected.
// None. Any system or network that can be detected can be footprinted. However, some configuration choices may limit the useful information that can be collected during a footprinting attack.
}
@When("Try to Request Footprinting")
public void tryrequestfootprinting(){
//  Try one of the following techniques :
   //1.  Open Source Footprinting: Examine the website about the organization and skim through the webpage's HTML source to look for comments.
   //2.  Network Enumeration: Perform various queries (Registrar Query, Organizational Query, Domain Query, Network Query, POC Query) on the many whois databases found on the internet to identify domain names and associated networks.
   //3.  DNS Interrogation: Once basic information is gathered the attack could begin to query DNS.
   //4.  Other Techniques: Use ping sweep, TCP scan, UDP scan, OS Identification various techniques to gain more information about the system and network.
}@Then("Assert the success of Request Footprinting")
public void assrequestfootprinting(){
//  Assert one of the following indications :
   //  -A list of sensitive information about the system and network.
}
}