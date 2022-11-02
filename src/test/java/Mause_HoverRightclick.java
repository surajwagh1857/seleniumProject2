import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mause_HoverRightclick {
public static void main(String[] args) throws Exception {
	
	System.setProperty("webdriver.chrome.driver", "E:\\Chrom_Driver\\chromedriver.exe");

	WebDriver driver= new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	WebElement submitBtn=driver.findElement(By.name("submit"));
	
	Actions builder=new Actions(driver);
	
	org.openqa.selenium.interactions.Action click_submit=builder.moveToElement(submitBtn).contextClick().build();
	
	click_submit.perform();
	System.out.println("Action is performed...!!!");
}
}
