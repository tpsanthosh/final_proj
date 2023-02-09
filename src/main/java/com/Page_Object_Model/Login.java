package com.Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	public WebDriver driver;
	
	@FindBy(xpath=("(//li[@class='authorization-link'])[1]"))
	private WebElement login;
	
	@FindBy (xpath=("//input[@id='email']"))
	private WebElement email;
	
	@FindBy(xpath=("(//input[@id='pass'])[1]"))
	private WebElement pass;
	
	@FindBy(xpath=("(//button[@id='send2'])[1]"))
	private WebElement submit;
	
	public Login(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getLogin() {
		return login;
	}
	
	public WebElement getEmail() {
		return email;
	}
	
	public WebElement getPass() {
		return pass;
	}
	
	public WebElement getSubmit() {
		return submit;
	}
	
	
	
	
	
	
	
}
