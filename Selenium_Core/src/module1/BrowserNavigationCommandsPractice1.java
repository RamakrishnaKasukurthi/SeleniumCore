package module1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserNavigationCommandsPractice1 {
	
	@Test
	public void navigationCommands() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\JAVA\\Eclipse_Selenium_Driver\\Chrome_Driver\\New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.DemoQA.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Sortable")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().to("http://www.DemoQA.com");
	
	/*driver.navigate().to("URL");
	//It does exactly the same thing as the driver.get(appUrl) method
	
	
	driver.navigate().forward();
	//Takes you forward by one page on the browser’s history
	
	driver.navigate().back();
	//Takes youback by one page on the browser’s history.
	
	driver.navigate().refresh();
	//Perform the same function as pressing F5 in the browser.
	
	
	*/
	
	}

}
