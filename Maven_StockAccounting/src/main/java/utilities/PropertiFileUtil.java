package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class PropertiFileUtil {
	public static String getValueForkey(String key) throws Throwable, Exception
	{
		Properties configProperties = new Properties();
		configProperties.load(new FileInputStream(new File("C:\\Users\\guravaiah.m\\Maven_StockAccounting\\propertyfile\\Environment.properties")));
		return configProperties.getProperty(key);
	}
}

	