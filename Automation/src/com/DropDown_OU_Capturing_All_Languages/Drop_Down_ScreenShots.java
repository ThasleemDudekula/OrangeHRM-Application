package com.DropDown_OU_Capturing_All_Languages;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_ScreenShots {
	
	WebDriver driver;
	String applicationUrl="https://www.osmania.ac.in/";
	
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "./newbrowser/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
		driver.get(applicationUrl);
		
	}

	public void selectlanguages() throws IOException
	{
		By selectlanguageproperty=By.id("gtranslate_selector");
		WebElement option=driver.findElement(selectlanguageproperty);
		
		//Select languageselection = new Select(seletlanguage);
		
		//languageselection.selectByIndex(2);
		
		//languageselection.selectByValue("en|te");
		//languageselection.selectByVisibleText("Arabic");
		By linkstagproperty=By.tagName("option");
		List<WebElement> alllanguages=option.findElements(linkstagproperty);
		
		//List<WebElement> alllanguages=option.getAllSelectedOptions();
		int namescount=alllanguages.size();
		for(int linksIndex=0;linksIndex<namescount;linksIndex=linksIndex+1)
		{
			String alllanguagesnames=alllanguages.get(linksIndex).getText();
			
			Select languageselection = new Select(option);
			languageselection.selectByIndex(linksIndex);
			
			File capturing=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(capturing, new File("./ouscreenshots/"+alllanguagesnames+".png"));
			
		}
	
		
		System.out.println();

	}

public static void main(String[] args) throws IOException {
	
	Drop_Down_ScreenShots optionspress = new Drop_Down_ScreenShots();
	optionspress.setup();
	optionspress.selectlanguages();
}








	
	

}
