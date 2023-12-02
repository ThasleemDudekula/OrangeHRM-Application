package com.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Tsrtc_HandlingAlert extends BaseTest {

	@Test(priority=1,description="Validating Check availability Button Test")
	
	public void checkAvailabilityTest()
	{
		// property of check availability Element 
		// id="searchBtn"
		
		By CheckAvailabilityProperty=By.id("searchBtn");
		WebElement CheckAvailability=driver.findElement(CheckAvailabilityProperty);
		CheckAvailability.click();	
	}
	
	
	@Test(priority=2,description="Validating the Alert window Test")
	
	public void handlingAlert() throws InterruptedException
	{
		// Since the Alert window is not within the Browser - we are unable to identify the properties
		// of the element of an Alert -- so is the Reason the driver should be made to shift into
		//	the alert window and then handle the element of the Alert
		
		Alert tsrtcAlertWindow=driver.switchTo().alert();
		
		Thread.sleep(5000);
		
		String AlertWindowMessage=tsrtcAlertWindow.getText();
		System.out.println("The text of alert window is" +  AlertWindowMessage);
		
		//tsrtcAlertWindow.accept();  // accept method will perform operation on OK button in the alert window
		
		 tsrtcAlertWindow.dismiss(); // dismiss method will perform Operation on Cancel button
		 
	     // tsrtcAlertWindow.sendKeys("Testing"); // to send a Test Data into the Alert Window

		 
		
	}
	
	
	
	
	
}
