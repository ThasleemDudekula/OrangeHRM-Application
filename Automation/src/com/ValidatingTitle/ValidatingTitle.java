package com.ValidatingTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingTitle {

	public static void main(String[] args) {
		
		  /*Automating Chrome Browser
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thasleem\\Selenium\\Browsers\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
	     
		 //Navigating to Bing Homepage
			String applicationUrlAddress="http://bing.com";
			driver.get(applicationUrlAddress);
		
		//Expected title of the bing gome page----->Client Requirement
			String expected_bingHomepageTitle="Bing";		
			System.out.println("The title of the bing Homepage Title is:"+expected_bingHomepageTitle);
			
		//Actual title of the bing homepage-------->Developer developed the actual page 
			String Actual_bingHomepageTitle=driver.getTitle();
			System.out.println("The title of the bing Homepage Title is:"+Actual_bingHomepageTitle);
			
	    // Validating the title of the bing Homepage
			if(Actual_bingHomepageTitle.equals(expected_bingHomepageTitle))
			{
				System.out.println("Title of the bing Homepage matched: PASS");
			}
			else
			{
				System.out.println("Title of the bing Homepage not matched:FAIL");
			}
			
			driver.quit();*/
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Thasleem\\Selenium\\Browsers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		String ApplicationUrlAddress="https://google.com";
		driver.get(ApplicationUrlAddress);
		
		String expected_googleHomepageTitle="google";
		System.out.println("expected_googleHomepageTitle is:"+expected_googleHomepageTitle);
		
		String Actual_googleHomepageTitle="google";
		System.out.println("Actual_googleHomepageTitle is:"+Actual_googleHomepageTitle);

		if(Actual_googleHomepageTitle.equalsIgnoreCase(Actual_googleHomepageTitle))
		{
			System.out.println("Title of the google Homepage matched: PASS");
		}
		else
		{
			System.out.println("Title of the google Homepage is not matched:FAIL");
		}
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
