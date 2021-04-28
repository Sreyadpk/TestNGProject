package testsuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTest {

	WebDriver driver,driver1;;
	
	@Test
	public void ChromeTest() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sreya\\devops-workspace\\TestNGProject\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

	}
	
	@Test
	public void FirefoxTest() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\sreya\\devops-workspace\\TestNGProject\\drivers\\geckodriver.exe");
		driver1 = new FirefoxDriver();
		driver1.get("https://www.simplilearn.com/");
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

	}
}
