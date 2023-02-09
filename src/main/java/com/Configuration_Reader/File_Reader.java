package com.Configuration_Reader;


public class File_Reader {

	private File_Reader() {
		
	}
	
	public static File_Reader getInstanceFR() {
		File_Reader fr=new File_Reader();
		return fr;
	}
	
	public static Config_Read getInstanceCR() throws Throwable {
		Config_Read cr=new Config_Read();
		return cr;
	}
	
}
