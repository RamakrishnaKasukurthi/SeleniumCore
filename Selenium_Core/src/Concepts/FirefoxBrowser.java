package Concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirefoxBrowser {

	
	@Test
	public void launch() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\91800\\Selenium Softwares\\geckodriver-v0.26.0-win32\\geckodriver.exe");
		WebDriver obj=new FirefoxDriver();
		obj.get("https://www.selenium.dev/");
	}

}
