package JavaScripExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollFullPage {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://amazon.com/");
		Thread.sleep(4000);
		JavascriptExecutor js=  (JavascriptExecutor)driver;
		//js.executeScript("window.scrollTo(0, documnet.body.scrollHeight)");
	
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

	}

}
