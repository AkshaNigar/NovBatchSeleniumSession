package seleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopUp {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//driver.get("https://Test:Test@the-internet.herokuapp.com/basic_auth");
//		String username = "admin";
//		String password = "admin";
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	
	
	}

}
