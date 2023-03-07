package SeleniumSessionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyTrip {

		static WebDriver driver;

		public static void main(String[] args) throws Exception {

			driver = new ChromeDriver();
			driver.get("https://www.makemytrip.com/");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//p[@data-cy='departureDate']")).click();
			Thread.sleep(3000);
			List<String> expectedMonthPickersList = Arrays.asList("May 2023", "June 2023");
			

			By deparMonthPicker = By.xpath("//div[@class='DayPicker-Months']//div[@class='DayPicker-Caption']/div");
			By nextArrow = By.xpath("//span[@aria-label='Next Month']");
			By datePickerDay = By.xpath("//div[@aria-label='Thu Jun 15 2023']");
			//By waitElement=By.linkText("June 2023");
				

			selectDepartureDate(deparMonthPicker,expectedMonthPickersList,  nextArrow, datePickerDay );
	}

		
		public static void selectDepartureDate(By deparMonthPicker, List<String> expectedMonthPickersList, By nextArrow, By datePickerDay) throws InterruptedException
		{
			while (true) {
				
				List<WebElement> monthsPicker = driver.findElements(deparMonthPicker);
				List<String> monthsPickerValue = new ArrayList<String>();
				for (WebElement ele : monthsPicker) {
					String text = ele.getText();
					monthsPickerValue.add(text);
				}
				System.out.println(monthsPickerValue);

				if (!monthsPickerValue.equals(expectedMonthPickersList)) {
					driver.findElement(nextArrow).click();
				} else
					break;
			}

			Thread.sleep(5000);
			driver.findElement(datePickerDay).click();
			
		}
}
