package com.OHRMExcelLogIn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LogInTest {

	public static void main(String[] args) throws IOException {
		
		
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		
		System.setProperty("webdriver.chrome.driver","./newbrowser/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println("**chrome browser launched successsfully**");
		
		driver.get(applicationUrlAddress);
		System.out.println(" Sucessfully navigated to OrangeHRM Application ");
		
		
		FileInputStream orangeHRMApplicationLogInTestDataFile =new FileInputStream("C:\\Users\\Thasleem\\Automation\\src\\com\\ExcelFiles\\excelsheet.xlsx");
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
		System.out.println(" The Expected Text of OrangeHRM Application HomePage is :- "+expected_OrangeHRMApplicationHomePageText);

		// id="welcome" - Property of WelCome Admin Element
		By welComeAdminProperty=By.id("welcome");
		WebElement welComeAdmin=driver.findElement(welComeAdminProperty);


		String actual_OrangeHRMApplicationHomePageText=welComeAdmin.getText();
		System.out.println(" The actual Text of OrangeHRM Application HomePage is :- "+actual_OrangeHRMApplicationHomePageText);

		
		
		// Validating HomePage
		if(actual_OrangeHRMApplicationHomePageText.contains(expected_OrangeHRMApplicationHomePageText))
		{
		System.out.println(" Succesfully Navigated to OrangeHRM Application HomePage - PASS");

	
		Cell logInTestResultRowOfCell=LogInTestDataRow.createCell(2);
		logInTestResultRowOfCell.setCellValue("Succesfully Navigated to OrangeHRM Application HomePage - PASS");

		}
		else
		{
		System.out.println(" Failed to Navigat to OrangeHRM Application HomePage - FAIL");
		

		Cell logInTestResultRowOfCell=LogInTestDataRow.createCell(2);
		logInTestResultRowOfCell.setCellValue("Failed to Navigat to OrangeHRM Application HomePage - FAIL");

		}

		FileOutputStream orangeHRMApplicationLogInTestResultFile = new FileOutputStream("C:\\Users\\Thasleem\\Automation\\src\\com\\ExcelFiles\\OHRMlogInTestData.xlsx");
		Workbook.write(orangeHRMApplicationLogInTestResultFile);

		welComeAdmin.click();
		
		By logOutProperty=By.linkText("Logout");
		WebElement logOut=driver.findElement(logOutProperty);
		logOut.click();

		driver.quit();
		
		
		
	}
	
	
	
}


