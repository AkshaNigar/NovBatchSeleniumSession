package SeleniumSessionTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksAvailaible {

	static WebDriver driver;

	public static void main(String[] args) {

		String browserName = "chrome";
		BrowserUtility brwUtil = new BrowserUtility();
		WebDriver driver = brwUtil.intializeBrowser(browserName);
		brwUtil.doLaunchUrl("https://www.amazon.com/#");
		ElementsUtility eleUtil = new ElementsUtility(driver);
		// By Locator
		By pageLinks = By.tagName("a");
		By footerLinks = By.cssSelector(".navFooterVerticalRow");
		By logoimg=By.cssSelector(".nav-logo-link");
		// Check logo is present or not
		boolean flag=eleUtil.doIsDisplayed(logoimg);
		System.out.println("Logo present: "+flag);
		
		List<WebElement> pageLinks1 = eleUtil.doGetElements(pageLinks);
		int totalLinks = eleUtil.sizeOfList(pageLinks);

		// Total Links available on page
		System.out.println("Total Links availaible on page:" + totalLinks);

		System.out.println("All pageLink Text");

		for (int i = 0; i < totalLinks; i++) {
			String text = pageLinks1.get(i).getText();
			if(text.length()!=0)
			{
				System.out.println(+i +" : " +text);
			}
		}

		// Links available on footer
		WebElement footer = eleUtil.doGetElement(footerLinks);

		List<WebElement> ftrLinks = footer.findElements(pageLinks);
		int totalFtrLinks = ftrLinks.size();
		System.out.println("footerLinks: " + totalFtrLinks);

		int count =0;
		System.out.println("All FooterVerticalRow Text");
		for (WebElement e : ftrLinks) {
			System.out.println(+count+ ": "+e.getText());
			count++;
		}

	}

}
