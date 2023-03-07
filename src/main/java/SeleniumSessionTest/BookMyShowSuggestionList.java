package SeleniumSessionTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyShowSuggestionList {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
	
		driver.get("https://in.bookmyshow.com/explore/home/national-capital-region-ncr");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='1']")).click();
		driver.findElement(By.className("cLnzvB")).sendKeys("ava");
		Thread.sleep(3000);
		
		//By locator
		By sugglocator=By.xpath("//ul[@class='sc-sPYgB gVUFKz']/li//span");
		doSearch(sugglocator, "Avan");
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public static void doSearch(By suggLocator , String value) throws InterruptedException {

		List<WebElement> suggList = getElements(suggLocator);
		System.out.println(suggList.size());
		for (WebElement e : suggList) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains(value)) {
				e.click();
				break;
			}
		}

	}
}
