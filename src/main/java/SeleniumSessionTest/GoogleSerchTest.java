package SeleniumSessionTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSerchTest {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		//driver.get("https://www.google.com/");
		driver.get("https://in.bookmyshow.com/explore/home/national-capital-region-ncr");
		By serchLocator = By.xpath("//input[@class='gLFyf']");
		
		// By suggListLocator=By.xpath("//ul[@class='G43f7e']/li"); -- It will also fetch the text of each suggestion
	
		By suggListLocator = By.xpath("//li[@class='sbct']//div[@class='wM6W7d']/span");
		By suggListLocator1 = By.xpath("//li//span");

		//driver.findElement(serchLocator).sendKeys("naveen automations lab");
		driver.findElement(By.xpath("//span[@id='4']")).sendKeys("ava");
		Thread.sleep(3000);
		doSearch(suggListLocator1, "lucky");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static void doSearch(By suggLocator, String value) throws InterruptedException {

		List<WebElement> suggList = getElements(suggLocator);
		System.out.println(suggList.size());
		for (WebElement e : suggList) {
			String text = e.getText();
			if (text.contains(value)) {
				e.click();
				break;
			}
		}

	}
}
