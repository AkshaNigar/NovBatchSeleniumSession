package seleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {

	static WebDriver driver;

	public static void main(String[] args) {

		String browser = "Edge";

		// 1, using switch case
		switch (browser) {
		case "Chrome":
			driver = new ChromeDriver();
			break;
		case "Edge":
			driver = new EdgeDriver();
			break;
		case "Firefox":
			driver = new FirefoxDriver();
			break;

		default:
			System.out.println("Please pass the correct browser:" + browser);
			break;
		}

		// 2. using if-else condition

		// if (browser.equals("chrome")) {
		// driver = new EdgeDriver();
		// } else if (browser.equals("firefox")) {
		// driver = new FirefoxDriver();
		// } else if (browser.equals("Edge")) {
		// driver = new EdgeDriver();
		// }
		// else
		// {
		// System.out.println("Please pass the correct browser:" +browser);
		// }

		driver.get("http://google.com/");

		String actTitle = driver.getTitle();
		if (actTitle.equals("Google")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		driver.quit();
	}

}
