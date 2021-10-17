package com.Geetha.SecurePay.generics;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excellibrary implements Autoconstant
{
	
	public static String getcellvalue(String sheet,int row,int cell) throws IOException
	{
		FileInputStream fis=new FileInputStream(excel_path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		String cellvalue=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();		
		return cellvalue;
	}

}
