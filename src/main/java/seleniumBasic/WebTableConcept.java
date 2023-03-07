package seleniumBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 driver= new ChromeDriver();

		 driver.get("https://cosmocode.io/automation-practice-webtable/");
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		// String textmsg=driver.findElement(By.xpath("(//strong[contains(text(), 'Angola')]/parent::td/following-sibling::td)[3]")).getText();
		 //System.out.println(textmsg);
		int rows= driver.findElements(By.xpath("//tbody//tr")).size();
		int coloumn= driver.findElements(By.xpath("//tbody//tr[1]//td")).size();
		 
		
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=coloumn; j++)
			{
				String text=driver.findElement(By.xpath("//tbody//tr["+i+"]"+"/td["+j+"]")).getText();
				System.out.print(text+"        ");
			}
			System.out.println();
		}
	}

}
