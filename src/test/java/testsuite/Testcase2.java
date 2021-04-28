package testsuite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase2 {

	@BeforeTest
	public void beforetest()
	{
		System.out.println("before test");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("inside before method..");
	}
	
	@Test(groups= {"sanity"})
	public void test3()
	{
		System.out.println("Inside test3()...");
	}
	
	@Test
	public void test4() {
		System.out.println("Inside test4()...");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("inside after method..");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("after test");
	}
}
