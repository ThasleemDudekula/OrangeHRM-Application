package com.OrangeHRMapplicationPagesTest;

import org.testng.annotations.Test;

import com.BaseTest.Base_Test;
import com.OrangeHRMapplicationPages.OrangeHRMapplicationLogInPage;

public class OrangeHRMapplicationLogInPageTest extends Base_Test {

	@Test(priority=1,description="Validating OrangeHRM Application LogIn Page Text - LOGIN Panel")
	public void OrangeHRMapplicationLogInPage_LogIn_PanelTextTest()
	{
		
		OrangeHRMapplicationLogInPage orangeHRMapplication=new OrangeHRMapplicationLogInPage();
		orangeHRMapplication.OrangeHRMapplicationLogInPage_LogIn_PanelText();
			
	}
	
	 @Test(priority=12,description="Validating OrangeHRM Application Username - Username")
	public void OrangeHRMapplicationLoginUsernameTest()
	{
		OrangeHRMapplicationLogInPage orangeHRMapplication=new OrangeHRMapplicationLogInPage();
		orangeHRMapplication.OrangeHRMapplicationLoginUsername();
		
	}
	
	 @Test(priority=13,description="Validating OrangeHRM Application Password - Password")
	public void OrangeHRMapplicationLogInPasswordTest()
	{
		OrangeHRMapplicationLogInPage orangeHRMapplication=new OrangeHRMapplicationLogInPage();
		orangeHRMapplication.OrangeHRMapplicationLogInPassword();
	}
	
    @Test(priority=14,description="Validating OrangeHRM Application LogIn")
	public void OrangeHRMapplicationLogInTest()
	{
		OrangeHRMapplicationLogInPage orangeHRMapplication=new OrangeHRMapplicationLogInPage();
		orangeHRMapplication.OrangeHRMapplicationLogIn();
	}
	
	@Test(priority=2,description="Validating OrangeHRM Logo display")
	public void OrangeHRMlogoTest()
	{
		OrangeHRMapplicationLogInPage orangeHRMapplication=new OrangeHRMapplicationLogInPage();
		orangeHRMapplication.OrangeHRMlogo();
	}
	
	
	@Test(priority=3,description="Validating OrangeHRM Homepage title")
	public void OrangeHrmTitle()
	{
		OrangeHRMapplicationLogInPage orangeHRMapplication=new OrangeHRMapplicationLogInPage();
		orangeHRMapplication.OrangeHrmTitle();
	}
	
	@Test(priority=4,description="Validating OrangeHRM Homepage Url")
	public void OrangeHRmUrlTest()
	{
		OrangeHRMapplicationLogInPage orangeHRMapplication=new OrangeHRMapplicationLogInPage();
		orangeHRMapplication.OrangeHRmUrl();
	}
	
	@Test(priority=5,description="Validating OrangeHRM Homepage Alternate LogIn")
	public void OrngeHRMAlternativeLoginnnTest()
	{
		OrangeHRMapplicationLogInPage orangeHRMapplication=new OrangeHRMapplicationLogInPage();
		orangeHRMapplication.OrngeHRMAlternativeLoginnn();
	}
	
	@Test(priority=6,description="Validating OrangeHRM Homepage SelectDropDown")
	public void OrangeHRMhomepageSelectDropDown()
	{
		OrangeHRMapplicationLogInPage orangeHRMapplication=new OrangeHRMapplicationLogInPage();
		orangeHRMapplication.OrangeHRMhomepageSelectDropDown();
	}
	
	@Test(priority=7,description="Validating OrangeHRM Homepage LogIn Link")
	public void OrangeHRMhomepageLogInLinkTest()
	{
		OrangeHRMapplicationLogInPage orangeHRMapplication=new OrangeHRMapplicationLogInPage();
		orangeHRMapplication.OrangeHRMhomepageLogInLink();
	}
	
	@Test(priority=8)
	public void OrangeHRMhomepageLinkedInLinkTest()
	{
		OrangeHRMapplicationLogInPage orangeHRMapplication=new OrangeHRMapplicationLogInPage();
		orangeHRMapplication.OrangeHRMhomepageLinkedInLink();
	}
	
	@Test(priority=9)
	public void OrangeHRMhomepageFacebooklinkTest()
	{
		OrangeHRMapplicationLogInPage orangeHRMapplication=new OrangeHRMapplicationLogInPage();
		orangeHRMapplication.OrangeHRMhomepageFacebooklink();
	}
	
	
	@Test(priority=10)
	public void OrangeHRMapplicationTwitterLinkTest()
	{
		OrangeHRMapplicationLogInPage orangeHRMapplication=new OrangeHRMapplicationLogInPage();
		orangeHRMapplication.OrangeHRMapplicationTwitterLink();
	}
	
	@Test(priority=11)
	public void OrangeHRMapplicationYouTubeLinkTest()
	{
		OrangeHRMapplicationLogInPage orangeHRMapplication=new OrangeHRMapplicationLogInPage();
		orangeHRMapplication.OrangeHRMapplicationYouTubeLink();
	}
	
	
	@Test(priority=12)
	public void OrangeHRMhomepageTitleTest()
	{
		OrangeHRMapplicationLogInPage orangeHRMapplication=new OrangeHRMapplicationLogInPage();
		orangeHRMapplication.OrangeHRMhomepageTitle();	
	}
	
	@Test(priority=13)
	public void WelcomeAdminTest()
	{
		OrangeHRMapplicationLogInPage orangeHRMapplication=new OrangeHRMapplicationLogInPage();
		orangeHRMapplication.WelcomeAdmin();
	}
	
	
}
