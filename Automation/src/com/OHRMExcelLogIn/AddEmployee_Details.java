package com.OHRMExcelLogIn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddEmployee_Details {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		
		System.setProperty("webdriver.chrome.driver","./newbrowser/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println("**chrome browser launched successsfully**");
		
		driver.get(applicationUrlAddress);
		System.out.println(" Sucessfully navigated to OrangeHRM Application ");
		
		FileInputStream orangeHRMApplicationLogInTestDataFile =new FileInputStream("./src/com/ExcelFiles/AddEmployee.xlsx");
		XSSFWorkbook Workbook=new XSSFWorkbook(orangeHRMApplicationLogInTestDataFile );
		XSSFSheet logInTestDataSheet =Workbook.getSheet("sheet1");
		
		int testdatarowcount=logInTestDataSheet.getLastRowNum();
		
		for(int rowindex=1;rowindex<=3;rowindex++)
		{
		try
		{
		Row LogInTestDataRow=logInTestDataSheet.getRow(rowindex);
		
		// <div id="logInPanelHeading">LOGIN Panel</div>   ----LogInPanel property
		Cell testdataofcell=LogInTestDataRow.getCell(0);
		String expectedloginpaneltext=testdataofcell.getStringCellValue();
		
		By LogInPanelProperty=By.id("logInPanelHeading");
		WebElement LogInPanel=driver.findElement(LogInPanelProperty);
		String actualtext=LogInPanel.getText();
		
		Cell LogInPanelTestData=LogInTestDataRow.createCell(1);
		LogInPanelTestData.setCellValue(actualtext);
		
		if(actualtext.equals(expectedloginpaneltext))
		{
			Cell testdatacellresult=LogInTestDataRow.createCell(2);
			testdatacellresult.setCellValue("Expected text is equals to Actual text= Pass");
		}
		else
		{
			Cell testdatacellresult=LogInTestDataRow.createCell(2);
			testdatacellresult.setCellValue("Expected text is NOT equals to Actual text= Fail");	
		}
			
		
		Cell homepagetitle=LogInTestDataRow.getCell(3);
		String ActualHomePageTitle=homepagetitle.getStringCellValue();
		
		String Expected_OHRMtitle=driver.getTitle();
		
		Cell HomepageTitle=LogInTestDataRow.createCell(4);
		HomepageTitle.setCellValue(Expected_OHRMtitle);
		
		if(ActualHomePageTitle.equals(Expected_OHRMtitle))
		{
			Cell TitleHomepageresult=LogInTestDataRow.createCell(5);
			TitleHomepageresult.setCellValue("Expected text of Title is equals to Actual text: PASS");
		}
		else
		{
			Cell TitleHomepageresult=LogInTestDataRow.createCell(5);
			TitleHomepageresult.setCellValue("Expected text of Title is not equals to Actual text: FAIL");
		}
		
		// Admin property
		// <a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
		
		
		Cell AdminText=LogInTestDataRow.getCell(8);
		String ExpectedTextOfAdmin=AdminText.getStringCellValue();
		
		By AdminProperty=By.id("welcome");
		WebElement adminText=driver.findElement(AdminProperty);
		String Actual_AdminText=adminText.getText();
		
		Cell Admintext=LogInTestDataRow.createCell(9);
		Admintext.setCellValue(Actual_AdminText);
		
		if(Actual_AdminText.contains(ExpectedTextOfAdmin))
		{
			Cell AdminHomepageText=LogInTestDataRow.createCell(10);
			AdminHomepageText.setCellValue("Expected text of Admin is equals to actual text: PASS");	
		}
		else
		{
			Cell AdminHomepageText=LogInTestDataRow.createCell(10);
			AdminHomepageText.setCellValue("Expected text of Admin is not equals to actual text: FAIL");
		}
		
		
		// Add Employee proerty---- //<label class="hasTopFieldHelp">Full Name</label>
	      
		Cell TextOfAddEmployee=LogInTestDataRow.getCell(11);
		String Expected_TextOfEmployee=TextOfAddEmployee.getStringCellValue(); 
		
	      String Expected_AddEmployeeNameProperty="Full Name";
	      WebElement Expected_AddemployeeName=driver.findElement(By.className("hasTopFieldHelp"));
	      String Actual_AddemployeeTextName=Expected_AddemployeeName.getText();
	      
	      Cell AddEmployeeText=LogInTestDataRow.createCell(12);
	      AddEmployeeText.setCellValue(Actual_AddemployeeTextName);
	      
	      if(Actual_AddemployeeTextName.equals(Expected_TextOfEmployee))
	      {
	    	  Cell AddEmployeedataText=LogInTestDataRow.createCell(13);
	    	  AddEmployeedataText.setCellValue("Expected text of Add Employee is equals to Actual text - PASS");
	      }
	      else
	      {
	    	  Cell AddEmployeedataText=LogInTestDataRow.createCell(13);
	    	  AddEmployeedataText.setCellValue("Expected text of Add Employee is equals to Actual text - PASS");  
	      }
		
		
		
		
		Cell logInTestDataRowOfUserNameCell=LogInTestDataRow.getCell(6);
		
		String userNameTestData=logInTestDataRowOfUserNameCell.getStringCellValue();
		
		// id=txtUsername
		
		// String usernameTestData="Admin";
		
		By usernameProperty=By.id("txtUsername");
		WebElement username=driver.findElement(usernameProperty);
		username.sendKeys(userNameTestData);
		
		Cell logInTestDataRowOfPasswordCell=LogInTestDataRow.getCell(7);
		String passwordTestData=logInTestDataRowOfPasswordCell.getStringCellValue();
		
		// String passwordTestData="Thasleem@07";

		By passwordProperty=By.name("txtPassword");
		WebElement password=driver.findElement(passwordProperty);
		password.sendKeys(passwordTestData);
		
		By logInButtonProperty=By.className("button");
		WebElement logInButton=driver.findElement(logInButtonProperty);
		logInButton.click();
		
		// id="menu_pim_viewPimModule"
		
		By PIMproperty=By.id("menu_pim_viewPimModule");
		WebElement PIM=driver.findElement(PIMproperty);
		PIM.click();
		
		// id="menu_pim_addEmployee"<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>
		By PimAddEmployeeProperty=By.id("menu_pim_addEmployee");
		WebElement PimAddEmployee=driver.findElement(PimAddEmployeeProperty);
		PimAddEmployee.click();
		
		Cell firstnamecell=LogInTestDataRow.getCell(14);
		String firstNameTestData=firstnamecell.getStringCellValue();
		
		By firstNameProperrty=By.id("firstName");
		WebElement firstName=driver.findElement(firstNameProperrty);
		firstName.sendKeys(firstNameTestData);
		
		Cell middlenamecell=LogInTestDataRow.getCell(15);
		String MiddleNameTestData=middlenamecell.getStringCellValue();
		
		By MiddlenNameProperty=By.id("middleName");
		WebElement MiddlenName=driver.findElement(MiddlenNameProperty);
		MiddlenName.sendKeys(MiddleNameTestData);
		
		Cell lastnamecell=LogInTestDataRow.getCell(16);
		String LastNameTestData=lastnamecell.getStringCellValue();
		
		By LastNameProperty=By.id("lastName");
		WebElement LastName=driver.findElement(LastNameProperty);
		LastName.sendKeys(LastNameTestData);
		
		// getting Employee id value
		
		By EmployeeIdProperty=By.id("employeeId");
		WebElement EmployeeId=driver.findElement(EmployeeIdProperty);
		String EmployeeIdNumber=EmployeeId.getAttribute("value");

		Cell employeeidcell=LogInTestDataRow.createCell(17);
		employeeidcell.setCellValue(EmployeeIdNumber);
		System.out.println("The Employee id is:"+EmployeeIdNumber);
		
		
	// Save button opertion
		
		By SaveButtonProperty=By.id("btnSave");
		WebElement SaveButton=driver.findElement(SaveButtonProperty);
		SaveButton.click();
		}
		
		
		
		
		
		
		catch (Exception e) {
			// TODO: handle exception
		}
		}	
	
		driver.navigate().back();

	}

	
}
