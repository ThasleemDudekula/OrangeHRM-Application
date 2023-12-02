package com.BingScreenshot;

import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BingScreenshot {

	
	public static void main(String[] args) throws IOException {
		
	
	WebDriver driver;

	String applicationUrlAddress="http://Amazon.com";
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Thasleem\\Automation\\Browsers\\chromedriver.exe");
	driver=new ChromeDriver();
	
	
	driver.manage().window().maximize();
	
	driver.get(applicationUrlAddress);
	
	//File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//FileUtils.copyFile(screenshot, new File("bingHomePage.png"));
	
	// File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	// FileUtils.copyFile(screenshot, new File("livetech.png"));
	
	File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(screenshot, new File("Thasleemscreenshot.png"));
	
	
	driver.close();
	
	
	}	
	
	
}
