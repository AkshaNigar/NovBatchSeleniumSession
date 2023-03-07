package SeleniumSessionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/flights/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".sc-kfPuZi.hEnmCV.fswWidgetTitle")).click();
		List<String> expectedMonthPickers = Arrays.asList("May 2023", "June 2023");
		Thread.sleep(3000);

		By deparMonthPicker = By.xpath("//div[@class='DayPicker-Months']//div[@class='DayPicker-Caption']/div");
		By nextArrow = By.xpath("//span[@aria-label='Next Month']");
		By datePickerDay = By.xpath("//div[@aria-label='Thu Jun 15 2023']");
		By doneBtn = By.xpath("//span[@class='fswTrvl__done']");
		
//		while (true) {
//			List<WebElement> monthsPicker = driver.findElements(deparMonthPicker);
//			List<String> monthsPickerValue = new ArrayList<String>();
//			for (WebElement ele : monthsPicker) {
//				String text = ele.getText();
//				monthsPickerValue.add(text);
//			}
//			System.out.println(monthsPickerValue);
//
//			if (!monthsPickerValue.equals(expectedMonthPickers)) {
//				driver.findElement(nextArrow).click();
//			} else
//				break;
//		}
//
//		driver.findElement(selectDate).click();
//		driver.findElement(doneBtn).click();
		
		selectDepartureDate(deparMonthPicker,expectedMonthPickers,  nextArrow, datePickerDay,doneBtn );
	}	

	
	public static void selectDepartureDate(By deparMonthPicker, List<String> expectedMonthPickers, By nextArrow, By datePickerDay,By doneBtn )
	{
		while (true) {
			
			List<WebElement> monthsPicker = driver.findElements(deparMonthPicker);
			List<String> monthsPickerValue = new ArrayList<String>();
			for (WebElement ele : monthsPicker) {
				String text = ele.getText();
				monthsPickerValue.add(text);
			}
			System.out.println(monthsPickerValue);

			if (!monthsPickerValue.equals(expectedMonthPickers)) {
				driver.findElement(nextArrow).click();
			} else
				break;
		}

		driver.findElement(datePickerDay).click();
		driver.findElement(doneBtn).click();
	}
}
