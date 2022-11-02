package Seleniumpro.Selenium_chrome;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.apache.*;

public class Mause_hour {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "E:\\Chrom_Driver\\chromedriver.exe");

	WebDriver driver= new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	
	WebElement link_home= driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]"));
	WebElement td_home= driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[1]"));
	
	Actions builder=new Actions(driver);// step1
	 org.openqa.selenium.interactions.Action mousehoverHome= builder.moveToElement(td_home).build();// step2
	mousehoverHome.perform();
	Thread.sleep(2000);
	String bgCoulur1=link_home.getCssValue("background-color");
	String bgCoulur2=td_home.getCssValue("background-color");
	System.out.println("Befor hover--->"+bgCoulur1);
	System.out.println("After hover--->"+bgCoulur2);
	
	
	
	
	
}
}
