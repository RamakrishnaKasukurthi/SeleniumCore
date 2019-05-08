package module1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BrowserCommandsPractice1 {
	@Test
	public void commands() {

		System.setProperty("webdriver.gecko.driver",
				"E:\\\\JAVA\\\\Eclipse_Selenium_Driver\\\\Gecko_Driver\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		String url = "http://shop.demoqa.com/";
		driver.get(url);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String pagetitle = driver.getTitle();
		int pagetitlelength = driver.getTitle().length();

		System.out.println("Page title is:" + pagetitle);
		System.out.println("page title length is: " + pagetitlelength);

		String actualurl = driver.getCurrentUrl();
		System.out.println(actualurl);

		if (actualurl.equals(url)) {
			System.out.println("Url is correct");
		} else {
			System.out.println("This is invalid Url");
		}

		String pagesource = driver.getPageSource();
		//System.out.println(pagesource);

		int pagesourcelength = driver.getPageSource().length();

		System.out.println("page source length is: " + pagesourcelength);
		
		driver.close();

	}

}
