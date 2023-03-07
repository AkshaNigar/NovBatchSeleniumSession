package SeleniumSessionTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserUtility {

	private WebDriver driver;

	// Intialize the browser
	public WebDriver intializeBrowser(String browserName) {
		
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver= new ChromeDriver();
			break;
		case "edge":
			driver= new EdgeDriver();
			break;
		case "ie":
			driver= new InternetExplorerDriver();
			break;

		default:
			System.out.println("Incorrect browser plz pass correct browser:"+browserName);
			break;
			}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		return driver;
		
	}
	
	// launch the URL
	
	public void doLaunchUrl(String Url)
	{
		driver.get(Url);
	}
	
	// Get title of Webpage
	public String getTitle()
	{
		return driver.getTitle();
	}
	// Current Url of page
	public String getCurrentUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public void driverQuit()
	{
		driver.quit();
	}
	public void driverClose()
	{
		driver.close();
	}
	
	

}
