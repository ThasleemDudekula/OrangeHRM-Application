package com.MouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_HelloSignIn {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Thasleem\\Selenium\\Browsers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		String applicationUrlAddress="http://amazon.in";		
		driver.get(applicationUrlAddress);
		
		//<span id="nav-link-accountList-nav-line-1" 
		//class="nav-line-1 nav-progressive-content">Hello, sign in</span>
		
		By HellosignInProperty=By.id("nav-link-accountList-nav-line-1");
		WebElement HellosignIn=driver.findElement(HellosignInProperty);		
		
		Actions action=new Actions(driver);
		action.moveToElement(HellosignIn).build().perform();
		
		//<a id="nav_prefetch_yourorders" href="/gp/css/order-history?ref_=nav_AccountFlyout_orders" 
		//class="nav-link nav-item"><span class="nav-text">Your Orders</span></a>
		
		By yourOrdersProperty=By.id("nav_prefetch_yourorders");
	    WebElement yourOrders=driver.findElement(yourOrdersProperty);
	    yourOrders.click();
		
	    System.out.println(driver.getTitle());

	    driver.quit();
		
	    
	    /*System.setProperty("webdriver.chrome.driver","C:\\Users\\Thasleem\\Selenium\\Browsers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		String applicationUrlAddress="http://amazon.in";		
		driver.get(applicationUrlAddress);
		
		id="icp-nav-flyout"
	    
		By LanguageProperty=By.id("icp-nav-flyout");
	   WebElement Language=driver.findElement(LanguageProperty);
	   
	   //<i class="icp-radio"></i>
	   
	   By TeluguLangProperty=By.className("icp-radio");
	   WebElement TeluguLan=driver.findElement(TeluguLangProperty);
	   TeluguLan.click();
	   
	   System.out.println(driver.getTitle());
	   
	   driver.quit();*/
	    
	    
	    
	    
		
		
	    
	    
		
		
		
		
		
		
		

	}

}
