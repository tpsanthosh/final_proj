package com.Configuration_Reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config_Read {

	public static Properties p;
	
	public Config_Read () throws IOException {
		
		File f=new File(
				"C:\\Users\\Santhosh kumar\\eclipse-workspace\\Final\\src\\main\\java\\com\\Config_Properties\\Configuration.properties ");
		FileInputStream fis=new FileInputStream(f);
		p=new Properties();
		p.load(fis);
	}
	
	public String getFirstname() {
		String fname=p.getProperty("firstname");
		return fname;
	}
	
	public String getLastname() {
		String lname=p.getProperty("lastname");
		return lname;
	}
	
	public String getSemail() {
		String semail=p.getProperty("semail");
		return semail;
	}
	
	public String getPassword() {
		String pass=p.getProperty("password");
		return pass;
	}
	
	public String getCpassword() {
		String cpass=p.getProperty("cpassword");
		return cpass;
	}
	
	public String getLemail() {
		String lemail=p.getProperty("lemail");
		return lemail;
	}
	
	public String getLpassword() {
		String lpass=p.getProperty("lpassword");
		return lpass;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
