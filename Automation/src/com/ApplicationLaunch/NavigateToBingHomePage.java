package com.ApplicationLaunch;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToBingHomePage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thasleem\\Selenium\\Browsers\\chromedriver.exe");
		ChromeDriver Driver=new ChromeDriver();
		 
		// Driver.get("http://bing.com");
		
		Driver.navigate().to("http://bing.com");

		
	}

}
