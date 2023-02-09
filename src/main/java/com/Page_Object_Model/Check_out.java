package com.Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Check_out {

	public WebDriver driver;
	
	@FindBy (xpath=("((//button[@data-action='customer-menu-toggle'])[1]"))
	private WebElement checkbox;
	
	@FindBy (xpath=("(//li[@class='authorization-link'])[3]"))
	private WebElement checkout;
	
	public Check_out(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getCheckbox() {
		return checkbox;
	}
	
	public WebElement getCheckout() {
		return checkout;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
