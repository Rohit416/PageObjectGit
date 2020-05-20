package objectRespository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginObjectsPageFactory {
  WebDriver driver;                          // WebDriver class defined the driver 
 public LoginObjectsPageFactory(WebDriver driver)    // created constructor with argument driver 

 {
	 this.driver=driver;                    // this keyword implies that this driver is equal to defined driver in class
	 PageFactory.initElements(driver, this);
	 }
 
 /*By Username = By.name("username");         // to improve more releability 
 By Password = By.name("password");
 By Submit =By.id("signin-submit2");
 By Home =By.xpath("//*[@id=\'site-logo\']/a");*/
 
 @FindBy(name="username")
 WebElement Username;
 
 @FindBy(name="password")
 WebElement Password;
 
 @FindBy(id="signin-submit2")
 WebElement Submit;
 
 @FindBy(xpath="//*[@id=\\'site-logo\\']/a")
 WebElement Home;


   public WebElement Emailid() 
   {
	   return Username;
   }
   public WebElement password() 
   {
	   return Password;
   }
   public WebElement submit() 
   {
	   return Submit;
   }
   public WebElement home() 
   {
	   return Home;
   }
   }
   