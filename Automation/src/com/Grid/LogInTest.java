package com.Grid;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LogInTest {
	
	@Parameters("Browser")
	
	@Test
	public void loginTest(String browserName)
	{
		
		System.out.println("The name of the Browser is :- "+browserName);
		
		// DesiredCapabilities- it is used to connect to Node System
	    // should be set with the Browser information along with the platform on which
	   //  the Test should be executed
		
		DesiredCapabilities capabilities=null;
		
		if(browserName.equals("chrome"))
		{
			capabilities=DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
		}
		else
		if(browserName.equals("firefox"))
		{
			capabilities=DesiredCapabilities.firefox();
			capabilities.setBrowserName("firefox");
			capabilities.setPlatform(Platform.WINDOWS);
			
		}
		
		
		
		
		
	}
	
	

}
