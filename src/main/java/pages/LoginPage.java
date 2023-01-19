package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	@FindBy (xpath="//input[@name='username']")
	WebElement usernametextbox;
	
	@FindBy (xpath="//input[@name='password']")
	WebElement passwordTextBox;
	
	@FindBy (xpath="//button[@type='submit']")
	WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	public void enterUsernameIntextBox(String user) {
		
		if (usernametextbox.isEnabled()) {
			
			usernametextbox.sendKeys(user);
		}
	}
	
	public void enterPasswordIntextBox(String pass) {
		
		if(passwordTextBox.isEnabled()) {
			
			passwordTextBox.sendKeys(pass);
		}
	}
    
	public void clickOnLoginButton() {
		
		if(loginButton.isEnabled()) {
			
			loginButton.click();
		}
	}
}
