package MindQ.SeleniumTestngFrameworkJune.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	
	
	public static WebDriver driver;
	@Parameters("Browser")
	@BeforeTest
	public  void launchApplication(String browser) {
		
		
		
		
		
		if(browser.equals("Chrome")) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://studio.cucumber.io/users/sign_in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		
		}else if(browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
			driver.manage().window().maximize();
			driver.get("https://studio.cucumber.io/users/sign_in");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
			
			
			
			
		}
		
	
		
		
		
	}
	
	
	public static void closeBrowser() {
		
		driver.close();
	}

	

}
