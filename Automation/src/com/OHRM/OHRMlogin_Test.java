package com.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRMlogin_Test {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thasleem\\Selenium\\Browsers\\chromedriver.exe");
		ChromeDriver driver;

		driver = new ChromeDriver();

		String applicationUrlAddrss="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
		driver.get(applicationUrlAddrss);

		/*
		 HTML - Programing Language used to develop WebPages

		Properties of UserName Element
		<input name="txtUsername" id="txtUsername" type="text">

		 < - tag
		 <input - tag Name

		 name - attribute / locator of WebDriver
		 txtUsername - value / selector

		 id - attribute / locator of WebDriver
		 txtUsername - value / selector

		 type - attribute
		 text - value
		*/

		/*
		driver.findElement(By.id("txtUsername")).sendKeys("srini");

		// <input name="txtPassword" autocomplete="off" type="password">

		driver.findElement(By.name("txtPassword")).sendKeys("Q@Trainer7");

		// <input type="submit"  class="button"  value="LOGIN">

		driver.findElement(By.className("button")).click();
		*/

		// Properties of UserName Element
		// <input name="txtUsername" id="txtUsername" type="text">

		//WebElement userName=driver.findElement(By.id("txtUsername"));// identifying the element on the WebPage
		//userName.sendKeys("srini"); // Performing Operation on the Element

		By usernameProperty=By.id("txtUsername");
		WebElement username=driver.findElement(usernameProperty);
		username.sendKeys("Admin");
		
	//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		
		By passwordProperty=By.name("txtPassword");
		WebElement password=driver.findElement(passwordProperty);
		password.sendKeys("Thasleem@07");
		
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		
		By LoginButtonProperty=By.className("button");
		WebElement LoginButton=driver.findElement(LoginButtonProperty);
		LoginButton.click();
		
		
		
		
		
		
		
		
		

		   /* By userNameProperty=By.id("txtUsername"); // identifying the property of an element
		    WebElement userName=driver.findElement(userNameProperty);// identifying the element on the WebPage
		    userName.sendKeys("srini"); // Performing Operation on the Element

		 // <input name="txtPassword" autocomplete="off" type="password">
		    By passwordProperty=By.name("txtPassword");
		    WebElement password=driver.findElement(passwordProperty);
		    password.sendKeys("Q@Trainer7");
		   
		 // <input type="submit"  class="button"  value="LOGIN">
		    By logInButtonProperty=By.className("button");
		    WebElement logInButton=driver.findElement(logInButtonProperty);
		    logInButton.click();*/
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
	}

}
