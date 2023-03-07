package testngSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTest {
	
	WebDriver driver;
	
	@BeforeTest
	
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
	}
	
	
	@Test(priority=1)
	public void title()
	{
		String title=driver.getTitle();
		System.out.println("Title : "+title);
		Assert.assertEquals(title, "Amazon.com. Spend less. Smile more.");
	}
	
	
	@Test(priority=2)
	 public void getUrl()
	 {
		String url=driver.getCurrentUrl();
		System.out.println("URL: "+url);
		Assert.assertEquals(url, "https://www.amazon.com/");
	 }

	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
}

