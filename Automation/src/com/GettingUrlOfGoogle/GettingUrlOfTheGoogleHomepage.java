package com.GettingUrlOfGoogle;

import org.openqa.selenium.chrome.ChromeDriver;

public class GettingUrlOfTheGoogleHomepage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Thasleem\\Selenium\\Browsers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();	
		
		String ApplicationUrlAddress="http://google.com";
		driver.get(ApplicationUrlAddress);
		
		
		
		
		
		

	}

}
