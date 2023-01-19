package tests;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import pages.LoginPage;

public class HomeTest extends BaseTest{
	
	LoginPage loginpage;
	HomePage homepage;
	
	public void initObjects() { 
		
		loginpage =new LoginPage(driver);
		homepage =new HomePage(driver);
	}
	
	@BeforeClass
	public void init() {
		
		//step-1
		initObjects();
		
	}
	
	
	
	@Test
	public void logout() {
		
		Assert.assertTrue(homepage.verifyDashBoardMenu());
		Reporter.log("Verified dashboard tab present");
		
		homepage.clickOnProfile();
		Reporter.log("Clicked on profile");
		
		homepage.clickOnLogout();
		Reporter.log("Clicked on logout");
	}
	
	
	

}
