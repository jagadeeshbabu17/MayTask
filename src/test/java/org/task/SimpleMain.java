package org.task;

import org.openqa.selenium.By;

import com.task.BaseClass;

public class SimpleMain extends BaseClass {
	public static void main(String[] args) {
		launch();
		Pom1 p = new Pom1();
		enterURL("https://www.facebook.com/");
		enterData(p.getUserName(), "Jagadeeshbabu");
		enterData(p.getPassword(), "Katuri_17");
		btnClick(driver.findElement(By.xpath("//button[text()='Log In']")));
	}

}
