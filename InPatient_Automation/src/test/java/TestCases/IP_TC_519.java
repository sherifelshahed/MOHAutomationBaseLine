package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CMO_OPD_Create_consultation_visit.*;

public class IP_TC_519 {

	WebDriver driver;

	@BeforeTest
	public void setup() {
		// System Property for Edge Driver
		System.setProperty("webdriver.edge.driver", "D:\\Automation testing tools\\Edgedriver\\msedgedriver.exe");
		// Initialize Edge Driver
		driver = new EdgeDriver();
		driver.navigate().to("http://10.209.1.140/healthplug/#/user/leads");
		driver.manage().window().maximize();
	}

	@Test
	public void navigate_to_login() {

		Login_HP Login = new Login_HP();
		Login.login_Edge(driver);

		SelectForm Form = new SelectForm();
		Form.select_form(driver);

		Create_consultation_visit form = new Create_consultation_visit();
		form.select_form(driver);
	}

	@AfterTest
	public void close() {
//		driver.close();
	}
}
