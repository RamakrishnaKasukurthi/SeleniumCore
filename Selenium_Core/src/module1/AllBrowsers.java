package module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AllBrowsers {

	WebDriver driver=null;
	
	@Test
	public void firefox() {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\91800\\Selenium Softwares\\geckodriver-v0.26.0-win32\\geckodriver.exe");
driver=new FirefoxDriver();
driver.get("https://www.selenium.dev/");
	}

	/*
	 * public void chrome() {
	 * 
	 * }
	 */

}
