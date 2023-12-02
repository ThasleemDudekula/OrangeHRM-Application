package com.ExcelOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteOperations {
	
     public static void main(String[] args) throws IOException {
	
	FileInputStream file=new FileInputStream("C:\\Users\\Thasleem\\Automation\\src\\com\\ExcelFiles\\singleTestData.xlsx");
	
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	
	XSSFSheet sheet=workbook.getSheet("sheet1");
	
	Row SheetOfNewRowCreated=sheet.createRow(4);
	
	Cell RowOfCell=SheetOfNewRowCreated.createCell(5);
	
	// setting the value into the New Rww of Cell Cereated
	RowOfCell.setCellValue("selenium");
	
	// Saving the file with the path of the location of the System with a Name along with the WorkBook
	FileOutputStream testResultFile=new FileOutputStream("C:\\Users\\Thasleem\\Automation\\src\\com\\ExcelFiles\\singleTestData.xlsx");
	
	workbook.write(testResultFile);
	
	
     }
}
