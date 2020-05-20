package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRespository.HomePageObject;

import objectRespository.LoginPageObject;

public class LoginApplication {
@Test
public void login()
{
	System.setProperty("webdriver.chrome.driver","C:\\selenium_practice\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.website.com/sign-in/");         // to invoke 
	LoginPageObject rd =new LoginPageObject (driver);    // object created by passing the constructor argument 
	
	 // constructor is used to initialize non-static variables i.e objects
	rd.EmailId().sendKeys("9063471600");     
	rd.Password().sendKeys("123456");
	rd.Submit().click();
	rd.Home().click();
	HomePageObject rh = new HomePageObject(driver);
    rh.Homefeature().click();
	//LoginObjectsPageFactory pf =new LoginObjectsPageFactory (driver);
	//pf.Emailid().sendKeys("jgckjj");
	//pf.password().sendKeys("kjekjfek");
	//pf.home().click();
}

}

