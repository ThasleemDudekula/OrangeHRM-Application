      package com.SignIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	   public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Thasleem\\Selenium\\Browsers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
     	String applicationUrlAddress="http://google.com";
     	driver.get(applicationUrlAddress);
     	
     	
     	/* <a class="gb_za gb_jd gb_Ld gb_ie" href="https://accounts.google.com/ServiceLogin?hl=en&amp;
     	  passive=true&amp;continue=https://www.google.com/%3Fgws_rd%3Dssl&amp;ec=GAZAmgQ" 
     	  target="_top"><span class="gb_Hd">Sign in</span></a>
     	*/
     	
     	
     	/*By signInProperty=By.className("gb_za gb_jd gb_Ld gb_ie");
     	WebElement signIn=driver.findElement(signInProperty);*/
     	
     	By signInProperty=By.linkText("Sign in");
     	WebElement signIn=driver.findElement(signInProperty);
     	
     	String signhrefAttributeValue=signIn.getAttribute("href");
     	System.out.println("The href Attribute value of signIn element is:"+signhrefAttributeValue);
     	
     	String signInClassAttributeValue=signIn.getAttribute("class");
     	System.out.println("The class Attribute value of signIn element is"+signInClassAttributeValue);
     	
     	String signIn_Text=signIn.getText();
     	System.out.println("The text of an element of signin is:"+signIn_Text);
     	signIn.click();
     	
     	driver.quit();
     	
      }

   }
