package com.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GmailLogInTest {

	public static WebDriver driver;
	String applicationUrlAddress="http:gmail.com";
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Thasleem\\Automation\\Browsers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(applicationUrlAddress);
		
		driver.manage().window().maximize();
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test
	public void gmailLogInTest()
	{
	
		// <input type="email" class="whsOnd zHQkBf" jsname="YPqjbf" autocomplete="username"
		// spellcheck="false" tabindex="0" aria-label="Email or phone" name="identifier" value=""
		// autocapitalize="none" id="identifierId"
		// dir="ltr" data-initial-dir="ltr" data-initial-value="">

		// xpath is--    //input[@autocomplete='username']
		                 //input[@autocomplete='username']
		
		By emilIdProperty=By.xpath("//input[@autocomplete='username']");
		WebElement emailId=driver.findElement(emilIdProperty);
		emailId.sendKeys("Thasleem07@gmail.com");
		
		// Next Button property
		// <span jsname="V67aGc" class="VfPpkd-vQzf8d">Next</span>
		
		// //span[@jsname='V67aGc']
		
	    By nextButtonProperty=By.xpath("//span[@jsname='V67aGc']");
	    
	 // text() - method - creating an xpath Expression------  //tagname[text()='textvalue']

	                                                            //span[text()='Next']
	    By NextButtonProperty=By.xpath("//span[text()='Next']");
		WebElement nextButton=driver.findElement(NextButtonProperty);

		System.out.println("The text of the Next button is :- "+ nextButton.getText());

		nextButton.click();

		
		
		
	}
	
	
	
}
