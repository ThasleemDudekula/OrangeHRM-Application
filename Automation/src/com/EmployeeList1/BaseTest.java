package com.EmployeeList1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	@BeforeTest
	public void setup() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","./newbrowser/chromedriver.exe");
		driver= new ChromeDriver();
		
		FileInputStream testdatafile = new FileInputStream("./src/com/ExcelFiles/newwebtable.xlsx");
	   	XSSFWorkbook workbook = new XSSFWorkbook(testdatafile);
	   	XSSFSheet testdatasheet=workbook.createSheet("webtable2");
	   	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println("**chrome browser launched successsfully**");
		
		driver.get(applicationUrlAddress);
		System.out.println(" Sucessfully navigated to OrangeHRM Application ");
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
	
	
	

}
