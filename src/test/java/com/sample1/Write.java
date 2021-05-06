package com.sample1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Write {
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\jb\\selinium\\Demo\\Files\\jb2.xls");
		FileInputStream stream =new FileInputStream(file);
		Workbook workbook=new HSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(6);
		Cell cell = row.getCell(0);
		String value = cell.getStringCellValue();
		System.out.println(value);
		if (value.equals("jb")) {
			cell.setCellValue("JB");	
		}
		if (value.equals("JB")) {
			cell.setCellValue("jb");
			
		}
		FileOutputStream stream1=new FileOutputStream(file);
		workbook.write(stream1);
		 
	}

}
