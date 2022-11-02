package Selenium_2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class popup2 {
	public class SeleniumTest {
		
		WebDriver driver = null;
		WebElement userTestBox = null;
		WebElement passTestBox = null;
		WebElement signInBtn = null;
		WebElement successTest = null;
		
		@BeforeTest
		void getDriver() {
			
			System.out.println( "Hello welcome to Automation page!" );
			System.setProperty("webdriver.chrome.driver",
					"E:\\Chrom_Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		
		/*@BeforeClass
		void getWebElements()throws Exception{
			driver.get("https://demo.guru99.com/test/newtours/");
			Thread.sleep(2000);
			driver.manage().window().maximize(); 
			
		}*/
		
		@AfterTest
		void closeDriver()throws InterruptedException {
			Thread.sleep(3000);
			driver.close();
		}
		
		@Test
		void N_01_uploadFile() throws InterruptedException {
			driver.get("http://demo.guru99.com/test/upload/");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			driver.findElement(By.name("uploadfile_0")).sendKeys("E:\\abc.txt");
			Thread.sleep(3000);
			driver.findElement(By.id("terms")).click();
			Thread.sleep(3000);
			// click the "UploadFile" button
			driver.findElement(By.name("send")).click();
			
			Thread.sleep(2000);
			String expected = "1 file\n" + 
					"has been successfully uploaded.";
			String actual = driver.findElement(By.xpath("//*[@id=\"res\"]/center")).getText();
			//System.out.println("Actual messege ----> "+actual);
			Assert.assertEquals(actual, expected);
			Thread.sleep(3000);
			
		}
		
		@Test
		void N_02_downloadFile() throws InterruptedException {
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
		void N_03_alertHandle() throws InterruptedException {
			
			driver.get("http://demo.guru99.com/test/delete_customer.php");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);

			driver.findElement(By.name("cusid")).sendKeys("1233");
			Thread.sleep(2000);

			driver.findElement(By.name("submit")).click();
			Thread.sleep(1000);

			driver.switchTo().alert().accept();
			Thread.sleep(1000);
			
			String expected = "Customer Successfully Delete!";
			String actual = driver.switchTo().alert().getText();
			
			driver.switchTo().alert().accept();
			Assert.assertEquals(actual, expected);
			Thread.sleep(2000);
		}
		
		@Test
		void N_04_popUpWindows() throws InterruptedException {

			driver.get("https://demo.guru99.com/popup.php");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);

			driver.findElement(By.linkText("Click Here")).click();
			Thread.sleep(2000);
			String MainWindow = driver.getWindowHandle();

			Set<String> handles = driver.getWindowHandles();

			Iterator<String> handle_itr = handles.iterator();

			while (handle_itr.hasNext()) {
				String ChildWindow = handle_itr.next();
				if (!MainWindow.equalsIgnoreCase(ChildWindow)) {

					driver.switchTo().window(ChildWindow);
					Thread.sleep(2000);
					driver.findElement(By.name("emailid")).sendKeys("abcd@gmail.com");
					Thread.sleep(2000);
					driver.findElement(By.name("btnLogin")).click();
					Thread.sleep(1500);
				}
Throwable
			}
			
			String actual = driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td/h2")).getText();
			String expected = "Access details to demo site.";
			Assert.assertEquals(actual, expected);
			Thread.sleep(2000);
			driver.close();
			
			Thread.sleep(2000);
			driver.switchTo().window(MainWindow);
		}
		
	}
	}