package POM_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
WebDriver driver;
	@FindBy(name="uid")
	private WebElement userId;

	@FindBy(name="password")
	private WebElement pass;
	
	@FindBy(name="btnLogin")
	private WebElement submit;
	
	
// we can inculcate encapsulation concept by using private data member and public 
	//constructor and public method declaration

		
public Login_page(WebDriver driver) {
	super();
	this.driver = driver;
	PageFactory.initElements(driver, this);

}

public void setUid(String uid) throws InterruptedException {
	userId.sendKeys(uid);
	Thread.sleep(2000);
}

public void setPass(String pwd) throws InterruptedException {
	 pass.sendKeys(pwd);
	 Thread.sleep(2000);
}
public void login () throws InterruptedException {
	submit.click();
	Thread.sleep(2000);
}

public void validation () {
	String actTxt= driver.switchTo().alert().getText();
	String expectedTxt="User or Password is not valid";
	driver.switchTo().alert().accept();
	
	if (actTxt.equals(expectedTxt)) {
		System.out.println("validation is successfull...!");
	}else {
		System.out.println("validation is unsuccessfull...!");
	}
	
	
}
	
}
