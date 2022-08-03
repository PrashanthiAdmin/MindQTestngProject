package MindQ.SeleniumTestngFrameworkJune.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;

    @FindBy(id="user_email")

    WebElement username;

    @FindBy(id="user_password")

    WebElement password;    

 

    @FindBy(name="commit")

    WebElement signin;

    public LoginPage(WebDriver driver){

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }
    
    

    //Set user name in textbox

    public void setUserName(String strUserName){

    	username.sendKeys(strUserName);     
    }

    //Set password in password textbox

    public void setPassword(String strPassword){

    password.sendKeys(strPassword);

    }

    //Click on login button

    public void clickLogin(){

            signin.click();

    }  

}
