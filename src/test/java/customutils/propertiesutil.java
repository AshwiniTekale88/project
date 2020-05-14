package customutils;

import java.io.FileInputStream;
import java.util.Properties;

public class propertiesutil {
Properties prop;
public static String getLocator(String locatorName) {
	String value="";
	try {
		String basepath=System.getProperty(basepath);
		FileInputStream fis=new FileInputStream("");
		prop.load(fis);
		value=(String)prop.get(locatorName)
		
	}catch()
	return value;
	
}

}
