package objectRespository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePageObject {
  WebDriver driver;                          // WebDriver class defined the driver 
 public HomePageObject(WebDriver driver)    // created constructor with argument driver 

 {
	 this.driver=driver;                    // this keyword implies that this driver is equal to defined driver in class
	 }
 
 By Feature = By.xpath("//*[@id=\'site-menu\']/li[3]/a");
 
 public WebElement Homefeature()
 {
	return driver.findElement(Feature);
 }
 
}
                                      