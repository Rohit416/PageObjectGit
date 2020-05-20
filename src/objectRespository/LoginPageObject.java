package objectRespository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
  WebDriver driver;                          // WebDriver class defined the driver 
 public LoginPageObject(WebDriver driver)    // created constructor with argument driver 

 {
	 this.driver=driver;                    // this keyword implies that this driver is equal to defined driver in class
	 }
 
 By Username = By.name("username");         // to improve more releability 
 By Password = By.name("password");
 By Submit =By.id("signin-submit2");
 By Home =By.xpath("//*[@id=\'site-logo\']/a");
 public WebElement EmailId()               // login page this are the objects related to login
 {
	 return driver.findElement(Username);  // we use return to return this to the main class
	}
 public WebElement Password()
 {
	 return driver.findElement(Password);
	 }
 public WebElement Submit()
 {
	return driver.findElement(Submit);
	 }
 public WebElement Home()
 {
	return driver.findElement(Home);
	 }
}
                                      