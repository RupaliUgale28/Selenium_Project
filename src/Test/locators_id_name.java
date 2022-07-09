//LOCATORS= id and name
package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators_id_name 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shashi\\eclipse-workspace\\Selenium_Project\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Enter the email id field
		WebElement Email_id=driver.findElement(By.id("email"));
		Email_id.sendKeys("the boss");
		
		//Enter the password field
		WebElement Password=driver.findElement(By.name("pass"));
		Password.sendKeys("123456789");
		
		//Click on log in button
		WebElement button=driver.findElement(By.name("login"));
		button.click();
		
		
		//Give some waits
		Thread.sleep(8000);
		
		//Close the browser
		driver.close();
			

	}

}
