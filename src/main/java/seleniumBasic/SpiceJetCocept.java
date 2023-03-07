package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJetCocept {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.sastasafar.com/airline/spicejet?gclid=EAIaIQobChMI65id29rq_AIVZIdLBR1iLg3UEAAYASAAEgKravD_BwE");
		
		driver.findElement(By.xpath("//input[@class='formRow--input js-input addclearbutton' and @id='origin']")).click();
		

	}

}
