package Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebElementCommands {

	@Test
	public void chrome() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91800\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.toolsqa.com/selenium-tutorial/");

		driver.findElement(By.id("")).clear();
		// If this element is a text entry element, this will clear the value

		driver.findElement(By.className("")).sendKeys("");
		// text entry elements like INPUT and TEXTAREA elements

		driver.findElement(By.linkText("")).click();
		// Clicking is perhaps the most common way of interacting with web elements like
		// text elements, links, radio boxes and many more.

		Boolean status = driver.findElement(By.name("")).isDisplayed();
		// This method determines if an element is currently being displayed or not.
		// This accepts nothing as a parameter but returns boolean value(true/false).

		Boolean status1 = driver.findElement(By.tagName("")).isEnabled();
		// This determines if the element currently is Enabled or not? This accepts
		// nothing as a parameter but returns boolean value(true/false).

		Boolean status2 = driver.findElement(By.tagName("")).isSelected();
		// Determine whether or not this element is selected or not. This accepts
		// nothing as a parameter but returns boolean value(true/false).

		driver.findElement(By.cssSelector("")).submit();
		// This method works well/better than the click() if the current element is a
		// form, or an element within a form. This accepts nothing as a parameter and
		// returns nothing.

		String str = driver.findElement(By.xpath("")).getText();
		// This method will fetch the visible (i.e. not hidden by CSS) innerText of the
		// element

		String str1 = driver.findElement(By.id("")).getTagName();
		// This method gets the tag name of this element.

		String str2 = driver.findElement(By.className("")).getCssValue("");
		// This method Fetch CSS property value of the give element.

		String str3 = driver.findElement(By.id("")).getAttribute("");
		// This method gets the value of the given attribute of the element. This
		// accepts the String as a parameter and returns a String value.

		Dimension dim = driver.findElement(By.name("")).getSize();
		// his method fetch the width and height of the rendered element. This accepts
		// nothing as a parameter but returns the Dimension object.

		Point point = driver.findElement(By.cssSelector("")).getLocation();
		// This method locate the location of the element on the page. This accepts
		// nothing as a parameter but returns the Point object.
		

	}

}
