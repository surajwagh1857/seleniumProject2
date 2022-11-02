package Selenium_2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class Test_Launch_Program {
	static WebDriver driver = null;

	@BeforeClass
	public void beforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Chrom_Driver\\chromedriver.exe");

		driver = new ChromeDriver();
		String baseUrl = "https://demo.guru99.com/test/newtours/";
		driver.navigate().to(baseUrl);
		Thread.sleep(2000);
		driver.manage().window().maximize();

	}

	@AfterClass
	public void afterClass() throws Exception {
		driver.close();
		Thread.sleep(2000);
	}

	@Test
	public void N_01_Click_on_Register() {

		WebElement register = driver.findElement(By.linkText("REGISTER"));

		register.click();
		String ExpectedUrl = "https://demo.guru99.com/test/newtours/register.php";
		String ActualUrl = driver.getCurrentUrl();

		Assert.assertEquals(ActualUrl, ExpectedUrl);

	}

	@Test
	public void N_02_add_Details() {
		WebElement firstname = driver.findElement(By.name("firstName"));
		WebElement lastname = driver.findElement(By.name("lastName"));
		WebElement phone = driver.findElement(By.name("phone"));
		WebElement username = driver.findElement(By.name("userName"));

		Actions builder = new Actions(driver);
		Actions mouseclickOn_register = builder.moveToElement(firstname).click().sendKeys("suraj").

				sendKeys(Keys.TAB).sendKeys("wagh").sendKeys(Keys.TAB).sendKeys("9822682988").sendKeys(Keys.TAB)
				.sendKeys("surajwagh1995@gmail.com");

		mouseclickOn_register.perform();

		boolean finalresult = (firstname.isDisplayed() && lastname.isDisplayed() && phone.isDisplayed());
		Assert.assertTrue(finalresult);
	}

	@Test
	public void N_03_Select_INDIA() throws Exception {

		WebElement countryList = driver.findElement(By.name("country"));

		Select drpCountry = new Select(countryList);

		drpCountry.selectByVisibleText("INDIA");

		Actions builder = new Actions(driver);
		Action clickTab = builder.moveToElement(countryList).click().sendKeys(Keys.TAB).sendKeys(Keys.TAB).build();
		clickTab.perform();

		String Expected = "INDIA";
		String Actual = drpCountry.getFirstSelectedOption().getText();
		Assert.assertEquals(Actual, Expected);
		
	}

//	@Test
//	public void N_04_click_submit() throws Exception 
//		WebElement submitBtn=driver.findElement(By.name("submit"));
//		submitBtn.click();
//
//	}
//
//	@Test
//	public void N_05_getFinal_Text() throws Exception {
//		driver.getCurrentUrl();
//
//		WebElement final_word = driver.findElement(By.xpath(
//				"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[1]/font/b"));
//		String Expectedtext = "Dear suraj wagh,";
//		String Actualtext = final_word.getText();
//		System.out.println("final_text--->" + Actualtext);
//
//		Assert.assertEquals(Actualtext, Expectedtext);
//	}
}
