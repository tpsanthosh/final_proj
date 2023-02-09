package com.Final;

import org.openqa.selenium.WebDriver;

import com.Base_Final.Base_class;
import com.Configuration_Reader.File_Reader;
import com.Singleton_Design_Pattern.Singleton;

public class Runner_Class extends Base_class {

	public static WebDriver driver=Base_class.get_Driver();
	
	public static Singleton sdp=new Singleton(driver);
	
	public static void main(String[] args) throws Throwable {
		
		
		geturl("https://magento.softwaretestingboard.com/");
		
		
		clickonelement(sdp.getInstanceCreate().getCreate());
		
		String firstname=File_Reader.getInstanceFR().getInstanceCR().getFirstname();
		inputvalues(sdp.getInstanceCreate().getFname(), firstname);
		
		String lastname=File_Reader.getInstanceFR().getInstanceCR().getLastname();
		inputvalues(sdp.getInstanceCreate().getLname(), lastname);
		
		clickonelement(sdp.getInstanceCreate().getCheckbox());
		
		String semail=File_Reader.getInstanceFR().getInstanceCR().getSemail();
		inputvalues(sdp.getInstanceCreate().getSemail(), semail);	
		
		String password=File_Reader.getInstanceFR().getInstanceCR().getPassword();
		inputvalues(sdp.getInstanceCreate().getPass(), password);
		
		String cpassword=File_Reader.getInstanceFR().getInstanceCR().getCpassword();
		inputvalues(sdp.getInstanceCreate().getCpass(), cpassword);
		
		clickonelement(sdp.getInstanceCreate().getSubmit());
		
		clickonelement(sdp.getInstanceCout().getCheckbox());
		
		clickonelement(sdp.getInstanceCout().getCheckout());
		
		driver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
