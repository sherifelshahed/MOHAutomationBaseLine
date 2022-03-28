package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import DOC_Pages.*;

public class IP_TC_715 {

	WebDriver driver;

	@BeforeTest
	public void setup() {

		// System Property for Edge Driver
		String EdgePath = System.getProperty("user.dir") + "\\Drivers\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", EdgePath);

		// Initialize Edge Driver
		driver = new EdgeDriver();
		driver.navigate().to("http://10.209.1.140/healthplug/#/user/leads");
		driver.manage().window().maximize();

	}

	@Test
	public void navigate_to_Doctor_login_HP() {

		DOC_Login_HP Login = new DOC_Login_HP();
		Login.login_Edge(driver);

		System.out.println("Doctor logged in on successfully and home page is displayed");

	}

	@AfterTest
	public void close() {
		driver.close();
	}
}
