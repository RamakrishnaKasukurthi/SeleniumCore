package Concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ElementVisibilityTest {
	
	
WebDriver driver =null;
	
	@Test
	public void browserLaunch() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\91800\\\\Selenium Softwares\\\\chromedriver_win32\\\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("");
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//isisDisplayed: for all web elements

Boolean b1=driver.findElement(By.xpath("")).isDisplayed();// true/false

//isEnabled for all web elements
Boolean b2=driver.findElement(By.xpath("")).isEnabled();// true/false

//isSelected for check box, radio buttons and drop downs 
Boolean b3=driver.findElement(By.xpath("")).isSelected();// true/false
}
}
