package SeleniumSessionTest;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementsUtility {
	
	// Making it private user would not be able to access this .. if user access this will get null pointer exception due default value of this as null
	
	private WebDriver driver;
	
	// To initialize the value to this default driver we are creating constructor of this class
	public ElementsUtility(WebDriver driver)
	{
	this.driver= driver;	
	}
	
	public WebElement doGetElement(By locator){
		return driver.findElement(locator);
	}
	
	public void doSendKeys(By locator, String value)
	{
		doGetElement(locator).sendKeys(value);
	}
	
	public void doClick(By locator){
		doGetElement(locator).click();
	}
	
	public String doGetText(By locator){
		return doGetElement(locator).getText();
	}
	public  List<WebElement> doGetElements(By locator)
	{
		return driver.findElements(locator);
	}
	public  int sizeOfList(By locator)
	{
		return doGetElements(locator).size();
	}
	public  boolean doIsDisplayed(By locator)
	{
		return doGetElement(locator).isDisplayed();
	}
	
	public  boolean doIsEnabled(By locator)
	{
		return doGetElement(locator).isEnabled();
	}
	public  boolean doIsSelected(By locator)
	{
		return doGetElement(locator).isSelected();
	}
	public  String getElementAttribute(By locator, String atrname)
	{
		return doGetElement(locator).getAttribute(atrname);
	}

	public void getElementsAttribute(By locator, String value)
	{
		List<WebElement> eleList=doGetElements(locator);
		
		for(WebElement ele: eleList)
		{
			String atrValue=ele.getAttribute(value);
			String eleText=ele.getText();
			System.out.println(atrValue+":::"+eleText);
		}
		
	}
	
	public int getTotalElementcount(By locator)
	{
		int eleCount= doGetElements(locator).size();
		System.out.println("Total count :"+eleCount);
		return eleCount;
		
	}
	public  void doSearch(By suggLocator, String value) throws InterruptedException {

		List<WebElement> suggList = doGetElements(suggLocator);
		System.out.println(suggList.size());
		for (WebElement e : suggList) {
			String text = e.getText();
			if (text.equals(value)) {
				e.click();
				break;
			}
		}
		}
	
	//**************Select DropDown Utility*****************
	public  void doSelectDropDownByIndex(By locator, int index)
	{
		Select select = new Select(doGetElement(locator));
		select.selectByIndex(index);
		
	}
	public  void doSelectDropDownByValue(By locator, String value)
	{
		Select select = new Select(doGetElement(locator));
		select.selectByValue(value);
	}
	public  void doSelectDropDownByVisibleText(By locator, String text)
	{
		Select select = new Select(doGetElement(locator));
		select.selectByVisibleText(text);
	}
	public  int getTotalDropDownOptions(By locator) {
		Select select = new Select(doGetElement(locator));
		List<WebElement> dropDownOptions = select.getOptions();
		int optionCount = dropDownOptions.size();
		return optionCount;
	}

	public  List<String> getDropDownOptionsTextList(By locator) {
		Select select = new Select(doGetElement(locator));
		List<String> optionTextList = new ArrayList<String>();
		List<WebElement> optionsList = select.getOptions();
		for (WebElement e : optionsList) {
			String text = e.getText();
			optionTextList.add(text);

		}
		return optionTextList;
	}

	public  List<WebElement> getDropDownOptionsList(By locator) {
		Select select = new Select(doGetElement(locator));
		return select.getOptions();
	}

	public  void selectDroDownValue(By locator, String expValue) {
		List<WebElement> optionsList = getDropDownOptionsList(locator);
		for (WebElement e : optionsList) {
			String text = e.getText();
			if (text.equals(expValue)) {
				e.click();
				break;
			}
		}
	}


	
}
