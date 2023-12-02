package com.WebTable2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CapturingCompleTableData extends BaseTest{

	@Test
	public void CompleteTable() throws IOException
	{
		//  /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[7]
		
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody
		 //Identifying the WebTable
		// /html/body/div[5]/section[1]/div

		By webTableProperty=By.xpath("/html/body/div[5]/section[1]/div");
		WebElement webTable=driver.findElement(webTableProperty);

		By rowProperty=By.tagName("tr");
		
		List<WebElement>rows=webTable.findElements(rowProperty);

		
	   	
	   	System.out.println("5555555555555");
		for(int rowIndex=1;rowIndex<=36;rowIndex++)
		{
		
		WebElement webTableRow=rows.get(rowIndex);

		By rowOfCellProperty=By.tagName("td");

		List<WebElement>rowOfCells=webTableRow.findElements(rowOfCellProperty);
	
		
	   	
		for(int rowOfCellIndex=1;rowOfCellIndex<8;rowOfCellIndex++)
		{
		WebElement rowOfCell=rowOfCells.get(rowOfCellIndex);
		String data=rowOfCell.getText();
		System.out.print(data);
		
		FileInputStream testdatafile= new FileInputStream("./src/com/ExcelFiles/newwebtable.xlsx");
	  	XSSFWorkbook workbook = new XSSFWorkbook(testdatafile);
	  	XSSFSheet testdatasheet =workbook.getSheet("Sheet1");
	  	Row testdatarow =testdatasheet.getRow(rowIndex);
	  	Cell testdatacell=testdatarow.createCell(rowOfCellIndex);
	  	testdatacell.setCellValue(data);
	  	FileOutputStream result = new FileOutputStream("./src/com/ExcelFiles/newwebtable.xlsx");
	  	workbook.write(result);
	 

		}
		System.out.println();
		}	       
	       }
	
	
	
	
}
