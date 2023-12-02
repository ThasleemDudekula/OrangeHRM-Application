package com.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AfterLognInValidatingOHRMtitle {

	public static void main(String[] args) {
	
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\Thasleem\\Selenium\\Browsers\\chromedriver.exe");
		   ChromeDriver driver=new ChromeDriver();
		
	       String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
	       driver.get(applicationUrlAddress);
	       
	       By usernameProperty=By.id("txtUsername");
	       WebElement username=driver.findElement(usernameProperty);
	       username.sendKeys("Admin");
	       
	       By passwordProperty=By.name("txtPassword");
	       WebElement password=driver.findElement(passwordProperty);
	       password.sendKeys("Thasleem@07");
	       
	       By LogInButtonProperty=By.className("button");
	       WebElement LogInButton=driver.findElement(LogInButtonProperty);
	       LogInButton.click();
	       
	       
	       String Expected_OrangeHRMhomepageTitle="OrangeHRM";
	       System.out.println("The _OrangeHRMhomepageTitle is:"+Expected_OrangeHRMhomepageTitle);
	       
	       
	       String Actual_OrangeHRMhomepageTitle=driver.getTitle();
		   System.out.println("The Actual_OrangeHRMhomepage Title is:"+ Actual_OrangeHRMhomepageTitle);
		   
		   if(Actual_OrangeHRMhomepageTitle.equals(Expected_OrangeHRMhomepageTitle))
		   {
			   System.out.println("The title of the OrangeHRM matched -PASS");
		   }
		   else
		   {
			   System.out.println("The title of the OrangeHRM is not matched- FAIL");
		   }
		   
		   
		   
		   driver.quit();
	       
	       
	       
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
