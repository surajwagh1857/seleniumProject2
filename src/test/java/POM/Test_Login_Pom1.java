package POM;

import org.testng.annotations.Test;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
public class Test_Login_Pom1 {
	static WebDriver driver;
	
  @Test
  public void validation_Login() throws Exception {
	 driver.findElement(user)driver.
	
		
		String actualUrl = driver.getCurrentUrl();

		String expectedUrl = "https://demo.guru99.com/V4/index.php";
		System.out.println(actualUrl);
	    Assert.assertEquals(actualUrl, expectedUrl);
			

  }
 
 
}

