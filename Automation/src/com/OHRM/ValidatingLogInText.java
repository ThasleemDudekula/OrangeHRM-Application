package com.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingLogInText {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Thasleem\\Selenium\\Browsers\\chromedriver.exe");
		   ChromeDriver driver=new ChromeDriver();
		
	       String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
	       driver.get(applicationUrlAddress);
	       
	       //<div id="logInPanelHeading">LOGIN Panel</div>
	       
	       By Actual_LogInPanelProperty=By.id("logInPanelHeading");
	       WebElement LogInPanel=driver.findElement(Actual_LogInPanelProperty);
	       String Actual_LogInPanel_Text=LogInPanel.getText();
	       
	       System.out.println("The Actual text of LogInPanel on the OrangeHRM Homepage is:"+Actual_LogInPanel_Text);
	       
	      String Expected_LogInPanelProperty="LOGIN Panel";
	      WebElement ExpectedLogInPanel=driver.findElement(Actual_LogInPanelProperty);
	      String Expected_LognInPanel_Text=ExpectedLogInPanel.getText();
	      
	      System.out.println("The Expected text of LogInPanel on the OrangeHRM Homepage is:"+Expected_LognInPanel_Text);
	      
	      
	      if(Actual_LogInPanel_Text.equals(Expected_LognInPanel_Text))
	      {
	    	  System.out.println("The text of LogInPanel on the OrangeHRM Homepage is matched- PASS ");
	      }
	      else
	      {
	    	  System.out.println("The text of LogInPanel on the OrangeHRM Homepage is not matched- FAIL");
	      }
	       
	      driver.quit();
		
		
		
		
		
		
		

	}

}
