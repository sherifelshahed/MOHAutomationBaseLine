package NUR_Change_Password;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login2_HP {

	public void login_Edge(WebDriver driver) {
		try {

			Thread.sleep(4000);
		
		// Login to HP Web
		By username = By.id("user-id");
		driver.findElement(username).sendKeys("NURIPD01");

		By password = By.id("his-password");
		driver.findElement(password).sendKeys("egy456");

		By login_button = By.xpath("/html/body/app-root/app-common-login/div/div[2]/div[2]/form/button");
		driver.findElement(login_button).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(Change_Password.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	}


