package Selenium_2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload {
	static WebDriver driver = null;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Chrom_Driver\\chromedriver.exe");

		driver = new ChromeDriver();

		// upload_file();
		// download_file();
		Alert_Handle();
		//popup_windows() ;
	}

	static void upload_file() throws Exception {
		driver.get("https://demo.guru99.com/test/upload/");
		Thread.sleep(2000);
		driver.manage().window().maximize();

		WebElement choose_file = driver.findElement(By.name("uploadfile_0"));
		choose_file.sendKeys("E:\\abc.txt");
		Thread.sleep(2000);

		WebElement checkbox = driver.findElement(By.id("terms"));
		checkbox.click();
		Thread.sleep(2000);

		WebElement submit = driver.findElement(By.id("submitbutton"));
		submit.click();

	}

	static void download_file() {

		driver.get("https://www.jenkins.io/download/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]/div/div/a[2]/span[2]")).click();

	}

	static void Alert_Handle() throws Exception {
		driver.get("http://demo.guru99.com/selenium/delete_customer.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("cusid")).sendKeys("123");
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();

		String massage = driver.switchTo().alert().getText();
		System.out.println("Alert Massage------> " + massage);
		driver.switchTo().alert().accept();

		String massage2 = driver.switchTo().alert().getText();
		System.out.println("Alert Massage---------> " + massage2);

	}

	static void popup_windows() throws Exception {

		driver.get("https://www.demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/p/a")).click();
		String main_window = driver.getWindowHandle();
		System.out.println("Main window-----> " + main_window);

		Set<String> handle = driver.getWindowHandles();

		Iterator<String> handle_itr = handle.iterator();

		while (handle_itr.hasNext()) {

			String childwindow = handle_itr.next();

			if (!main_window.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
				Thread.sleep(2000);
				driver.findElement(By.name("emailid")).sendKeys("surajwagh1995@gmail.com");

				driver.findElement(By.name("btnLogin")).click();

			}
		}
	}
}
