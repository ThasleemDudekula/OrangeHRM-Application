package com.Excel_Pracrice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel_Practice {

	
	@Test
	public void excel() throws IOException
	{
	FileInputStream testfile = new FileInputStream("./src/com/ExcelFiles/excelsheet.xlsx");
	XSSFWorkbook workbook = new XSSFWorkbook(testfile);
	
	XSSFSheet tesrdatasheet =workbook.getSheet("Sheet1");
	Row rowssheet=tesrdatasheet.getRow(0);
	
	Cell rowofcell=rowssheet.getCell(0);
	
	
	
	}
	
	
}
