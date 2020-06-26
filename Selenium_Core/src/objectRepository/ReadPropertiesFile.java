package objectRepository;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ReadPropertiesFile {
	
	WebDriver driver=null;
	
	@Test
	public void readProperties() throws IOException {
		
		//create Properties object
		Properties pro=new Properties();
		
		//store the file path into FileInputStream object 
		FileInputStream fi=new FileInputStream("C:\\Users\\91800\\eclipse-workspace\\SeleniumCore\\Selenium_Core\\src\\objectRepository\\config.properties");
  
		//load FileInputStream object into Properties object 
		pro.load(fi);
  
  //get the properties which is store in file
  String browser=pro.getProperty("browser");
  
  if (browser.equals("chrome")) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91800\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
}else if (browser.equals("FF")) {
	System.setProperty("webdriver.gecko.driver",
			"C:\\Users\\91800\\Selenium Softwares\\geckodriver-v0.26.0-win32\\geckodriver.exe");
driver=new FirefoxDriver();
} else System.out.println("Invalid Browser");
  
driver.get(pro.getProperty("URL"));
	}


}
