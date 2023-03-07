package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
	
	public static void main(String[] args)
	{
		
		String browserName= "chrome";
		String Url= "https://naveenautomationlabs.com/opencart/index.php?route=account/register";
		
		// Create an object of BrowserUtil class to call the methods of BrowserUtil class
		BrowserUtil brUtils= new BrowserUtil();
		WebDriver driver=brUtils.initDriver(browserName);
		brUtils.launchUrl(Url);
		String currentURL=driver.getCurrentUrl();
		if(currentURL.equalsIgnoreCase(Url))
		{
			System.out.println("Actual and Expected Urls are matched");
		}
		else
		{
			System.out.println("Actual and Expected Urls are not matched");
		}
		
		String pageTitle=brUtils.getPageTitle();
		System.out.println(pageTitle);
		if(pageTitle.contains("naveen"))
		{
			System.out.println("Title is correct");
		}
		else
		{
			System.out.println("Title is incorrect");
		}
		
		//By Locator : does not hit the server: just maintaining the locator(By is class availaible in selenium and Id is a static method)
		
		By firstName=By.id("input-firstname");
		By lastName=By.id("input-lastname");
		By emailID=By.id("input-email");
		By telephone=By.id("input-telephone");
		By password=By.id("input-password");
		By confirmpassword= By.id("input-confirm");
		
		
		// Create an object ElementUtils class to access the method of this class
		ElementUtils eleUtils= new ElementUtils(driver);
		eleUtils.doSendKeys(firstName, "Akshi");
		eleUtils.doSendKeys(lastName, "Nigar");
		eleUtils.doSendKeys(emailID, "Test1233@gmail.com");
		eleUtils.doSendKeys(telephone, "8768768585");
		eleUtils.doSendKeys(password, "Test@123!@#");
		eleUtils.doSendKeys(confirmpassword, "Test@123!@#");
		
		
		//brUtils.closeBrowser();
		
		
		
	
		
	}

}
