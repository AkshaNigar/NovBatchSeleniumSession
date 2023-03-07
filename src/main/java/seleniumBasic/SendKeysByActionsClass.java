package seleniumBasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysByActionsClass {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		WebElement firstName=driver.findElement(By.id("input-firstname"));
		WebElement lastName=driver.findElement(By.id("input-lastname"));
		Actions act = new Actions(driver);
		act.sendKeys(firstName, "Akshi Nigar").build().perform();
		act.sendKeys(lastName, "Noahiya").build().perform();
		act.click(driver.findElement(By.xpath("//input[@type='submit']")));
		
	}

}
