package MindQ.SeleniumTestngFrameworkJune;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import MindQ.SeleniumTestngFrameworkJune.base.BasePage;
import MindQ.SeleniumTestngFrameworkJune.pageobjects.SigninPage;

public class LoginTestCases extends SigninPage {
	    

	@Test
	@Parameters({"Emailid","Password"})
	public static void loginUsingInvalidCredentials(String email, String pwd) {
		
		
		SoftAssert sa = new SoftAssert();
		enterEmailId(email);
		enterPassword(pwd);
		clickSigninButton();

		boolean actualResult = errorMessagePresence();
		boolean expectedResult = true;
		
		
		

		/*
		 * if (actualResult == expectedResult) {
		 * 
		 * System.out.println("Test case is passed"); } else {
		 * System.out.println("Test case is failed"); }
		 */
		
		
		sa.assertEquals(actualResult,expectedResult,"Test case is failed");
		
		
		
		//driver.close();
		//Assert.assertTrue(actualResult,"Test case is failed");
		
		sa.assertAll();
		//Assert.assertFalse(actualResult);
	}

	
	//@Test(dataProvider = "TestData" )
	public static void loginUsingInvalidCredentialsUsingDp(String email, String pwd) {

		
		enterEmailId(email);
		enterPassword(pwd);
		clickSigninButton();

		boolean actualResult = errorMessagePresence();
		boolean expectedResult = true;

		if (actualResult == expectedResult) {

			System.out.println("Test case is passed");
		} else {
			System.out.println("Test case is failed");
		}

	}
	

	public static void resetPasswordVerification(String email) {

		enterEmailId(email);
		
		//clickSigninButton();

		boolean actualResult = errorMessagePresence();
		boolean expectedResult = true;

		if (actualResult == expectedResult) {

			System.out.println("Test case is passed");
		} else {
			System.out.println("Test case is failed");
		}

	}
	
	
	
	@DataProvider (name = "ResetPassword")
	 public Object[][] dpMethod1() 
	{
	 return new Object [][] { {"mindqtest123@gmail.com"},{"mindq123@gmail.com"},{"testing123@gmail.com"}}; 
	}

	
	
	@DataProvider (name = "TestData",parallel=true)
	 public Object[][] dpMethod() 
	{
		
		  return new Object [][] { {"mindqtest123@gmail.com","test12345"},
		  {"mindq123@gmail.com","test123"}, {"testing123@gmail.com","test@123"}};
		 
		
		
	}
	
	
	


}
