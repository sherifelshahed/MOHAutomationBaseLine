package NUR_Change_Password;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login1_HP {

	public void login_Edge(WebDriver driver) {

		// Login to HP Web
		By username = By.id("user-id");
		driver.findElement(username).sendKeys("NURIPD01");

		By password = By.id("his-password");
		driver.findElement(password).sendKeys("egy123");

		By login_button = By.xpath("/html/body/app-root/app-common-login/div/div[2]/div[2]/form/button");
		driver.findElement(login_button).click();
	}

}
