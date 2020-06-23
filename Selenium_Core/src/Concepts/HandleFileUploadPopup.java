package Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopup {
	
	WebDriver driver=null;
	public void browserlaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91800\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("");

	}
public void fileupload() {
	
	
	driver.findElement(By.xpath("")).sendKeys("Path of the file which you want to upload");

	driver.findElement(By.name("submit")).click();
}
	
}
