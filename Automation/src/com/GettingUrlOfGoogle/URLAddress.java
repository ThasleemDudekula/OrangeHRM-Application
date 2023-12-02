package com.GettingUrlOfGoogle;

import org.openqa.selenium.chrome.ChromeDriver;

public class URLAddress 
{
	public static void main(String[] args) 
	{
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\Thasleem\\Selenium\\Browsers\\chromedriver.exe");
		ChromeDriver driver;
		
		driver=new ChromeDriver();
		
		String applicationUrlAddress="http://google.com";
		driver.get(applicationUrlAddress);
		
		String Expected_googleHomepageTitle="Google";
		System.out.println("Expected_googleHomepageTitle is:"+Expected_googleHomepageTitle);
		
		String Actual_googleHomepageTitle=driver.getTitle();
		System.out.println("Actual_googleHomepageTitle is:"+Actual_googleHomepageTitle);
		
		if(Actual_googleHomepageTitle.equals(Expected_googleHomepageTitle))
		{
			System.out.println("The Title of the googleHomepage is matched: PASS");
		}
		else
		{
			System.out.println("The Title of the googleHomepage is not matched: FAIL");
		}
		driver.quit();	*/
		
		
		
		
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\Thasleem\\Selenium\\Browsers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		String applicationUrlAddress="http://whatsapp.com";
		driver.get(applicationUrlAddress);
		
		String Expected_whatsappHomepageTitle="WhatsApp | Secure and Reliable Free Private Messaging and Calling";
		System.out.println("Expected_whatsappHomepageTitle is:"+Expected_whatsappHomepageTitle);
		
		String Actual_whatsappHomepageTitle=driver.getTitle();
		System.out.println(driver.getTitle());
		System.out.println(" Actual_whatsappHomepageTitle is:"+ Actual_whatsappHomepageTitle);
	   if(Actual_whatsappHomepageTitle.equals(Expected_whatsappHomepageTitle))
	    
	    	System.out.println("Whatsapp Homepage Title is matched: PASS");
	    
	    else
	    
	    	System.out.println("Whatsapp Homepage Title is not matched: FAIL");
	    
		
		driver.quit();*/
		
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Thasleem\\Selenium\\Browsers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		String applicationUrlAddress="http://facebook.com";
		driver.get(applicationUrlAddress);
		
		String Expected_facebookHomepageTitle="Facebook – log in or sign up";
		System.out.println(" Expected_facebookHomepageTitle is:"+Expected_facebookHomepageTitle);
				
		String Actual_facebookHomepageTitle=driver.getTitle();
		System.out.println("Actual_facebookHomepageTitle:"+Actual_facebookHomepageTitle);
		
		if(Actual_facebookHomepageTitle.equals(Expected_facebookHomepageTitle))
		{
			System.out.println("Actual_facebbokHomepageTitle is matched: PASS");
		}
		else
		{
			System.out.println("Expected_facebookHomepageTitle is not matched: FAIL");
		}
		driver.quit();
		
		
		
		
		
		
		
		
		
		
	}
 }
