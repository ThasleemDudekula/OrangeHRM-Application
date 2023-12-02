package com.AddEmployeeUploadPhoto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	WebDriver driver;
	String applicationurladdress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
   @BeforeTest
	public void setup()
	{
	   System.setProperty("webdriver.chrome.driver", "./newbrowser/chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
       driver.get(applicationurladdress);
	}
   
   
   @AfterTest
   public void teardown()
   {
	   driver.quit();
   }
   
   
	
	
}
