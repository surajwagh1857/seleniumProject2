package POM;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Test_Login_Pom {
	static WebDriver driver;

	By userID = By.xpath("//input[@name=\"uid\"]");
	By password = By.xpath("//input[@name=\"password\"]");
	By login = By.xpath("//input[@name=\"btnLogin\"]");

	@BeforeClass
	public void beforclass() {

		System.setProperty("webdriver.chrome.driver", "E:\\Chrom_Driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/V4/");

		driver.manage().window().maximize();
	}

	@Test
	public void validation() throws InterruptedException {
		driver.findElement(userID).sendKeys("suraj123");
		Thread.sleep(2000);
		driver.findElement(password).sendKeys("suraj@123");
		Thread.sleep(2000);
		driver.findElement(login).click();
		driver.switchTo().alert().accept();
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://demo.guru99.com/V4/index.php";
		Assert.assertEquals(actualUrl, expectedUrl);
	}

	@AfterClass
	public void afterTest() {
		driver.close();
	}

}
