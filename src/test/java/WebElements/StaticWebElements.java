package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebElements {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "E:\\Chrom_Driver\\chromedriver.exe");

			driver = new ChromeDriver();
		 driver.get("https://demo.guru99.com/test/write-xpath-table.html");
	  		Thread.sleep(2000);
	  		driver.manage().window().maximize();
	  		Thread.sleep(2000);
	  		Static_Web_element();
	  		Thread.sleep(4000);
	  		driver.close();	
	  	
}
	static void Static_Web_element() {
		
		//WebElement secondCell_absolute_Xpath=driver.findElement(By.xpath("/html/body/center/table/tbody/tr/td[2]"));
		WebElement secondCell_Relative_Xpath=driver.findElement(By.xpath("//*[text()=\"second cell\"]"));
		
		String sec_Cell_No=secondCell_Relative_Xpath.getText();
		
	System.out.println("Static webtable second cellNo= "+sec_Cell_No);
}
	}
