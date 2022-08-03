package MindQ.SeleniumTestngFrameworkJune;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstLaunch extends AppTest{

	public static void firstLaunchUsingTestng() {

		System.out.println("first launch");

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
	}

	@BeforeClass
	public static void runBeforeclass() {
		System.out.println("Before class");
	}
	
	@AfterClass
	public static void runAfterclass() {
		System.out.println("after class");
	}
	
	
	@BeforeMethod
	public static void launchApplication() {
		
		System.out.println("*********************************");
		System.out.println("Launch browser");

		System.out.println("clicking login button");

	}

	@Test(priority = 1,invocationCount = 2)
	public static void loginUsingValidData() {

		System.out.println("Login using valid data");
		
		
	}

	@Test(priority = 2)
	public static void loginUsingInValidData() {

		
		System.out.println("Login using invalid data");
		
		

	}
	
	@AfterMethod
	public static void closeDriver() {
		System.out.println("close the driver");
	}

	/*
	 * public static void main(String[] args) {
	 * 
	 * 
	 * WebDriverManager.chromedriver().setup();
	 * 
	 * WebDriver driver = new ChromeDriver();
	 * 
	 * }
	 */
}
