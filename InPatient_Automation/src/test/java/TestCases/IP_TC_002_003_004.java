package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Outpatient_Refer_to_Admission.*;

public class IP_TC_002_003_004 {

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
	public void navigate_to_Refer_to_Admission() {

		Login_HP Login = new Login_HP();
		Login.login_Edge(driver);

		SelectPatientIP select_patient = new SelectPatientIP();
		select_patient.selectpatientIP_Edge(driver);

		SelectForm Form = new SelectForm();
		Form.select_form(driver);

		Refer_to_Admission refer = new Refer_to_Admission();
		refer.Physicians_Refer_to_Admission_Edge(driver);

	}

	@AfterTest
	public void close() {
//		driver.close();
	}
}
