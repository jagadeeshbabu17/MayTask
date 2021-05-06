package com.sample1;

import static org.junit.Assert.assertEquals;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {
	static WebDriver driver;

	@BeforeClass
	public static void launch() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		WebElement txtUser = driver.findElement(By.id("username"));
		txtUser.sendKeys("praveen05");
		// String string1 = txtUser.getAttribute("value");
		// Assert.assertEquals("jagadeeshbabu27", string1);
		WebElement txtPass = driver.findElement(By.id("password"));
		txtPass.sendKeys("praveen@05");
		// String string2 = txtPass.getAttribute("value");
		// Assert.assertEquals("Katuri_17", string2);
		WebElement btn = driver.findElement(By.id("login"));
		btn.click();

	}

	@Before
	public void beforeMethod() {
		Date date = new Date();
		System.out.println(date);
	}

	@Test
	public void testCode() throws InterruptedException {
		WebElement location = driver.findElement(By.id("location"));
		// location.click();
		// location.getText();
		Select s = new Select(location);
		s.selectByIndex(5);
		WebElement element = driver.findElement(By.id("hotels"));
		Select s1 = new Select(element);
		s1.selectByIndex(1);
		WebElement element2 = driver.findElement(By.id("room_type"));
		Select s2 = new Select(element2);
		s2.selectByIndex(3);
		WebElement element3 = driver.findElement(By.id("adult_room"));
		Select s3 = new Select(element3);
		s3.selectByIndex(3);
		WebElement element4 = driver.findElement(By.id("child_room"));
		Select s4 = new Select(element4);
		s4.selectByIndex(0);
		WebElement element5 = driver.findElement(By.id("Submit"));
         element5.click();
		
	}

	@After
	public void afterMethod() {
		Date date = new Date();
		System.out.println(date);
	}

	@AfterClass
	public static void close() {
		// driver.close();
	}

}
