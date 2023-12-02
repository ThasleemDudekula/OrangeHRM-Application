package com.ExcelOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadMultipleTestData2 {
	
	public static void main(String[] args) throws IOException {
		
		
		FileInputStream testDataFile=new FileInputStream("C:\\Users\\Thasleem\\Automation\\src\\com\\ExcelFiles\\MultipleData2.xlsx");
		
		XSSFWorkbook workBook =new XSSFWorkbook(testDataFile);
		
		XSSFSheet testDataSheet =workBook.getSheet("sheet1");
		
		// Identify the number of Active Rows in the Sheet
		int rowCount=testDataSheet.getLastRowNum();
		
		// for Going to every Active Row in the Sheet
		for(int rowIndex=0;rowIndex<=rowCount;rowIndex++)
		{
			
			// Going to a Particular Row
			Row testDataRow=testDataSheet.getRow(rowIndex);
			
			// In the Current row - finding the Number of Active Cells
			
			int rowOfCellsCount=testDataRow.getLastCellNum();
			
			// To goto Every Active Row of All the Active Cells
			
			for(int rowOfCell=0;rowOfCell<rowOfCellsCount;rowOfCell++)
			{
				
				// going to an Active Row of an Active Cell
				Cell testDataRowOfActiveCell=testDataRow.getCell(rowOfCell);
				
				String testData=testDataRowOfActiveCell.getStringCellValue();
				
				System.out.print(testData+ "  | ");
					
			}
			
			System.out.println();
			
		}
		
	}
	
}
