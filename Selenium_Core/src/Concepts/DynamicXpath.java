package Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicXpath {

	WebDriver driver=null;
	@Test
	public void browselaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91800\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
driver =new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	 
	 }
	
	public void xpath() {
		
		//Absolute XPath(Single slash is used to create XPath)
		
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/form/div[1]/div/div[1]/div/div/input[1]")).click();
		
		//Relative XPath(Double slash is used to create XPath with relative path)
		
		//Single Attribute
		
		driver.findElement(By.xpath("//input[@id='Email']")).click();
		
		//{ //input[@id='Email'] or //*[@id='Email'] }
		
		driver.findElement(By.xpath("//input[@name='Email']"));
		
		//Multiple Attribute:
		
		driver.findElement(By.xpath("//input[@id='Email'][@name='Email']")).click();
		
		//Using AND
		
		driver.findElement(By.xpath("//input[@id='Email' and @name='Email']")).click();
		driver.findElement(By.xpath("//button[@type='button' and @class='btn']")).click();
		
		//Using OR
		
		driver.findElement(By.xpath("//input[@id='Email' or @name='Email']")).sendKeys("Name");
		
		
		//contains()
		//mostly used if id is changing every time after refresh
		
		driver.findElement(By.xpath("//input[contains(@id,'Email')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
		
		
		
		//starts-with():
		//mostly used if id is changing every time after refresh
		//we can use ends-with also 
		
		driver.findElement(By.xpath("//*[starts-with(@attribute_name,'attribute_value')]")).click();
		
		//text():
		driver.findElement(By.xpath("//a[text()='contacts']")).click();
		driver.findElement(By.xpath("//*[text()='New look for sign-in coming soon']")).click();
		
		//following
		
		driver.findElement(By.xpath("//*[@id='FirstName']/following::input[@type='text']")).click();
		
		//preceding: Selects all nodes that appear before the current node in the document
		
		driver.findElement(By.xpath("//*[@id='LastName']//preceding::input[@type='text']")).click();
		
	}
	
}
