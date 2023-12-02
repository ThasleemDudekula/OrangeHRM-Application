package com.OHRM;

import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingURLaddress {

	public static void main(String[] args) {
		
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\Thasleem\\Selenium\\Browsers\\chromedriver.exe");
		   ChromeDriver driver=new ChromeDriver();
		
	       String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
	       driver.get(applicationUrlAddress);
	       
	       String expected_URLaddressProperty="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
	       System.out.println("The expected URL Address of the OrangeHRM is:"+expected_URLaddressProperty);
	       
	       
	       String actual_URLaddressProperty=driver.getCurrentUrl();
		   System.out.println("The actual URL Address of the OrangeHRM is:"+actual_URLaddressProperty);
		   
		   if(actual_URLaddressProperty.contains(expected_URLaddressProperty))
		   {
			   System.out.println("The URL Address of the OrangeHRM is matched - PASS");
		   }
		   else
		   {
			   System.out.println("The URL Address of the OrangeHRM is not matched - FAIL");
		   }
		   
		   
		   driver.quit();
		
		
		
		

	}

}
