package com.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ValidatingHomepagePIM {

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
	       
	       //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule" 
	       //id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
	       
	      By PIMproperty=By.id("menu_pim_viewPimModule");
	      WebElement PIM=driver.findElement(PIMproperty);	
	      
	      Actions action=new Actions(driver);
	      action.moveToElement(PIM).build().perform();
	      
	      String PIMtext=PIM.getText();
	      WebElement TextOfPIM=driver.findElement(By.id("menu_pim_viewPimModule"));
	      String pimText=TextOfPIM.getText();		
	      
	      System.out.println("The Text of pim is:"+pimText);
	      
	      
	      driver.quit();
		
		
		

	}

}
