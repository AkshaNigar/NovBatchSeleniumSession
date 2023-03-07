package SeleniumSessionTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeaderOpenCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        List<WebElement> headerList=driver.findElements(By.xpath("//a[text()='Desktops']/ancestor::ul/li/a"));
        
        for(WebElement ele:headerList)
        {
        	String text=ele.getText();
        	System.out.println(text);
        }
       
	}

}
