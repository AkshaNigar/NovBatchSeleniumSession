package seleniumBasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();

		// driver.manage().window().maximize();
		// driver.manage().deleteAllCookies();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		By logo = By.xpath("//img[@alt='company-branding']");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// WebElement logoElement =
		// wait.until(ExpectedConditions.presenceOfElementLocated(logo));
		WebElement logoElement = wait.until(ExpectedConditions.visibilityOfElementLocated(logo));
		System.out.println(logoElement.getText());
		System.out.println(logoElement.getAttribute("alt"));
		
		wait.until(ExpectedConditions.titleContains("Orange"));
		System.out.println(driver.getTitle());
	}

}
