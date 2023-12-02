package com.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Youtube {
	
	public static WebDriver driver;
	String applicationUrlAddress="https://www.youtube.com/";
	
	
	@BeforeTest
	public void setUp()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thasleem\\Automation\\Browsers\\chromedriver.exe");
	driver=new ChromeDriver();
	
	driver.get(applicationUrlAddress);
	
	driver.manage().window().maximize();	
		
	}
	
	/*@AfterTest
	public void tearDown()
	{
		driver.quit();
	}*/
	
	@Test(priority=1)
	public void youtube()
	{
		//  tou tube search properties
	//  <input id="search" autocapitalize="none" autocomplete="off" autocorrect="off" name="search_query" 
	//	tabindex="0" type="text" spellcheck="false" placeholder="Search" aria-label="Search" role="combobox" aria-haspopup="false" 
	//	aria-autocomplete="list" dir="ltr" class="ytd-searchbox" style="outline: none;">
		
	// xpath property of youtube is---	//input[@type='text']
		
	    By SearchPropertry=By.xpath("//input[@type='text']");
		WebElement serach=driver.findElement(SearchPropertry);
		serach.sendKeys("RD automation learning");
		serach.sendKeys(Keys.ENTER);
		
		
		
		
	}
	
	
	
	
	

}
