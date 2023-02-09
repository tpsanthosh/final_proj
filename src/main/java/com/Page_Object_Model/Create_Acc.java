package com.Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Create_Acc {

	public WebDriver driver;
	
	@FindBy (xpath=("(//a[text()='Create an Account'])[1]"))
	private WebElement create;
	
	@FindBy (xpath=("//input[@id='firstname']"))
	private WebElement fname;
	
	@FindBy(xpath=("//input[@id='lastname']"))
	private WebElement lname;
	
	@FindBy(xpath=("//input[@id='is_subscribed']"))
	private WebElement checkbox;
	
	@FindBy (xpath=("//input[@id='email_address']"))
	private WebElement semail;
	
	@FindBy (xpath=("//input[@id='password']"))
	private WebElement pass;
	
	@FindBy(xpath=("//input[@id='password-confirmation']"))
	private WebElement cpass;
	
	@FindBy(xpath=("(//button[@type='submit'])[2]"))
	private WebElement submit;
	
	public Create_Acc(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getCreate() {
		return create;
	}
	
	public WebElement getFname() {
		return fname;
	}
	
	public WebElement getLname() {
		return lname;
	}
	public WebElement getCheckbox() {
		return checkbox;
	}
	
	public WebElement getSemail() {
		return semail;
		
	}
	public WebElement getPass() {
		return pass;
	}
	
	public WebElement getCpass() {
		return cpass;
	}
	
	public WebElement getSubmit() {
		return submit;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
