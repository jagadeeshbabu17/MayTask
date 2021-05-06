package com.sample1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Amazon {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		WebElement txtBox = driver.findElement(By.id("twotabsearchtextbox"));
		txtBox.sendKeys("iphone 12", Keys.ENTER);
		List<WebElement> elements = driver
				.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		for (int i = 0; i < elements.size(); i++) {
			WebElement ele = elements.get(i);
			String text = ele.getText();
			System.out.println(text);
		}
		File file = new File("C:\\Users\\jb\\selinium\\Demo\\Files\\jb9.xls");
		Workbook workbook = new HSSFWorkbook();
		Sheet sheet = workbook.createSheet("sheet1");
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("phones");
		for (int i = 1; i < elements.size(); i++) {
			Row r = sheet.createRow(i);
			Cell c = r.createCell(0);
			c.setCellValue(elements.get(i - 1).getText());
		}
		FileOutputStream outputStream = new FileOutputStream(file);
		workbook.write(outputStream);
		 System.out.println("done");
		driver.quit();
	}
}
