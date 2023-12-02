package com.ExcelOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_SignleTestData {

	public static void main(String[] args) throws IOException {
		
		//Identify the file(Excel File) in the system
		
		FileInputStream excelTestDataFile=new FileInputStream("C:\\Users\\Thasleem\\Automation\\src\\com\\TestData\\testData.xlsx");
		
		// Identify theWorkbook in the File
		
		XSSFWorkbook workbook=new XSSFWorkbook(excelTestDataFile);
		
		// Identify a perticular sheet in the workbook
		
		XSSFSheet testdataSheet=workbook.getSheet("sheet1");
		
		// Identify the Row in the sheet
		
		Row sheetRow=testdataSheet.getRow(0);
		
		// Identify the Row of Cell in the Row
		
		Cell sheetRowOfCell=sheetRow.getCell(0);
		
		// get the data from the Row of a cell
		
		 String testData=sheetRowOfCell.getStringCellValue();
		
		 System.out.println(testData);
		 
	
		
	}
	
	
	
	
}
