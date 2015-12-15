package pack2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FacebookUsingTestNG {
	

	  public WebDriver driver;

  @BeforeClass
  public static void setup() 
  {
	  
	 //In case of InternetExplorer Driver we need to set the path of IEDriver.exe
	    System.setProperty("webdriver.ie.driver", "C:/Program Files/Internet Explorer/IEDriverServer.exe");
	 
  }

  @Test
  public void facebookLogin() throws InterruptedException 
  {

	  driver = new InternetExplorerDriver();
	  driver.get("http://www.facebook.com");
	
	  String expectedTittle = "Facebook - Log In or Sign Up";
	  
	  String actualTittle = driver.getTitle();
	  
	  System.out.println(actualTittle);
		
	  Assert.assertEquals(actualTittle, expectedTittle);
	  
	  WebElement username = driver.findElement(By.id("email"));
			  username.clear();
			  username.sendKeys("yourUsemname");
			  
	  WebElement password = driver.findElement(By.id("pass"));
	  		  password.clear();
	  		  password.sendKeys("yourPassowrd");	  
	  		  
	  WebElement LoginInButton = driver.findElement(By.id("u_0_2"));
	  		  LoginInButton.click();
	  		
  }

  @AfterClass
  public void teardown()  
  {
	  driver.close();
	  driver.quit();
  }

}