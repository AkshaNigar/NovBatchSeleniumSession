package SeleniumSessionTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAlertConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='JavaScript Alerts']")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		Thread.sleep(2000);
//		Alert alert=driver.switchTo().alert();
//		String alText=alert.getText();
//		System.out.println(alText);
//		alert.accept();
//		String resultText=driver.findElement(By.xpath("//p[@id='result']")).getText();
//		if(resultText.equals("You successfully clicked an alert"))
//		{
//			System.out.println("Pass");
//		}
		
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		Alert al=driver.switchTo().alert();
//		System.out.println(al.getText());
//		//al.accept();
//		al.dismiss();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert alt=driver.switchTo().alert();
		alt.sendKeys("Test12");
		alt.accept();
	}
	

}
