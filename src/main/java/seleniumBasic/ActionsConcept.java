package seleniumBasic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		
		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
		Thread.sleep(3000);
		WebElement menilink=driver.findElement(By.cssSelector("a[class='menulink']"));
		
		Actions act= new Actions(driver);
		act.moveToElement(menilink).build().perform();
		Thread.sleep(3000);
		List<WebElement> menuLinks=driver.findElements(By.xpath("//ul[@class='submenu']//a"));
		System.out.println("Menu Links: "+menuLinks.size());
		
		for(WebElement e: menuLinks)
		{
			System.out.println(e.getText());
			if((e.getText()).equals("COURSES"))
			{
				e.click();
				
				break;
			}
		}
		driver.quit();
		
		
	}

}
