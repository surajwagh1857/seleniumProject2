package POM_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Test_Login  {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = null;
	System.setProperty("webdriver.chrome.driver", "E:\\Chrom_Driver\\chromedriver.exe");

	 driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/V4/");

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	
	Login_page lp=new Login_page(driver);
	lp.setUid("Suraj");
	lp.setPass("Suraj@123");
	lp.login();
	lp.validation();
	
}
}
