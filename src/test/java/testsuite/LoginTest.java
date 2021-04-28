package testsuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sreya\\devops-workspace\\WebDriver_Maven\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

	}

	@Parameters({ "username", "password" })
	@Test
	public void login(String username, String password) {

		WebElement loginLink = driver.findElement(By.linkText("Log in"));
		loginLink.click();

		WebElement fillUsername = driver.findElement(By.name("user_login"));
		fillUsername.sendKeys(username);

		WebElement fillPassword = driver.findElement(By.id("password"));
		fillPassword.sendKeys(password);

		WebElement chkRem = driver.findElement(By.className("rememberMe"));
		chkRem.click();

		WebElement btnSubmit = driver.findElement(By.name("btn_login"));
		btnSubmit.click();

		WebElement error = driver.findElement(By.id("msg_box"));

		String actMsg = error.getText();
		String expMsg = "The email or password you have entered is invalid.";

		Assert.assertEquals(expMsg, actMsg);

	}

	@AfterMethod
	public void teardown() {
		//driver.quit();
	}
}
