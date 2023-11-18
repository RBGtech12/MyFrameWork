package utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericKeyWord 
{
	WebDriver driver;
	public void openBrowser(String browser)
	{
		if(browser.equals("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equals("Edge"))
		{
			driver=new EdgeDriver();

		}
		else if(browser.equals("Firefox"))
		{
			driver=new FirefoxDriver();

		}
		}
		public void enterURL(String url)
		{
			driver.get(url);
		}
		public void enterData(String locator,String locatorValue,String data )
		{
			if(locator.equals("id"))
			{
				driver.findElement(By.id(locatorValue)).click();
			}
			else if(locator.equals("name"))
			{
				driver.findElement(By.name(locatorValue)).sendKeys(data);
			}
			else if(locator.equals("className"))
			{
				driver.findElement(By.className(locatorValue)).sendKeys(data);
			}
			else if(locator.equals("linkText"))
			{
				driver.findElement(By.linkText(locatorValue)).sendKeys(data);
			}
			else if(locator.equals("partialLinkText"))
			{
				driver.findElement(By.partialLinkText(locatorValue)).sendKeys(data);
			}
			else if(locator.equals("tagName"))
			{
				driver.findElement(By.tagName(locatorValue)).sendKeys(data);
			}
			else if(locator.equals("CssSelector"))
			{
				driver.findElement(By.cssSelector(locatorValue)).sendKeys(data);
			}
			
			}
		public void clickOnElement(String locator,String locatorValue)
		{

			if(locator.equals("id"))
			{
				driver.findElement(By.id(locatorValue)).click();
			}
			else if(locator.equals("name"))
			{
				driver.findElement(By.name(locatorValue)).click();
			}
			else if(locator.equals("className"))
			{
				driver.findElement(By.className(locatorValue)).click();
			}
			else if(locator.equals("linkText"))
			{
				driver.findElement(By.linkText(locatorValue)).click();
			}
			else if(locator.equals("partialLinkText"))
			{
				driver.findElement(By.partialLinkText(locatorValue)).click();
			}
			else if(locator.equals("tagName"))
			{
				driver.findElement(By.tagName(locatorValue)).click();
			}
			else if(locator.equals("CssSelector"))
			{
				driver.findElement(By.cssSelector(locatorValue)).click();
			}
			}
		public WebElement elementFind(String locator,String locatorValue)
		{
			WebElement element=null;


			if(locator.equals("id"))
			{
				element=driver.findElement(By.id(locatorValue));
			}
			else if(locator.equals("name"))
			{
				element=driver.findElement(By.name(locatorValue));
			}
			else if(locator.equals("className"))
			{
				element=driver.findElement(By.className(locatorValue));
			}
			else if(locator.equals("linkText"))
			{
				element=driver.findElement(By.linkText(locatorValue));
			}
			else if(locator.equals("partialLinkText"))
			{
				element=driver.findElement(By.partialLinkText(locatorValue));
			}
			else if(locator.equals("tagName"))
			{
				element=driver.findElement(By.tagName(locatorValue));
			}
			else if(locator.equals("CssSelector"))
			{
				element=driver.findElement(By.cssSelector(locatorValue));
			}
			
			
			return element;
			
		}
		
		public List<WebElement> elementsFind(String locator,String locatorValue)
		{

			List<WebElement> elements=null;


			if(locator.equals("id"))
			{
				elements=driver.findElements(By.id(locatorValue));
			}
			else if(locator.equals("name"))
			{
				elements=driver.findElements(By.name(locatorValue));
			}
			else if(locator.equals("className"))
			{
				elements=driver.findElements(By.className(locatorValue));
			}
			else if(locator.equals("linkText"))
			{
				elements=driver.findElements(By.linkText(locatorValue));
			}
			else if(locator.equals("partialLinkText"))
			{
				elements=driver.findElements(By.partialLinkText(locatorValue));
			}
			else if(locator.equals("tagName"))
			{
				elements=driver.findElements(By.tagName(locatorValue));
			}
			else if(locator.equals("CssSelector"))
			{
				elements=driver.findElements(By.cssSelector(locatorValue));
			}
			return elements;
						
		}

		public String pageTitle()
		{
			String title=driver.getTitle();
			return title;
			
		}
		
		
}
