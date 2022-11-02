package Seleniumpro.Selenium_chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_Launch {

	static WebDriver driver = null;
	static WebElement yesRadio = null;
	static WebElement NoRadio = null;
	static WebElement resetBtn = null;
	static WebElement checkBtn = null;
	static WebElement displayText = null;

	@BeforeTest
	void saticMembers() {
		System.setProperty("webdriver.chrome.driver", "E:\\Chrom_Driver\\chromedriver.exe");

		driver = new ChromeDriver();

	}

	@BeforeClass
	void classInitialization() throws Exception {
		driver.get("https://demo.guru99.com/test/ajax.html");
		Thread.sleep(2000);

		driver.manage().window().maximize();
		Thread.sleep(2000);

		yesRadio = driver.findElement(By.id("yes"));
		NoRadio = driver.findElement(By.id("no"));

		resetBtn = driver.findElement(By.xpath("/html/body/div[5]/form/p[2]/input[1]"));
		checkBtn = driver.findElement(By.id("buttoncheck"));

		displayText = driver.findElement(By.xpath("/html/body/div[5]/form/p[3]"));

	}

	@Test
	public void yesClick() {
		System.out.println("inside TestCase...1");
		yesRadio.click();
		checkBtn.click();
		String expected = "Radio button is checked and it's value is Yes";
		String actual = displayText.getText();
		Assert.assertEquals(actual, expected);

	}

	@Test
	public void noClick() {
		System.out.println("inside TestCase...2");
		NoRadio.click();
		checkBtn.click();
		String expected = "Radio button is checked and it's value is No";
		String actual = displayText.getText();
		Assert.assertEquals(actual, expected);

	}

	@Test
	public void resetClick() {
		System.out.println("inside TestCase...3");
		resetBtn.click();
		checkBtn.click();
		String expected = "Radio button is Not checked";
		String actual = displayText.getText();
		Assert.assertEquals(actual, expected);

	}

	@Test
	public void resetDisable() throws Exception {
		System.out.println("inside TestCase...4");
		resetBtn.click();
		checkBtn.click();
		Thread.sleep(2000);
		boolean isYesRadio = yesRadio.isSelected();
		boolean isNoRadio = NoRadio.isSelected();

		Assert.assertEquals(false, isYesRadio && isNoRadio);
	}

	@Test
	public void YesDisable() throws Exception {
		System.out.println("inside TestCase...5");
		resetBtn.click();
		checkBtn.click();
		Thread.sleep(2000);
		boolean isYesRadio = yesRadio.isSelected();
		Assert.assertEquals(false, isYesRadio);
	}
	@Test
	public void NoDisable() throws Exception {
		System.out.println("inside TestCase...6");
		resetBtn.click();
		checkBtn.click();
		Thread.sleep(2000);
		boolean isNoRadio = NoRadio.isSelected();
		Assert.assertEquals(false, isNoRadio);

	}

}