package module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserCommands {
	@Test
	public void commands() {

		System.setProperty("webdriver.chrome.driver",
				"E:\\JAVA\\Eclipse_Selenium_Driver\\Chrome_Driver\\New\\chromedriver.exe");
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
		
		System.out.println(pagesource);
		
		driver.close();
		//This method Close only the current window the WebDriver is currently controlling
		
		driver.quit();
		//This method Closes all windows opened by the WebDriver

	}

}
