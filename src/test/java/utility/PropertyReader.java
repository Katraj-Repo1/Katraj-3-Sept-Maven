package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	
	
	public static String readProperty(String keys) throws IOException {
		
		//step-1 path
		String path = System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties";
		
		//step-2 
		Properties prop =new Properties();
		
		//step-3
		FileInputStream fis =new FileInputStream(path);
		
		//step-4 
		prop.load(fis);
		
		String value = prop.getProperty(keys);
		
       return value;
		
	}
	
}
