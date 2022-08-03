package MindQ.SeleniumTestngFrameworkJune;

import org.testng.annotations.Test;

public class SecondLaunch extends AppTest{

	
	@Test(priority = 1)
	public static void signupUsingPhone() {

		System.out.println("sign up using phone number");
	}

	@Test(priority = 2)
	public static void signupUsingEmail() {

		System.out.println("sign up using email id");
	}

}
