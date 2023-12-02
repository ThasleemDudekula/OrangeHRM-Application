package com.BaseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Utility.Log;


public class Base_Test {
	
	public static WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
	
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thasleem\\OrangeHRM_POM\\browserDriverFiles\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		Log.info("Successfully launched the browser");
		
		driver.get(applicationUrlAddress);
		
		Log.info("Navigated to OrangeHRM Application LogIn Page");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
		Log.info(applicationUrlAddress);
	}
	
	

}
