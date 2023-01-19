package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy (xpath="//span[text()='Dashboard']")
	WebElement dashBoardSideMenu;
	
	@FindBy (xpath="//span[@class='oxd-userdropdown-tab']")
	WebElement profileSection;
	
	@FindBy (xpath="//a[text()='Logout']")
	WebElement logout;
	
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements( driver, this);
	}
	
	public boolean verifyDashBoardMenu() {
		
		return dashBoardSideMenu.isDisplayed();
		
	}
	
	public void clickOnProfile() {
		
		profileSection.click();
		
	}
	
	public void clickOnLogout() {
		
		logout.click();
	}

}
