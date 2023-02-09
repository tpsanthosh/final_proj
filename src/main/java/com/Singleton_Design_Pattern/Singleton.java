package com.Singleton_Design_Pattern;

import org.openqa.selenium.WebDriver;

import com.Page_Object_Model.Check_out;
import com.Page_Object_Model.Create_Acc;

public class Singleton {

	public WebDriver driver;
	
	private Create_Acc create;
	private Check_out cout;
	
	public Singleton(WebDriver driver2) {
		this.driver=driver2;
		
	}
	
	public Create_Acc getInstanceCreate() {
		create=new Create_Acc(driver);
				return create;
	}
	
	public Check_out getInstanceCout() {
		cout=new Check_out(driver);
		return cout;
	}
	
}
