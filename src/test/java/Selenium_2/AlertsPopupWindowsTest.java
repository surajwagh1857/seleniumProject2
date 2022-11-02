package Selenium_2;

import org.testng.annotations.Test;
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

public class AlertsPopupWindowsTest 
{
static WebDriver myDriver = null;
	
@BeforeTest
void staticmembers()
{
	System.setProperty("webdriver.chrome.driver",
		      "E:\\Chrom_Driver\\chromedriver.exe");
	myDriver = new ChromeDriver();
	 
}
	
	
		mymyDriver.get("https://demo.guru99.com/test/delete_customer.php");
		
		Thread.sleep(2000);
		mymyDriver.manage().window().maximize(); 
		Thread.sleep(3000);
		
	} */
	
	@AfterTest 
	void closeBrowser() 
	{
		myDriver.close();
	} 
	

	@Test
	void TC_01_uploadFile() throws Exception 
	{        
		myDriver.get("https://demo.guru99.com/test/upload/");
	
	    Thread.sleep(2000);
	    myDriver.manage().window().maximize(); 
	    Thread.sleep(3000);
	    
		     WebElement choosefile = myDriver.findElement(By.id("uploadfile_0"));
			choosefile.sendKeys("E:\\abc.txt");
			
			WebElement chkbox = myDriver.findElement(By.id("terms"));
			Thread.sleep(1000);
			chkbox.click();
			Thread.sleep(3000);
			WebElement btnSubmit = myDriver.findElement(By.id("submitbutton"));
			btnSubmit.click();
			Thread.sleep(3000);
		
		String expected = "1 file\n" + 
				"has been successfully uploaded.";
		String actual = myDriver.findElement(By.xpath("//*[@id=\"res\"]/center")).getText();
		
		Assert.assertEquals(actual, expected);
		Thread.sleep(3000);
		
	}
	
	@Test
	void TC_02_downloadFile() throws Exception {
		
		myDriver.get("https://www.jenkins.io/download/");
		Thread.sleep(3000);
		myDriver.manage().window().maximize(); 
		Thread.sleep(3000);
		
		myDriver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]/div/div/a[5]")).click();
		
		String expected = "https://www.jenkins.io/download/thank-you-downloading-windows-installer-stable/";
		String actual = myDriver.getCurrentUrl();
		
		Assert.assertEquals(actual, expected);
		//Thread.sleep(2000);
	}
	
	@Test
	void TC_03_alertHandle() throws Exception {
		
		myDriver.get("http://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		myDriver.manage().window().maximize();
		Thread.sleep(2000);

		myDriver.findElement(By.name("cusid")).sendKeys("1233");
		Thread.sleep(2000);

		myDriver.findElement(By.name("submit")).click();
		Thread.sleep(1000);

		myDriver.switchTo().alert().accept();
		Thread.sleep(1000);
		
		String expected = "Customer Successfully Delete!";
		String actual = myDriver.switchTo().alert().getText();
		
		myDriver.switchTo().alert().accept();
		Assert.assertEquals(actual, expected);
		Thread.sleep(2000);
	}
	
	@Test
	void TC_04_popUpWindows() throws Exception 
	{

		myDriver.get("https://demo.guru99.com/popup.php");
		Thread.sleep(2000);
		myDriver.manage().window().maximize();
		Thread.sleep(2000);

		myDriver.findElement(By.linkText("Click Here")).click();
		Thread.sleep(2000);
		String MainWindow = myDriver.getWindowHandle();

		Set<String> handles = myDriver.getWindowHandles();

		Iterator<String> handle_itr = handles.iterator();

		while (handle_itr.hasNext()) {
			String ChildWindow = handle_itr.next();
			if (!MainWindow.equalsIgnoreCase(ChildWindow)) {

				myDriver.switchTo().window(ChildWindow);
				Thread.sleep(2000);
				myDriver.findElement(By.name("emailid")).sendKeys("abcd@gmail.com");
				Thread.sleep(2000);
				myDriver.findElement(By.name("btnLogin")).click();
				Thread.sleep(1500);
			}

		}		
		String actual = myDriver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td/h2")).getText();
		String expected = "Access details to demo site.";
		Assert.assertEquals(actual, expected);
		Thread.sleep(2000);
		myDriver.close();
		
		Thread.sleep(2000);
		myDriver.switchTo().window(MainWindow);
	}
}