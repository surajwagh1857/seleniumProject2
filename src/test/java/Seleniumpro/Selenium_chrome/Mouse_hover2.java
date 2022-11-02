package Seleniumpro.Selenium_chrome;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.internal.FindsByName;

public class Mouse_hover2 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Chrom_Driver\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		WebElement username= driver.findElement(By.name("userName"));
		WebElement submitbtn= driver.findElement(By.name("submit"));
		
		Actions builder=new Actions(driver);// step1
//		 org.openqa.selenium.interactions.Action mousehoverusername= builder.moveToElement(username).click().sendKeys("suraj").build();// step2
//		mousehoverusername.perform();
		Thread.sleep(2000);
		org.openqa.selenium.interactions.Action clicksumbit=builder.moveToElement(submitbtn).click().build();
		clicksumbit.perform();
		String textname=driver.getTitle();
		String actualurl=driver.getCurrentUrl();
		//String bgCoulur2=td_home.getCssValue("background-color");
		//System.out.println("Befor hover--->"+bgCoulur1);
		System.out.println("After hover--->"+textname);
		System.out.println("After hover--->"+actualurl);
		
		String expectedurl="https://demo.guru99.com/test/newtours/login_sucess.php";
		
		
		
		
		
}}
