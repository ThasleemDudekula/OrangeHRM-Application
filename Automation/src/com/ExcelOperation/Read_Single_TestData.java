package com.ExcelOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Single_TestData {

	public static void main(String[] args) throws IOException {
		
		// Identify the file 
		FileInputStream testDataFile=new FileInputStream("C:\\Users\\Thasleem\\Automation\\src\\com\\ExcelFiles\\singleTestData.xlsx");
		
		// identify the workbook in the file
		XSSFWorkbook workbook=new XSSFWorkbook(testDataFile);
		
		// identify the sheet in the workbook
		XSSFSheet testDataSheet=workbook.getSheet("sheet1");
		
		// identify a perticular row in the sheet
		Row testDataOfRow=testDataSheet.getRow(0);
		
		// identify a perticular cell in the row
		Cell RowOfCell=testDataOfRow.getCell(0);
		
		// get the data from the row of the cell
		String testData=RowOfCell.getStringCellValue();
		
		System.out.println(testData);
		
		// identify the 2nd row of 2nd cell
		Row secondRow=testDataSheet.getRow(2);
		Cell secondRowOfCell=secondRow.getCell(2);
		System.out.println(secondRowOfCell);
		
		
	}
	
	
}
