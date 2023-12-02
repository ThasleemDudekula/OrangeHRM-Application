package com.Screenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	
	WebDriver driver;
	String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
	
	@BeforeTest
	public void SetUp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Thasleem\\Automation\\Browsers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		System.out.println(" **** Chrome Browser Launched Successfuly ********");

		driver.get(applicationUrlAddress);
		System.out.println(" Navigated to tsrtc Application LogIn Page ");
		driver.manage().window().maximize();
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
		System.out.println("******** tsrtc Application along with Chrome Browser Closed ******");
	}
	
	
	
	
}
