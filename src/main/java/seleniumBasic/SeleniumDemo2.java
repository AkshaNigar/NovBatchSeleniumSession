package seleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumDemo2 {
	static WebDriver driver;

	public static void main(String[] args) {
		
		String browser = "Chrome";

		// 1. using switch case
		switch (browser) {
		case "Chrome":
			driver = new ChromeDriver();
			break;
		case "Edge":
			driver = new EdgeDriver();
			break;
		case "Firefox":
			driver = new EdgeDriver();
			break;

		case "IE":
			driver = new InternetExplorerDriver();
			break;
		default:
			System.out.println("Please pass the correct browser:" + browser);
			break;
		}
		
		driver.get("https://www.amazon.com/");
		
		String actTitle = driver.getTitle();
		if(actTitle.contains("Amazon"))
		{
			System.out.println("Title is correct");
		}
		else 
		{
			System.out.println("Title is incorrect");
		}
		
		driver.quit();
		
		
	}

}
