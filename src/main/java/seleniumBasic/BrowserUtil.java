package seleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserUtil {

	private WebDriver driver;

	public WebDriver initDriver(String browserName) {
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "ie":
			driver = new InternetExplorerDriver();
			break;

		default:
			break;

		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		return driver;
	}

	public void launchUrl(String Url) {
		if (Url == null) {
			System.out.println("Cant not launch the Url:" + Url);
		}
		if (Url.indexOf("https") == 0) {
			driver.get(Url);
		}
	}

	public String getPageTitle() {
		return driver.getTitle();

	}

	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public void quitBrowser() {
		if (driver != null) {
			driver.quit();
		}
	}

	public void closeBrowser() {
		if (driver != null) {
			driver.close();
		}
	}

}
