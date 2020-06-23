package Concepts;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Screenshot {
	
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
	public void screenShot() {
		
		/*
		 * TakesScreenshot ts=(TakesScreenshot)driver; File
		 * srcfile=ts.getScreenshotAs(OutputType.FILE); File.copyFile(srcfile, new
		 * File(""));
		 */
		
		  try {
	          TakesScreenshot ts=(TakesScreenshot)driver;  
			  File scrFile = ts.getScreenshotAs(OutputType.FILE);
	            //The below method will save the screen shot in destination directory with name "screenshot.png"
	             FileHandler.copy(scrFile, new File("C:\\Users\\91800\\OneDrive\\Desktop\\REtest\\screenshot.png"));
	         } catch (IOException e) {
	             e.printStackTrace();
	            }
		
		
	}

}
