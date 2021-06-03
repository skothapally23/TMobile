package com.An_Tmobileapp.genericLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This class contains generic methods(file handling reusable methods)
 * @author hai
 *
 */
public class FileLib {
	
	public String readPropData(String propPath, String key)throws Throwable
	{
		FileInputStream fis=new FileInputStream(propPath);
		Properties prop =new Properties();
		prop.load(fis);
		String PropValue=prop.getProperty(key, "incorrect key");
		return PropValue;
	}
	
	public String getCellData(String excelpath,String sheet, int row, int cell) throws Throwable {
		FileInputStream fis= new FileInputStream(excelpath);
		Workbook wb= WorkbookFactory.create(fis);
		String xlval=wb.getSheet(sheet).getRow(row).getCell(cell).toString();
		return xlval;
	}

	public int getRowCount(String excelpath, String sheet) throws Throwable{
	 FileInputStream fis=new FileInputStream(excelpath);
	 Workbook wb =WorkbookFactory.create(fis);
	 int rc= wb.getSheet(sheet).getLastRowNum();
	 return rc;
	}
	
	public void setCellData(String excelpath, String sheet, int row, int cell, String data) throws Throwable
	{
		FileInputStream fis=new FileInputStream(excelpath);
		Workbook wb=WorkbookFactory.create(fis);
		wb.getSheet(sheet).getRow(row).createCell(cell).setCellValue(data);
		FileOutputStream fos =new FileOutputStream(excelpath);
		wb.write(fos);
	}


}
