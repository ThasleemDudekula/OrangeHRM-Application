package com.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminText {

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
	       
	       //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/viewAdminModule" 
		      //id="menu_admin_viewAdminModule" class="firstLevelMenu"><b>Admin</b></a>  
		   
	       String Expected_AdminProperty="Admin";
	       WebElement Expected_Admin=driver.findElement(By.id("menu_admin_viewAdminModule"));
	       String Expected_AdminText=Expected_Admin.getText();
	       
	    
	       
	       System.out.println("The Expected Text of an Admin is:"+Expected_AdminText);
	      
	     
	       By Actual_AdminProperty=By.id("menu_admin_viewAdminModule");
	       WebElement Actual_Admin=driver.findElement(Actual_AdminProperty);
	       String Actual_AdminText=Actual_Admin.getText();
		
	       System.out.println("The Actual_Text of an Admin is:"+Actual_AdminText);
	       
	       if(Actual_AdminText.equals(Expected_AdminText))
	       {
	    	   System.out.println("The Text of an Admin of OHRM Homepage is matched - PASS");
	       }
	       else
	       {
	    	   System.out.println("The Text of an Admin of OHRM Homepage is not matched -FAIL");	
		
	       }
}
}