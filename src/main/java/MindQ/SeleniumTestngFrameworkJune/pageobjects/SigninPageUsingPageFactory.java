package MindQ.SeleniumTestngFrameworkJune.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import MindQ.SeleniumTestngFrameworkJune.base.BasePage;

public class SigninPageUsingPageFactory extends BasePage{
	
	
	
	
	
	@FindBy(id = "user_email")
	static WebElement emailIdInputBox;
	
	
	@FindBy(id = "user_password")
	static WebElement passwordInputBox;
	
	
	@FindBy(name = "commit")
	static  WebElement signinButton;
	
	
	@FindBy(xpath = "//p[text()='Invalid email or password.']")
	static WebElement errorMessageText;
	
	
	public SigninPageUsingPageFactory(WebDriver driver) {
		   BasePage.driver = driver;
		   PageFactory.initElements(driver, this);
		
		
	}
	
	
	
	
	public  void enterEmailId(String emailid) {
		try {
			
			emailIdInputBox.sendKeys(emailid);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public  void enterPassword(String password) {
		try {
			passwordInputBox.sendKeys(password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public  void clickSigninButton() {
		try {
			signinButton.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public  String captureActualErrorMessage() {
		
		String text = "";
		
		try {
			text = errorMessageText.getText();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return text;
	}
	
	
	
	public  boolean errorMessagePresence() {
		
		boolean errorPresence = false;
		try {
			errorPresence = errorMessageText.isDisplayed();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return errorPresence;
		
	}
	

}
