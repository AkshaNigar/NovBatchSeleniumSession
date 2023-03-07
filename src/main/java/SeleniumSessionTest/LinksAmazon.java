package SeleniumSessionTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinksAmazon {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		BrowserUtility bl = new BrowserUtility();
		driver = bl.intializeBrowser("chrome");
		bl.doLaunchUrl("https://www.amazon.com/");

		ElementsUtility el = new ElementsUtility(driver);

		// By Locators
		By Links = By.tagName("a");
		By images = By.tagName("img");

		// List<WebElement> links=el.doGetElements(Links);
		// System.out.println("Total Links availaible on page are:
		// "+links.size());
		//
		// for(WebElement ele:links )
		// {
		// String hrefvalue=ele.getAttribute("href");
		// String linkText= ele.getText();
		//
		// //System.out.println(hrefvalue+"::::::::"+linkText) ;
		//
		// //linkText.length()!=0
		// if(hrefvalue !=null && linkText.length()!=0)
		// {
		// count++;
		// System.out.println(hrefvalue+"::::::::"+linkText) ;
		// }
		// }
		//System.out.println("Links available without null and text value:" + count);

//
//		List<WebElement> imgList = el.doGetElements(images);
//        System.out.println("Total Images: "+imgList.size());
//		for (WebElement e : imgList) {
//			String srcValue = e.getAttribute("src");
//			String imgText = e.getText();
//			
//			System.out.println(srcValue+ " ------->"+imgText);
//		}
		el.getTotalElementcount(Links);
		el.getElementsAttribute(Links, "href");
		bl.driverClose();
	}
	
	
	
	public static List<WebElement> doGetElements(By locator)
	{
		return driver.findElements(locator);
	}
	
	
	
	
	
	
	
	

}
