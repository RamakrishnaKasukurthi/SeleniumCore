package Concepts;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLinksTest {

	WebDriver driver = null;

	@Test
	public void browselaunch() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91800\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.softwaretestingmaterial.com/");

		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// broken links mean navigation pages or separate URL navigation
//it will be link:  //a href<http://www.google.com>
		// it will be imgs //img href<http://www.test.com>

		// 1. get the all links and images in list

		List<WebElement> li = driver.findElements(By.tagName("a"));
		li.addAll(driver.findElements(By.tagName("img")));

		System.out.println(li.size());

		List<WebElement> li2 = new ArrayList<WebElement>();

//2. Iterate list to ignore links and imgs which does not have href attribute

	try {
		
	
		for (int i = 0; i < li.size(); i++) {

			if (li.get(i).getAttribute("href") != null) {

				li2.add(li.get(i));

			}
		}
	} catch (StaleElementReferenceException e) {
		e.printStackTrace();
		System.out.println("stale element reference exception");
	}
	
		System.out.println(li2.size());
		
		//get the active link list
		for (int j = 0; j < li2.size(); j++) {
			//Http conection to check the href
			HttpURLConnection connection=(HttpURLConnection) new URL(li2.get(j).getAttribute("href")).openConnection();
			
			//connect the url 
			connection.connect();
			String message=connection.getRequestMethod();  //ok
			//to disconnect
			connection.disconnect();
			System.out.println(li2.get(j).getAttribute("href")+"---->"+message);
		}
		

	}

}
