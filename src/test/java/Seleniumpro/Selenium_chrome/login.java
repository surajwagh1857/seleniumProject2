package Seleniumpro.Selenium_chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
public static void main(String[] args) {
	System.out.println("in the login page...");
	System.getProperty("webdriver.chrome.driver", "E:\\Chrom_Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("surajwagh1995@gmail.com");
	driver.findElement(By.id("passContainer")).sendKeys("9822682988");
	driver.findElement(By.id("loginbutton")).click();
}
}
