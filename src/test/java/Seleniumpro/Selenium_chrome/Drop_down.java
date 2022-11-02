package Seleniumpro.Selenium_chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Chrom_Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(2000);
		driver.manage().window().maximize();

//		Select drpcountry=new Select(driver.findElement(By.name("country")));
//		
//              drpcountry.selectByVisibleText("INDIA");
//              Thread.sleep(2000);
//              drpcountry.selectByIndex(1);
//              Thread.sleep(2000);
//              System.out.println("dropdown by selectByVisibleText & selectByIndex");
//           
		driver.get("http://jsbin.com/osebed/2");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Banana");
		fruits.selectByIndex(1);
		System.out.println("dropdown multiple selection by selectByVisibleText & selectByIndex");

		driver.close();

	}
}