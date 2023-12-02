package com.EmployeeList1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EmployeeList extends BaseTest {
	
	@Test
	public void employeelist() throws IOException
	{
		FileInputStream testdatafile = new FileInputStream("./src/com/ExcelFiles/newwebtable.xlsx");
	   	XSSFWorkbook workbook = new XSSFWorkbook(testdatafile);
	   	XSSFSheet testdatasheet=workbook.createSheet("webtablel");
	   	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println("**chrome browser launched successsfully**");
		
		driver.get(applicationUrlAddress);
		System.out.println(" Sucessfully navigated to OrangeHRM Application ");
		
		FileInputStream orangeHRMApplicationLogInTestDataFile =new FileInputStream("./src/com/Employee_List/Employee List.xlsx");
		XSSFWorkbook Workbook=new XSSFWorkbook(orangeHRMApplicationLogInTestDataFile );
		XSSFSheet logInTestDataSheet =Workbook.getSheet("sheet1");
		
		Row LogInTestDataRow=logInTestDataSheet.getRow(1);
		
		Cell logInTestDataRowOfUserNameCell=LogInTestDataRow.getCell(0);
		
		String userNameTestData=logInTestDataRowOfUserNameCell.getStringCellValue();
		
		// id=txtUsername
		
		// String usernameTestData="Admin";
		
		By usernameProperty=By.id("txtUsername");
		WebElement username=driver.findElement(usernameProperty);
		username.sendKeys(userNameTestData);
		
		Cell logInTestDataRowOfPasswordCell=LogInTestDataRow.getCell(1);
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
		
	//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewEmployeeList/reset/1" id="menu_pim_viewEmployeeList">Employee List</a>

       By employeelistproperty=By.linkText("Employee List");
       WebElement employeelist=driver.findElement(employeelistproperty);
       
       
       employeelist.click();
       
       ///html/body/div[1]
       
       ///html/body/div[1]/div[3]/div[2]/div/form
       ///html/body/div[1]/div[3]/div[2]/div
       ///html/body/div[1]/div[3]/div[2]
       
       ///html/body/div[1]/div[3]/div[2]/div/form---3
       ///html/body/div[1]/div[3]/div[2]/div---2
       ///html/body/div[1]/div[3]/div[2]---1
       
       
       ///html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/thead/tr--------tablr head
       
       ///html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/thead
       
       ///html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/thead/tr
       
       ///html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/thead/tr/th[1]----0cell
       
       ///html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/thead/tr/th[8]------last cell
       
       
       
      ///html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody           main table
       
       ///html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[1]/td[1]
       
       ///html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[1]/td[8]
       
       	
       ///html/body/div[1]/div[3]/div[2]/div
       
       
       
       By webTableProperty=By.xpath("html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody");
   	WebElement webTable=driver.findElement(webTableProperty);

   	By rowProperty=By.tagName("tr");
   	
   	List<WebElement>rows=webTable.findElements(rowProperty);
	
   	for(int rowIndex=0;rowIndex<rows.size();rowIndex++)
   	{
   		Row row=testdatasheet.createRow(rowIndex);
   	WebElement webTableRow=rows.get(rowIndex);
   	By rowOfCellProperty=By.tagName("td");

   	
   	List<WebElement>rowOfCells=webTableRow.findElements(rowOfCellProperty);

   	
   	for(int rowOfCellIndex=0;rowOfCellIndex<rowOfCells.size();rowOfCellIndex++)
   	{
   	WebElement rowOfCell=rowOfCells.get(rowOfCellIndex);
   	String data=rowOfCell.getText();
   	System.out.print(data+ " | ");
   	
   	
   	Cell cellll=row.createCell(rowOfCellIndex);
   	cellll.setCellValue(data);
   	
   	}
   	System.out.println();
   	}	
   	FileOutputStream res = new FileOutputStream("./src/com/ExcelFiles/newwebtable.xlsx");
   	workbook.write(res);
   	
   		
	By WelcomeAdminProperty=By.id("welcome");
	WebElement WelcomeAdmin=driver.findElement(WelcomeAdminProperty);
	WelcomeAdmin.click();
	
	By LogoutProperties=By.linkText("Logout");
	   WebElement LogOut=driver.findElement(LogoutProperties);
	   LogOut.click();
	

	}
	
	
	

}
