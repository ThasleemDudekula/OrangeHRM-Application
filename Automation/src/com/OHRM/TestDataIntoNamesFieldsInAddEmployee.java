package com.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDataIntoNamesFieldsInAddEmployee {

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
	      System.out.println(AddEmployee.getText());
	      AddEmployee.click();
	      
	      //FirstName field property
	      //<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
	      
	      By FirstNamefieldProperty=By.id("firstName");
	      WebElement FirstNameField=driver.findElement(FirstNamefieldProperty);	
	      FirstNameField.sendKeys("Thasleem");
	      
	      //MiddleNameFieldProperty
	      //<input class="formInputText" maxlength="30" type="text" name="middleName" id="middleName">
	      
	      By MiddleNameFiledProperty=By.id("middleName");
	      WebElement MiddleNameField=driver.findElement(MiddleNameFiledProperty);
	      MiddleNameField.sendKeys("ts");
	      
	      //LatNameFiledProperty
	      //<input class="formInputText" maxlength="30" type="text" name="lastName" id="lastName">
	      
	      By LastNameFiledProperty=By.id("lastName");
	      WebElement LastNameField=driver.findElement(LastNameFiledProperty);
	      LastNameField.sendKeys("Dudekula");
		
	      
	      //GetEmployeeID
	      //<input class="formInputText valid" maxlength="10" type="text" name="employeeId" value="0002" id="employeeId">
	      
	      //<input class="formInputText valid" maxlength="10" type="text" name="employeeId" value="0002" id="employeeId">
	      
	      
	     // WebElement Employee=driver.findElement(By.id("employeeId"));
	     // By EmployeeIdProperty=By.id("employeeId");
	     // WebElement EmployeeId=driver.findElement(EmployeeIdProperty);
	      //String EmployeeIdFieldContainsValue=EmployeeId.getText();
	      
          //System.out.println(Employee.getText());	      
	     // System.out.println("The Employee Id Field containing the value of:"+EmployeeIdFieldContainsValue);
		//System.out.println("klkjefkgk");
		//driver.close();
		
		WebElement Employee=driver.findElement(By.id("employeeId"));  
	      
	      
	      
	      
		

	}

}
