package DOC_Reject_Order;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DOC_Login_HP {

	public void login_Edge(WebDriver driver) {
		driver.navigate().to("http://10.209.1.140/healthplug/#/user/leads");

//	 Login to HP Web

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		By username = By.id("user-id");
		driver.findElement(username).sendKeys("DOCIPD01");

		By password = By.id("his-password");
		driver.findElement(password).sendKeys("egy123");

		By login_button = By.xpath("/html/body/app-root/app-common-login/div/div[2]/div[2]/form/button");
		driver.findElement(login_button).click();

//		By Clinician = By.xpath("//*[@id=\"role_clinic\"]");
//		driver.findElement(Clinician).click();
//
//		By Continue = By.xpath("//*[@id=\"common-login\"]/div[2]/div[2]/div[3]/button");
//		driver.findElement(Continue).click();
	}

}
