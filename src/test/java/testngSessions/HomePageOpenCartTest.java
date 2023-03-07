package testngSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageOpenCartTest extends BaseTest {

	

	@Test
	public void getTitle() {
		String title = driver.getTitle();
		System.out.println("Home Page title is : " + title);
		Assert.assertEquals(title, "Your Store");
	}

	@Test

	public void getUrl() {
		String URL = driver.getCurrentUrl();
		System.out.println("Home Page URL is: " + URL);
		Assert.assertEquals(URL, "https://naveenautomationlabs.com/opencart/index.php?route=common/home");
	}

	@Test

	public void footerLinkCount() {
		int linksTotal = driver.findElements(By.xpath("//h5[text()='Information']/parent::div/parent::div//a")).size();
		Assert.assertEquals(linksTotal, 15);
	}

	@Test

	public void LogoIsPresent() {
		boolean flag = driver.findElement(By.xpath("//img[@alt='naveenopencart']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	

}
