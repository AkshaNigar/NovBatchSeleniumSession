package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AdminDemo_Webtable {
	static WebDriver driver;

	public static void main(String[] args) {

//		ChromeOptions oc = new ChromeOptions();
//		// oc.setHeadless(true);
//		oc.addArguments("--ncognito");

		driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/admin/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#Email")).clear();
		driver.findElement(By.cssSelector("#Email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.cssSelector("#Password")).clear();
		driver.findElement(By.cssSelector("#Password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
