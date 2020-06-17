package com.base;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {
	
	public static int rowC;
	public static int cellC;
	
	public static String[][] getExcelData(String filepath, String Sheetname) throws IOException{
		
			FileInputStream input = new FileInputStream(filepath);
			
			Workbook wb = WorkbookFactory.create(input);
			Sheet sheet1 = wb.getSheet(Sheetname);
			int rowcount = sheet1.getPhysicalNumberOfRows();
			int cellcount = sheet1.getRow(0).getLastCellNum();
			System.out.println("rowcount is "+rowcount);
			System.out.println("cellcount is "+ cellcount);
			String[][] data = new String[rowcount][cellcount];
			for(int i=1;i<rowcount;i++){
				Row row = sheet1.getRow(i);
				int Cellc = row.getPhysicalNumberOfCells();
				System.out.println("inside cell count is "+Cellc);
				
				for(int j=0;j<Cellc;j++){
					Cell cell = row.getCell(j);
					System.out.println("Dummy1");
					if(cell.getCellType() == CellType.STRING){
						
						System.out.println("dummy2");
						data[i-1][j] = cell.getStringCellValue();
						
					}
					else{
						data[i-1][j] = String.valueOf(cell.getNumericCellValue());
					}
					
				}
				
			}
			return data;
		
	}
	
	public static int RowCount(String filepath, String sheetname) throws  IOException{
		FileInputStream input = new FileInputStream(filepath);
		
		Workbook wb = WorkbookFactory.create(input);
		Sheet sheet1 = wb.getSheet(sheetname);
		
		int rowC = sheet1.getLastRowNum();
		System.out.println(rowC);
		return rowC;
		
	}
	
	public static int CellCount(String filepath, String sheetname, int k) throws  IOException{
		FileInputStream input = new FileInputStream(filepath);
		
		Workbook wb = WorkbookFactory.create(input);
		Sheet sheet1 = wb.getSheet(sheetname);
		
		int cellC = sheet1.getRow(k).getLastCellNum();
		System.out.println(cellC);
		return cellC;
		
	}

}
