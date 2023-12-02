package com.AddEmployeePhoto;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AddEmployeePhoto {

	@Test
	public void addemployee() throws InterruptedException, IOException {
	
		System.setProperty("webdriver.chrome.driver", "./newbrowser/chromedriver.exe");
		ChromeDriver driver;

		driver = new ChromeDriver();

		String applicationUrlAddrss="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
		driver.get(applicationUrlAddrss);
		
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
		
		
		
		
		
		
		
		
		
		
		
		/*
		
		
		

		{
		 // id="welcome"
		    By welComeAdminProperty=By.id("welcome");
		    WebElement welComeAdmin=driver.findElement(welComeAdminProperty);
		   
		   
		    String expected_OrangeHRMApplicationHomePageText="Welcome Admin";
		    System.out.println(" The Expected Text of OrangeHRM Application HomePage is :- "+expected_OrangeHRMApplicationHomePageText);
		   
		    String actual_OrangeHRMApplicationHomePageText=welComeAdmin.getText();
		    System.out.println(" The Actual Text of OrangeHRM Application HomePage is :- "+actual_OrangeHRMApplicationHomePageText);
		   
		    if(actual_OrangeHRMApplicationHomePageText.equals(expected_OrangeHRMApplicationHomePageText))
		    {
		    System.out.println(" Successfully  Navigated to OrangeHRM Application HomePage - PASS ");
		    Cell testResultCell=testDataRow.createCell(2);
		    testResultCell.setCellValue("Successfully  Navigated to OrangeHRM Application HomePage - PASS");
		   
		    }
		    else
		    {
		    System.out.println(" Failed to Navigate to OrangeHRM Application HomePage - FAIL ");
		    Cell testResultCell=testDataRow.createCell(2);
		    testResultCell.setCellValue("Failed to Navigate to OrangeHRM Application HomePage - FAIL ");
		    }
		   
		    FileOutputStream testResultFile = new FileOutputStream("./src/com/OrangeHRMApplicationTestDataFiles/OHRM_LogInTest_TestData.xlsx");
		    workBook.write(testResultFile);
		   
		    welComeAdmin.click();
		}

		@Test(priority=8,description=" Validating LogOut Test ")
		public void logOutTest() throws InterruptedException
		{
		// Synchronization
		   
		    Thread.sleep(5000); // wait time of Java - will be implemented only for the next statement
		   
		    // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
		    // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
		       
		    By logOutProperty=By.linkText("Logout");
		    WebElement logOut=driver.findElement(logOutProperty);
		    logOut.click();
		}

		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
