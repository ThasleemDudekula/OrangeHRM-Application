package com.Xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon_CustomerService_click {

	public static WebDriver driver;
	String applicationUrlAddrss="http://amazon.in";

	@BeforeTest
	public void setUp()
	{

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\srinivas1\\Desktop\\730AMSeptBatch\\WevApplicationTesting\\ChromeDriver\\chromedriver.exe");
	driver = new ChromeDriver();

	// System.out.println(" **** Chrome Browser Launched Successfuly ********");
	System.out.println("**** Chrome Browser Launched Successfuly ********");

	driver.get(applicationUrlAddrss);

	//System.out.println(" Navigated to OrangeHRM Application LogIn Page ");

	System.out.println(" Navigated to OrangeHRM Application LogIn Page ");

	driver.manage().window().maximize();
	}
	
	/*
	@AfterTest
	public void tearDown()
	{
	driver.quit();
	}

	*/
	
	@Test
	public void customerServiceClick()
	{
		
		
	}
	
	
	
}
