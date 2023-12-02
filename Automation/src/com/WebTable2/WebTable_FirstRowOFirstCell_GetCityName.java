package com.WebTable2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebTable_FirstRowOFirstCell_GetCityName extends BaseTest {

	@Test
	public void getCityName()
	{
		
		// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		
		By CityNameProperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]");
		WebElement CityName=driver.findElement(CityNameProperty);
		String CityNameText=CityName.getText();
		
		System.out.println("The city name is:"+CityNameText);
		
	}
	
	
}
