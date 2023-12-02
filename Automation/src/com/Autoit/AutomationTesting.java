package com.Autoit;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class AutomationTesting {
	
	@Test
	public void Automation() throws IOException {
		
WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Thasleem\\Automation\\newbrowser\\chromedriver.exe");
	    driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.MINUTES);
			
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.MINUTES);
		
		String applicationUrlAddress="https://demo.automationtesting.in/Register.html";	
		driver.get(applicationUrlAddress);
		
		// <input type="text" placeholder="First Name" class="form-control ng-pristine ng-invalid 
		// ng-invalid-required ng-touched" 
		 // ng-model="FirstName" required="">
		
	
	//	/html/body/section/div/div/div[2]/form/div[1]/div[1]/input
		
		//  //*[@id="basicBootstrapForm"]/div[1]/div[1]/input
		
		//By FirstNameProperty=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input");
		//WebElement Firstname=driver.findElement(FirstNameProperty);
		
		//Firstname.sendKeys("thas");
		// By FirstNameProperty=By.tagName("text");
		// WebElement Firstname=driver.findElement(FirstNameProperty);
		
		By AddressProperty=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea");
		WebElement Address=driver.findElement(AddressProperty);
		Address.click();
		Actions keyboard=new Actions(driver);
		
		keyboard.sendKeys(Keys.TAB).build().perform();
		
		
		keyboard.sendKeys(Keys.TAB).build().perform();
		
		//*[@id="basicBootstrapForm"]/div[2]/div/textarea
		
	
		
		keyboard.sendKeys(Keys.TAB).build().perform();
		keyboard.sendKeys(Keys.TAB).build().perform();
		keyboard.sendKeys(Keys.TAB).build().perform();
		keyboard.sendKeys(Keys.TAB).build().perform();
		keyboard.sendKeys(Keys.TAB).build().perform();
		keyboard.sendKeys(Keys.TAB).build().perform();
		keyboard.sendKeys(Keys.TAB).build().perform();
		keyboard.sendKeys(Keys.TAB).build().perform();
		keyboard.sendKeys(Keys.TAB).build().perform();
		keyboard.sendKeys(Keys.TAB).build().perform();
		keyboard.sendKeys(Keys.TAB).build().perform();
		keyboard.sendKeys(Keys.TAB).build().perform();
		keyboard.sendKeys(Keys.TAB).build().perform();
		keyboard.sendKeys(Keys.TAB).build().perform();
		
		keyboard.sendKeys(Keys.ENTER).build().perform();
		
		java.lang.Runtime.getRuntime().exec("C:\\Users\\Thasleem\\Automation\\SofiaImage\\Sofia.exe");
		
		
		
		
	}
}
