package POM;

import org.openqa.selenium.WebDriver;

public class Test_pom_Login {
	
	public static void main(String[] args) throws Exception {
		Login_Pom lp=new Login_Pom();
		lp.setUserid("suraj123");
		lp.setPass("suraj@123");
		lp.login();
		lp.validation();
		}
	}

