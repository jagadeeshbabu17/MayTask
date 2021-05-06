package com.sample1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Create {
	public static void main(String[] args) throws IOException {
		File file =new File("C:\\Users\\jb\\selinium\\Demo\\Files\\jb8.xls");
		Workbook workbook=new HSSFWorkbook();
		Sheet sheet = workbook.createSheet();
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("jb");
		FileOutputStream stream=new FileOutputStream(file);
		workbook.write(stream);
		}

}
