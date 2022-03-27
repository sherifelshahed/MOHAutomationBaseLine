package Rad_Technician_Orders;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_EM_Rad {

	public void login(WebDriver driver) {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		By username = By.name("name");
		driver.findElement(username).sendKeys("LABIPD01");

		By password = By.name("password");
		driver.findElement(password).sendKeys("egy123");

		By loginButton = By.id("loginID");
		driver.findElement(loginButton).click();

		By OKButton = By.id("loginID");
		driver.findElement(OKButton).click();

	}
}
