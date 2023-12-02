package com.OHRM;

import org.openqa.selenium.chrome.ChromeDriver;

public class OHRMvalidatingTitle {

	public static void main(String[] args) {
		
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\Thasleem\\Selenium\\Browsers\\chromedriver.exe");
		   ChromeDriver driver=new ChromeDriver();
		
	       String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
	       driver.get(applicationUrlAddress);
	       
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
