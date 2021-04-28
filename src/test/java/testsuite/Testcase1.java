package testsuite;

import org.testng.annotations.Test;

public class Testcase1 {

	@Test(groups="sanity")
	public void test1() {
		System.out.println("Inside test1()...");
	}
	
	@Test
	public void test2() {
		System.out.println("Inside test2()...");
	}
	
	@Test(groups="sanity")
	public void othertest() {
		System.out.println("Inside othertest...");
	}
}
