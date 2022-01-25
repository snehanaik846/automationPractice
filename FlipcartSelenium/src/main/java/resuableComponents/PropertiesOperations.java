package resuableComponents;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertiesOperations {
	static Properties prop = new Properties();

	public static String getPropertyValue(String key) throws Exception {
		String filepath = System.getProperty("user.dir") + "/src/test/resources/TestData/config.properties";
		FileInputStream ip = new FileInputStream(filepath);
		prop.load(ip);
		String value = prop.get(key).toString();
		return value;

	}
}
