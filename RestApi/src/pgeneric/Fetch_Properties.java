package pgeneric;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Fetch_Properties 
{
	public static String getProperties_Value() throws IOException
	{
		FileInputStream fis=new FileInputStream("E:\\eclipse_neon\\RestApi\\src\\pUtils\\GlobalProperties.properties");
		Properties pro=new Properties();
		pro.load(fis);
		String a1 = pro.getProperty("baseURI");
		return a1;
		
	}
}
