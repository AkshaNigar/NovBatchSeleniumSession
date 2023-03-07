package SeleniumSessionTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessBrowser {

	static WebDriver driver;
	public static void main(String[] args) {
		
	
		ChromeOptions oc= new ChromeOptions();
		//oc.setHeadless(true);
		oc.addArguments("Incognito");
		driver = new ChromeDriver(oc);
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());

	}

}
