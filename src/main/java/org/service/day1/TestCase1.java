package org.service.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase1 extends ProjectSpecificMethod{

	
	@Test
	
	public void CreateOne() throws InterruptedException
	{
		WebElement list = driver.findElement(By.xpath("//*[@id='collapseId08771d0cc0a8016401f604303b94b999']/li[10]"));
		list.click();
		
		
		WebElement frame1 = driver.findElement(By.xpath("//*[@id='gsft_main']"));
		driver.switchTo().frame(frame1);
		
		Thread.sleep(6000);

		WebElement New = driver.findElement(By.xpath("//*[text()='New']"));
		New.click();
		
		Thread.sleep(6000);
		
		WebElement dec = driver.findElement(By.xpath("//*[@id='incident.short_description']"));
		dec.sendKeys("Jenkin and Maven");
		
		WebElement submit =  driver.findElement(By.xpath("//*[@class='form_action_button_container']/button[1]"));
	
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", submit);
	
	submit.click();
	Thread.sleep(6000);
	

	WebElement verify =  driver.findElement(By.xpath("(//*[@id='incident_table']//tr)[3]/td[3]"));
	String id = verify.getText();
	System.out.println(id);
	

	}
	
	
	
	
	
	
	
	
	
	
	
}
