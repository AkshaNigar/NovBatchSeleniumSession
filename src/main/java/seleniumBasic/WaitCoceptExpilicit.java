package seleniumBasic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitCoceptExpilicit {

	static WebDriver driver;
	
	public static void main(String[] args)
	{
		driver=  new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		By footerLinks= By.xpath("//footer//a");
//		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
//		List<WebElement> links=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(footerLinks));
		List<WebElement> links=waitForPresenceofElements(5,footerLinks);
		System.out.println(links.size());
		for(WebElement e: links)
		{
			System.out.println(e.getText());
		}
		
	}
	
	
	public static List<WebElement> waitForPresenceofElements(int timeout, By locator)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}
	
	public static List<WebElement> waitForVisibiltyofElements(int timeout, By locator)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
}
