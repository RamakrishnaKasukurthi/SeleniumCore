package Concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	
	
	/*
	 * the output is:
	set up
	launch browser
	enter url
	
	login
	Get title test case
	logout

	login
	Search test case
	logout
	
	delete cooki
	close all
	 *
	 */
	
	
	@BeforeSuite   ///---1
	public void setUp() {
		
		System.out.println("set up");
		
	}
	@BeforeTest //--2
	public void launchBrowser() {
		System.out.println("launch browser");
	}
@BeforeClass//----3
	public void url() {
	System.out.println("enter url");
		
	}
	@BeforeMethod//---4
	public void login() {
		System.out.println("login");
		
	}
	@Test //---5
	public void getTitle() {
		System.out.println("Get title test case");
				
	}
	@Test ///--5 it only 
	public void search() {
		System.out.println("Search test case");
	}
	
	@AfterMethod //---6
	public void logout() {
		System.out.println("logout");
	}
	@AfterTest //---7
	public void deleteCooki() {
		System.out.println("delete cooki");
	}
	
	@AfterSuite //--8
	public void close() {
		System.out.println("close all");
	}
	
	
}
