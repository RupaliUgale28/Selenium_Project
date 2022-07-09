//NAVIGATION TO THE BROWSER
package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_2 {

	public static void main(String[] args) throws InterruptedException 
	{
		//Launch the driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shashi\\eclipse-workspace\\Selenium_Project\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//open the google/URL
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//get title and URL
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		//navigate to facebook
		driver.navigate().to("https://www.facebook.com/");

		//make forward and backward movement
		driver.navigate().back();
		Thread.sleep(3000);

		driver.navigate().forward();
		Thread.sleep(3000);
		
		//close the current browser
		driver.close();

	}

}
