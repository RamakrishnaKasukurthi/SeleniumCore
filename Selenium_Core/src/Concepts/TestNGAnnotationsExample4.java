package Concepts;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotationsExample4 {
	
	//search() method is depends on contact contact() so first it will run the contact() then it will run the search()
	//if contact() failed then search wont run 
	
	@BeforeMethod
	public void getTitle() {
		System.out.println("Get title test case");
				
	}
	@Test(dependsOnMethods = "contact")
	public void search() {
		System.out.println("Search test case");
	}
	@Test(invocationTimeOut = 2)
	public void contact() {
		System.out.println("contact");
		
	}
	
	// if you want execute the method no. of the use the @Test(invocationCount = 10)
	
	// if want maintain time out then use @Test(invocationTimeOut = 2)
	
}
