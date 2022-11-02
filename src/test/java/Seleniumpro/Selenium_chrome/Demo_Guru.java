package Seleniumpro.Selenium_chrome;


	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.*;


	public class Demo_Guru {

		public static void main(String[] args) throws Exception
		{
			System.out.println("<<<<<<<Inside brouser launch class>>>>>>>>");
			
			
			  System.setProperty("webdriver.chrome.driver",
			  "E:\\Chrom_Driver\\chromedriver.exe");
			 
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.guru99.com/test/ajax.html");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			WebElement yesRadio=driver.findElement(By.id("yes"));
			WebElement noRadio=driver.findElement(By.id("no"));
			
			WebElement resetBtn=driver.findElement(By.xpath("/html/body/div[4]/form/p[2]/input[1]"));
			WebElement checkBtn=driver.findElement(By.id("buttoncheck"));
			WebElement displayText=driver.findElement(By.xpath("/html/body/div[4]/form/p[3]"));
			/*
			 * username.clear(); password.clear();
			 * 
			 * username.sendKeys("kn961391@gmail.com"); Thread.sleep(5000);
			 * password.sendKeys("8459@32700"); Thread.sleep(5000); loginButton.click();
			 */	
			
			yesRadio.click();
			checkBtn.click();
			Thread.sleep(2000);
			noRadio.click();
			checkBtn.click();
			Thread.sleep(2000);
			resetBtn.click();
			checkBtn.click();
			Thread.sleep(2000);
			checkBtn.click();
			System.out.println("display=>>>>"+displayText.getText());
			System.out.println("<<<<<<<<<<<Website login page is successfull>>>>>>>>");
			
			
			

		}

	}

