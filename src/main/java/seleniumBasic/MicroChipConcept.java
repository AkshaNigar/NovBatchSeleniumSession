package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MicroChipConcept {

	static WebDriver driver;
	public static void main(String[] args) {
	
		 driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.microchip.com/prochiplicensing/#/");
		
		selectDropdownSelection("When is your design planned for production?","2023");
		selectDropdownSelection("What is your HDL preference?","Verilog");
		selectDropdownSelection("Which CPLD will you be using?", "ATF1502");
		selectDropdownSelection("What are the potential quantities per year(or total CPLD volume) you plan to use in your design(s)?", "< 1000 units");
		
		

	}
	
	public static void selectDropdownSelection(String label, String value)
	{
		WebElement ele=driver.findElement(By.xpath("//label[text()='"+ label+"']/preceding-sibling::select"));
		Select sc= new Select(ele);
		//sc.selectByIndex(0);
		sc.selectByValue(value);
	}

}
