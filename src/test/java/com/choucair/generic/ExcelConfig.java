package com.choucair.generic;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;


public class ExcelConfig {
	

	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
	public ExcelConfig(String excelPath)
	{
		try
		{
			File src = new File(excelPath);
			
			FileInputStream fis = new FileInputStream(src);
			
			wb = new XSSFWorkbook(fis);
			
			
		}
		
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}
	
	public String getData(int sheetNumber, int row, int column)
	{
		sheet1 = wb.getSheetAt(sheetNumber);
		
		String data = sheet1.getRow(row).getCell(column).getStringCellValue();
		
		return data;
	}
	
	public void setData(int sheetNumber, int row, int column, String dato, String path) throws IOException
	{
		
		try {
			
		sheet1 = wb.getSheetAt(sheetNumber);
		
		sheet1.createRow(row).createCell(column).setCellValue(dato);
		
		FileOutputStream fout = new FileOutputStream(path);

		wb.write(fout);
		
		fout.flush();
		fout.close();

	}
	catch (Exception e)
	{
		System.out.println(e.getMessage());
	}
}
	
	
	public int getRowCount(int sheetIndex)
	{
		int row = wb.getSheetAt(sheetIndex).getLastRowNum();
		
		row = row + 1;
		
		return row;
	}
	
}
