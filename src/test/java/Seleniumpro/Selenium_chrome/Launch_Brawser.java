package Seleniumpro.Selenium_chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Brawser {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", 
			"E:\\Chrom_Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver(); 
	driver.get("https://demo.guru99.com/test/ajax.html");
	Thread.sleep(2000);
	
	driver.manage().window().maximize(); 
	Thread.sleep(2000);
	
	WebElement yesRadio=driver.findElement(By.id("yes"));
	 WebElement NoRadio=driver.findElement(By.id("no"));
	
	 WebElement resetBtn=driver.findElement(By.xpath("/html/body/iframe[2]"));
	 WebElement checkBtn=driver.findElement(By.id("buttoncheck"));
	 
	 WebElement desplayText=driver.findElement(By.xpath("/html/body/div[5]/form/p[3]"));
	 
	 yesRadio .click();
	 Thread.sleep(2000);
	 checkBtn.click();
	 Thread.sleep(2000);
	 //resetBtn.click();
	 //Thread.sleep(2000);
	 checkBtn.click();
	 Thread.sleep(2000);
	 NoRadio.click();
	 Thread.sleep(2000);
	 checkBtn.click();
	 Thread.sleep(2000);
	 
	 driver.close();
	 System.out.println("diplay ----------> "+desplayText.getText());
	// System.out.println("yes------->"+yesRadio.getAttribute("Value"));
	 driver.close();
	 
}
}
