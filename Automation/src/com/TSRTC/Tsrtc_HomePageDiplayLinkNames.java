package com.TSRTC;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tsrtc_HomePageDiplayLinkNames {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Thasleem\\Selenium\\Browsers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
     	String applicationUrlAddreess="https://www.tsrtconline.in/oprs-web/";
     	driver.get(applicationUrlAddreess);
     	
     	By linkProperty=By.tagName("a");
     	List<WebElement>tsrtc_HomePageLinks=driver.findElements(linkProperty);
     	
     	int tsrtc_HomePageCount=tsrtc_HomePageLinks.size();
     	System.out.println("The no of links on the tsrtc_HomePage are:"+tsrtc_HomePageLinks);
     	
     	
     	
     	
     	for(int index=0;index<tsrtc_HomePageCount;index++)
     	{
     	String tsrtc_HomePageLinkName=tsrtc_HomePageLinks.get(index).getText();
     	System.out.println(index+" "+tsrtc_HomePageLinkName);
     
     	}
     	
     	

     	
     	driver.quit();
     	
		
		
		
		

	}

}
