package com.SignIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSignIn_GetText {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Thasleem\\Selenium\\Browsers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		String applicationUrlAddress="http://google.com";
		driver.get(applicationUrlAddress);

	    By SignInProperty=By.className("gb_Dd");
	    WebElement SignIn=driver.findElement(SignInProperty);
	    String SignIn_Text=SignIn.getText();	
	    System.out.println("The text of an element SignIn on to the Google Homepage is:"+SignIn_Text);
	    SignIn.click();
		
		
	}

}
