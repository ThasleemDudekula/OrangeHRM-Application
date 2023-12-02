package com.ExcelOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ValueOfTestData {

	public static void main(String[] args) throws IOException {

		FileInputStream file=new FileInputStream("C:\\Users\\Thasleem\\Automation\\src\\com\\TestData\\excelsheet.xlsx");

		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet TestDataSheet=workbook.getSheet("sheet1");
		
		Row TestDataRow=TestDataSheet.getRow(0);
		
		Cell TestDataRowOfCell=TestDataRow.getCell(0);
		
		String Data=TestDataRowOfCell.getStringCellValue();
		
		System.out.println(Data);

	}

}
