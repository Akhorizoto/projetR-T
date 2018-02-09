package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


// The adversary attempts to access the discovered directories that allow access and may attempt to bypass server or application level ACLs by using manual or automated methods

public class readdirectoriesorfileswhicharenotintendedforpublicviewing {
@Given("prepare to Read directories or files which are not intended for public viewing.")
public void prereaddirectoriesorfileswhicharenotintendedforpublicviewing(){
// Ability to send HTTP requests to a web application.
// The server version or patch level must not inherently prevent known directory listing attacks from working.
}
@When("Try to Read directories or files which are not intended for public viewing.")
public void tryreaddirectoriesorfileswhicharenotintendedforpublicviewing(){
//  Try one of the following techniques :
   //1.  Try multiple exploit techniques to list directory contents for directories that will not reveal their contents with a "/" request
   //2.  Try other known exploits to elevate privileges sufficient to bypass protected directories.
   //3.  List the files in the directory by issuing a request with the URL ending in a "/" slash.
   //4.  Access the files via direct URL and capture contents.
   //5.  Attempt to bypass ACLs on directories by using methods that are known to work against some server types by appending data to the directory request. For instance, appending a Null byte to the end of the request which may cause an ACL to fail and allow access.
   //6.  Sequentially request a list of common base files to each directory discovered.
}@Then("Assert the success of Read directories or files which are not intended for public viewing.")
public void assreaddirectoriesorfileswhicharenotintendedforpublicviewing(){
//  Assert one of the following indications :
   //  -Directory contents are accessible to the attacker.
}
}