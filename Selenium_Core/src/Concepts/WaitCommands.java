package Concepts;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitCommands {

	WebDriver driver = null;

	@Test
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\\\\\Users\\\\\\\\91800\\\\\\\\Selenium Softwares\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("");

	}

	public void waitCommands() throws InterruptedException {
		// Implicit Wait

		// it will wait for a certain amount of time before throwing an exception that
		// it cannot find the element on the page.
		// We should note that implicit waits will be in place for the entire time the
		// browser is open.
		// This means that any search for elements on the page could take the time.

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Explicit Wait
		// By using Explicit Wait command, the WebDriver is directed to wait until a
		// certain condition occurs before proceeding with executing the code.

		// explicit wait - to wait for the compose button to be click-able
		WebDriverWait wait = new WebDriverWait(driver, 30);

		// expected condition is visibility Of Element Located
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));

		// click on the compose button as soon as the "compose" button is visible
		driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();

		// one more example for Explicit wait
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		// expected condition is element To Be Clickable
		wait1.until(ExpectedConditions.elementToBeClickable(By.className("")));

		// there are no. of conditions are there
		// alertIsPresent(), elementSelectionStateToBe(), elementToBeClickable(),
		// elementToBeSelected(), frameToBeAvaliableAndSwitchToIt(),
		// invisibilityOfTheElementLocated(),
//	 invisibilityOfElementWithText(), presenceOfAllElementsLocatedBy(), presenceOfElementLocated(), 
		// textToBePresentInElement(), textToBePresentInElementLocated(),
		// textToBePresentInElementValue(), titleIs(),
		// titleContains(), visibilityOf(), visibilityOfAllElements(),
		// visibilityOfAllElementsLocatedBy(), visibilityOfElementLocated().

		// Fluent Wait

		// The fluent wait is used to tell the web driver to wait for a condition, as
		// well as the frequency with which we want to check the condition before
		// throwing an "ElementNotVisibleException" exception.
		
		// Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		   Wait<WebDriver> wait3 = new FluentWait<WebDriver>(driver)
		       .withTimeout(30, TimeUnit.SECONDS)
		       .pollingEvery(5, TimeUnit.SECONDS)
		       .ignoring(NoSuchElementException.class);

		   WebElement foo = wait3.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(By.id("foo"));
		     }
		   });

		   //PageLoadTimeout Command
		   driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		   
		   //SetScriptTimeout Command
		   driver.manage().timeouts().setScriptTimeout(100,TimeUnit.SECONDS);
		   
		   //Sleep Command
Thread.sleep(1000);
	}
}
