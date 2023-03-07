package seleniumBasic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		WebElement components=driver.findElement(By.xpath("//a[text()='Components']"));
		Actions act = new Actions(driver);
		act.moveToElement(components).build().perform();
		//Thread.sleep(2000);
		List<WebElement> listItems= driver.findElements(By.xpath("//a[text()='Mice and Trackballs (0)']/parent::li/parent::ul//a"));
		for(WebElement e: listItems)
		{
			System.out.println(e.getText());
		}
	}

}
