package NUR_Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NUR_Login_HP {

	public void login_Edge(WebDriver driver) {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Login to HP Web

		By username = By.id("user-id");
		driver.findElement(username).sendKeys("NURIPD01");

		By password = By.id("his-password");
		driver.findElement(password).sendKeys("egy123");

		By login_button = By.xpath("//*[@id=\"common-login\"]/div[2]/div[2]/form/button");
		driver.findElement(login_button).click();
	}

}
