package Selenium_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_Xpath {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "E:\\Chrom_Driver\\chromedriver.exe");

			driver = new ChromeDriver();
		 driver.get("https://demo.guru99.com/test/newtours/register.php");
	  		Thread.sleep(2000);
	  		driver.manage().window().maximize();
	  		Thread.sleep(2000);
	  		elementBy_relative();
	  		Thread.sleep(4000);
	  		driver.close();
	}
static void elementBy_relative() {
	
	WebElement f_Name=driver.findElement(By.xpath("//input[@name=\"firstName\"]"));
	f_Name.sendKeys("suraj");
	WebElement l_Name=driver.findElement(By.xpath("//input[@name=\"lastName\"]"));
	l_Name.sendKeys("wagh");
	WebElement phone=driver.findElement(By.xpath("//*[@name='phone']"));
	phone.sendKeys("9822682988");
	WebElement address=driver.findElement(By.xpath("// input [@name=\"address1\"]"));
	address.sendKeys("khochi,kolhapur");
	WebElement submit=driver.findElement(By.xpath("//*[@name='submit']"));
	submit.click();
	System.out.println(" finding element by relative xpath & registration completed...");
}
}
