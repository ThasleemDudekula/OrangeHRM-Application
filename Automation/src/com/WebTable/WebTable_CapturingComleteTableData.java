package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebTable_CapturingComleteTableData extends BaseTest {
	
	/*
	public void CapturingComleteTableData()
	{
		// capturing first row of first cell
		//  /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		
		// capturing last row of last cell
		//  /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]
		
		// to go to every row
		
		for(int rowindex=1;rowindex<=36;rowindex++)
		{
			for(int rowofCellindex=1;rowofCellindex<=8;rowofCellindex++)
			{
				By tableDataProeprty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+rowindex+"]/td["+rowofCellindex+"]");
				
				WebElement tableData=driver.findElement(tableDataProeprty);
				String tableDataText=tableData.getText();
				System.out.print(tableDataText+" |  ");
				
			}
			System.out.println();	
		}
		*/
	
	
	@Test
	public void capturingCompleTableData()
	{

	// FIrst row of FIrst Cell
	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]

	// Last Row of Last CEll
	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]

	String xpathExrpessionPart1="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
	String xpathExrpessionPart2="]/td[";
	String xpathExrpessionPart3="]";

	// to goto every ROw
	for(int rowIndex=1;rowIndex<=36;rowIndex++)
	{
	// of every should goto all its respective cells
	for(int rowOfCellIndex=1;rowOfCellIndex<=8;rowOfCellIndex++)
	{
	/*
	By tableDataProeprty=By.xpath
	("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+rowIndex+"]/td["+rowOfCellIndex+"]");
	                */
	By tableDataProeprty=By.xpath(xpathExrpessionPart1+rowIndex+xpathExrpessionPart2+rowOfCellIndex+xpathExrpessionPart3);


	WebElement tableData=driver.findElement(tableDataProeprty);
	String tableDataText=tableData.getText();
	System.out.print(tableDataText+"  |  ");
	}
	System.out.println();
	}

		
		
	}
	
	
	

}
