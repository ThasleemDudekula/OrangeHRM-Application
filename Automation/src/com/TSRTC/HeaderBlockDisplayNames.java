package com.TSRTC;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeaderBlockDisplayNames {

	public static void main(String[] args) {
		
		WebDriver driver;
	  System.setProperty("webdriver.chrome.driver","./newbrowser/chromedriver.exe");	
	  driver =new ChromeDriver();
	  
	  String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
	  driver.get(applicationUrlAddress);
	  
	  By tsrtc_HeaderBlockProperty=By.className("menu-wrap");
	  WebElement tsrtc_HeaderBlock=driver.findElement(tsrtc_HeaderBlockProperty);
	  
	  By tsrtc_HeaderBlockLinkProperty=By.tagName("a");
	  List<WebElement>tsrtc_HeaderBlockLinks=tsrtc_HeaderBlock.findElements(tsrtc_HeaderBlockLinkProperty);
	  
	  int tsrtc_HeaderBlockLinksCount=tsrtc_HeaderBlockLinks.size();	  
	  System.out.println("The no of count of HeaderBlock Count is:"+tsrtc_HeaderBlockLinksCount);
	  
	  for(int index=0;index<tsrtc_HeaderBlockLinksCount;index++)
	  {
		String tsrtc_HeaderBlockLinkName=tsrtc_HeaderBlockLinks.get(index).getText();
		System.out.println(index+"  "+ tsrtc_HeaderBlockLinkName);
		 
	    tsrtc_HeaderBlockLinks.get(index).click();
	    
	   driver .navigate().back();
	    
	    tsrtc_HeaderBlock=driver.findElement(tsrtc_HeaderBlockLinkProperty);
	  }
	    
	  driver .close();
	    
	    
	    
	    
	    
	    
	   /* String webPageTitle=driver.getTitle();
	    System.out.println(webPageTitle);

	    String webPageCurrentUrlAddress=driver.getCurrentUrl();
	    System.out.println(webPageCurrentUrlAddress);

	    System.out.println();

	    driver.navigate().back();

	    // Identifying the Header Block for another Time
	    tsrtc_HeaderBlock=driver.findElement(tsrtc_HeaderBlockProperty);
	    // of the header Block - finding all the elements and storing back to the ArrayList
	    // we are creating the arrayList for another time - because when the driver focus shits to
	    // the next page the information stored in the arrayList of the driver will be cleared off
	    // - so create the arrayList to identify the elements of the Header Block for another time
	    // after coming back to WebPage
	    tsrtc_HeaderBlockLinks=tsrtc_HeaderBlock.findElements(tsrtc_HeaderBlockProperty);
	    }

	    driver.close();  */
	  
	 	
	}
}
