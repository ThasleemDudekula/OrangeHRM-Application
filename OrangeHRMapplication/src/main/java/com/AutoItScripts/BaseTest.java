package com.AutoItScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	public static WebDriver driver;
	
	@BeforeTest
	   public void SetUp()
	    {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thasleem\\OrangeHRMapplication\\Browsers\\chromedriver.exe");
		
		
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		
		String applicationUrlAddrss="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
		driver.get(applicationUrlAddrss);

	}
		
		@AfterTest
		public void TearDown()
		{
			driver.quit();
			
		}
	
	

}
