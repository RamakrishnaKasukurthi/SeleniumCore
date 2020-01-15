package module1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CheckBox_RadioButton {

	@Test
	public void openURL() {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\91800\\Selenium Softwares\\geckodriver-v0.26.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
//driver.get("https://www.toolsqa.com/selenium-tutorial/");

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\\\Users\\\\91800\\\\Selenium Softwares\\\\chromedriver_win32\\\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 */
		driver.get("http://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// For Radion button

		WebElement radio = driver.findElement(By.id("vfb-7-1"));
		boolean display = radio.isDisplayed();
		System.out.println("radio button display is " + display);
		boolean enable = radio.isEnabled();
		System.out.println("radio button enable is " + enable);
		boolean selection = radio.isSelected();
		System.out.println("radio button selection for 1st time " + selection);
		radio.click();
		boolean selection2 = radio.isSelected();
		System.out.println("radio button selection for 2nd time " + selection2);

		// For check box

		driver.findElement(By.id("vfb-6-0")).click();
		driver.findElement(By.id("vfb-6-1")).click();

//driver.quit();

		// Use IsSelected method

		// driver.manage().deleteAllCookies();

		// actions.moveToElement(driver.findElement(By.id("sex-1"))).click().perform();

		/*
		 * WebElement element=driver.findElement(By.id("sex-1"));
		 * 
		 * WebDriverWait wait=new WebDriverWait(driver, 15);
		 * wait.until(ExpectedConditions.elementToBeClickable(element));
		 * element.click();
		 */

		/*
		 * WebElement chkbt=driver.findElement(By.id("sex-1")); Boolean bln = false;
		 * 
		 * bln=chkbt.isSelected(); if (bln==true) {
		 * System.out.println("already selected"); }else {
		 * driver.findElement(By.id("sex-1")).click(); }
		 */

		/*
		 * List<WebElement> radio_sex = driver.findElements(By.name("sex"));
		 * 
		 * 
		 * for (int i = 0; i < 2; i++) { WebElement st=radio_sex.);
		 * System.out.println(st); }
		 */

		// radio_sex.get(1).click();
		/*
		 * if (bln == true) { radio_sex.get(1).click(); } else {
		 * radio_sex.get(0).click(); }
		 */
	}

}
