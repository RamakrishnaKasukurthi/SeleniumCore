package Concepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertPopupHandle {
	
	WebDriver driver=null;
	@Test
	public void browselaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91800\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
driver =new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	 
	 }
	@Test
	public void handle() {
		driver.manage().window().maximize();
		driver.findElement(By.name("proceed")).click();
		//craete object of Alert class and swithc to alert.
		Alert al=driver.switchTo().alert();
		String st=al.getText();
		System.out.println(st);
		
		//to accept the alert
		al.accept();
		 
		// to dismiss the alert.
		al.dismiss();
		
		
	}

}
