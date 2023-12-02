
package com.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragMeToMyTarget {

	WebDriver driver;
	
	public void applicationLaunch()
	{
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Desktop\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		
		// driver.get(applicationUrlAddress);
		
		
		// System.setProperty("webdriver.chrome.driver","C:\\Users\\Thasleem\\Automation\\Browsers\\chromedriver.exe");
		// driver=new ChromeDriver();
		
		String applicationUrlAddress="https://jqueryui.com/droppable/";
		driver.get(applicationUrlAddress);
			
	}
	
	
	public  void applicationClose()
	{
		driver.quit();
	}
	
	
	public void dragAndDrop_GetText()
	{
		
		// drag me to my target property
		// id="draggable"
		
		//Frame property
		// class ="demo-frame"
		
	   By WebPageFrameProperty=By.className("demo-frame");
	   WebElement WebPageFrame=driver.findElement(WebPageFrameProperty);
	   
	   driver.switchTo().frame(WebPageFrame);
	   
		
		WebElement dragMeToMyTarget=driver.findElement(By.id("draggable"));
		
		// droppable property
		// <div id="droppable" class="ui-widget-header ui-droppable">
		
		WebElement Droppable=driver.findElement(By.id("droppable"));
		
		Actions action=new Actions(driver); 
		// action.dragAndDrop(dragMeToMyTarget,Droppable).build().perform();
		
		
		
	   	Droppable.getText();
	    System.out.println(Droppable.getText());
		
		driver.switchTo().defaultContent();
		
		// Resizable property    <a href="https://jqueryui.com/resizable/">Resizable</a>
		
		By ResizableProperty=By.linkText("Resizable");
		WebElement Resizable=driver.findElement(ResizableProperty);
		Resizable.getText();
		Resizable.click();
		
		System.out.println(driver.getTitle());
		
		
	}
	
	public static void main(String[] args) {
		
	DragMeToMyTarget drag=new DragMeToMyTarget();
	
		drag.applicationLaunch();
		drag.dragAndDrop_GetText();
		// drag.applicationClose();
	
	
	
  }
}
