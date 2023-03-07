package JavaScripExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScorllPageByPixcelConcept {

	
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		JavascriptExecutor js=  (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0, 1000)");
		
		
		
	}

}
