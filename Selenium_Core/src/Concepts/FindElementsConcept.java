package Concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindElementsConcept {
	
	WebDriver driver=null;
	@Test
	public void browselaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91800\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
driver =new ChromeDriver();
driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	 }
	@Test
	public void elements() {
		
		java.util.List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println(li.size());
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i).getText());
			
		}
	}

}
