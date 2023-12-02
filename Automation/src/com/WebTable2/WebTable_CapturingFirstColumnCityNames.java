package com.WebTable2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebTable_CapturingFirstColumnCityNames extends BaseTest{

	@Test
	public void CapturingFirstColumnCityNames()
	{
		
		// First row of first cell city name
	//	/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		
	// last row of first cell city name
	//	/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]/a
		
		for(int rowindex=1;rowindex<=36;rowindex++)
		{
		By firstCoulmnCityNameProperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+rowindex+"]/td[1]/a");
		WebElement firstCoulmnCityName=driver.findElement(firstCoulmnCityNameProperty);
		String FirstColumnCityNames=firstCoulmnCityName.getText();
		
		System.out.println(FirstColumnCityNames);
		
		}
	}
	
}
