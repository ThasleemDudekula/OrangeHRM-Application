package com.CapturingTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingTitle_BingHomePage {

	public static void main(String[] args) {
		
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thasleem\\Selenium\\Browsers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		String applicationUrlAddress="http://google.com";
		driver.get(applicationUrlAddress);
		
		String googleHomepageTitle=driver.getTitle();		
		System.out.println("The title of the google Homepage Title is:"+googleHomepageTitle);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\Thasleem\\Selenium\\Browsers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		String applicationUrlAddress="http://instagram.com";
		driver.get(applicationUrlAddress);
		
		String instagramHomePageTitle=driver.getTitle();
		System.out.println("Bing title:"+instagramHomePageTitle);
		
		driver.quit();*/
		
		
	}

}
