package com.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomateWelcomeAdmin {

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
	       
	       //<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
	       
	       //<a href="#" id="welcome" class="panelTrigger activated-welcome">Welcome Admin</a>
	       
	       
	       
	       //<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
	       
	       
	       
	       By WelComeAdminProperty=By.id("welcome");
	       WebElement WelcomeAdmin=driver.findElement(WelComeAdminProperty);
	       WelcomeAdmin.click();
	       
	       
	       
	       
	      
		

	}

}
