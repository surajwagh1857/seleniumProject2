package Selenium_2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class Test_up_load_popup {
	static WebDriver driver = null;

	@BeforeClass
	public void beforeClass() {

		System.setProperty("webdriver.chrome.driver", "E:\\Chrom_Driver\\chromedriver.exe");

		driver = new ChromeDriver();

	}

	@AfterTest
	public void afterClass() throws Exception {
         Thread.sleep(2000);
		 driver.close();
	}

   @Test 
  public void TC_01_upload_file() throws Exception{
	   Thread.sleep(2000);
	  driver.get("https://demo.guru99.com/test/upload/");
		Thread.sleep(2000);
		driver.manage().window().maximize();

		WebElement choose_file = driver.findElement(By.name("uploadfile_0"));
		choose_file.sendKeys("E:\\abc.txt");
		Thread.sleep(2000);

		WebElement checkbox = driver.findElement(By.id("terms"));
		checkbox.click();
		Thread.sleep(2000);

		WebElement submit = driver.findElement(By.id("submitbutton"));
		submit.click();
		String ExpectedTitle="File Upload Demo";
		System.out.println("ExpectedTitle -----> "+ExpectedTitle);
		String ActalTitle=driver.getTitle();
		
		Assert.assertEquals(ActalTitle,ExpectedTitle);
		Thread.sleep(2000);
  }
  @Test  
  public void TC_02_download_file() throws Exception{
	  Thread.sleep(2000);
	  driver.get("https://www.jenkins.io/download/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]/div/div/a[5]/span[2]")).click();
		Thread.sleep(2000);
		String expected = "https://www.jenkins.io/download/thank-you-downloading-windows-installer-stable/";
		String actual = driver.getCurrentUrl();
		
		Assert.assertEquals(actual, expected);
		Thread.sleep(2000);
}
  @Test 
  public void TC_03_Alert_Handle() throws Exception {
	  Thread.sleep(2000);
		driver.get("http://demo.guru99.com/selenium/delete_customer.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("cusid")).sendKeys("123");
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();

		String massage = driver.switchTo().alert().getText();
		System.out.println("Alert Massage------> " + massage);
		driver.switchTo().alert().accept();

		String massage2 = driver.switchTo().alert().getText();
		System.out.println("Alert Massage---------> " + massage2);
		driver.switchTo().alert().accept();
		String ExpectedUrl="https://demo.guru99.com/selenium/delete_customer.php";
		String ActualUrl=driver.getCurrentUrl();
		Assert.assertEquals(ActualUrl, ExpectedUrl);
		Thread.sleep(2000);
	}
	@Test  
	public void TC_04_popup_windows() throws Exception {
		Thread.sleep(2000);
		driver.get("https://www.demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/p/a")).click();
		Thread.sleep(2000);
		String main_window = driver.getWindowHandle();
		System.out.println("Main window-----> " + main_window);

		Set<String> handle = driver.getWindowHandles();

		Iterator<String> handle_itr = handle.iterator();

		while (handle_itr.hasNext()) {

			String childwindow = handle_itr.next();

			if (!main_window.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
				Thread.sleep(2000);
				driver.findElement(By.name("emailid")).sendKeys("surajwagh1995@gmail.com");

				driver.findElement(By.name("btnLogin")).click();
			String ExpectedUrl = "https://www.demo.guru99.com/access_popup.php?uid=mngr84567%20&%20pass=yguvaqY%20&%20email=surajwagh1995@gmail.com";
				String ActualUrl = driver.getCurrentUrl();
				String ExpectedTitle="Guru99 Bank Home Page";
				String ActualTitle=driver.getTitle();
				System.out.println(ActualTitle);
				//Assert.assertEquals(ActualUrl,  ExpectedUrl);
				Assert.assertEquals(ActualTitle,  ExpectedTitle);
			}
		}
	}
}
