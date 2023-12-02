package com.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateLogOutOHRM {

	public static void main(String[] args) throws InterruptedException {
		
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
	       
	      
	       // Logout Properties
	      //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>	
		
		
	       Thread.sleep(5000);
	       
	       By LogoutProperties=By.linkText("Logout");
		   WebElement LogOut=driver.findElement(LogoutProperties);
		   LogOut.click();
		
		   
		   //Validating Homepage Title
		   
		  String Expected_OHRMhomepage="OrangeHRM"; 
		  System.out.println("OHRM Expected Homepage title is: "+Expected_OHRMhomepage);
		   
		   
		  String Actual_OHRMhomepage=driver.getTitle();
		  System.out.println("OHRM Actual Homepage title is :"+Actual_OHRMhomepage);
		  
		  if(Actual_OHRMhomepage.equals(Expected_OHRMhomepage))
		  {
			  System.out.println("The Actual Homepage title of OHRM is matched: PASS");
		  }
		  else
		  {
			  System.out.println("The Actual Homepage title of OHRM is not matched: FAIL");
		  }
		  
		 
          //LogIn properties   <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		  
		  By LogInPageApplicationUrlAddress=By.id("btnLogin");
		  WebElement LogIn=driver.findElement(LogInPageApplicationUrlAddress);
		  String LogInText=LogIn.getText();
		  
		  System.out.println("The LogIn text is:"+LogInText);
	
		  
		  
		  
		  
		  
		  
		
	}

}
