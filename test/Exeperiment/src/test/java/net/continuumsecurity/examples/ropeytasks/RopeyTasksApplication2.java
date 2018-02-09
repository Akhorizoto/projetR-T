package net.continuumsecurity.examples.ropeytasks;

import net.continuumsecurity.Config;
import net.continuumsecurity.Credentials;
import net.continuumsecurity.UserPassCredentials;
import net.continuumsecurity.behaviour.ILogin;
import net.continuumsecurity.behaviour.ILogout;
import net.continuumsecurity.behaviour.INavigable;
import net.continuumsecurity.web.WebApplication;
import org.openqa.selenium.By;

public class RopeyTasksApplication2 extends WebApplication implements ILogin,
        ILogout,INavigable {

    public RopeyTasksApplication2() {
        super();

    }

    @Override
    public void openLoginPage() {
    	String url = "http://localhost:8080/bodgeit/login.jsp";
        driver.get(url);
        findAndWaitForElement(By.id("username"));
    }

    @Override
    public void login(Credentials credentials) {
    	openLoginPage();
        UserPassCredentials creds = new UserPassCredentials(credentials);
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys(creds.getUsername());
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(creds.getPassword());
        driver.findElement(By.name("_action_login")).click();
    }
    @Override
    public void loginInj() {
        
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys("'");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("'");
        driver.findElement(By.name("submit")).click();
        
    }
    // Convenience method
    public void login(String username, String password) {
        login(new UserPassCredentials(username, password));
    }

    @Override
    public boolean isLoggedIn() {
        driver.get(Config.getInstance().getBaseUrl()+"task/list");
        if (driver.getPageSource().contains("Tasks")) {
            return true;
        } else {
            return false;
        }
    }

    public void viewProfile() {
        driver.findElement(By.linkText("password.jsp")).click();
    }

    public void viewAlicesProfile() {
        viewProfile();
    }

    public void viewBobsProfile() {
        viewProfile();
    }

    @Override
    public void logout() {
        driver.findElement(By.linkText("Logout")).click();
    }

    public void search(String query) {
        findAndWaitForElement(By.linkText("Tasks")).click();
        driver.findElement(By.id("q")).clear();
        driver.findElement(By.id("q")).sendKeys(query);
        driver.findElement(By.id("search")).click();
    }

    public void viewAllUsers() {
        driver.get(Config.getInstance().getBaseUrl() + "admin/list");
    }

    public void navigate() {
        openLoginPage();
        login(Config.getInstance().getDefaultCredentials());
        viewProfile();
        search("test");
    }

	@Override
	public void navigateInj() {
		openLoginPage();
				
        login(Config.getInstance().getIncoreectCredentials());
//        viewProfile();
//        search("test");
		
	}
	public static void main (String[] args){
	   WebApplication app = new WebApplication();
	   app.navigate();
	   }

}

