package SeleniumSessionTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementAttributes {
	static WebDriver driver;

	public static void main(String[] args) {

		int count=0;
		BrowserUtility bl = new BrowserUtility();
		driver = bl.intializeBrowser("chrome");
		bl.doLaunchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		ElementsUtility el = new ElementsUtility(driver);

		// By Locator
		
//		By fn = By.name("firstname");
//
//		String fnAtr = el.getAttribute(fn, "placeholder");
//		if (fnAtr.equals("First Name")) {
//			System.out.println("Validation pass :" + fnAtr);
//		}
	
		By inputTag= By.tagName("input");
		List<WebElement> inputEles=el.doGetElements(inputTag);
		System.out.println("Total Inputs fields :"+inputEles.size());
		for(WebElement e: inputEles)
		{
			String atr=e.getAttribute("placeholder");
			if(atr.length()!=0)
			{
				count++;
				System.out.println(atr);
			}
			
		}
		System.out.println("Input fields without balnk values:" +count);

		bl.driverQuit();

	}

}
