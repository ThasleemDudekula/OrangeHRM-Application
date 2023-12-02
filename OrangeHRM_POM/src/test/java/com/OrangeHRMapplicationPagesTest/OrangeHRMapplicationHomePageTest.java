package com.OrangeHRMapplicationPagesTest;

import org.testng.annotations.Test;

import com.BaseTest.Base_Test;
import com.OrangeHRMapplicationPages.OrangeHRMapplicationHomePage;
import com.OrangeHRMapplicationPages.OrangeHRMapplicationLogInPage;

public class OrangeHRMapplicationHomePageTest extends Base_Test{
	
	@Test(priority=1)
	public void OrangeHRMapplicationLogInPage_LogIn_PanelTextTest()
	{
	
		OrangeHRMapplicationHomePage OrangeHRMLogin=new OrangeHRMapplicationHomePage();
		OrangeHRMLogin.OrangeHRMapplicationLogInPage_LogIn_PanelText();
	}
	
	@Test(priority=2,description="Validating OrangeHRM Application Username - Username")
	public void OrangeHRMapplicationLoginUsernameTest()
	{
		OrangeHRMapplicationHomePage OrangeHRMLogin=new OrangeHRMapplicationHomePage();
		OrangeHRMLogin.OrangeHRMapplicationLoginUsername();
		
	}
	
	 @Test(priority=3,description="Validating OrangeHRM Application Password - Password")
	public void OrangeHRMapplicationLogInPasswordTest()
	{
		 OrangeHRMapplicationHomePage OrangeHRMLogin=new OrangeHRMapplicationHomePage();
		 OrangeHRMLogin.OrangeHRMapplicationLogInPassword();
	}
	
    @Test(priority=4,description="Validating OrangeHRM Application LogIn")
	public void OrangeHRMapplicationLogInTest()
	{
    	 OrangeHRMapplicationHomePage OrangeHRMLogin=new OrangeHRMapplicationHomePage();
    	 OrangeHRMLogin.OrangeHRMapplicationLogIn();
	}
	/*
    @Test(priority=5,description="Validating OrangeHRM Logo display")
	public void OrangeHRMlogoTest()
	{
    	 OrangeHRMapplicationHomePage OrangeHRMLogin=new OrangeHRMapplicationHomePage();
    	 OrangeHRMLogin.OrangeHRMlogo();
	}
	
	
	@Test(priority=6,description="Validating OrangeHRM Homepage title")
	public void OrangeHrmTitle()
	{
		OrangeHRMapplicationHomePage OrangeHRMLogin=new OrangeHRMapplicationHomePage();
		OrangeHRMLogin.OrangeHrmTitle();
	}
	
	@Test(priority=7,description="Validating OrangeHRM Homepage Url")
	public void OrangeHRmUrlTest()
	{
		OrangeHRMapplicationHomePage OrangeHRMLogin=new OrangeHRMapplicationHomePage();

		OrangeHRMLogin.OrangeHRmUrl();
	}
	
	@Test(priority=8)
	public void OrangeHRMhomepageTitleTest()
	{
		OrangeHRMapplicationHomePage OrangeHRMLogin=new OrangeHRMapplicationHomePage();
		OrangeHRMLogin.OrangeHRMhomepageTitle();	
	}
	
	@Test(priority=9)
	public void WelcomeAdminTest()
	{
		OrangeHRMapplicationHomePage OrangeHRMLogin=new OrangeHRMapplicationHomePage();

		OrangeHRMLogin.WelcomeAdmin();
	}
	@Test(priority=10)
	public void pimFunctionalityTest()
	{
		OrangeHRMapplicationHomePage OrangeHRMLogin=new OrangeHRMapplicationHomePage();
		OrangeHRMLogin.pimFunctionality();
	}
	
	@Test(priority=11)
	public void addEmployeeLinkFunctionalityTest()
	{
		OrangeHRMapplicationHomePage OrangeHRMLogin=new OrangeHRMapplicationHomePage();
		OrangeHRMLogin.addEmployeeLinkFunctionality();
	}
	
	@Test(priority=12)
	public void firstNameFunctionalityTest()
	{
		OrangeHRMapplicationHomePage OrangeHRMLogin=new OrangeHRMapplicationHomePage();
		OrangeHRMLogin.firstNameFunctionality("Suresh", "suri", "Thaslee");
	}
	
	
	
	*/
	
	
    }
