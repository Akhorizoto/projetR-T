package net.continuumsecurity.examples.ropeytasks;

import net.continuumsecurity.Config;
import net.continuumsecurity.Credentials;
import net.continuumsecurity.UserPassCredentials;
import net.continuumsecurity.behaviour.ILogin;
import net.continuumsecurity.behaviour.ILogout;
import net.continuumsecurity.behaviour.INavigable;
import net.continuumsecurity.web.WebApplication;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BodgeitApplication extends WebApplication implements ILogin,
        ILogout,INavigable {

    public BodgeitApplication() {
        super();

    }

    @Override
    public void openLoginPage() {
    	String url = Config.getInstance().getBaseUrl() +"login.jsp";
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
        driver.findElement(By.id("submit")).click();
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
        driver.get(Config.getInstance().getBaseUrl()+"password.jsp");
        if (! driver.getPageSource().contains("null")) {
            return true;
        } else {
            return false;
        }
    }

    public WebDriver getdriver() {
    	
		return driver;
		
	}
    @Override
    public void logout() {
        driver.findElement(By.linkText("logout.jsp")).click();
    }

    public void search(String query) {
    	driver.get(Config.getInstance().getBaseUrl()+"search.jsp");
       // findAndWaitForElement(By.linkText("Tasks")).click();
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys(query);
        driver.findElement(By.xpath("/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/"
        		+ "td[2]/font/form/table/tbody/tr[2]/td[2]/input")).click();
    }

    public void viewAllUsers() {
        driver.get(Config.getInstance().getBaseUrl() + "admin.jsp");
    }

    public void navigate() {
        openLoginPage();
        login(Config.getInstance().getDefaultCredentials());
        search("test");
        driver.get(Config.getInstance().getBaseUrl()+"basket.jsp?quantity_16=a&update=Update+Basket");
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

