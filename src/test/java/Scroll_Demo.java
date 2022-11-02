import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Scroll_Demo {
	static WebDriver driver;
	 @BeforeClass
	void classInitialization()throws Exception
	{
		 System.setProperty("webdriver.chrome.driver", 
				 "E:\\Chrom_Driver\\chromedriver.exe");
		 driver.manage().window().maximize();
Thread.sleep(2000);
	}
  @Test
  public void Scroll_Window() throws Exception {
	 
	  driver.get("https://demo.guru99.com/test/guru99home/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
			  
			  
  }
}
