package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader 
{
	public static String properties(String key) throws IOException
	{
		String projectpath=System.getProperty("user.dir");
		String myfile="\\ObjectRepo\\config.properties";
		FileInputStream fis=new FileInputStream(projectpath+myfile);
		Properties pro=new Properties();
		pro.load(fis);
		return pro.getProperty(key);
	}

}
