package seleniumBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {


	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.makemytrip.com/");
		System.out.println(driver.getTitle());
		if(driver.getTitle().contains("MakeMyTrip"))
		{
			System.out.println("Title is correct");
		}
		else
		{
			System.out.println("Title is incorrect");
		}
		
		//Click on From option
		driver.findElement(By.id("fromCity")).click();
		Thread.sleep(3000);
		
		// Fetch all city available under From 
		List<WebElement> fromList=driver.findElements(By.xpath("//ul[@role='listbox']/li//p[contains(@class, 'blackText')]"));
		List<String> frmCities=new ArrayList<String>();
		for(WebElement ele: fromList)
		{
			String fromCity=ele.getText();
			frmCities.add(fromCity);
		}
		Collections.sort(frmCities);
		for(String e:frmCities)
		{
			System.out.println(e);
		}
		List<String> expectedList= Arrays.asList("Bangkok, Thailand", "Bengaluru, India");
		System.out.println(frmCities.containsAll(expectedList));
		
		//Select any city under from
		
		driver.findElement(By.xpath("//p[text()='Pune, India']")).click();
		
		driver.findElement(By.id("toCity")).click();
		List<WebElement> toList=driver.findElements(By.xpath("//div[@id='react-autowhatever-1']//ul/li//p[contains(@class, 'blackText')]"));
		List<String> toCities=new ArrayList<String>();
		for(WebElement element: toList)
		{
			String toCity=element.getText();
			toCities.add(toCity);
		}
		System.out.println(toCities);
		//Select any city from To options
		
		driver.findElement(By.xpath("//p[text()='New Delhi, India']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//p[text()='16'])[1]")).click();
		String departureDate=driver.findElement(By.xpath("//p[@data-cy='departureDate']")).getText();
		System.out.println(departureDate);
		
		driver.findElement(By.xpath("(//span[contains(@class,'appendBottom10')])[2]")).click();
		driver.findElement(By.xpath("(//p[text()='23'])[2]")).click();
		String returnDat=driver.findElement(By.xpath("//p[@data-cy='returnDate']")).getText();
		System.out.println(returnDat);
	}

}
