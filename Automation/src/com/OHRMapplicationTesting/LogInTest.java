package com.OHRMapplicationTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		FileInputStream propertiesFile = new FileInputStream("C:\\Users\\Thasleem\\Automation\\src\\com\\utility\\OrangeHRM.properties");
		
		
		Properties properties;
		
		properties=new Properties();
		
		properties.load(propertiesFile);;
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thasleem\\Selenium\\Browsers\\chromedriver.exe");
		ChromeDriver driver;

		driver = new ChromeDriver();

		String applicationUrlAddrss="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
		driver.get(applicationUrlAddrss);
		
		//<input name="txtUsername" id="txtUsername" type="text">
		By usernameProperty=By.id("txtUsername");
		WebElement username=driver.findElement(usernameProperty);
		username.sendKeys("Admin");
		
		By passwordProperty=By.name("txtPassword");
		WebElement password=driver.findElement(passwordProperty);
		password.sendKeys("Thasleem@07");
		
		By LoginButtonProperty=By.className("button");
		WebElement LoginButton=driver.findElement(LoginButtonProperty);
		LoginButton.click();
		
		By WelcomeAdminProperty=By.id("welcome");
		WebElement WelcomeAdmin=driver.findElement(WelcomeAdminProperty);
		WelcomeAdmin.click();
		Thread.sleep(2000);
		By LogoutProperties=By.linkText("Logout");
		   WebElement LogOut=driver.findElement(LogoutProperties);
		   LogOut.click();
		
		
		
	}
	
	
	
	
	
}
