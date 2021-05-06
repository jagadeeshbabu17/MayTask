package com.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class BaseClass {
		
		public static WebDriver driver;
		
		
		public static void launch() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\jb\\selinium\\Task\\driver\\chromedriver.exe");
			 driver =new ChromeDriver(); 
		}
		public static void enterURL(String url) {
	      driver.get(url);
	      driver.manage().window().maximize();
		}
		public static void enterData(WebElement element,String data) {
			element.sendKeys(data);
		}
		public static void btnClick(WebElement element) {
	     element.click();
		}

	}


