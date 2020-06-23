package Concepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicWebTable {
	WebDriver driver=null;
	@Test
	public void browserLaunch() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\91800\\\\Selenium Softwares\\\\chromedriver_win32\\\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("http://demo.guru99.com/test/web-table-element.php#");
//driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

}
	@Test
	public void webtable() {
		
		String befor_xpath="//tr[";
		String after_xpath="]//td[1]";
		
		List<WebElement> li=driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		System.out.println(li.size());
				
		//Method-1
		  for (int i = 2; i < li.size(); i++) {
		  String td=driver.findElement(By.xpath(befor_xpath+i+after_xpath)).getText();
		  
		  System.out.println(td);
		  
			
			  if (td.equals("HDIL")) {
			  driver.findElement(By.xpath(befor_xpath+i+after_xpath)).click();
			  
			  
			  }
			 
			  
		  }
		  
		  //Method -2 select using dynamic xpath 
		  
		  driver.findElement(By.xpath("//a[contains(text(),'HDIL')]")).click();
		 
		
		
	}
}
