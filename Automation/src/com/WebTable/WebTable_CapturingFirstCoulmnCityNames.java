package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebTable_CapturingFirstCoulmnCityNames extends BaseTest {
	
	@Test
	public void CapturingFirstCoulmnCityNames()
	{
		// First row of first Cell
		// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[2]/td[1]
		
		// Last Row of first Cell
		// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]
		
		for(int index=1;index<=36;index++)
		{
			By FirstCoulmnCityNameProperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+index+"]/td[1]");
			WebElement CityName=driver.findElement(FirstCoulmnCityNameProperty);
			String cityNameText=CityName.getText();
			
			System.out.println(cityNameText);
			
		}
		
		
		
	}
	
	
	
	

}
