package Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
	
	WebDriver driver=null;
	@Test
	public void browserLaunch() {
		
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\91800\\\\Selenium Softwares\\\\chromedriver_win32\\\\chromedriver.exe");
	driver=new FirefoxDriver();
	driver.get("");
	}
	
	@Test
public void dragANDdrop() {
	
	Actions ac=new Actions(driver);

	WebElement sourceEle=driver.findElement(By.className(""));
	
	WebElement targetEle=driver.findElement(By.id(""));
	
	// Performs drag and drop action of sourceEle onto the targetEle
    ac.dragAndDrop(sourceEle, targetEle).build().perform();

    
    
 // Store 'box A' as source element
    WebElement sourceEle1 = driver.findElement(By.id("draggable"));
    // Store 'box B' as source element
    WebElement targetEle1 = driver.findElement(By.id("droppable"));
    int targetEleXOffset = targetEle1.getLocation().getX();
    int targetEleYOffset = targetEle1.getLocation().getY();

    // Performs dragAndDropBy onto the  target element offset position
   ac.dragAndDropBy(sourceEle1, targetEleXOffset, targetEleYOffset).build().perform();
   
   
   // if Click and hold and move element 
   
   ac.clickAndHold(driver.findElement(By.id(""))).moveToElement(driver.findElement(By.className(""))).release().build().perform();
    
	
}
	
}
