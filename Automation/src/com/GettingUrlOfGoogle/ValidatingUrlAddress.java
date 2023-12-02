package com.GettingUrlOfGoogle;

import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingUrlAddress {

	public static void main(String[] args) {
		System.setProperty("weebdriver.chrome.driver","C:\\Users\\Thasleem\\Selenium\\Browsers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		String expectedGoogleHomePageUrlAddress="google.com";
		System.out.println(" The expected URl address of the Google HomePage is :- "+expectedGoogleHomePageUrlAddress);

		// getting the URL Address of the Current WebPage
		String actualGoogleHomePageCurrentUrlAddress=driver.getCurrentUrl();
		System.out.println(" The Actual Current URL Address of the Google HomePage is :- "+actualGoogleHomePageCurrentUrlAddress);

		if(actualGoogleHomePageCurrentUrlAddress.contains(expectedGoogleHomePageUrlAddress))
		{
		System.out.println(" Url address Found in the GoogleHomePage - PASS");
		}
		else
		{
		System.out.println(" Expected Url Address is not Found in the GoogleHomePage - FAIL");
		}

		driver.quit();
		

		
		
		
		
		
		
		
		
	}

}
