package com.sample1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excel2 {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\jb\\selinium\\Demo\\Files\\jb2.xls");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new HSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Sheet1");
		for(int i=0;i<sheet.getPhysicalNumberOfRows();i++) {
			Row row = sheet.getRow(i);
			for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
				Cell cell = row.getCell(j);
				//System.out.println(cell);
				int type = cell.getCellType();
				if(type==1) {
					String name = cell.getStringCellValue();
					System.out.println(name);
				}
				if(type==0) {
					double d = cell.getNumericCellValue();
					long l=(long) d;
					String name=String.valueOf(l);
					System.out.println(name);
				}
				
				
			}
		}
	}
}
