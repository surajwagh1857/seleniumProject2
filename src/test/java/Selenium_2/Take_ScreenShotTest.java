package Selenium_2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Take_ScreenShotTest {
	 WebDriver driver;
  @Test
  public void takeScreenshot() throws IOException {
	  
	  
	  System.setProperty("webdriver.chrome.driver",
		      "E:\\Chrom_Driver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.infosys.com");
	  driver.manage().window().maximize();
	  
		
		  TakesScreenshot ts=( TakesScreenshot )driver; 
		  
		  File srcFile=ts.getScreenshotAs(OutputType.FILE);
		  
		  File destFile=new File("D:\\Users\\abcd.jpeg");
		  
		  
		  FileUtils.copyFile(srcFile, destFile);
		//  FileHandler.copy(srcFile, destFile);  this aproch also used...
		 System.out.println("screenshot captured successfully...");
	 driver.close();
	  
  }
}
