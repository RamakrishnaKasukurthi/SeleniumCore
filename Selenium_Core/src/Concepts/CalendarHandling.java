package Concepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CalendarHandling {

	WebDriver driver = null;

	@Test
	public void browserLaunch() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\91800\\\\Selenium Softwares\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@Test
	public void dataSelect() {

		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();

		// direct selection method. not recommended
		// driver.findElement(By.xpath("//a[contains(text(),'26')]")).click();

		List<WebElement> row = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		System.out.println(row.size());
		
		for (int i = 0; i < row.size(); i++) {
			
			String st=row.get(i).getText();
			
			if (st.equals("30")) {
				
				row.get(i).click();
				
			}
			
		}

	}

}
