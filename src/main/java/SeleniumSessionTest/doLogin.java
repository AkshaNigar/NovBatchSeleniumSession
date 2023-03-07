package SeleniumSessionTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class doLogin {

	public static void main(String[] args) {
		doLoginUser();
	}

	public static void doLoginUser() {
		BrowserUtility brwUtil = new BrowserUtility();
		WebDriver driver = brwUtil.intializeBrowser("chrome");
		ElementsUtility eleUtil = new ElementsUtility(driver);
		brwUtil.doLaunchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String loginTitle = brwUtil.getTitle();
		System.out.println(loginTitle);
		if (loginTitle.equalsIgnoreCase("Account Login")) {
			System.out.println("landed on correct page");
		} else {
			System.out.println("landed on incorrect page");
		}

		// By locator
		By email = By.id("input-email");
		By pwd = By.id("input-password");
		By loginBtn = By.xpath("//*[@id='content']/div/div[2]/div/form/input");

		eleUtil.doSendKeys(email, "SampleTest@gamil.com");
		eleUtil.doSendKeys(pwd, "Test!23");
		eleUtil.doClick(loginBtn);
		String titleText=brwUtil.getTitle();
		System.out.println(titleText);
		if(titleText.equalsIgnoreCase("My Account"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}

	}
}
