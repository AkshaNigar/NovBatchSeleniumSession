package seleniumBasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollWebElement {

		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			
			driver= new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get("https://accounts.google.com/");
			driver.findElement(By.xpath("//div[@role='combobox']")).click();
			WebElement targetElement= driver.findElement(By.xpath("//li[@data-value='fi']"));
			WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(targetElement));
			Actions actions= new Actions(driver);
			actions.scrollToElement(targetElement).build().perform();			
	}

}
