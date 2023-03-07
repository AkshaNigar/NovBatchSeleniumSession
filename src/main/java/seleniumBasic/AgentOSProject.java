package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AgentOSProject {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		driver.get("https://P2955296:Testing123@login.esso-uat.charter.com:8443/nidp//app/login?sid=0&option=credential");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("P2955296");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Testing123!@#");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		
		
		
	}

}
