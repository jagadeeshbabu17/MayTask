package org.task;

import org.openqa.selenium.By;

import com.task.BaseClass;

public class Newclass extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
	
			
			
			launch();
			
			enterURL("https://www.facebook.com/");
			
			LoginPom l = new LoginPom();
			
			enterData(l.getUsername(), "pk");
			enterData(l.getPassword(), "pk");
			
	//		btnClick(driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-search-under-catagory lfloat']")));
			
	//		Thread.sleep(5000);
			
			driver.navigate().refresh();
			
	//		driver.navigate().back();	
				
			enterData(l.getUsername(), "dfkjsd"
					+ ""
					+ ""
					+ ""
					+ "");

}
}