package org.task;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.task.BaseClass;


public class LoginPom extends Newclass {
	
	public LoginPom() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(id="email")
	
	private WebElement Username; 
	
	@FindBy(id="pass")
	
	private WebElement Password;

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return Password;
	}


	
	
	
	
	
	
	
	
	
	

}
