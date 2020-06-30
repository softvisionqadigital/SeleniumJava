package com.herokuapp.theinternet.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.DataProvider;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelDataProvider {

	@DataProvider(name = "ExcelReader")
	public Object[][] loginData() {
		String pathname = System.getProperty("user.dir") + "\\src\\test\\resources\\DataProvider\\NegativeLogin.xls";
		String sheetname = "NegativeTest";
		Object[][] arrayObject = ExcelReader(pathname, sheetname);
		return arrayObject;
	}

	public String[][] ExcelReader(String pathname, String sheetname) {
		String[][] data = null;
		try {
			FileInputStream inputStream = new FileInputStream(pathname); // Excel sheet file location get mentioned here
			Workbook workbook = Workbook.getWorkbook(inputStream);// get my workbook
			Sheet sheet = workbook.getSheet(sheetname);// get my sheet from workbook
			int RowNum = sheet.getRows();// count my number of Rows
			int ColNum = sheet.getColumns(); // get last ColNum
			data = new String[RowNum][ColNum]; // pass my count data in array
			for (int i = 0; i < RowNum; i++) // Loop work for Rows
			{
				for (int j = 0; j < ColNum; j++) // Loop work for colNum
				{
					data[i][j] = sheet.getCell(j, i).getContents();
				}
			}
		} catch (FileNotFoundException e) {
			throw new RuntimeException("File " + pathname + " was not found.");
		} catch (IOException e) {
			throw new RuntimeException("Could not read " + pathname + " file.");
		} catch (BiffException e) {
			e.printStackTrace();
		}
		return data;
	}
}
