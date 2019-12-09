package org.service.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethod {
public static ChromeDriver driver;	
	
@BeforeClass	
	
	public void launch() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver/chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.get("https://dev60716.service-now.com/");
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		Thread.sleep(5000);
		
	}

@BeforeMethod
public void Create() throws InterruptedException
{
	
	
	WebElement frame = driver.findElement(By.xpath("//*[@id='gsft_main']"));
	driver.switchTo().frame(frame);

	  WebElement id =driver.findElement(By.xpath("//*[@id='user_name']"));
	  id.sendKeys("admin",Keys.TAB);
	  
	  
	WebElement pass = driver.findElement(By.xpath("//*[@id='user_password']"));
	pass.sendKeys("Test$1234",Keys.TAB);
	
	driver.findElementByXPath("(//*[text()='Login'])[2]").click();
	Thread.sleep(5000);
}

}
