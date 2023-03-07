package testngSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {

	WebDriver driver;

	@Parameters({ "url", "browser" })
	@BeforeTest
	public void setUp(String url, String browser) {
		// driver = new ChromeDriver();

		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Pass the correct browser");
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(url);

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
