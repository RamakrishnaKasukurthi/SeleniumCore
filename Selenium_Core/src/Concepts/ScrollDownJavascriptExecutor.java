package Concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollDownJavascriptExecutor {
	
	
WebDriver driver =null;
	
	@Test
	public void browserLaunch() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\91800\\\\Selenium Softwares\\\\chromedriver_win32\\\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//WebElement element=driver.findElement(By.xpath("//input[@name='proceed']"));

JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,1000)");

//This will scroll the page Horizontally till the element is found		
//js.executeScript("arguments[0].scrollIntoView();", Element);

//scroll down to the bottom of the webpage
js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	
	
	}

}
