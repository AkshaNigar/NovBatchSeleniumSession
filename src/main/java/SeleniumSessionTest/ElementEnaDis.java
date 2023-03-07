package SeleniumSessionTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementEnaDis {

	
	public static void main(String[] args) {
		

		WebDriver driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		boolean flagDisElement=driver.findElement(By.cssSelector(".agree")).isDisplayed();
		if(flagDisElement==true)
		System.out.println("Pass");
		boolean flagEnaElement=driver.findElement(By.cssSelector(".agree")).isEnabled();
		if(flagDisElement==true)
		{
			System.out.println("Element is enabled");
		}
		boolean flagSelElement=driver.findElement(By.cssSelector(".agree")).isSelected();
		if(flagSelElement==true)
		{
			System.out.println("Element is selected");
		}
		else
		{
			System.out.println("Element is not selected");
		}
		driver.quit();
	}

}
