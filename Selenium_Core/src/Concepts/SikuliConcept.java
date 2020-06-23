package Concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class SikuliConcept {
	
	WebDriver driver = null;

	@Test
	public void browserLaunch() throws FindFailed {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\91800\\\\Selenium Softwares\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=OYlzcXA3LxI&t=1632s");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		
		//for sikuli we have to d/w jar and capture the icons to perform
		//use: some element we can not identify then we can use this to click example buttons, calendar etc
		
		//create object of Screen class sikuli
		Screen s=new Screen();
		//for pause icon
		Pattern pause=new Pattern("Pause_YT.JPG");
		s.wait(pause,2000);
		s.click();
		
		
		
	}


}
