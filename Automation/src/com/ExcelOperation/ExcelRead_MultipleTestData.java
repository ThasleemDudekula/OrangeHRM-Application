package com.ExcelOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead_MultipleTestData {

	/*public static void main(String[] args) {

		FileInputStream testDataFile = new FileInputStream(
				"C:\\Users\\Thasleem\\Automation\\src\\com\\ExcelFiles\\multipleData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(testDataFile);
		XSSFSheet testDataSheet = workBook.getSheet("Sheet2");

		// identifying the number of active rows in the sheet
		int rowsCount=testDataSheet.getLastRowNum();

		// to goto every active row of the sheet
		for (int rowIndex=0; rowIndex<=rowsCount; rowIndex++)
		{
			// going to a perticular row in the sheet
			Row row = testDataSheet.getRow(rowIndex);
           //In the row identify the number of Acctive Cells
			int rowOfCellsCount=row.getLastCellNum();

			//  to go to an active row of all the active cells
			for (int rowOfCellIndex = 0; rowOfCellIndex < rowOfCellsCount; rowOfCellIndex++)
			{
				// going to a perticular Active row of active cell
				Cell rowOfCell = row.getCell(rowOfCellIndex);

				// get the value from the active row of active cell
				String testData = rowOfCell.getStringCellValue();
				System.out.println(testData + "  |   ");

			}

			System.out.println();

		}

	}*/
		
		
		
		public static void main(String[] args) throws IOException  {

			FileInputStream testDataFile = new FileInputStream("C:\\Users\\Thasleem\\Automation\\src\\com\\ExcelFiles\\multipleData.xlsx");
			XSSFWorkbook workBook = new XSSFWorkbook(testDataFile);
			XSSFSheet testDataSheet = workBook.getSheet("Sheet2");

			// Identifying the number of Active Rows in the Sheet
			int rowsCount=testDataSheet.getLastRowNum();

			// to goto every Active Row of the Sheet
			for(int rowIndex=4;rowIndex<=rowsCount;rowIndex++)
			{
			// going to a Particular Row in the Sheet
			Row row=testDataSheet.getRow(rowIndex);

			// In the Row - identify the number of Active Cells
			int rowOfCellsCount=row.getLastCellNum();

			// To goto an Active Row of All the Active Cells
			for(int rowOfCellIndex=1;rowOfCellIndex<rowOfCellsCount;rowOfCellIndex++)
			{
			// going to a particular Active Row of Active Cell
			Cell rowOfCell=row.getCell(rowOfCellIndex);

			// get the value from the Active Row of Active Cell
			String testData=rowOfCell.getStringCellValue();
			System.out.print(testData+" | ");

			}
			System.out.println();

			}

			}

		
		
		

}
