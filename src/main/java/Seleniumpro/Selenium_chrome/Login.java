package Seleniumpro.Selenium_chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver",
			  "E:\\Chrom_Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/login/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	
	WebElement email= driver.findElement(By.id("email"));
	WebElement password= driver.findElement(By.id("pass"));

	WebElement login= driver.findElement(By.id("loginbutton"));

	
	
	email.sendKeys("surajwagh1995@gmail.com");
	password.sendKeys("9822682988");
	Thread.sleep(2000);
	
	login.click();
	
//	String actualurl="https://accounts.browserstack.com/confirmation";
//	
//	String expectedul=driver.getCurrentUrl();
//	
}
}
