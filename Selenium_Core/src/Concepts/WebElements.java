
package Concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebElements {

	public static WebDriver driver = null;

	// InternetExplorerDriver driver = new InternetExplorerDriver();
	@Test
	public void elements() {
		/*
		 * System.out.println("Test one"); System.setProperty("webdriver.ie.driver",
		 * "E:\\JAVA\\Eclipse_Selenium_Driver\\IEDriverServer.exe");
		 */

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\91800\\\\Selenium Softwares\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/account/create?specId=yidReg");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		/*
		 * 1. ID 2. Name 3. Class Name 4. Tag Name 5. Link Text 6. Partial Link Text 7.
		 * CSS Selector 8. XPath
		 */

		WebElement ParentElement=driver.findElement(By.id("reg-submit-button"));
		WebElement chaildElement=ParentElement.findElement(By.className("pure-button puree-button-primary puree-spinner-button"));
		chaildElement.submit();
		
		// 1. ID
		driver.findElement(By.id("usernamereg-yid")).sendKeys("Ramakrishnak1992");

		// 2. Name
		driver.findElement(By.name("lastName")).sendKeys("Kasukurthi");

		// 3. Class Name
		driver.findElement(By.className("ureg-fname ")).sendKeys("Ramakrishna");

		// 4. Tag Name
		driver.findElement(By.tagName("")).sendKeys("");

		// 5. Link Text
		driver.findElement(By.linkText("")).sendKeys("");

		// 6. Partial Link Text
		driver.findElement(By.partialLinkText("")).click();

		// 7. CSS Selector
		driver.findElement(By.cssSelector("")).sendKeys("");

		// 8. XPath
		driver.findElement(By.xpath("")).click();
		
	}

	/*
	 * @Test private void id() {
	 * 
	 * //System.out.println("Seond Method");
	 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 * driver.findElement(By.id("usernamereg-firstName")).sendKeys("Ramakrishna");
	 * 
	 * }
	 */
}
