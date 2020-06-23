package Concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeBrowser {
	
	@Test
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91800\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
	WebDriver obj=new ChromeDriver();
	obj.get("https://www.selenium.dev/");
	}

}
