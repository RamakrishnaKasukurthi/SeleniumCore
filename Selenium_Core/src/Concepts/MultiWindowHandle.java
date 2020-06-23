package Concepts;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultiWindowHandle {
	
	WebDriver driver=null;
	@Test
	public void browserlaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91800\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("http://www.popuptest.com/");
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


	}
	@Test
	public void handleWindow() {
		
		driver.findElement(By.linkText("Multi-PopUp Test")).click();
		
		//take all windows into set collection object.
		
		Set<String> handler=driver.getWindowHandles();
		
		//by using Iterator we need to move to next window.
		Iterator<String> it=handler.iterator();
		
		String parentwindow=it.next();
		
		System.out.println("Parent window: "+parentwindow);
		System.out.println(driver.getTitle());
		
		String childwindow=it.next();
		
		System.out.println("Chaild window: "+childwindow);
		System.out.println(driver.getTitle());
		
		//by using switch we need to move requird window
		driver.switchTo().window(childwindow);
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentwindow); 
		
		System.out.println(driver.getTitle());
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@type='button']")).click();
		
	}

}
