package propertyutility;

import java.io.FileInputStream;
import java.util.Properties;

public class Propertyutility 
{
public static String path="C:\\Users\\Adil\\eclipse-workspace\\MoveToFramework\\testdata\\config.properties";
	public static String getReaddata(String key)
	{
		String value="";
		try 
		{
			FileInputStream fis=new FileInputStream(path);
			Properties prop=new Properties();
			prop.load(fis);
			value=prop.getProperty(key);	
		} catch (Exception e) 
		{
			System.out.println("issue in GetRead data"+e);
		}
		return value;
	}
	
}
