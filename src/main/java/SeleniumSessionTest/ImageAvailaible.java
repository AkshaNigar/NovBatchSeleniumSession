package SeleniumSessionTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ImageAvailaible {

	static WebDriver driver;
	public static void main(String[] args) {
		
		String browserName="chrome";
		BrowserUtility brwUtil= new BrowserUtility();
		WebDriver driver=brwUtil.intializeBrowser(browserName);
		ElementsUtility eleUtil= new ElementsUtility(driver);
		brwUtil.doLaunchUrl("https://www.amazon.com/#");
		
		//By Locator
		By images=By.tagName("img");
		
		List<WebElement> listImages=eleUtil.doGetElements(images);
		System.out.println("Total Images on page: "+listImages.size());
		
		for(WebElement e:listImages)
		{
			// System.out.println(e.getText()); // showing blank space
			System.out.println(e.isDisplayed());
		}
		
		brwUtil.driverQuit();
		
		
		
		
	}

	
}
