package SeleniumSessionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownOptions {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		//driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// By locator
		//By dropdown = By.xpath("//select[@id='Form_getForm_Country']");
		By dropdown=By.xpath("//select");
		// Select select = new Select (driver.findElement(dropdown));
		// By
		// countryOptions=By.xpath("//select[@id='Form_getForm_Country']/option");

		// List<WebElement> countryList=select.getOptions();
		//
		// System.out.println(countryList.size());
		// for(WebElement e: countryList)
		// {
		//
		// String text=e.getText();
		// System.out.println(text);
		// if(text.equals("France"))
		// {
		// e.click();
		// break;
		//
		// }
		// }
		int size = getTotalDropDownOptions(dropdown);
		System.out.println(size);
		Thread.sleep(3000);

		if (getDropDownOptionsTextList(dropdown).contains("India")) {
			System.out.println("India is present");
		}
		Thread.sleep(3000);
		List<String> expCountries = Arrays.asList("India", "Brazil");
		if (getDropDownOptionsTextList(dropdown).containsAll(expCountries)) {
			System.out.println("Pass");
		}
		Thread.sleep(2000);
		selectDroDownValue(dropdown, "India");
	}

	public static WebElement doGetElement(By locator) {
		return driver.findElement(locator);
	}

	public static int getTotalDropDownOptions(By locator) {
		Select select = new Select(doGetElement(locator));
		List<WebElement> dropDownOptions = select.getOptions();
		int optionCount = dropDownOptions.size();
		return optionCount;
	}

	public static List<String> getDropDownOptionsTextList(By locator) {
		Select select = new Select(doGetElement(locator));
		List<String> optionTextList = new ArrayList<String>();
		List<WebElement> optionsList = select.getOptions();
		for (WebElement e : optionsList) {
			String text = e.getText();
			optionTextList.add(text);

		}
		return optionTextList;
	}

	public static List<WebElement> getDropDownOptionsList(By locator) {
		Select select = new Select(doGetElement(locator));
		return select.getOptions();
	}

	public static void selectDroDownValue(By locator, String expValue) {
		List<WebElement> optionsList = getDropDownOptionsList(locator);
		for (WebElement e : optionsList) {
			String text = e.getText();
			if (text.equals(expValue)) {
				e.click();
				break;
			}
		}
	}

}
