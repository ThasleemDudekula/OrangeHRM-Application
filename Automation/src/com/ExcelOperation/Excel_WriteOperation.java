package com.ExcelOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_WriteOperation {

	public static void main(String[] args) throws IOException {
		
		FileInputStream testDataFile=new FileInputStream(".\\src\\com\\ExcelFiles\\multipleData.xlsx");
		
		XSSFWorkbook workBook=new XSSFWorkbook(testDataFile);
		
		XSSFSheet testDataSheet=workBook.getSheet("Sheet2");
		
		Row testDataSheetRow=testDataSheet.createRow(4);
		
		Cell rowOfCell=testDataSheetRow.createCell(4);
		rowOfCell.setCellValue("selenium");
		
        Cell cell=testDataSheetRow.createCell(6);
        cell.setCellValue("Testing");
        
        FileOutputStream testResultFile=new FileOutputStream(".\\src\\com\\ExcelFiles\\multipleData.xlsx");
        workBook.write(testResultFile);
        }

}
