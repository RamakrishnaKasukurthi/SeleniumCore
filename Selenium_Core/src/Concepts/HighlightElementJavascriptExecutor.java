package Concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HighlightElementJavascriptExecutor {
	
	WebDriver driver =null;
	
	@Test
	public void browserLaunch() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\91800\\\\Selenium Softwares\\\\chromedriver_win32\\\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

WebElement element=driver.findElement(By.xpath("//input[@name='proceed']"));



//Create object of a JavascriptExecutor interface
JavascriptExecutor js = (JavascriptExecutor) driver;
      //use executeScript() method and pass the arguments 
      //Here i pass values based on css style. Yellow background color with solid red color border. 
js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;')", element);




	}

}
