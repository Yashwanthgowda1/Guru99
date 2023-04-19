package generic_library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertyfileutility {

	private Properties property;
	/**
	 * this method is used to initilize property file
	 * @param filepath
	 * @param Key
	 */
public void propertyconfg(String filepath ) {
	FileInputStream fis=null;//filenotfoundexception
	try {
	
	fis=new FileInputStream(filepath);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	property=new Properties();//create a instance of property class
	try {
		property.load(fis);
	}
		catch (IOException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

	/**
	 * this method is used to fetch the value from property file based on key
	 * @param value 
	 * @return
	 */

public String fetchproperty(String key) {//by passing a value fetching a data
	
	return property.getProperty(key);
}

/**
 * this method is used to write the data into property file
 * @param key
 * @param value
 * @param filePath
 * @param message
 */
public void setDataToprorprty(String key, String value,String filePath,String message) {
	
	property.put(key, value);
	
	
	/*
	
FileOutputStream fos=new FileOutputStream(filePath);
property.store(fos, message);
*/

		try {
			property.store(new FileOutputStream(filePath), message);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

}
}
