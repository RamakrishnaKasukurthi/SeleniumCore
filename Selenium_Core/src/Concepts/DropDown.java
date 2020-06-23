package Concepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown {
	@Test
	public void dropdown() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91800\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement country=driver.findElement(By.xpath("//select[@name='country']"));
		//Create the Object of Select class and provide drop down element.
		Select dropdown=new Select(country);
		
		//Get Selected first option from Dropdown
		WebElement first_selectedValue=dropdown.getFirstSelectedOption();
		String value=first_selectedValue.getText();
		System.out.println(value);
		
		
	//Get All option from dropdown
		
		List<WebElement> list_dropdown=dropdown.getOptions();
		for (int i = 0; i < list_dropdown.size(); i++) {
			String values_dropdown=list_dropdown.get(i).getText();
			System.out.println(values_dropdown);
			
		}
		
		//selectByIndex
		dropdown.selectByIndex(4);
		
		WebElement selected_value=dropdown.getFirstSelectedOption();
		String valuebyindex =selected_value.getText();
		System.out.println("selectByIndex is:"+valuebyindex);
	
		//selectByValue
		dropdown.selectByValue("AUSTRALIA");
		String valuebyvalue =selected_value.getText();
		System.out.println("selectByValue is:"+valuebyvalue);
	
	//selectByVisibleText
		dropdown.selectByVisibleText("INDIA");
		String valuebyVisibleText =selected_value.getText();
		System.out.println("selectByVisibleText is:"+valuebyVisibleText);
	}

}
