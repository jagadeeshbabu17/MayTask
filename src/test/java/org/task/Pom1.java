package org.task;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 extends SimpleMain {
	public Pom1() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement userName;
	@FindBy(id="pass")
	private WebElement password;
	public WebElement getUserName() {
		return userName;
	}
	public WebElement getPassword() {
		return password;
	}

	
}
