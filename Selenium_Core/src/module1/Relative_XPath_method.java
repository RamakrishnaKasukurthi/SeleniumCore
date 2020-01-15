package module1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Relative_XPath_method {
	@Test
	public void xpath_methods() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\91800\\\\Selenium Softwares\\\\chromedriver_win32\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://wordpress.com/log-in");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Using single attribute

		/*
		 * driver.findElement(By.xpath("//input[@id='usernameOrEmail']")).sendKeys(
		 * "username"); driver.findElement(By.
		 * xpath("//button[@class='button form-button is-primary']")).click();
		 * 
		 * // Using multiple attribute
		 * 
		 * driver.findElement(By.xpath(
		 * "//input[@class='form-text-input'][@id='usernameOrEmail']"))
		 * .sendKeys("ramakrishna");
		 */		
		//Using contains method
		
		driver.findElement(By.xpath("//a[contains(@href,'https://wordpress.com/wp-login.php?action=lostpassword')]")).click();
		driver.findElement(By.xpath("//button[contains(@class,'button form-button is-primary')]")).click();
		
		//Using starts-with method
		
		
		

	}

}
