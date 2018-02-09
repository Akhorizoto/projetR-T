package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The adversary attempts to access the discovered directories that allow access and may attempt to bypass server or application level ACLs by using manual or automated methods

public class iterativelyexploredirectoryfilestructures {
@Given("prepare to Iteratively explore directory/file structures")
public void preiterativelyexploredirectoryfilestructures(){
// Ability to send HTTP requests to a web application.
// The server version or patch level must not inherently prevent known directory listing attacks from working.
}
@When("Try to Iteratively explore directory/file structures")
public void tryiterativelyexploredirectoryfilestructures(){
//  Try one of the following techniques :
   //1.  Use a scanner tool to dynamically add directories/files to include their scan based upon data obtained in initial probes.
   //2.  Use a browser to manually explore the website by issuing a request ending the URL in a slash '/'.
   //3.  Attempt to bypass ACLs on directories by using methods that known to work against some server types by appending data to the directory request. For instance, appending a Null byte to the end of the request which may cause an ACL to fail and allow access.
   //4.  Sequentially request a list of common base files to each directory discovered.
   //5.  Try multiple fuzzing techniques to list directory contents for directories that will not reveal their contents with a "/" request
}@Then("Assert the success of Iteratively explore directory/file structures")
public void assiterativelyexploredirectoryfilestructures(){
//  Assert one of the following indications :
   //  -A list of files within a requested directory.
}
}