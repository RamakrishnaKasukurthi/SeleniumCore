package module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFoxLaunch {
	
	@Test
	public void firefox() {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\91800\\Selenium Softwares\\geckodriver-v0.26.0-win32\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.toolsqa.com/selenium-tutorial/");
	}

}
