package com.SignIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_SignIn {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Thasleem\\Selenium\\Browsers\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	
	String applicationUrlAddress="http://google.com";
	driver.get(applicationUrlAddress);

    By SignInProperty=By.className("gb_Dd");
    WebElement SignIn=driver.findElement(SignInProperty);
    
    SignIn.click();
    
    //<span class="gb_Dd">Sign in</span>
    
    
    
    
    
    
    
    
	
    /*By signInProperty=By.linkText("Sign in");
    WebElement signIn=driver.findElement(signInProperty);
    String signIn_Text=signIn.getText();
    System.out.println(" The text of an Element Sign In on the Google HomePage is :- "+signIn_Text);

    signIn.click();*/

		
	}
}