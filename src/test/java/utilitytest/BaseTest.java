package utilitytest;

import java.io.IOException;

import org.testng.annotations.Test;

import utility.GenericKeyWord;
import utility.PropertyReader;

public class BaseTest 
{
	GenericKeyWord p1;
	@Test
	public void setup() throws IOException
	{
		p1=new GenericKeyWord();
		String re=PropertyReader.properties("Browser");
		System.out.println("re :"+ re);
		p1.openBrowser(PropertyReader.properties("Browser"));
		p1.enterURL(PropertyReader.properties("Url"));
		p1.enterData("name", "email", "9542192450");
		p1.enterData("name", "pass", "Ravi@143");
		p1.clickOnElement("name","login");
		System.out.println(p1.pageTitle());
		
	}

}
