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

public class Read {
	public static void main(String[] args) throws IOException {
		File file =new File("C:\\Users\\jb\\selinium\\Demo\\Files\\jb2.xls");
		FileInputStream inputStream = new  FileInputStream(file);
		Workbook workbook=new HSSFWorkbook(inputStream);
		Sheet sheet = workbook.getSheet("Sheet1");
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				int type = cell.getCellType();
				if (type==1) {
					String name = cell.getStringCellValue();
					System.out.println(name);
				}
				if (type==0) {
					double d = cell.getNumericCellValue();
					long l=(long) d;
					String valueOf = String.valueOf(l);
					System.out.println(valueOf);
					
				}
					
					
				}
				
			}
		}
	}

