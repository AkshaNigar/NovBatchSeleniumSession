package testngSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterPageOpenCarkTest extends BaseTest {
	
	
	@Test
	public void creatUser()
	{
		driver.findElement(By.id("input-firstname")).sendKeys("Akshi");
		driver.findElement(By.id("input-lastname")).sendKeys("Nigar");
		driver.findElement(By.id("input-email")).sendKeys("AutoTest122@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("8456755787");
		driver.findElement(By.id("input-password")).sendKeys("Password@123");
		driver.findElement(By.id("input-confirm")).sendKeys("Password@123");
		
		driver.findElement(By.xpath("(//input[@name='newsletter'])[1]")).click();
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("Your Account Has Been Created!"));
		
		String ucCnfMsg=driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
		System.out.println("Confirmation message:" +ucCnfMsg);
		Assert.assertEquals(ucCnfMsg, "Your Account Has Been Created!");
		
		
	}
	
	
	
	
}
