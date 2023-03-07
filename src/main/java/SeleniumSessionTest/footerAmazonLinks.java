package SeleniumSessionTest;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class footerAmazonLinks {

	static WebDriver driver;

	public static void main(String[] args) {
		BrowserUtility bl = new BrowserUtility();
		driver = bl.intializeBrowser("chrome");
		bl.doLaunchUrl("https://www.amazon.com/");

		ElementsUtility el = new ElementsUtility(driver);

		// By Locator
		// By VerticalFooterLink= By.xpath("//div[@id='navFooter']//a");

		By VFLinks = By.cssSelector(".navFooterVerticalRow");

		// List<WebElement>
		// listOffooterLink=driver.findElements(VerticalFooterLink);
		//
		// System.out.println("Size:"+listOffooterLink.size());
		//
		// for(WebElement ele:listOffooterLink )
		// {
		// String text=ele.getText();
		// System.out.println(text);
		// }

		int ListCount = el.getTotalElementcount(VFLinks);
		System.out.println(ListCount);

		String text = driver.findElement(VFLinks).getText();
		System.out.println(text);

		// List<String> elementsList=getElementListText(VFLinks);
		bl.driverClose();

	}

	public static List<WebElement> doGetElements(By locator) {
		return driver.findElements(locator);
	}

	public static List<String> getElementListText(By locator) {
		List<String> arList = new ArrayList<String>();
		List<WebElement> eleList = doGetElements(locator);
		for (WebElement ele : eleList) {
			String text = ele.getText();
			System.out.println(text);
			arList.add(text);
		}
		return arList;
	}
}
