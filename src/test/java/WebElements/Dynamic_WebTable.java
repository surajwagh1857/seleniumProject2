package WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_WebTable {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "E:\\Chrom_Driver\\chromedriver.exe");

			driver = new ChromeDriver();
		 driver.get("http://demo.guru99.com/test/web-table-element.php");
	  		Thread.sleep(2000);
	  		driver.manage().window().maximize();
	  		Thread.sleep(2000);
	  		Dynamic_Web_element();
	  		Thread.sleep(4000);
	  		driver.close();	
	  	
}
	static void Dynamic_Web_element() {
		List<WebElement>rows=driver.findElements(By.xpath("//table/tbody/tr"));
		List<WebElement>columns=driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
		
		WebElement Dynamic_webElement=driver.findElement(By.xpath("//table/tbody/tr[4]/td[4]"));
		
		String Dynamic_webElement_Name=Dynamic_webElement.getText();
		System.out.println("No of Rows ="+rows.size());
		System.out.println("No of columns ="+columns.size());
	System.out.println(" Dynamic_webElement_Name = "+Dynamic_webElement_Name);
}
}