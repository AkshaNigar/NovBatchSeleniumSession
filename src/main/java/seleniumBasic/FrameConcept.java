package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameConcept {

	static WebDriver driver;
	
		public static void main(String[] args)  {
			
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			driver.get("http://www.londonfreelance.org/courses/frames/index.html");
			driver.switchTo().frame("main");
			String text=driver.findElement(By.xpath("//h2[text()='Title bar ']")).getText();
			System.out.println(text);
			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			String text1=driver.findElement(By.xpath("//h1[text()='Example home page ']")).getText();
			System.out.println(text1);

	}

}
