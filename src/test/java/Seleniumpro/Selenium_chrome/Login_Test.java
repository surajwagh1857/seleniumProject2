package Seleniumpro.Selenium_chrome;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Login_Test {
	WebDriver driver = null;
	WebElement email = null;
	WebElement password = null;
	WebElement login = null;
	WebElement checkbox = null;

	@BeforeTest
	public void getDriver() {
		System.setProperty("webdriver.chrome.driver", "E:\\Chrom_Driver\\chromedriver.exe");

		driver = new ChromeDriver();

	}

	@BeforeClass
	public void classinitialization() throws Exception {
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		driver.manage().window().maximize();

		email = driver.findElement(By.id("email"));
		password = driver.findElement(By.id("pass"));

		login = driver.findElement(By.id("loginbutton"));

	}

	@Test
	public void checkLogin() throws Exception {
		email.sendKeys("surajwagh1995@gmail.com");
		password.sendKeys("9822682988");
		Thread.sleep(2000);

		login.click();

		String actualurl = driver.getCurrentUrl();

		String expectedurl = "https://www.facebook.com/login/";

		Assert.assertEquals(actualurl, expectedurl);
	}

	@Test
	public void loginfailbyemail() throws Exception {

		email.sendKeys("xyzksjalsjh");
		password.sendKeys("9822682988");
		Thread.sleep(2000);
		login.click();
		String actualurl = driver.getCurrentUrl();
		String expectedurl = "https://www.facebook.com/home.php";
		Assert.assertNotSame(actualurl, expectedurl);
	}

	@Test
	public void loginfailbypass() throws Exception {

		email.sendKeys("surajwagh1995@gmail.com");
		password.sendKeys("9822sfGSDF");
		Thread.sleep(2000);
		login.click();
		String actualurl = driver.getCurrentUrl();

		String expectedurl = "https://www.facebook.com/home.php";

		Assert.assertNotSame(actualurl, expectedurl);
	}

	@Test
	public void loginfailbyboth_mail_pass() throws Exception {

		email.sendKeys("surajwagh1995ASCA");
		password.sendKeys("9822asc");
		Thread.sleep(2000);
		login.click();
		String actualurl = driver.getCurrentUrl();
		String expectedurl = "https://www.facebook.com/home.php";
		Assert.assertNotSame(actualurl, expectedurl);
	}

	@Test
	public void loginfailbyblank_mail() throws Exception {

		email.sendKeys("");
		password.sendKeys("9822682988");
		Thread.sleep(2000);
		login.click();
		String actualurl = driver.getCurrentUrl();
		String expectedurl = "https://www.facebook.com/home.php";
		Assert.assertNotSame(actualurl, expectedurl);
	}

	@Test
	public void loginfailbyblank_pass() throws Exception {

		email.sendKeys("surajwagh1995@gamial.com");
		password.sendKeys("");
		Thread.sleep(2000);
		login.click();
		String actualurl = driver.getCurrentUrl();
		String expectedurl = "https://www.facebook.com/home.php";
		Assert.assertNotSame(actualurl, expectedurl);
	}

	@Test
	public void loginfailbyblankboth_mail_pass() throws Exception {

		email.sendKeys("");
		password.sendKeys("");
		Thread.sleep(2000);
		login.click();
		String actualurl = driver.getCurrentUrl();
		String expectedurl = "https://www.facebook.com/home.php";
		Assert.assertNotSame(actualurl, expectedurl);
	}

}