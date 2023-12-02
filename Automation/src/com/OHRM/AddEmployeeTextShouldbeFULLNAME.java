package com.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddEmployeeTextShouldbeFULLNAME {

	public static void main(String[] args) {
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\Thasleem\\Selenium\\Browsers\\chromedriver.exe");
		   ChromeDriver driver=new ChromeDriver();
		
	       String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
	       driver.get(applicationUrlAddress);
	       
	       By usernameProperty=By.id("txtUsername");
	       WebElement username=driver.findElement(usernameProperty);
	       username.sendKeys("Admin");
	       
	       By passwordProperty=By.name("txtPassword");
	       WebElement password=driver.findElement(passwordProperty);
	       password.sendKeys("Thasleem@07");
	       
	       By LogInButtonProperty=By.className("button");
	       WebElement LogInButton=driver.findElement(LogInButtonProperty);
	       LogInButton.click();
	       
	       //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule" 
	       //id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
	       
	      By PIMproperty=By.id("menu_pim_viewPimModule");
	      WebElement PIM=driver.findElement(PIMproperty);	
	      PIM.click();
		
		
		//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee" 
		//id="menu_pim_addEmployee">Add Employee</a>
	      
	      
	      By AddEmployeeProperty=By.id("menu_pim_addEmployee");
	      WebElement AddEmployee=driver.findElement(AddEmployeeProperty);
	      AddEmployee.click();
	      
	      //<label class="hasTopFieldHelp">Full Name</label>
	      
	      String Expected_AddEmployeeNameProperty="Full Name";
	      WebElement Expected_AddemployeeName=driver.findElement(By.className("hasTopFieldHelp"));
	      String Expected_AddemployeeTextName=Expected_AddemployeeName.getText();
	     
	      System.out.println("The Expected AddEmployee text name is:"+Expected_AddemployeeTextName);
	     
	      By EmployeeIdProperty=By.id("employeeId");
	      WebElement EmployeeId=driver.findElement(EmployeeIdProperty);
	      String EmployeeIdText=EmployeeId.getAttribute("value");
	      System.out.println("The Employee id is:-"+EmployeeIdText);
	      
	      By Actual_AddEmployeeNameProperty=By.className("hasTopFieldHelp");
	      WebElement AddEmployeeName=driver.findElement(Actual_AddEmployeeNameProperty);
	      String Actual_AddEmployeeTextName= AddEmployeeName.getText();     
	      System.out.println("The Actual AddEmployee text name is:"+Actual_AddEmployeeTextName);
	      
	      if(Actual_AddEmployeeTextName.equals(Expected_AddemployeeTextName))
	      {
	    	  System.out.println("The AddEmployee text name is matched- PASS");
	      }
	      else
	      {
	    	  System.out.println("The AddEmployee text name is not matched- FAIL");
	      }
	      driver.quit();
		
		
		// First name, LastName, Middle name
	      
	      //personal_txtEmpFirstName
	      
			/*
			 * By FirstNameProperty=By.id("personal_txtEmpFirstName"); WebElement
			 * FirstName=driver.findElement(FirstNameProperty); String
			 * FirstNameText=FirstName.getAttribute("value");
			 * System.out.println("The FirstName text is:-"+FirstNameText);
			 */
		
		
	}

}
