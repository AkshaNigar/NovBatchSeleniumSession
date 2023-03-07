package SeleniumSessionTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserOperations {

	static WebDriver driver;
	public static void main(String[] args) {
		

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().to("https://www.amazon.com/");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
	
		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());

	}

}
