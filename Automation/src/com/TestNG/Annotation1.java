package com.TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation1 {

	@BeforeTest(description="Gmail Application Launch")
	public void gmainApplicationLaunch()
	{
		System.out.println("* gmail application launch succesfully *");
	}
	
	@Test(priority=1,description=" Validating LogIn functionality")
	public void gmailApplicationLogInTest()
	{
		System.out.println(" LogIn functionality successful");
	}
	
	@Test(priority=2,description= " Validating InBox Functionality")
	public void gmailApplicationInBoxTest()
	{
		System.out.println(" InBox Functionality successful ");
	}
	
	@Test(priority=3,description= " Validating compose Functionality")
  public void gmailApplicationComposeMailTest()
  {
	  System.out.println(" ComposeMail functionality succesfull");
  }
	
	@Test(enabled=false,description= " Validating Drafts Functionality")
  public void gmailApplicationDraftsTest()
  {
	  System.out.println(" Drafts functionality test succesful");
  }
	
	@Test(priority=5,description= " Validating sentMail Functionality")
  public void gmailApplicationSentMailTest()
  {
	  System.out.println(" Sent mail funcionality test succesfull");
  }
	
	@AfterTest(description= " Gmail Application close ")
  public void gmailApplicationClose()
  {
	  System.out.println("****** Gmail appication closed succesfully ****");
  }
  
  
	
	
}
