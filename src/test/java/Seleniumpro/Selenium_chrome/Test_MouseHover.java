package Seleniumpro.Selenium_chrome;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class Test_MouseHover {
	WebDriver driver=null;
	WebElement link_home=null;
	WebElement td_home=null;
	
  @BeforeClass
  public void InitializationClass() throws Exception {
	  driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		 link_home= driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]"));
	 td_home= driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[1]"));
		
  }

  @BeforeTest
  public void getDriver() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Chrom_Driver\\chromedriver.exe");

		driver= new ChromeDriver();  
  }
  @Test
  public void Testmouse_Hover() throws Exception {
	  Actions builder=new Actions(driver);// step1
		 org.openqa.selenium.interactions.Action mousehoverHome= builder.moveToElement(td_home).build();// step2
		mousehoverHome.perform();
		Thread.sleep(2000);
		String bgCoulur1=link_home.getCssValue("background-color");
		String actualbgCoulur2=td_home.getCssValue("background-color");
		String expectedColour="rgba(0, 0, 0, 0)";
		
		Assert.assertEquals(actualbgCoulur2,expectedColour);
			
  }
  @AfterClass
  void closeDriver() {
	  driver.close();
  }
}
