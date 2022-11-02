package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Pom {

	By userID = By.xpath("//input[@name=\"uid\"]");
	By password = By.xpath("//input[@name=\"password\"]");
	By login = By.xpath("//input[@name=\"btnLogin\"]");

	static WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver", "E:\\Chrom_Driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/V4/");

		driver.manage().window().maximize();
	}

	public void setUserid(String user) throws Exception {
		driver.findElement(userID).sendKeys(user);
		Thread.sleep(3000);
	}

	public void setPass(String pass) throws Exception {

		driver.findElement(password).sendKeys(pass);
		Thread.sleep(3000);
	}

	public void login() {

		driver.findElement(login).click();

	}

	public void validation() {
		String alt_text = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		String expected = "User or Password is not valid";
		if (expected.equals(alt_text)) {
			System.out.println("Validation  is successfull...!");
		} else {
			System.out.println("validation is unsuccessfull...! ");
		}
	}

	public static void main(String[] args) throws Exception {
		Login_Pom lp = new Login_Pom();
		lp.setUserid("suraj123");
		lp.setPass("suraj@123");
		lp.login();
		Thread.sleep(2000);
		lp.validation();
		

	}
}
