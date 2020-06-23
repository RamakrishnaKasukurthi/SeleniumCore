package Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseMovement {
	
	WebDriver driver=null;
	@Test
	public void browserlaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91800\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://www.spicejet.com/");
driver.manage().window().maximize();
	}
	
	@Test
	public void mouseAction() throws InterruptedException {
		
		//to perform mouse actions we have to create Action class object
		Actions ac=new Actions(driver);
		
		//to move the mouse focus to particular item or element
		ac.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
		Thread.sleep(3000);
		 
		driver.findElement(By.xpath("//a[contains(text(),'SpiceMax')]")).click();
		
		// to click or select by using mouse
		
		ac.moveToElement(driver.findElement(By.id(""))).click().perform();
		
		//Perform Double Click Action on the Web Element
		
		ac.doubleClick(driver.findElement(By.className(""))).build().perform();
		
		// context-click (right click) 
		
	ac.contextClick(driver.findElement(By.id(""))).build().perform();
	
	

	// Capture x and y offset positions of element for move mouse cursor
	WebElement gmailLink=driver.findElement(By.linkText(""));
    int xOffset = gmailLink.getRect().getX();
    int yOffset = gmailLink.getRect().getY();
    Actions actionProvider = new Actions(driver);
    // Performs mouse move action onto the offset position
    actionProvider.moveByOffset(xOffset, yOffset).build().perform();
		
		
    //click And Hold 
		ac.clickAndHold(driver.findElement(By.className(""))).build().perform();
		//and release
		ac.release().build().perform();
		
	}

}
