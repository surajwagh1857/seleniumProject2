package Selenium_2;

import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Driver;
import java.util.Iterator;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

public class Launch_program {
	
	static WebDriver driver=null;
	
	
	
public static void main(String[] args) throws Exception {
	
	System.setProperty("webdriver.chrome.driver", "E:\\Chrom_Driver\\chromedriver.exe");

	driver= new ChromeDriver();
	String baseUrl="https://demo.guru99.com/test/newtours/";
	driver.navigate().to(baseUrl);
	Thread.sleep(2000);
	driver.manage().window().maximize();
	
	WebElement register= driver.findElement(By.linkText("REGISTER"));
//	Actions builder=new Actions(driver);
//	org.openqa.selenium.interactions.Action right_click=builder.contextClick(register).build();
//	
//	right_click.perform();
//	
Robot robot=new Robot();
//	
//	for(int i=0;i<6;i++) {
//		robot.keyPress(KeyEvent.VK_DOWN);
//		robot.keyRelease(KeyEvent.VK_DOWN);
//	}
//	robot.keyPress(KeyEvent.VK_ENTER);
//	robot.keyRelease(KeyEvent.VK_ENTER);
	register(register);
	Thread.sleep(2000);
	add_details();
	Thread.sleep(2000);
	select_india();
	Thread.sleep(2000);
	click_submit();
	Thread.sleep(2000);
getFinal_Text();
	
	
	
	Thread.sleep(6000);

	//driver.close();
}
static void register(WebElement x) {

	Actions builder=new Actions(driver);
	
	org.openqa.selenium.interactions.Action Mouse_click=builder.moveToElement(x).click().build();
	Mouse_click.perform();	
}
static void add_details() {
	
	WebElement firstname= driver.findElement(By.name("firstName"));
	WebElement lastname = driver.findElement(By.name("lastName"));
	WebElement phone = driver.findElement(By.name("phone"));
	WebElement username = driver.findElement(By.name("userName"));
	
	Actions builder= new Actions(driver);
	Actions mouseclickOn_register=builder.moveToElement(firstname).click().sendKeys("suraj").
			
			sendKeys(Keys.TAB).sendKeys("wagh").sendKeys(Keys.TAB).sendKeys("9822682988").
			sendKeys(Keys.TAB).sendKeys("surajwagh1995@gmail.com");
	
	mouseclickOn_register.perform();
}

static void select_india() {
	
        WebElement countryList=driver.findElement(By.name("country"));
	
	Select drpCountry=new Select(countryList);
	
	drpCountry.selectByVisibleText("INDIA");	
}
static void click_submit() {
	WebElement submitBtn=driver.findElement(By.name("submit"));
	submitBtn.click();
	
}
static void getFinal_Text() {
	driver.get(driver.getCurrentUrl());

WebElement final_word=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[1]/font/b"));
	
	String text=final_word.getText();
	System.out.println("final_text--->"+text);
	
}

}
