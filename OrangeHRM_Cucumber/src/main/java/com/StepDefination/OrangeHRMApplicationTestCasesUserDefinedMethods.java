package com.StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Utility.Log;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRMApplicationTestCasesUserDefinedMethods {
	
	
	WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";

	
	
	@Given("^User should open the system$")
	public void user_should_open_the_system() 
	{
	    
		System.setProperty("webdriver.chrome.driver", "./newbrowser/chromedriver.exe");
		driver = new ChromeDriver();

		Log.info("**** Chrome Browser Successfully Launched ****");
		
	}

	@When("^User should enter OrangeHRM application Url Address$")
	public void user_should_enter_OrangeHRM_application_Url_Address() 
	{
	    
		driver.get(applicationUrlAddress);

		Log.info(" Entered OrangeHRM Appliation Url Address ");
		
	}

	@Then("^User should be navigated to OrangeHRM LogIn page$")
	public void user_should_be_navigated_to_OrangeHRM_LogIn_page() 
	{
	    
		String expected_orangeHRMApplicationLogInPageText="LOGIN Panel";
		Log.info(" The Expected text of the OrangeHRM Application LogIn Page is :- "+expected_orangeHRMApplicationLogInPageText);


		// id="logInPanelHeading"
		By orangeHRMApplicationLogInPageTextProperty=By.id("logInPanelHeading");
		WebElement orangeHRMApplicationLogInPageText=driver.findElement(orangeHRMApplicationLogInPageTextProperty);
		String actual_orangeHRMApplicationLogInPageText=orangeHRMApplicationLogInPageText.getText();

		Log.info(" The Actual Text of the OrangeHRM Application LogIn Page is :- "+actual_orangeHRMApplicationLogInPageText);

		if(actual_orangeHRMApplicationLogInPageText.equals(expected_orangeHRMApplicationLogInPageText))
		{
		Log.info(" Successfully Navigated to OrangeHRM Application LogIn Page - PASS");
		}
		else
		{
		Log.info(" Failed to Navigate to OrangeHRM Application LogIn Page - FAIL ");
		}

		// Validation with Title - OrangeHRM  (Should be exactly same)
		// Validating with URl Address - orangehrm-4.2.0.1 ( Should Have )

		
	}

	@Then("^User should close the application along with the Browser$")
	public void user_should_close_the_application_along_with_the_Browser() 
	{
	    
		driver.quit();
		Log.info(" **** OrangeHRM Aplication along with Chrome Browser Successfully Closed ***** ");

	}

	
	
	

}
