package resuableComponents;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesOperation {
	
	public String getpropertyvalue(String key) throws IOException {
		Properties prop = new Properties();
		String propfilepath="C:/Users/sneha/eclipse-workspace/seleniumbasic/src/test/resource/testData/config.properties";
		FileInputStream fis = new FileInputStream(propfilepath);
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
		
	}

}
