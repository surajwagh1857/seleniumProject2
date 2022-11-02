package Data_Provider;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class DataProviderDemo {
	WebDriver driver = null;

	@BeforeTest
	public void beforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Chrom_Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@DataProvider(name = "usernameList")
	public Object[][] getDatafromDataProvider() {
		return new Object[][] { { "suraj123", "suraj@123" }, { "komal123", "komal@123" },
				{ "sanjivani123", "sanjivani@123" }, { "prachi123", "prachi@123" },

		};
	}

	@Test(dataProvider = "usernameList")
	public void testLoginPage(String name, String password) throws Exception {

		driver.get("https://demo.guru99.com/test/login.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys(name);
		Thread.sleep(2000);
		WebElement pass = driver.findElement(By.id("passwd"));
		pass.sendKeys(password);
		Thread.sleep(2000);
		WebElement submit = driver.findElement(By.id("SubmitLogin"));
		submit.click();
		Thread.sleep(2000);

		String expected="https://demo.guru99.com/test/success.html";
		String actual=driver.getCurrentUrl();
		Assert.assertEquals(actual, expected);
	}

	@AfterTest
	public void closeDriver() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}

}
