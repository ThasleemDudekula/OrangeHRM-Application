package com.Alert;

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
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thasleem\\Automation\\Browsers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		System.out.println("**** Chrome Browser launchedd succesfully ****");
		
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();
		
	}
	
	/*@AfterTest
	public void TarDown()
	{
		
		driver.quit();
		System.out.println("***Tsrtc application along with chrome Browser closed sucesfully***");
		
		
	}*/
	
	
	
	
}
