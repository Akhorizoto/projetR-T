package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// This attack pattern is only applicable on platforms that support symbolic links.

public class verifythattargethostsplatformsupportssymboliclinks {
@Given("prepare to Verify that target host's platform supports symbolic links.")
public void preverifythattargethostsplatformsupportssymboliclinks(){
// 
// The target host does insecure temporary file creation.
}
@When("Try to Verify that target host's platform supports symbolic links.")
public void tryverifythattargethostsplatformsupportssymboliclinks(){
//  Try one of the following techniques :
   //1.  Research target platform to determine whether it supports symbolic links.
   //2.  Create a symbolic link and ensure that it works as expected on the given platform.
}@Then("Assert the success of Verify that target host's platform supports symbolic links.")
public void assverifythattargethostsplatformsupportssymboliclinks(){
//  Assert one of the following indications :
   //  -Target platform supports symbolic links (e.g. Linux, UNIX, etc.)
}
}