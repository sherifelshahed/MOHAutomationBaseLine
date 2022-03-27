package Discharge_Patient_Process;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NUR_Login_EM {

	public void login(WebDriver driver) {

		By username = By.name("name");
		driver.findElement(username).sendKeys("NURIPD01");

		By password = By.name("password");
		driver.findElement(password).sendKeys("egy123");

		By loginButton = By.id("loginID");
		driver.findElement(loginButton).click();
		
		By OKButton = By.id("loginID");
		driver.findElement(OKButton).click();

	}
}
