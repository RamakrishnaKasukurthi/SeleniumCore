package Concepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BootstrapDropdown2 {
	
	WebDriver driver = null;

	@Test
	public void browserLaunch() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\91800\\\\Selenium Softwares\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://getbootstrap.com/docs/4.5/components/dropdowns/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}
	
	@Test
		public void select() {
			driver.findElement(By.id("dropdownMenuLink")).click();
			
			List<WebElement> li=driver.findElements(By.xpath("//*[@class='dropdown-menu show']//a"));
			
			System.out.println(li.size());
			for (int i = 0; i < li.size(); i++) {
				
				String st=li.get(i).getText();
				
				if (st.equals("Another action")) {
					li.get(i).click();
					
				}
			}
		}
		
	}
	


