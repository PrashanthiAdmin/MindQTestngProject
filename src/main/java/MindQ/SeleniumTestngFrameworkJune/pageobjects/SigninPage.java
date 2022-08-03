package MindQ.SeleniumTestngFrameworkJune.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import MindQ.SeleniumTestngFrameworkJune.base.BasePage;

public class SigninPage extends BasePage{
	
	public static By emailIdInputBox = By.id("user_email");
	public static By passwordInputBox= By.id("user_password");
	public static By signinButton = By.name("commit");
	public static By errorMessage = By.xpath("//p[text()='Invalid email or password.']");
	
	
	public static void enterEmailId(String emailid) {
		try {
	
	    driver.findElement(emailIdInputBox).clear();
		driver.findElement(emailIdInputBox).sendKeys(emailid);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void enterPassword(String password) {
		try {
			driver.findElement(passwordInputBox).clear();
			driver.findElement(passwordInputBox).sendKeys(password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void clickSigninButton() {
		try {
			driver.findElement(signinButton).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static String captureActualErrorMessage() {
		
		String text = "";
		
		try {
			text = driver.findElement(errorMessage).getText();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return text;
	}
	
	
	
	public static boolean errorMessagePresence() {
		
		boolean errorPresence = false;
		try {
			errorPresence = driver.findElement(errorMessage).isDisplayed();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return errorPresence;
		
	}
	
	
	
	
	
	

	
	

}
