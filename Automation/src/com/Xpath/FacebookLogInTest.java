package com.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class FacebookLogInTest {

	public static WebDriver driver;
	String applicationUrlAddress="http://facebook.com";
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Thasleem\\Automation\\Browsers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		System.out.println("***Browser launched suuceesfully***");
	
		
		driver.get(applicationUrlAddress);
		
		driver.manage().window().maximize();
	}
	
	/*@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	*/
	@Test
	public void facebooklogInTest()
	{
		// email property
		// <input type="text" class="inputtext _55r1 _6luy" name="email" id="email" 
		// data-testid="royal_email" placeholder="Email address or phone number" 
		// autofocus="1" aria-label="Email address or phone number">
		
		// locator - xpath
		// selector (Xpath expression )- is created based on the available properties ( attribute and
        //		                                 with respective of its corresponding value )

		// Syntax for xpath expression creation - based on Single Property
		// any xpath expression starts with "//" is called as Relative Xpath
		// //tagname[@attribute='attributeValue'] -
		
		// //input[@data-testid='royal_email'] - Relative Xpath expression for identifying Email element
		// //input[@type='text']
		
		By emailProperty=By.xpath("//input[@type='text']");
		WebElement email=driver.findElement(emailProperty);
		email.sendKeys("Thasleem@07");
		
		
		
		// "//" - means search on the complete WebPage
		// search for the tagName - "input"
		// "*" - means search for all the Tag's on the WebPage
		
		// password property
        //  <input type="password" class="inputtext _55r1 _6luy _9npi" name="pass" 
		// id="pass" data-testid="royal_pass" placeholder="Password" aria-label="Password">
		
		// password xpath is //input[@placeholder='Password']
		
		By passwordProperty=By.xpath("//input[@placeholder='Password']");		
		WebElement password=driver.findElement(passwordProperty);
		password.sendKeys("thslm");
		
		// login button property
		// <button value="1" class="_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy" 
		// name="login" data-testid="royal_login_button" type="submit" id="u_0_5_ee">Log in</button>
		
		
		// logIn button xpath is-  //button[@name='login']
		
		By logInButtonProperty=By.xpath("//button[@name='login']");
		WebElement logInButton=driver.findElement(logInButtonProperty);
		logInButton.click();
		
	}
	
	
}

