package com.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRMlogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Thasleem\\Selenium\\Browsers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
	       String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
	       driver.get(applicationUrlAddress);
	       
	      /* driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	       driver.findElement(By.id("txtPassword")).sendKeys("Thasleem@07");
	       driver.findElement(By.id("btnLogin")).click();*/
	       
	        /* driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	       driver.findElement(By.name("txtPassword")).sendKeys("Livetech@123");
	       driver.findElement(By.id("btnLogin")).click();*/
	   
	      /* By usernameProperty=By.id("txtUsername");
	       WebElement username=driver.findElement(usernameProperty);
	       username.sendKeys("Admin");
	       
	       By passwordProperty=By.name("txtPassword");
	       WebElement password=driver.findElement(passwordProperty);
	       password.sendKeys("Thasleem@07");
	       
	       By LogInButtonProperty=By.className("button");
	       WebElement LogInButton=driver.findElement(LogInButtonProperty);
	       LogInButton.click();*/
	       
	       
	        By usernameProperty=By.id("txtUsername");	   
	        WebElement username=driver.findElement(usernameProperty);
	        username.sendKeys("Admin");
	        
	        
	   
	        By passwordproperty=By.name("txtPassword");
	        WebElement pasword=driver.findElement(passwordproperty);
	       
	       
	       
	     // <input name="txtUsername" id="" type="text">  
	       
	       
	       By usernameproperty=By.id("txtUsername");
	       WebElement username1=driver.findElement(usernameproperty);
	       username1.sendKeys("Admin");
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	
	
	
	
	}

}