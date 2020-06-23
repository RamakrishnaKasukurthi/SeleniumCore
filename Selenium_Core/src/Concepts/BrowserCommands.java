package Concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserCommands {
	@Test
	public void commands() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91800\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.toolsqa.com/selenium-tutorial/");
		// This method Load a new web page in the current browser window.

		String title = driver.getTitle();
		// This method fetches the Title of the current page

		System.out.println(title);

		String url = driver.getCurrentUrl();
		// This method fetches the string representing the Current URL which is opened  in the browser

		System.out.println(url);
		
	String pagesource=driver.getPageSource();
		//This method returns the Source Code of the page
		
		//System.out.println(pagesource);
		
		driver.close();
		//This method Close only the current window the WebDriver is currently controlling
		
		driver.quit();
		//This method Closes all windows opened by the WebDriver
		
		//equals(); to compare the Stings  
		
		boolean x= title.equals(url);
		System.out.println(x);
		
		

	}

}
