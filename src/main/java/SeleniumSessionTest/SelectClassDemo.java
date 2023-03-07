package SeleniumSessionTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassDemo {

	static WebDriver driver;
	
	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		
		//By Locator
		By dropdown=By.id("Form_getForm_Country");
		WebElement country=driver.findElement(dropdown);
		
		Select sc= new Select(country);
		
		sc.selectByIndex(3);

	}

}
