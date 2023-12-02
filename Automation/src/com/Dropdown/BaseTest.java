package com.Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {

	WebDriver driver;
	String applicationUrlAddress="https://www.osmania.ac.in/";
	
	@BeforeTest
	public void SetUp()
	{
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Thasleem\\Automation\\newbrowser\\chromedriver.exe");
	  driver=new ChromeDriver();
	  
	  System.out.println(" **** Chrome Browser Launched Successfuly ********");

	  driver.get(applicationUrlAddress);
	  System.out.println(" Navigated to Osmania University Application LogIn Page ");
	  driver.manage().window().maximize();
	  
	}
	
	@Test
	public void DropDownTesting() throws InterruptedException
	{
		By selectDropDownLanguageProperty=By.id("gtranslate_selector");
		WebElement selectDropDownLanguage=driver.findElement(selectDropDownLanguageProperty);
		
		//<option value="">Select Language</option>
		// <option value="en|hi">Hindi</option>
		// <option value="en|es">Spanish</option>
		// <option value="en|en">English</option>
		
		// getting all the elments of the DropDown
		
		By dropDownProperty=By.tagName("option");
		List<WebElement>selectLanguages=selectDropDownLanguage.findElements(dropDownProperty);
		
		// printing elements of the DropDown
		
		for(int index=0;index<selectLanguages.size();index++)
		{
			String dropDownLanguageName=selectLanguages.get(index).getText();
			System.out.println(dropDownLanguageName);
			
		}
			Select selection = new Select(selectDropDownLanguage);
		//	selection.selectByIndex();
			
			
			Thread.sleep(2000);

			
		
		
	}
	
	
	
}
