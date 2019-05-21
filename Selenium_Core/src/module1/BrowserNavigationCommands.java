package module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BrowserNavigationCommands {
	
	@Test
	public void navigationCommands() {
		
		System.setProperty("webdriver.gecko.driver",
				"E:\\\\JAVA\\\\Eclipse_Selenium_Driver\\\\Gecko_Driver\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.DemoQA.com");
	
	driver.navigate().to("URL");
	//It does exactly the same thing as the driver.get(appUrl) method
	
	
	driver.navigate().forward();
	//Takes you forward by one page on the browser’s history
	
	driver.navigate().back();
	//Takes youback by one page on the browser’s history.
	
	driver.navigate().refresh();
	//Perform the same function as pressing F5 in the browser.
	
	
	
	
	}

}
