package seleniumBasic;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CriInfoTable {

	static WebDriver driver;

	 public static void main(String[] args) {
		
		
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/sa20-2022-23-1335268/mi-cape-town-vs-pretoria-capitals-20th-match-1343960/full-scorecard");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//Rilee Rossouw
		String wicketTakerName=getWicketTakerName("Rilee Rossouw");
		System.out.println(wicketTakerName);
		wicketTakerName=getWicketTakerName("Clyde Fortuin");
		System.out.println(wicketTakerName);
		
		List<String> batsmanDetails=getBatsmanDetails("Adil Rashid");
		System.out.println(batsmanDetails);
	}
	 
	 public static String getWicketTakerName(String batsmanName)
	 {
		 return driver.findElement(By.xpath("//span[text()='"+batsmanName+"']/ancestor::td/following-sibling::td//span/span"))
		 .getText();
	 }
	 
	 public static List<String> getBatsmanDetails(String batsmanName)
	 {
		 List<WebElement> batsmanDetails=driver.findElements(By.xpath("//table[contains(@class,'ci-scorecard-table')]//span[text()='"+batsmanName+"']/ancestor::td/following-sibling::td[contains(@class, 'ds-text-right')]"));
	     List<String> detailsList=new ArrayList<String>();
	     for(WebElement e:batsmanDetails )
	     {
	    	 String text=e.getText();
	    	 detailsList.add(text);
	     }
	     return detailsList;
	 
	 
	 
	 }

}
