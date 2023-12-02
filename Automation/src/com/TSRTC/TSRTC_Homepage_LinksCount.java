package com.TSRTC;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TSRTC_Homepage_LinksCount {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver","./Browsers/msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		
	    String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
	    driver.get(applicationUrlAddress);
	    
	    By linksProperty=By.tagName("input");
	    List<WebElement>tsrtc_HomePageLinks=driver.findElements(linksProperty);
	    
	   int tsrtc_HomePageCount=tsrtc_HomePageLinks.size();	    
	   
	   System.out.println("The no of links on the TSRTC App Homepage are:"+tsrtc_HomePageCount);
	    
	   
	   driver.quit();
	   
	}

}
