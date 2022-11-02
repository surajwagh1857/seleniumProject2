package Selenium_Pro.Selenium_Project;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByPartialLinkText;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Argument;

public class Scroll_Demo {
	static WebDriver driver;
  public static void main(String[] args) throws Exception {
	  System.setProperty("webdriver.chrome.driver", "E:\\Chrom_Driver\\chromedriver.exe");

		driver = new ChromeDriver();

	  Scroll_Window();
		//scroll_uptoVisible() ;
		//date_picker();
		Thread.sleep(2000);
    //driver.close();
  }
    public static void Scroll_Window() throws Exception {
   	 
  	  driver.get("https://demo.guru99.com/test/guru99home/");
  		Thread.sleep(2000);
  		driver.manage().window().maximize();
  		Thread.sleep(2000);
  		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("Window.scrollTo(0,document.body.scrollHeight)");
		//js.executeScript("window.scrollBy(2000,0)");//for horizontal scrolling...
			  
			  System.out.println("scrolled by executeScriptMethod...");
  }
    static void scroll_horizontal() throws InterruptedException {
    	driver.get("http://www.unipune.ac.in/");
  		Thread.sleep(2000);
  		driver.manage().window().maximize();
    	WebElement mh=driver.findElement(By.partialLinkText("Maharashtra Public"));
    }
    
    static void scroll_uptoVisible() throws InterruptedException {
    	driver.get("http://www.unipune.ac.in/");
  		Thread.sleep(2000);
  		driver.manage().window().maximize();
    	WebElement mh=driver.findElement(By.partialLinkText("Maharashtra Public"));
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].scrollIntoView()",mh);
    	
    	System.out.println("scrolled up to visible text element...");
    }
    static void date_picker() throws InterruptedException {
    	driver.get("https://demo.guru99.com/test/");
  		Thread.sleep(2000);
  		driver.manage().window().maximize();
  		Thread.sleep(2000);
  		
  		WebElement date_time=driver.findElement(By.xpath("/html/body/form/input[1]"));
  		date_time.sendKeys("2681995");
  		date_time.sendKeys(Keys.TAB);
  		date_time.sendKeys("1000");
  		
  		System.out.println("date and time filed successfully....");
    }
    
}
