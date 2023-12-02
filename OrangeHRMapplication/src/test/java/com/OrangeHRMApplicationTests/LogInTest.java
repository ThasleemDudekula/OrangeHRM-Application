package com.OrangeHRMApplicationTests;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.OHRMlogin.BaseTest;

import jdk.internal.org.jline.utils.Log;


public class LogInTest extends BaseTest {
	
	@Test
	public void Login()
	{
		
		
	/*	FileInputStream orangeHRMApplicationLogInTestDataFile =new FileInputStream("C:\\Users\\Thasleem\\Automation\\src\\com\\ExcelFiles\\excelsheet.xlsx");
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

		
		// Validating OrangeHRM Application HomePage
		String expected_OrangeHRMApplicationHomePageText="Admin";
		Log.info(" The Expected Text of OrangeHRM Application HomePage is :- "+expected_OrangeHRMApplicationHomePageText);

		// id="welcome" - Property of WelCome Admin Element
		By welComeAdminProperty=By.id("welcome");
		WebElement welComeAdmin=driver.findElement(welComeAdminProperty);


		String actual_OrangeHRMApplicationHomePageText=welComeAdmin.getText();
		Log.info(" The actual Text of OrangeHRM Application HomePage is :- "+actual_OrangeHRMApplicationHomePageText);

		
		
		// Validating HomePage
		if(actual_OrangeHRMApplicationHomePageText.contains(expected_OrangeHRMApplicationHomePageText))
		{
		Log.info(" Succesfully Navigated to OrangeHRM Application HomePage - PASS");

	
		Cell logInTestResultRowOfCell=LogInTestDataRow.createCell(2);
		logInTestResultRowOfCell.setCellValue("Succesfully Navigated to OrangeHRM Application HomePage - PASS");

		}
		else
		{
		Log.info(" Failed to Navigat to OrangeHRM Application HomePage - FAIL");
		

		Cell logInTestResultRowOfCell=LogInTestDataRow.createCell(2);
		logInTestResultRowOfCell.setCellValue("Failed to Navigat to OrangeHRM Application HomePage - FAIL");

		}

		FileOutputStream orangeHRMApplicationLogInTestResultFile = new FileOutputStream("C:\\Users\\Thasleem\\Automation\\src\\com\\ExcelFiles\\OHRMlogInTestData.xlsx");
		Workbook.write(orangeHRMApplicationLogInTestResultFile);

		welComeAdmin.click();
		
		By logOutProperty=By.linkText("Logout");
		WebElement logOut=driver.findElement(logOutProperty);
		logOut.click();

		
	*/	
	}

}
