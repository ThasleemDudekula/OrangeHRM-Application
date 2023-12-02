package com.Alert2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Tsrtc_HandlingAlert extends BaseTest {
	
	@Test
	public void HandlingAlert() throws InterruptedException
	{
		
	//	id="searchBtn"	
		By SearchButtonProperty=By.id("searchBtn");
		WebElement SearchButton=driver.findElement(SearchButtonProperty);
		SearchButton.click();
		
		Alert AlertWindowMessage=driver.switchTo().alert();
		
		Thread.sleep(4000);
		
		String alerWindowText=AlertWindowMessage.getText();
		System.out.println("The text of an Alert winow is:"+alerWindowText);
		
		String actual_TextOfAlert="Please select start place.";
		
		String Expected_TextOfAlert="Please select start place.";
		
		if(actual_TextOfAlert.equals(Expected_TextOfAlert))
		{
			System.out.println("Succesfully Navigated to Tsrtc-PASS");
		}
		else
		{
			System.out.println("Not Navigateted to Application-FAIL");
		}
		
		
		
		AlertWindowMessage.accept();
		
	}
}
