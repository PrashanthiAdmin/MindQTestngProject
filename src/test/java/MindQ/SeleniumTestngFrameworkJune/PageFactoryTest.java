package MindQ.SeleniumTestngFrameworkJune;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import MindQ.SeleniumTestngFrameworkJune.base.BasePage;
import MindQ.SeleniumTestngFrameworkJune.base.LoginPage;

public class PageFactoryTest extends BasePage{

	
	@Test
	public static void loginUsingInvalidCredentials() {
		
		
		LoginPage obj = new LoginPage(driver);
		
		
		obj.setUserName("test");
	}
}
