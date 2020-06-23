package Concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetTitleValidation {
	
	WebDriver obj=null;
	@Test
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\91800\\\\Selenium Softwares\\\\chromedriver_win32\\\\chromedriver.exe");
obj=new ChromeDriver();
obj.get("https://www.google.co.in/");
obj.manage().window().maximize();
	}
	@Test
public void validate() {
	String st=obj.getTitle();
	System.out.println(st);
	
		 
		  if (st.equals("Google")) {
		  System.out.println("Title is valid");
		  }else System.out.println("Invalid");
		 //to get current url
System.out.println(obj.getCurrentUrl());

//to close the Browser

obj.quit();
	}
	
}
