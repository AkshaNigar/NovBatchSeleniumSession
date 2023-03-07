package seleniumBasic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangHRM_BrowserWindowPopup {

	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		List<WebElement> loginLinks= driver.findElements(By.xpath("//div[@class='orangehrm-login-footer-sm']/a"));
		System.out.println("Size: "+loginLinks.size());
		
		for(WebElement e: loginLinks)
		{
			e.click();
		}
		

	}

}
