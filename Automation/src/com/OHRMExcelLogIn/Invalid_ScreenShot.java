package com.OHRMExcelLogIn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invalid_ScreenShot {
	private static Object object;

	public static void main(String[] args) throws IOException {
		


		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		
		System.setProperty("webdriver.chrome.driver","./newbrowser/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println("**chrome browser launched successsfully**");
		
		driver.get(applicationUrlAddress);
		System.out.println(" Sucessfully navigated to OrangeHRM Application ");
		
		for(int rowindex=1;rowindex<=4;rowindex++)
		{
		FileInputStream orangeHRMApplicationLogInTestDataFile =new FileInputStream("./src/com/ExcelFiles/Valid-Invalid.xlsx");
		XSSFWorkbook Workbook=new XSSFWorkbook(orangeHRMApplicationLogInTestDataFile );
		XSSFSheet logInTestDataSheet =Workbook.getSheet("sheet1");
		
		Row LogInTestDataRow=logInTestDataSheet.getRow(rowindex);
		
		Cell logInTestDataRowOfUserNameCell=LogInTestDataRow.getCell(0);
		
		String userNameTestData=logInTestDataRowOfUserNameCell.getStringCellValue();
		
		//<div id="logInPanelHeading">LOGIN Panel</div>
		By loginpanelproperty=By.id("logInPanelHeading");
		
		WebElement loginpanel=driver.findElement(loginpanelproperty);
		String loginpanename=loginpanel.getText();
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
try
{
		
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

		FileOutputStream orangeHRMApplicationLogInTestResultFile = new FileOutputStream("./src/com/ExcelFiles/Valid-Invalid.xlsx");
		Workbook.write(orangeHRMApplicationLogInTestResultFile);

		welComeAdmin.click();
		
		By logOutProperty=By.linkText("Logout");
		WebElement logOut=driver.findElement(logOutProperty);
		logOut.click();
		}
		
		catch (Exception e) {
			// TODO: handle exception
		}
try
{
System.out.println("%%%%%%%%%");

By invalidproperty=By.id("spanMessage");
WebElement test=driver.findElement(invalidproperty);
System.out.println("############&&&&&&&&&&&&");

   
     System.out.println("fddd");
File invalidScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(invalidScreenShot, new File("./InvalidScreenShots/"+loginpanename+userNameTestData+passwordTestData+".png"));

}
catch (Exception e) {
// TODO: handle exception
}

		}
		
		driver.quit();
		
		
		
	

	}

	}



