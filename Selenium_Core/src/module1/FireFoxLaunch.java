package module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFoxLaunch {
	
	@Test
	public void firefox() {
		
		System.setProperty("webdriver.gecko.driver","E:\\JAVA\\Eclipse_Selenium_Driver\\Gecko_Driver\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.toolsqa.com/selenium-tutorial/");
	}

}
