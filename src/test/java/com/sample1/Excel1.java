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

public class Excel1 {
	public static void main(String[] args) throws IOException  {
		File file =new File("C:\\Users\\jb\\selinium\\Demo\\Files\\jb2.xls");
		FileInputStream stream=new FileInputStream(file);
		Workbook workbook=new HSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Sheet3");
		Row row = sheet.getRow(6);
		Cell cell = row.getCell(7);
		String value = cell.getStringCellValue();
		System.out.println(value);
		int no = sheet.getPhysicalNumberOfRows();
		System.out.println(no);
		int count = row.getPhysicalNumberOfCells();
		System.out.println(count);
		for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
			System.out.println(i);
			Cell cell2 = row.getCell(i);
			System.out.print(cell2);
			System.out.println();
		}

	}
}
