
package org.peru;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Class1 {
	public static void main(String[] args) throws FileNotFoundException {
        File f= new File("C:\\Users\\jb\\selinium\\Demo\\Files\\jb2.xls");
        FileInputStream fileInputStream=new FileInputStream(f);
        Workbook workbook=new XSSFWorkbook();
        Sheet sheet = workbook.getSheet("Sheet1");
        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
        	Row row = sheet.getRow(i);
        	for (int j = 0; j <row.getPhysicalNumberOfCells(); j++) {
        		Cell cell = row.getCell(j);
        		int type = cell.getCellType();
				if (type==1) {
					String value = cell.getStringCellValue();
				} else if (DateUtil.isCellDateFormatted(cell)) {
                  SimpleDateFormat date=new SimpleDateFormat("dd-MMM");
                  Date value = cell.getDateCellValue();
				
					
				} {

				}
			}
			
		}
	}
}
