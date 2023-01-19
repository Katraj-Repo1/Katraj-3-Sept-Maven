package tests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.PropertyReader;

public class BaseTest {
	
	public static  WebDriver driver;
	

	@BeforeSuite
	public void initalization() throws IOException {
		//step-0
		WebDriverManager.chromedriver().setup();
		
		//step-1
		driver = new ChromeDriver();
		
		//step-2
		driver.manage().window().maximize();
		
		//step-3
		driver.get(PropertyReader.readProperty("URL_SIT"));
		
		//step-4
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}
	
	@AfterSuite
	
	public void tearDown() {
		
		driver.close();
	}
	

}
