package JavaScripExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ScorllPageByElementVisible {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--Incognito");
		driver = new ChromeDriver(co);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://amazon.com/");
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions action = new Actions(driver);
		WebElement targetElement = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
		System.out.println(targetElement.getText());

		// js.executeScript("arguments[0].scrollIntoView();", targetElement);

		action.scrollToElement(targetElement).build().perform();
	}

}
