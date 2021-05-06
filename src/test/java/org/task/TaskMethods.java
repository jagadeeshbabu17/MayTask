package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.task.BaseClass;

public class TaskMethods extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
	
		
		
		launch();
		
		enterURL("https://www.facebook.com/");
		
		
		
		enterData(driver.findElement(By.id("inputValEnter")), "iphone");
		
		btnClick(driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-search-under-catagory lfloat']")));
		
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		
		driver.navigate().back();	
			
	//	enterData(driver.findElement(By.id("inputValEnter")), "iphone");
		
		btnClick(driver.findElement(By.xpath("//p[text()='Help Center']")));
	}
	
}
