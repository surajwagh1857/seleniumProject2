package Seleniumpro.Selenium_chrome;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

public class Test_MouseHover2 {
	WebDriver driver = null;
	WebElement username = null;
	WebElement submitbtn = null;
	String actualurl = null;
	String expectedurl = null;

	@BeforeMethod
	public void beforeMethod() {
	}

	@BeforeClass
	public void beforeClass() throws Exception {
		driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(2000);
		driver.manage().window().maximize();

		username = driver.findElement(By.name("userName"));
		submitbtn = driver.findElement(By.name("submit"));
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\Chrom_Driver\\chromedriver.exe");

		driver = new ChromeDriver();
	}

	@Test
	public void Testmousehover2() throws Exception {
		Actions builder = new Actions(driver);// step1
//		 org.openqa.selenium.interactions.Action mousehoverusername= builder.moveToElement(username).click().sendKeys("suraj").build();// step2
//		mousehoverusername.perform();
//		Thread.sleep(2000);
		org.openqa.selenium.interactions.Action clicksumbit = builder.moveToElement(submitbtn).click().build();
		clicksumbit.perform();
		// String textname=driver.getTitle();
		String actualurl = driver.getCurrentUrl();
		String expectedurl = "https://demo.guru99.com/test/newtours/login_sucess.php";

		Assert.assertEquals(actualurl, expectedurl);
	}

	@AfterClass
	public void driverClose() {
		driver.close();

	}

}
