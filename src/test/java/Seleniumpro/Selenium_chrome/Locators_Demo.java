package Seleniumpro.Selenium_chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Demo {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Chrom_Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//driver.get("https://demo.guru99.com/test/link.html");
		driver.get("https://www.makemytrip.com/railways/");
		driver.manage().window().maximize();

//		driver.findElement(By.linkText("click here")).click();
//		Thread.sleep(4000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/a[2]")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		driver.findElement(By.partialLinkText("Insurance")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
		
		WebElement homepage= driver.findElement(By.cssSelector("#SW > div.landingContainer > div.makeFlex.hrtlCenter.prependTop5.appendBottom40 > a > img"));
		homepage.click();
		
		Thread.sleep(2000);
		driver.navigate().forward();
		
		
		
		
		
		

	}
}
