package com.OHRM;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ValidatingOHRMHomePage_Admin {
	
	public static void main(String[] args) {
		
		
String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\Thasleem\\Automation\\Browsers\\msedgedriver.exe");
		EdgeDriver driver= new EdgeDriver();
		
		System.out.println("**chrome browser launched successsfully**");
		
		driver.get(applicationUrlAddress);
		System.out.println(" Sucessfully navigated to OrangeHRM Application ");
		
		
		 String usernameTestData="Admin";
		
				By usernameProperty=By.id("txtUsername");
				WebElement username=driver.findElement(usernameProperty);
				username.sendKeys(usernameTestData);
				
				
				String passwordTestData="Thasleem@07";

				By passwordProperty=By.name("txtPassword");
				WebElement password=driver.findElement(passwordProperty);
				password.sendKeys(passwordTestData);
				
				By logInButtonProperty=By.className("button");
				WebElement logInButton=driver.findElement(logInButtonProperty);
				logInButton.click();
				
				
				
				// Validating OrangeHRM Application HomePage
				String expected_OrangeHRMApplicationHomePageText="Admin";
				System.out.println(" The Expected Text of OrangeHRM Application HomePage is :- "+expected_OrangeHRMApplicationHomePageText);

				// id="welcome" - Property of WelCome Admin Element
				By welComeAdminProperty=By.id("welcome");
				WebElement welComeAdmin=driver.findElement(welComeAdminProperty);


				String actual_OrangeHRMApplicationHomePageText=welComeAdmin.getText();
				System.out.println(" The actual Text of OrangeHRM Application HomePage is :- "+actual_OrangeHRMApplicationHomePageText);

				
				// Validating HomePage
				if(actual_OrangeHRMApplicationHomePageText.contains(expected_OrangeHRMApplicationHomePageText))
				{
				System.out.println(" Succesfully Navigated to OrangeHRM Application HomePage - PASS");

				}
				else
				{
				System.out.println(" Failed to Navigat to OrangeHRM Application HomePage - FAIL");

				}	
		
	}
	
	
}
