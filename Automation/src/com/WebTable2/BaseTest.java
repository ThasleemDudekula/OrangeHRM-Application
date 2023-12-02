package com.WebTable2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	WebDriver driver;
	String applicationUrlAddrss="https://www.timeanddate.com/worldclock/";

	
	@BeforeTest
	public void SetUp()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thasleem\\Automation\\newbrowser\\chromedriver.exe");
		driver=new ChromeDriver();
		
		System.out.println("***chrome browser launched successfully***");
		
		driver.get(applicationUrlAddrss);
		
		driver.manage().window().maximize();
		
	}
	
	@AfterTest
	public void TearDown()
	{
		driver.quit();
		System.out.println("**Web table along with Chrome browser closed successfully**");
		
		
	}
	
	
	
}
