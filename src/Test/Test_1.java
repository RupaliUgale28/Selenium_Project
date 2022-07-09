//Basic activities of driver
package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//program in Selenium 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shashi\\eclipse-workspace\\Selenium_Project\\driver\\chromedriver.exe");
		
		//creating reference of "WebDriver" for chromeDriver class//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//open the browser
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		//get the title of the website
		System.out.println(driver.getTitle());
		
		//get the current URL of the website
		System.out.println(driver.getCurrentUrl());
		
		//give some wait to execution
		Thread.sleep(4000);
		
		//close the current browser
		driver.close();

		
	}
}
