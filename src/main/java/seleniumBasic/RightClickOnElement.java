package seleniumBasic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickOnElement {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));

		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

//		Actions act = new Actions(driver);
//
//		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
//		act.moveToElement(rightClick).contextClick().build().perform();
//
//		List<WebElement> rightClickItems = driver
//				.findElements(By.xpath("//ul[contains(@class,'context-menu-list')]/li"));
//		System.out.println("Size: " + rightClickItems.size());
//		for (WebElement ele : rightClickItems) {
//			String item = ele.getText();
//			System.out.println(item);
//			if (item.equals("Copy")) {
//				ele.click();
//				Thread.sleep(3000);
//				driver.switchTo().alert().accept();
//				break;
//			}
//		}

		// "*******************************"
		By rightClick = By.xpath("//span[text()='right click me']");
		By copLocator = By.xpath("//span[text()='Copy']");
		rightClickonButton(rightClick);
		Thread.sleep(3000);
		clickOnLink(copLocator, "Copy");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void rightClickonButton(By locator) {
		Actions act = new Actions(driver);

		act.contextClick(getElement(locator)).build().perform();

	}

	public static void clickOnLink(By locator, String Value) throws InterruptedException {
		WebElement ele = getElement(locator);
		String text = ele.getText();
		System.out.println(text);
		if (text.equals("Copy")) {
			ele.click();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
		}

	}

}
