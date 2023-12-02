package com.OrangeHRMApplicationTests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.AutoItScripts.BaseTest;

public class AutoItScript  extends BaseTest{

	@Test
	public void AutoIt() throws InterruptedException, IOException
	{
		
		By usernameProperty=By.id("txtUsername");
		WebElement username=driver.findElement(usernameProperty);
		username.sendKeys("Admin");
		
		By passwordProperty=By.name("txtPassword");
		WebElement password=driver.findElement(passwordProperty);
		password.sendKeys("Thasleem@07");
		
		By LoginButtonProperty=By.className("button");
		WebElement LoginButton=driver.findElement(LoginButtonProperty);
		LoginButton.click();
		
		By pimProperty=By.id("menu_pim_viewPimModule");
		WebElement pim=driver.findElement(pimProperty);

		Actions pimAction = new Actions(driver);
		pimAction.moveToElement(pim).build().perform();
		
		By pimAddEmployeeProperty=By.id("menu_pim_addEmployee");
		WebElement pimAddEmployee=driver.findElement(pimAddEmployeeProperty);
		pimAddEmployee.click();
		
		String firstNameTestData="Thasleem";
		
		By firstNameProperrty=By.id("firstName");
		WebElement firstName=driver.findElement(firstNameProperrty);
		firstName.sendKeys(firstNameTestData);
		
		Actions KeyBoardActions=new Actions(driver);
		KeyBoardActions.sendKeys(Keys.TAB).build().perform();
		
        String MiddleNameTestData="ts";
		
		By MiddlenNameProperty=By.id("middleName");
		WebElement MiddlenName=driver.findElement(MiddlenNameProperty);
		MiddlenName.sendKeys(MiddleNameTestData);
		
		KeyBoardActions.sendKeys(Keys.TAB).build().perform();
		
		String LastNameTestData="Dudekula";
		
		By LastNameProperty=By.id("lastName");
		WebElement LastName=driver.findElement(LastNameProperty);
		LastName.sendKeys(LastNameTestData);
		
		By employeeIdProperty=By.id("employeeId");
		WebElement employeeId=driver.findElement(employeeIdProperty);
		String employeeIdValue=employeeId.getAttribute("value");
		System.out.println(" The Employee ID is :- "+employeeIdValue);

		KeyBoardActions.sendKeys(Keys.TAB).build().perform();

		// Focus to the Photograph
		KeyBoardActions.sendKeys(Keys.TAB).build().perform();
		KeyBoardActions.sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(5000);
		
		java.lang.Runtime.getRuntime().exec("C:\\Users\\Thasleem\\Automation\\autoit\\ammapic.exe");
		
		Thread.sleep(5000);
		
		By saveButtonProperty=By.id("btnSave");
		WebElement saveButton=driver.findElement(saveButtonProperty);
		saveButton.click();
		
		
		// id=empPic   property of the image
		
		By photographImageProperty=By.id("empPic");
		WebElement photographImage=driver.findElement(photographImageProperty);
		
		
		boolean flag=photographImage.isDisplayed();
		
		if(flag)
		{
		System.out.println(" Employee Photograph Successfully Uploaded to the Application - PASS");
		}
		else
		{
		System.out.println(" Employee Photograph Failed to Uploaded to the Application - FAIL");
		}
		
		
		
		
		
		
		
		
	}
	
	
	
}
