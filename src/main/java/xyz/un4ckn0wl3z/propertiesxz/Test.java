package xyz.un4ckn0wl3z.propertiesxz;

import java.io.FileReader;
import java.util.Properties;

public class Test {

	public static void main(String[] args)throws Exception{  
	    FileReader reader=new FileReader("db.properties");  
	      
	    Properties p=new Properties();  
	    p.load(reader);  
	      
	    System.out.println(p.getProperty("user"));  
	    System.out.println(p.getProperty("password"));  
	}  
	

}
