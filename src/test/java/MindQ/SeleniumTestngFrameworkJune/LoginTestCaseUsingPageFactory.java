package MindQ.SeleniumTestngFrameworkJune;

import org.testng.annotations.Test;

import MindQ.SeleniumTestngFrameworkJune.base.BasePage;
import MindQ.SeleniumTestngFrameworkJune.pageobjects.SigninPageUsingPageFactory;

public class LoginTestCaseUsingPageFactory extends BasePage{

	
	
	@Test
	public static void loginUsingInValidCredentials() {
		
		SigninPageUsingPageFactory signinPage = new SigninPageUsingPageFactory(driver);
		
		signinPage.enterEmailId("prashanthi@gmail.com");
		signinPage.enterPassword("test123");
		signinPage.clickSigninButton();

		boolean actualResult = signinPage.errorMessagePresence();
		boolean expectedResult = true;

		if (actualResult == expectedResult) {

			System.out.println("Test case is passed");
		} else {
			System.out.println("Test case is failed");
		}

	}
	
}
