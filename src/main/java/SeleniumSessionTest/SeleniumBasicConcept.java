package SeleniumSessionTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumBasicConcept {

	private static WebDriver driver;
	

	public static void main(String[] args) {

		

		registrationPage();
		
	}

	public static void registrationPage() {

		String browserName = "chrome";
		String Url = "https://naveenautomationlabs.com/opencart/index.php?route=account/register";

		// Create an object of BrowserUtility Class to access the methods of
		// that class
		BrowserUtility brwUtil = new BrowserUtility();

		// Initialize the browser
		driver = brwUtil.intializeBrowser(browserName);

		// Launch the Url
		brwUtil.doLaunchUrl(Url);

		String actTitle = brwUtil.getTitle();
		System.out.println("Actual title: " + actTitle);
		if (actTitle.contains("Register")) {
			System.out.println("Title is correct");
		} else {
			System.out.println("Title is incorrect");
		}

		// fetch the CurrentPageUrl

		String currentUrl = brwUtil.getCurrentUrl();
		if (currentUrl.equals(Url)) {
			System.out.println("Url is correct");
		} else {
			System.out.println("Url is incorrect");
		}
		By firtsName = By.name("firstname");
		// driver.findElement(firtsName).sendKeys("test");
		By lastName = By.name("lastname");
		By email = By.name("email");
		By telephone = By.name("telephone");
		By password = By.name("password");
		By confirmPwd = By.name("confirm");
		By agreeCheckBox = By.name("agree");
		By cntButton = By.cssSelector(".btn-primary");
		By text = By.tagName("h1");
		By errorMesg=By.cssSelector(".alert-dismissible");

		ElementsUtility eleUtil = new ElementsUtility(driver);

		eleUtil.doSendKeys(firtsName, "Akshi");
		eleUtil.doSendKeys(lastName, "Nigar");
		eleUtil.doSendKeys(email, "SampleTest@gamil.com");
		eleUtil.doSendKeys(telephone, "987667868");
		eleUtil.doSendKeys(password, "Test!23");
		eleUtil.doSendKeys(confirmPwd, "Test!23");
		eleUtil.doClick(agreeCheckBox);
		eleUtil.doClick(cntButton);
		String regText = eleUtil.doGetText(text);
		System.out.println("Text: " + regText);
		if(regText.contains("Created"))
		{
			System.out.println("Registration successful");
		}
		else
		{
			System.out.println("Registration unsuccessful");
			String errMsg=eleUtil.doGetText(errorMesg);
			System.out.println("Error msg: "+errMsg);
		}
		brwUtil.driverQuit();
		
	}

}
