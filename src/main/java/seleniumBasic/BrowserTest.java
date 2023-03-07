package seleniumBasic;

public class BrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String browsername="chrome";
		String Url="https://www.amazon.com/";
		BrowserUtil brUtils = new BrowserUtil();
		brUtils.initDriver(browsername);
		brUtils.launchUrl(Url);
		String pageTitle=brUtils.getPageTitle();
		System.out.println(pageTitle);
		if(pageTitle.contains("Amazon"))
		{
			System.out.println("Title is correct: "+pageTitle);
		}
		else
		{
			System.out.println("Title is Incorrect");
		}
		
		String curURL=brUtils.getCurrentUrl();
		System.out.println("CurrentUrl:"+curURL);
		if(curURL.equalsIgnoreCase(Url))
		{
			System.out.println("URL is matching with actual url");
		}

		else
		{
			System.out.println("Expected URL is not matching with Actual URL ");
		}
		
		brUtils.quitBrowser();
	}

}
