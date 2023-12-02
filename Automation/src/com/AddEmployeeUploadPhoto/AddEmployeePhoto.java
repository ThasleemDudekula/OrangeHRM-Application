package com.AddEmployeeUploadPhoto;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AddEmployeePhoto extends BaseTest {

	 @Test
	   public void addemployee() throws IOException
	   {
		   FileInputStream testdatafile = new FileInputStream("./src/com/ExcelFiles/AddEmployee.xlsx");
		   XSSFWorkbook workbook = new XSSFWorkbook(testdatafile);
		   XSSFSheet testdatasheet =workbook.getSheet("Sheet1");
		   
		   int testDataRowCount=testdatasheet.getLastRowNum();

		   for(int rowindex=1;rowindex<=3;rowindex++)
		   {
		   Row testdataRow=testdatasheet.getRow(rowindex);

		   try
		   {
		   Cell testdataofcell=testdataRow.getCell(0);

		   String loginpanelexpextedtext=testdataofcell.getStringCellValue();
		   
		   //<div id="logInPanelHeading">LOGIN Panel</div>
		        By loginpanelproperty=By.id("logInPanelHeading");
		        WebElement loginpanel=driver.findElement(loginpanelproperty);
		      
		        String actualloginpaneltext=loginpanel.getText();
		        
		        Cell actualtext=testdataRow.createCell(1);
		        actualtext.setCellValue(actualloginpaneltext);
		        
		        Cell expectedtitle=testdataRow.getCell(3);
		        String loginpageexpectedtitle=expectedtitle.getStringCellValue();
		        
		      
		         actualloginpaneltext=driver.getTitle();
		        
		        Cell actualtitle=testdataRow.createCell(4);
		        
		       actualtitle.setCellValue(actualloginpaneltext);
		      
		      
		        if(actualloginpaneltext.contains(loginpanelexpextedtext))
		        {
		       Cell testDataCellResult=testdataRow.createCell(2);
		    
		     testDataCellResult.setCellValue(" Succesfully Navigated to OrangeHRM Application HomePage - PASS");
		    
		        }
		        else
		        {
		       Cell testDataCellResult=testdataRow.createCell(2);
		    
		     testDataCellResult.setCellValue(" Succesfully Navigated to OrangeHRM Application HomePage - PASS");
		    
		       System.out.println("fail");
		        }
		        if(actualloginpaneltext.contains(loginpageexpectedtitle))
		        {
		       Cell testDataCellResult=testdataRow.createCell(5);
		       testDataCellResult.setCellValue(" Succesfully Navigated to OrangeHRM Application HomePage - PASS");
		        }
		        else
		        {
		       System.out.println("fail");
		       Cell testDataCellResult=testdataRow.createCell(5);
		       testDataCellResult.setCellValue(" Succesfully Navigated to OrangeHRM Application HomePage - PASS");
		        
		        }

		    
		     Cell testDataCell=testdataRow.getCell(6);
		    
		     String userNameTestData=testDataCell.getStringCellValue();
		    
		     // <input name="txtUsername" id="txtUsername" type="text">

		     By userNameProperty=By.id("txtUsername");
		    
		     WebElement userName=driver.findElement(userNameProperty);
		    
		     userName.sendKeys(userNameTestData);
		    
		    
		     Cell testDataCellpassword=testdataRow.getCell(7);
		    
		     String passwordTestData=testDataCellpassword.getStringCellValue();
		    
		     // <input name="txtPassword" autocomplete="off" type="password">
		    
		    
		     By passwordProperty=By.name("txtPassword");
		     WebElement password=driver.findElement(passwordProperty);
		     password.sendKeys(passwordTestData);
		    
		    
		    
		     // <input type="submit"  class="button"  value="LOGIN">
		    
		     By loginButtonProperty=By.className("button");
		    
		     WebElement loginButton=driver.findElement(loginButtonProperty);
		     loginButton.click();
		    
		    
		     Cell expected_OrangeHRMApplicationHomePageText=testdataRow.getCell(8);
		    
		    
		    
		     String ecpectedadmintext=expected_OrangeHRMApplicationHomePageText.getStringCellValue();

		     // id="welcome" - Property of WelCome Admin Element
		     By welComeAdminProperty=By.id("welcome");
		     WebElement welComeAdmin=driver.findElement(welComeAdminProperty);
		        
		     String actual_OrangeHRMApplicationHomePageText=welComeAdmin.getText();
		    
		     Cell actualwelcomeadmintext=testdataRow.createCell(9);
		     actualwelcomeadmintext.setCellValue(actual_OrangeHRMApplicationHomePageText);
		    
		     if(actual_OrangeHRMApplicationHomePageText.contains(ecpectedadmintext))
		     {
		     System.out.println(" Succesfully Navigated to OrangeHRM Application HomePage - PASS");
		     Cell testDataCellResult=testdataRow.createCell(10);
		    
		     testDataCellResult.setCellValue(" Succesfully Navigated to OrangeHRM Application HomePage - PASS");
		    
		    
		     }
		     else
		     {
		     System.out.println(" Failed to Navigat to OrangeHRM Application HomePage - FAIL");
		    
		     Cell logInTestResultRowOfCell=testdataRow.createCell(10);
		     logInTestResultRowOfCell.setCellValue("Failed to Navigat to OrangeHRM Application HomePage - FAIL");

		     }

		   //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule" id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
		    
		    
		     By pimproperty=By.linkText("PIM");
		     WebElement pimlink=driver.findElement(pimproperty);
		     pimlink.click();
		    
		   }
		   catch (Exception e) {
		   // TODO: handle exception
		   }
		     //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>
		     By addemployeeproperty=By.linkText("Add Employee");
		     WebElement addemployee=driver.findElement(addemployeeproperty);
		     addemployee.click();
		    
		     Cell expectedaddemployeetext=testdataRow.getCell(11);
		     String expectedaddemployeetextofcurrentpage=expectedaddemployeetext.getStringCellValue();
		    
		     //<div class="head">
		      // <h1>Add Employee</h1>
//		       </div>
		    
		     //<h1>Add Employee</h1>
		    
		     //<div class="head">
		       //<h1>Add Employee</h1>
		   //</div>
		     By headproperty=By.className("head");
		     WebElement headtext=driver.findElement(headproperty);
		    
		    
		     String actualtextofaddemployee=headtext.getText();
		    
		     Cell actualheadcelltext=testdataRow.createCell(12);
		     actualheadcelltext.setCellValue(actualtextofaddemployee);
		    
		     if(actualtextofaddemployee.contains(expectedaddemployeetextofcurrentpage))
		     {
		        Cell testDataCellResult=testdataRow.createCell(13);
		    
		     testDataCellResult.setCellValue(" Succesfully Navigated to OrangeHRM Application HomePage - PASS");
		    
		     }
		     else
		     {
		           Cell testDataCellResult=testdataRow.createCell(13);
		    
		     testDataCellResult.setCellValue(" Succesfully Navigated to OrangeHRM Application HomePage - PASS");
		    
		     }
		     //<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">

		     Cell firstnameofrow=testdataRow.getCell(14);
		     String firstnameteatdata=firstnameofrow.getStringCellValue();
		    
		   By firstnameproperty=By.id("firstName");
		     WebElement firstname=driver.findElement(firstnameproperty);
		    
		     firstname.click();
		    
		     firstname.sendKeys(firstnameteatdata);
		     //<input class="formInputText" maxlength="30" type="text" name="middleName" id="middleName">
		     Cell middlenameofrow=testdataRow.getCell(15);
		   String middlenametestdata=middlenameofrow.getStringCellValue();

		     By middlenameproperty=By.id("middleName");
		     WebElement middlename=driver.findElement(middlenameproperty);
		     middlename.click();
		    
		     middlename.sendKeys(middlenametestdata);

		    
		    //<input class="formInputText" maxlength="30" type="text" name="lastName" id="lastName">
		     Cell lastnameofrow=testdataRow.getCell(16);
		   String lastnamedata=lastnameofrow.getStringCellValue();


		   By lastnameproperty=By.id("lastName");
		     WebElement lastname=driver.findElement(lastnameproperty);
		     lastname.click();
		     lastname.sendKeys(lastnamedata);
		    
		     //<input class="formInputText valid" maxlength="10" type="text" name="employeeId" value="0001" id="employeeId">
		    
		     By employeeidproperty=By.id("employeeId");
		    
		     WebElement employeeid=driver.findElement(employeeidproperty);
		     employeeid.click();
		      
		     String employeeidtext=employeeid.getAttribute("value");
		    
		     Cell employeeidname=testdataRow.createCell(17);
		     employeeidname.setCellValue(employeeidtext);
		    
		     System.out.println("employee id "+employeeidname);
		    
		     //<label for="employeeId">Employee Id</label>
		    
		     //<input type="button" class="" id="btnSave" value="Save">
		     By saveproperty=By.id("btnSave");
		     WebElement save=driver.findElement(saveproperty);
		     save.click();
		      
		    
		     //<div id="profile-pic">

		     //<h1>Suresh Nagula Suresh</h1>
		     //<div class="imageHolder">
		      Cell expectedpersonaltext=testdataRow.getCell(18);
		      expectedpersonaltext.getStringCellValue();
		      
		          By headernameproperty=By.className("head");
		          WebElement headername=driver.findElement(headernameproperty);
		          String actualpersonalname=headername.getText();
		          
		          Cell personaldatacell=testdataRow.createCell(19);
		          personaldatacell.setCellValue(actualpersonalname);
		    
		          if(actualpersonalname.equals(expectedpersonaltext))
		          {
		         Cell logInTestResultRowOfCell=testdataRow.createCell(20);
		       logInTestResultRowOfCell.setCellValue("pass to Navigat to OrangeHRM Application HomePage - pass");
		   System.out.println("gsgsggggggggggggggggggggggggggg");
		          }
		          else
		          {
		         Cell logInTestResultRowOfCell=testdataRow.createCell(20);
		       logInTestResultRowOfCell.setCellValue("fail to Navigat to OrangeHRM Application HomePage - fail");
		       System.out.println("gsgsggggggggggggggggggggggggggg");
		          }
		          
		        
		          
		          Cell expectedfirstnamelvaliddata=testdataRow.getCell(14);
		          expectedfirstnamelvaliddata.getStringCellValue();
		         // <input value="Suresh" type="text" name="personal[txtEmpFirstName]"
		       //class="block default editable" maxlength="30" title="First Name"
		       //id="personal_txtEmpFirstName" disabled="disabled">
		          
		          //<div class="fieldDescription"><em>*</em> First Name</div>
		          
		          By firstdatavalidproperty=By.id("personal_txtEmpFirstName");
		          WebElement personaldatavalid=driver.findElement(firstdatavalidproperty);
		          String actualfirstnamevalidationtestdata=personaldatavalid.getAttribute("value");
		          Cell validfirstnamedata=testdataRow.createCell(21);
		          
		          validfirstnamedata.setCellValue(actualfirstnamevalidationtestdata);
		          
		          if(actualfirstnamevalidationtestdata.equals(expectedfirstnamelvaliddata))
		          {
		         Cell logInTestResultRowOfCell=testdataRow.createCell(22);
		         logInTestResultRowOfCell.setCellValue("fail to Navigat to OrangeHRM Application HomePage - fail");

		          }
		          else
		          {
		         Cell logInTestResultRowOfCell=testdataRow.createCell(22);
		         logInTestResultRowOfCell.setCellValue("fail to Navigat to OrangeHRM Application HomePage - fail");

		          }
		          
		          
		          Cell expectedmiddlenamevaliddata=testdataRow.getCell(15);
		          expectedmiddlenamevaliddata.getStringCellValue();
		      
		          
		        //<input value="Nagula" type="text" name="personal[txtEmpMiddleName]"
		       // class="block default editable" maxlength="30"
		       //title="Middle Name" id="personal_txtEmpMiddleName" disabled="disabled">

		          By middlenamevaliddatavalidproperty=By.id("personal_txtEmpMiddleName");
		          WebElement middlenamedatavalid=driver.findElement(middlenamevaliddatavalidproperty);
		          
		          String middlenamevalidtestdata=middlenamedatavalid.getAttribute("value");
		          Cell middlenamevalidatetestdata=testdataRow.createCell(23);
		          
		          middlenamevalidatetestdata.setCellValue(middlenamevalidtestdata);
		          if(middlenamevalidtestdata.equals(expectedmiddlenamevaliddata))
		          {
		         Cell logInTestResultRowOfCell=testdataRow.createCell(24);
		       logInTestResultRowOfCell.setCellValue("fail to Navigat to OrangeHRM Application HomePage - fail");

		          }
		          else
		          {
		         Cell logInTestResultRowOfCell=testdataRow.createCell(24);
		       logInTestResultRowOfCell.setCellValue("fail to Navigat to OrangeHRM Application HomePage - fail");

		          }
		        
		          
		          Cell expectedlastnamevaliddata=testdataRow.getCell(16);
		          expectedlastnamevaliddata.getStringCellValue();
		      
		             //<input value="Suresh" type="text" name="personal[txtEmpLastName]"
		            //class="block default editable" maxlength="30" title="Last Name"
		           //id="personal_txtEmpLastName" disabled="disabled">

		          By lastnamevaliddatavalidproperty=By.id("personal_txtEmpLastName");
		          WebElement lastnamedatavalid=driver.findElement(lastnamevaliddatavalidproperty);
		          
		          String lastnamevalidtestdata=lastnamedatavalid.getAttribute("value");
		          Cell lastnamevalidatetestdata=testdataRow.createCell(25);
		          
		          lastnamevalidatetestdata.setCellValue(lastnamevalidtestdata);
		          
		          
		          if(lastnamevalidtestdata.equals(expectedlastnamevaliddata))
		          {
		         Cell logInTestResultRowOfCell=testdataRow.createCell(26);
		         logInTestResultRowOfCell.setCellValue("fail to Navigat to OrangeHRM Application HomePage - fail");
		   System.out.println("@@@@@@@@@@@@@@@@@@@");
		          }
		          else
		          {
		         Cell logInTestResultRowOfCell=testdataRow.createCell(26);
		         logInTestResultRowOfCell.setCellValue("fail to Navigat to OrangeHRM Application HomePage - fail");
		         System.out.println("@@@@@@@@@@@@@@@@@@@");
		          }
		          
		          
		        //<input value="0003" type="text" name="personal[txtEmployeeId]" maxlength="10"
		        //class="editable" id="personal_txtEmployeeId" disabled="disabled">
		      
		          
		          Cell expectedvalidemployeeid=testdataRow.getCell(17);
		          expectedvalidemployeeid.getStringCellValue();
		          System.out.println("1");
		   By employeeidvalidproperty=By.id("personal_txtEmployeeId");
		    
		     WebElement employeeidvalid=driver.findElement(employeeidvalidproperty);
		     System.out.println("'2");
		      
		     String employeeidvalidtext=employeeidvalid.getAttribute("value");
		    
		     Cell employeeidvalidname=testdataRow.createCell(27);
		     employeeidvalidname.setCellValue(employeeidvalidtext);
		    System.out.println("333");
		          
		          if(employeeidvalidtext.equals(expectedvalidemployeeid))
		          {

		         Cell logInTestResultRowOfCell=testdataRow.createCell(28);
		         logInTestResultRowOfCell.setCellValue("fail to Navigat to OrangeHRM Application HomePage - fail");
		    
		          }
		          else
		          {

		         Cell logInTestResultRowOfCell=testdataRow.createCell(28);
		         logInTestResultRowOfCell.setCellValue("fail to Navigat to OrangeHRM Application HomePage - fail");
		    
		          }
		          
		          
		          
		       FileOutputStream tt = new FileOutputStream("./src/com/ExcelFiles/AddEmployee.xlsx");
		        workbook.write(tt);
		        driver.navigate().back();
		    
		   }
		        
		   //<a href="#" id="welcome" class="panelTrigger activated-welcome">Welcome Admin</a>

		   By welcomeAdminProperty=By.linkText("Welcome Admin");

		   WebElement welcomeadminlink=driver.findElement(welcomeAdminProperty);

		   welcomeadminlink.click();

		   By logoutProperty=By.linkText("Logout");

		   //check Notes

		   //WebDriverWait suresh = new WebDriverWait(driver, 10);
		   //suresh.until(ExpectedConditions.visibilityOfElementLocated(logoutProperty));

		   WebElement logout=driver.findElement(logoutProperty);
		   logout.click();
		   Row testdataRow=testdatasheet.getRow(1);

		   Cell testdataofcell=testdataRow.getCell(29);

		   String loginpanelexpextedtext=testdataofcell.getStringCellValue();

		   //<div id="logInPanelHeading">LOGIN Panel</div>
		       By loginpanelproperty=By.id("logInPanelHeading");
		       WebElement loginpanel=driver.findElement(loginpanelproperty);
		      
		       String ractualloginpaneltext=loginpanel.getText();
		      
		      
		      
		      Cell ractualtext=testdataRow.createCell(30);
		       ractualtext.setCellValue(ractualloginpaneltext);
		      if(ractualloginpaneltext.contains(loginpanelexpextedtext))
		       {
		       Cell testDataCellResult=testdataRow.createCell(31);

		   testDataCellResult.setCellValue(" Succesfully Navigated to OrangeHRM Application HomePage - PASS");

		       }
		       else
		       {
		       Cell testDataCellResult=testdataRow.createCell(31);
		    
		     testDataCellResult.setCellValue(" Succesfully Navigated to OrangeHRM Application HomePage - PASS");
		       }

		    
		       FileOutputStream tt = new FileOutputStream("./src/com/ExcelFiles/AddEmployee.xlsx");
		       workbook.write(tt);

	   }
	
	
}
