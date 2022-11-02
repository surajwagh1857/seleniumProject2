package Selenium_2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice_takescreenshot {
	WebDriver driver;
  @Test
  public void take_screenshot() throws IOException {
	  
	  System.setProperty("webdriver.chrome.driver",
		      "E:\\Chrom_Driver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.infosys.com");
	  driver.manage().window().maximize();
	  
	  TakesScreenshot ts=( TakesScreenshot)driver;
	  File srsfile=ts.getScreenshotAs(OutputType.FILE);
	  File  destfile=new File("D:\\Users\\xyz.jpej");
	  
	  FileUtils.copyFileToDirectory(srsfile, destfile);
	  System.out.println("screenshot taken successfully...");
	  driver.close();
	  
	  
	  
  }
}
