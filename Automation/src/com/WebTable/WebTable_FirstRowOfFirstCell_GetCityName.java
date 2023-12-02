package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebTable_FirstRowOfFirstCell_GetCityName extends BaseTest {

	@Test
	public void getCityName()
	{
			
	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a	
		
		 
		
		// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
		By FirstRowOfFirstCell_CityNameProperty=By.xpath("//a[text()='Accra']");
		WebElement CityName=driver.findElement(FirstRowOfFirstCell_CityNameProperty);
		String CityNameText=CityName.getText();
		System.out.println("The city name is:"+CityNameText);
		
		/*
		By webTable_FirstRowOfFirstCell_CityNameProperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]");
		WebElement cityName=driver.findElement(webTable_FirstRowOfFirstCell_CityNameProperty);
		String cityNameText=cityName.getText();

		System.out.println(" The City name is :- "+cityNameText);
*/
	}
	
	
	  
	
	
	
	
}
