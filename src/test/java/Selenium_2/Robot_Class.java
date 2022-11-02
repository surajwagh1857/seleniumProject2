package Selenium_2;

import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Robot_Class {
	static WebDriver driver=null;
	static WebElement f_name=null;
public static void main(String[] args) throws Exception {
	robotMethod();
}
static void robotMethod() throws Exception {
	driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
	Thread.sleep(3000);
	 f_name = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"));
	new Actions(driver).click(f_name).sendKeys("ABCD").build().perform();
	
	int x = f_name.getLocation().getX();
	int y = f_name.getLocation().getY();
	Robot robot = new Robot();
	robot.mouseMove(x, y);
	robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
	robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
	
}
}
