package seleniumBasic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CodeWithSushil {

	static WebDriver driver;

	 public static void main(String[] args) {
		
		
		 ChromeOptions oc= new ChromeOptions();
		 oc.addArguments("Incognito");
		 driver = new ChromeDriver(oc);
	
		driver.get("https://codewithsushil.in/3.05cricketScorecard.html#");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='details-button']")).click();;
		driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
		driver.findElement(By.xpath("//a[text()='Click here to Generate Scorecard']")).click();
		List<WebElement> listOfscores=driver.findElements(By.xpath("//tbody/tr/td/following-sibling::td"));
		List<Integer> list= new ArrayList<Integer>();
		for(WebElement e: listOfscores)
		{
			String text=e.getText();
			list.add(Integer.valueOf(text));
			
		}
		Collections.sort(list);
		
		System.out.println(list);
		int ListSize=list.size()-1;
	
		driver.findElement(By.xpath("//input[@id='score']")).sendKeys(String.valueOf(list.get(ListSize)));
		
	}

}
