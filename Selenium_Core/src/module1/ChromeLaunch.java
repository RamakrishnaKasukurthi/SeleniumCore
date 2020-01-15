package module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeLaunch {

	@Test
	public void chrome() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91800\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.toolsqa.com/selenium-tutorial/");
	}

}
