package SeleniumSessionTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		//driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//By Locator
		By dropdown=By.xpath("//select[@id='Form_getForm_Country']");
		
		//By dropdown=By.xpath("//select[@id='first']");
		
		doSelectDropDownByIndex(dropdown, 2);
		Thread.sleep(3000);
		//doSelectDropDownByVisibleText(dropdown, "Antigua and Barbuda");
		
	}
	
	public static WebElement doGetElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	//*********************Select Based dropdown*************
	public static void doSelectDropDownByIndex(By locator, int index)
	{
		Select select = new Select(doGetElement(locator));
		select.selectByIndex(index);
		
	}
	public static void doSelectDropDownByValue(By locator, String value)
	{
		Select select = new Select(doGetElement(locator));
		select.selectByValue(value);
	}
	public static void doSelectDropDownByVisibleText(By locator, String text)
	{
		Select select = new Select(doGetElement(locator));
		select.selectByVisibleText(text);
	}

}
