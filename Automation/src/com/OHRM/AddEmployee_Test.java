package com.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AddEmployee_Test {

	WebDriver driver;
	
	public void applicationLaunch()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Thasleem\\Automation\\Browsers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		// Maximize Browser
		driver.manage().window().maximize();
		
		String applicationUrlAddrss="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
		driver.get(applicationUrlAddrss);
		
	}
	
	// Validating LogIn page
	
	public void LogIn_Test()
	{
		By UserNameProperty=By.id("txtUsername");
		WebElement UserName=driver.findElement(UserNameProperty);
		UserName.sendKeys("Admin");
		
		By PasswordProperty=By.id("txtPassword");
	    WebElement	Password=driver.findElement(PasswordProperty);
	    Password.sendKeys("Thasleem@07");
	    
	    By LogInButtonProperty=By.id("btnLogin");
	    WebElement LogInButton=driver.findElement(LogInButtonProperty);
	    LogInButton.click();
	    
	}
	
	
	public void pimTest()
	{
		By pimProperty=By.id("menu_pim_viewPimModule");
		WebElement pim=driver.findElement(pimProperty);

		Actions pimAction = new Actions(driver);
		pimAction.moveToElement(pim).build().perform();
		
	}
	
	
	public void AddEmployee_Test()
	{
		
		By pimAddEmployeeProperty=By.id("menu_pim_addEmployee");
		WebElement pimAddEmployee=driver.findElement(pimAddEmployeeProperty);
		pimAddEmployee.click();
		 		
	}
	
	//Validating AddEmployee Webpage
	
	public void AddNewEmployee()
	{
		
		String firstNameTestData="Thasleem";
		
		By firstNameProperrty=By.id("firstName");
		WebElement firstName=driver.findElement(firstNameProperrty);
		firstName.sendKeys(firstNameTestData);
		
		String MiddleNameTestData="ts";
		
		By MiddlenNameProperty=By.id("middleName");
		WebElement MiddlenName=driver.findElement(MiddlenNameProperty);
		MiddlenName.sendKeys(MiddleNameTestData);
		
		String LastNameTestData="Dudekula";
		
		By LastNameProperty=By.id("lastName");
		WebElement LastName=driver.findElement(LastNameProperty);
		LastName.sendKeys(LastNameTestData);
		
		// getting Employee id value
		
		By EmployeeIdProperty=By.id("employeeId");
		WebElement EmployeeId=driver.findElement(EmployeeIdProperty);
		String EmployeeIdNumber=EmployeeId.getAttribute("value");
		System.out.println("The Employee id is:"+EmployeeIdNumber);
		
		
	// Save button opertion
		
		By SaveButtonProperty=By.id("btnSave");
		WebElement SaveButton=driver.findElement(SaveButtonProperty);
		SaveButton.click();
			
	}
	
	
	public static void main(String[] args) {
		
		AddEmployee_Test TestData=new AddEmployee_Test();
		
		TestData.applicationLaunch();
		TestData.LogIn_Test();
		TestData.pimTest();
		TestData.AddEmployee_Test();	
		TestData.AddNewEmployee();
		
		
		
		
		
		
	}
	
	
}



