package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		
				WebDriver d = new FirefoxDriver();
				EventFiringWebDriver driver = new EventFiringWebDriver(d);
				driver.get("http://www.facebook.com");
				String tittle = driver.getTitle();
				System.out.println(tittle);
				
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("yourUsername");
				driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("yourPassword");
				driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(Keys.ENTER);	
				driver.findElement(By.xpath("//*[@id='u_0_v']")).click();
				Thread.sleep(5000L);

				driver.close();
				driver.quit();

	}

}
