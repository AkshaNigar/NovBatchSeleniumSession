package testngSessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInOpenCartTest extends BaseTest {

	@Test(priority = 1)

	public void headerList() {
		List<WebElement> headerList = driver.findElements(By.xpath("//a[text()='Desktops']/ancestor::ul/li/a"));
		for (WebElement ele : headerList) {
			String text = ele.getText();
			System.out.println(text);
		}
		int count = headerList.size();
		Assert.assertEquals(count, 8);
	}

	@Test(priority = 2)

	public void logIn() {
		driver.findElement(By.id("input-email")).sendKeys("TestAkshi123@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Password@123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("My Account"));

		String title = driver.getTitle();
		Assert.assertEquals(title, "My Account");

	}

	@Test(priority = 3)

	public void h2ListSize() {
		int count = driver.findElements(By.xpath("//div[@id='content']/h2")).size();
		Assert.assertEquals(count, 4);
	}

}
