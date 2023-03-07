package SeleniumSessionTest;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLangLinks {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		//
		// By :Locator
		By langLocator=By.xpath("//div[@id='SIvCob']/a");  // Locator  to find out the language Links on google.com page
		
		By footerLinkLocator=By.xpath("//div[@jscontroller='NzU6V']/div/a"); // Locator  to Find out the footerLinks on google.com page
		
		//List<String> langListText=returnLanguageTextList(langLocator);
		//getGoogleLangLinks(langLocator);  
		
		getFooterLinks(footerLinkLocator);
		
		driver.quit();
	}

	public static List<WebElement> getElements(By Locator)
	{
		return driver.findElements(Locator);
	}
	
	public static void getGoogleLangLinks(By locator)
	{
		
		List<WebElement> langList=getElements(locator);	
		System.out.println("LanguageList Count: "+langList.size());
		int count=0;
		for(WebElement e: langList)
		{
			String text=e.getText();
			System.out.println(+count+" : "+text);
			count++;
			if(text.equals("English"))
			{
				e.click();
				break;
			}
			
		}
		
		
	}
	public static  List<String>  returnLanguageTextList(By locator)
	{
		List<String> langTextList= new ArrayList<String>();
		List<WebElement> langList=getElements(locator);	
		for(WebElement e: langList)
		{
			String text=e.getText();
			langTextList.add(text);
		}
		return langTextList;
	}
	
	public static void getFooterLinks(By locator)
	{
		List<WebElement> footerLinks=getElements(locator);
		for(WebElement e: footerLinks)
		{
			System.out.println(e.getText());
		}
		
	}
	
	
}
