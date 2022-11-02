package Seleniumpro.Selenium_chrome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio_chechbox {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Chrom_Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement Radiobtn1=driver.findElement(By.id("vfb-7-1"));
		WebElement Radiobtn2=driver.findElement(By.id("vfb-7-2"));
		WebElement Radiobtn3=driver.findElement(By.id("vfb-7-3"));
			
		WebElement checkbox1=driver.findElement(By.id("vfb-6-0"));
		WebElement checkbox2=driver.findElement(By.id("vfb-6-1"));
		WebElement checkbox3=driver.findElement(By.id("vfb-6-2"));
			
//		Radiobtn1.click();
//		Thread.sleep(2000);
//		Radiobtn2.click();
//		Thread.sleep(2000);
//		Radiobtn3.click();
//		Thread.sleep(2000);
//
//		
//		checkbox1.click();
//		Thread.sleep(2000);
//		checkbox2.click();
//		Thread.sleep(2000);
//	    checkbox3.click();
//		Thread.sleep(2000);
//		System.out.println("radio &check buttons are selected by individual click..!!");
		
		List<WebElement> elementList = driver.findElements(By.name("webform"));

		for (WebElement singleElement : elementList) {
			singleElement.click();
			Thread.sleep(2000);
			}
		System.out.println("radiobutton & checkbox clicked by for each loop..!!");
		driver.close();
		
		
		
		
		
	}
}
