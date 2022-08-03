package MindQ.SeleniumTestngFrameworkJune;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
   
    @BeforeSuite
  public static void launchBeforeSuite() {
	  System.out.println("Before suite");
  }
    
    @BeforeTest
    public static void launchBeforeTest() {
    	System.out.println("Before test");
    }
    
    @AfterTest
    public static void launchAfterTest() {
    	System.out.println("After test");
    }
  
  
  @AfterSuite
  public static void launchAfterSuite() {
	  System.out.println("After suite");
  }
	
}
