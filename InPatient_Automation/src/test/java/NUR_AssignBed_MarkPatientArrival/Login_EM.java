package NUR_AssignBed_MarkPatientArrival;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_EM {

	public void login(WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, 60);

		By username = By.name("name");
		driver.findElement(username).sendKeys("CMOIPD01");

		By password = By.name("password");
		driver.findElement(password).sendKeys("egy123");

		By loginButton = By.id("loginID");
		driver.findElement(loginButton).click();

	}
}
