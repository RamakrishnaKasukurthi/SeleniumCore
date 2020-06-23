package Concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class HtmlUnitDriverConcept {
	
	//HTMLunit drive is not available after 3.x on words so we have to download in google 
	
	//testing will happen in behind no browser will launch
	//very fast execution 
	//not suitable for Actions Class, mouse action, double click, drag and drop
	// called as gost driver and headless browser
	
	@Test
public void launch() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\91800\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
	//WebDriver driver=new ChromeDriver();
	WebDriver driver=new HtmlUnitDriver();
	
	driver.get("https://www.selenium.dev/");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.findElement(By.linkText("Downloads")).click();
	
System.out.println(driver.getCurrentUrl());
}

}
