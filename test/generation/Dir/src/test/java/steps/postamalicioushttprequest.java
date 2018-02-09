package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// Post a malicious HTTP request that will be interpreted as multiple HTTP requests when parsed on the server

public class postamalicioushttprequest {
@Given("prepare to Post a malicious HTTP Request")
public void prepostamalicioushttprequest(){
// Low: No specialized equipment is needed
// User-manipulateable HTTP Request headers are processed by the web server
}
@When("Try to Post a malicious HTTP Request")
public void trypostamalicioushttprequest(){
//  Try one of the following techniques :
   //1.  Post a malicious HTTP Request utilizing double CR/LF characters in HTTP header to cause request splitting
   //2.  Post a malicious HTTP Request utilizing "Transfer Encoding: chunked" in the request header to cause request splitting
   //3.  Post a malicious HTTP Request utilizing double Content-Length headers to cause request splitting
}@Then("Assert the success of Post a malicious HTTP Request")
public void asspostamalicioushttprequest(){
//  Assert one of the following indications :
}
}