package tests;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;


public class LoginTest extends BaseTest {
	
	//public static  WebDriver driver;
	
	LoginPage lp;
	
	@BeforeClass
	public void init() {
		
		
		
		//step-5 init object
		lp =new LoginPage(driver);
		
	}
	
	
	
	@Test (priority=2)
	public void login() {
		
		//step-1
		lp.enterUsernameIntextBox("Admin");
		Reporter.log("entered username");
		
		//step-2
		lp.enterPasswordIntextBox("admin123");
		Reporter.log("entered password");
		
		//step-3
		lp.clickOnLoginButton();
		Reporter.log("Click on Login");
		
		
	}
	
	@Test (priority=1)
	public void verifyPageTitle() {
		
		Assert.assertTrue(driver.getTitle().contains("Orange"),"Page title does not matched");
		Reporter.log("Verified login page title");
	}
	
	

}
