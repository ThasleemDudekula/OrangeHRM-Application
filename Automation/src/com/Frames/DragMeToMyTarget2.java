package com.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragMeToMyTarget2 {

	WebDriver driver;
	
	public void applicationLaunch()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Thasleem\\Automation\\Browsers\\chromedriver.exe");
	driver= new ChromeDriver();
	
	String applicationUrlAddress="https://jqueryui.com/droppable/";
	driver.get(applicationUrlAddress);

	}
	
  public void applicationClose()
{
	driver.quit();
}
	
  
  public void dragaAndDrop_GetText()
  {
	  
	  By WebPageFrameProperty=By.className("demo-frame");
	  WebElement  WebPageFrame=driver.findElement(WebPageFrameProperty);
	  
	  driver.switchTo().frame(WebPageFrame);
	  
	  
	 By DragMeToMyTargetProperty=By.id("draggable");
	 WebElement DragMeToMyTarget=driver.findElement(DragMeToMyTargetProperty); 
	  
	 // <div id="droppable" class="ui-widget-header ui-droppable">
		
	 By DroppableProperty=By.id("droppable");
	 WebElement Droppable=driver.findElement(DragMeToMyTargetProperty);
	  
	Actions action=new Actions(driver);
	action.dragAndDrop(DragMeToMyTarget,Droppable);	  
	  
	    
  }
  
  public static void main(String[] args) {
	
	  DragMeToMyTarget2 t7=new DragMeToMyTarget2();
	  
	  t7.applicationLaunch();
	  t7.dragaAndDrop_GetText();
	  
	  	  
}
	
	
	
}
