package seleniumBasic;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertWaitConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");

	   WebElement jsAlert=driver.findElement(By.xpath("//a[text()='JavaScript Alerts']"));
	   By alert=By.xpath("//a[text()='JavaScript Alerts']");
	   By JSAlert=By.xpath("//button[@onclick='jsAlert()']");
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		Boolean flag = wait.until(ExpectedConditions.textToBePresentInElement(jsAlert, "JavaScript Alerts"));
//		System.out.println(flag);
		System.out.println(waitForTextToBePresentInElement(10, jsAlert).booleanValue());
		
		Alert alert_js=waitForAlertisPresent(10, alert, JSAlert);
		System.out.println(alert_js.getText());
		alert_js.accept();
	
		
		String result=driver.findElement(By.id("result")).getText();
		if(result.equalsIgnoreCase("You successfully clicked an alert"))
		{
			System.out.println("Clicked on Alert successfully.");
		}
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}

	public static Boolean waitForTextToBePresentInElement(int timeOut, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.textToBePresentInElement(element, "JavaScript Alerts"));
		
	}

	public static Alert waitForAlertisPresent(int timeOut, By locator1, By locator2) {
		getElement(locator1).click();
		getElement(locator2).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
	   return wait.until(ExpectedConditions.alertIsPresent());
		
	}

}
