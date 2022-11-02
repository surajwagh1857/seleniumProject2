package Seleniumpro.Selenium_chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brows_launch {
    

	public static void main(String[] args) throws Exception{

		System.out.println("inside brouserLaunch class ......!!!");
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\Chrom_Driver\\chromedriver.exe");
		WebDriver myDriver = new ChromeDriver();
		//myDriver.get("https://www.facebook.com/");
		myDriver.navigate().to("https://www.facebook.com/");

		Thread.sleep(2000);
		myDriver.manage().window().maximize(); 
		Thread.sleep(2000);
		WebElement username = myDriver.findElement(By.id("email"));
		WebElement password = myDriver.findElement(By.id("pass"));
		WebElement loginButton = myDriver.findElement(By.name("login"));
		
		username.clear();
		password.clear();
		
		username.sendKeys("surajwagh1995@gmail.com");
		Thread.sleep(3000);
		password.sendKeys("9822682988");
		Thread.sleep(3000);
		loginButton.click();
		
		System.out.println("FaceBook login page success....!");
	
	}


  
  }

