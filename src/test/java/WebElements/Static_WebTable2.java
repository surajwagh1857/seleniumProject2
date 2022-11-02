package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_WebTable2 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "E:\\Chrom_Driver\\chromedriver.exe");

			driver = new ChromeDriver();
		 driver.get("https://demo.guru99.com/test/accessing-nested-table.html");
	  		Thread.sleep(2000);
	  		driver.manage().window().maximize();
	  		Thread.sleep(2000);
	  		Satic_Web_element();
	  		Thread.sleep(4000);
	  		driver.close();	
	  	
}
	static void Satic_Web_element() {
//WebElement first_cell_789abs_path=driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td"));
WebElement first_cell_789_relativepath=driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td"));

		String first_cell_789_relativepath_=first_cell_789_relativepath.getText();
		
	System.out.println("Table_element ="+first_cell_789_relativepath_);
		
		
		
}
}