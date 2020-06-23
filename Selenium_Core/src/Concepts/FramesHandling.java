package Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesHandling {
	
	WebDriver driver=null;
	public void browserlaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91800\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("");

	}
	
	public void frames() {
		
		//switch to frame and enter frame name to move the frame.
		//we can pass frame name or index id or web element
		driver.switchTo().frame("");
		//after that we have to select the element in that frame.
		driver.findElement(By.xpath("")).click();
		
	}

}
