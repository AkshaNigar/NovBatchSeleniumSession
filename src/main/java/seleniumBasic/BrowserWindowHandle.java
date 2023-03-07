package seleniumBasic;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandle {

	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement fb=driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		fb.click();
		//Get window Id
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		String parentWinId=it.next();
		String childWinId=it.next();
		System.out.println("parentWinId:"+parentWinId);
		System.out.println("childWinId:"+childWinId);
		//Switch to window 
		driver.switchTo().window(childWinId);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close(); // It will close the current window and after closing the that window , Now driver is loast
		driver.switchTo().window(parentWinId);
		System.out.println(driver.getCurrentUrl());
		driver.quit();

	}

}
