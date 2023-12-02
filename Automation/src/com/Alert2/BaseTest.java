package com.Alert2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	WebDriver driver;
	String applicationUrlAddrss="https://www.tsrtconline.in/oprs-web/";

	@BeforeTest
	public void setUp()
	{

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thasleem\\Automation\\newbrowser\\chromedriver.exe");
	driver = new ChromeDriver();

	System.out.println(" **** Chrome Browser Launched Successfuly ********");

	driver.get(applicationUrlAddrss);
	
	driver.manage().window().maximize();

	}

	
	@AfterTest
	public void tearDown()
	{
	driver.quit();
	System.out.println(" Tsrtc Application along with Chrome Browser Closed ");
	}
	

	
	
	
	

}
