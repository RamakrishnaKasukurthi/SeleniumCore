package Concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotationsExample2 {
	
	//this for setting priority to @Test

	WebDriver driver=null;
	@BeforeMethod
	public void browserLaunch() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91800\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		System.out.println("Browser launch");

		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	@Test(priority = 1)
	public void getURL() {
		System.out.println(driver.getCurrentUrl());
		
	}
	@Test(priority = 2)
	public void getTitleofPage() {
		
		
		System.out.println(driver.getTitle());
	}
	@Test(priority = 3)
	public void searchButton() {
		Boolean b1=driver.findElement(By.xpath("//*[@value='Google Search']")).isDisplayed();
	System.out.println(b1);
	}
	
	@Test(priority = 4)
	public void gamilLink() {
		Boolean b2=driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).isDisplayed();
		System.out.println(b2);
		
	}
	
	@AfterMethod
	public void teardown() {
 
		System.out.println("browser closing");
		driver.quit();
		
	}

	
	
}
