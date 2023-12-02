package com.Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Tsrtc_HeaderBlock_Testing_CapturingScreenshot extends BaseTest{

	@Test
	public void headerBlock_CapturingScreenshot() throws InterruptedException, IOException
	{
		
		// Identify the Header Block of the webpage
		// property of the headerblock is      class:"menu-wrap"
		 
	     By	tsrtc_HeaderBlockProperty=By.className("menu-wrap");
	     WebElement tsrtc_HeaderBlock=driver.findElement(tsrtc_HeaderBlockProperty);
	     
	     //<a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">
			// Home</a>
	     // <a class="tabcopy blinking" href="/oprs-web/guest/specialHire.do" target="_top" title="Bus on Contract">Bus on Contract</a>
	     
	     // <a class="tabcopy" href="/oprs-web/services/cancel.do" target="_top" title="Cancelled Services">Cancelled Services</a>
	     
	     // <a class="tabcopy" href="/oprs-web/services/driverInfo.do" target="_top" title="Driver Info">Driver Info</a>
	     
	     
	     By tsrtc_HeaderBlockLinksProperty=By.tagName("a");	     
	     List<WebElement>tsrtc_HeaderBlockLinks=tsrtc_HeaderBlock.findElements(tsrtc_HeaderBlockLinksProperty);
	     
	     int tsrtc_HeaderBlockLinksCount=tsrtc_HeaderBlockLinks.size();
	     System.out.println("The number of links in the Header Block of TSRTC Applicatin HomePage are :-"+tsrtc_HeaderBlockLinksCount);
	     
	  // to goto the arrayList and get the names of the links assigned and stored
	     
	     for(int index=0;index<tsrtc_HeaderBlockLinksCount;index++)
	     {
	    	 String tsrtc_HeaderBlockLinkName=tsrtc_HeaderBlockLinks.get(index).getText(); 
	    	 System.out.println(index+" "+tsrtc_HeaderBlockLinkName);
	    	 
	    	 String expected_WebpageLinkUrlAddress=tsrtc_HeaderBlockLinks.get(index).getAttribute("href");
	    	 System.out.println(expected_WebpageLinkUrlAddress);
	    	 
	    	// Performing an Operation on the links of the Hedear Block
	    	 tsrtc_HeaderBlockLinks.get(index).click();
	    	 
	    	 Thread.sleep(4000);
	    	 
	    	String actual_WebpageLinkUrlAddress=driver.getCurrentUrl();
	    	System.out.println(actual_WebpageLinkUrlAddress);
	    	
	    	if(actual_WebpageLinkUrlAddress.equals(expected_WebpageLinkUrlAddress))
	    	{
	    		System.out.println("Successfully navigated to Expected Link Webpage: PASS");
	    	}
	    	else
	    	{
	    		System.out.println("Failed to navigate to Expected Link Webpage: FAIL");
	    	}
	    	 
	    	//File Screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    //	FileUtils.copyFile(Screenshot, new File("./TSRTC_Screenshots/"+tsrtc_HeaderBlockLinkName+".png"));
	     
	    	
	    	
	    
	    	

	     
	     driver.navigate().back();
	     
	      tsrtc_HeaderBlock=driver.findElement(tsrtc_HeaderBlockProperty);
	      tsrtc_HeaderBlockLinks=tsrtc_HeaderBlock.findElements(tsrtc_HeaderBlockLinksProperty);
		
	     }
	     
	}
	
	
	
}
