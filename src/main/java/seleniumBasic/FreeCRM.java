package seleniumBasic;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FreeCRM {

	 static WebDriver driver;

	 public static void main(String[] args) throws InterruptedException {
		
		
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.cfm?CFID=223179&CFTOKEN=47949907&jsessionid=b630c72d795b294903472a2d441114292f41");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		//by locator
		By userName = By.xpath("//input[@placeholder='Username']");
		By password = By.xpath("//input[@placeholder='Password']");
		By logInBtn = By.xpath("//input[@value='Login']");
		By contactLink=By.xpath("//a[text()='Contacts']");
		By clmLocator = By.xpath("//form[@id='vContactsForm']/table/tbody/tr/td[@class='datatitle']");
		By rowLocator = By.xpath("//input[@name='contact_id']");
		
		String text= "Ali khan";
		By selectCheckbox=By.xpath("//a[text()='"+text+"']/parent::td/preceding-sibling::td/input");
		By companyName=By.xpath("//a[text()='Adam Lambert']/parent::td/following-sibling::td/a[@context='company']");
		By userDetails=By.xpath("//a[text()='Ali khan']/parent::td/following-sibling::td/following-sibling::td");
		
		
		getElement(userName).sendKeys("newautomation");
		getElement(password).sendKeys("Selenium@12345");
		getElement(logInBtn).click();

		Thread.sleep(4000);

		driver.switchTo().frame(1);
		getElement(contactLink).click();

		int column = getColumnCount(clmLocator);
		System.out.println("Column: "+column);
		int rows = getRowsCount(rowLocator)-1;
		System.out.println("Rows: " +rows);
		selectUser(selectCheckbox);
		String cmpName=getUserCompanyName("Ali khan");
		System.out.println(cmpName);
		 cmpName=getUserCompanyName("Chicago Bruner");
		System.out.println(cmpName);
		
		List<String> userInfo=getUserDetails(userDetails);
		System.out.println(userInfo);
		
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static int getColumnCount(By locator) {
		return getElements(locator).size();
	}

	public static int getRowsCount(By locator) {
		return getElements(locator).size();

	}
	
	public static void selectUser(By locator)
	{
		getElement(locator).click();
	}
	
	public static String getUserCompanyName(String text)

	{
		return driver.findElement(By.xpath("//a[text()='"+text+"']/parent::td/following-sibling::td/a[@context='company']")).getText();
	}
	public static List<String> getUserDetails(By locator)
	{
		List<WebElement> userDetails=getElements(locator);
		List<String> userInfo=new ArrayList<String>();
		for(WebElement e: userDetails)
		{
			String text=e.getText();
			userInfo.add(text);
		}
		return userInfo;
	}
}
