package TestCases;

import NUR_Place_Order.*;
import Utilities.read_excel_data_HP;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import DOC_Assign_and_Approve_Order.*;
import DOC_Pages.DOC_Login_HP;
import NUR_Pages.NUR_Login_HP;
import NUR_Pages.NUR_Logout_HP;
import NUR_Pages.SelectPatientIP;

public class NUR_DOC_Assign_and_Approve_Order_Setup {

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
	public void navigate_to_DOC_Assign_and_Approve_Order(String Patient_ID) {

		NUR_Login_HP Login = new NUR_Login_HP();
		Login.login_Edge(driver);

		SelectPatientIP select_patient = new SelectPatientIP();
		select_patient.selectpatientIP_Edge(driver, Patient_ID);

		NUR_SelectForm Form = new NUR_SelectForm();
		Form.select_form(driver);

		NUR_Place_Order Nur_order = new NUR_Place_Order();
		Nur_order.Nurse_order_Edge(driver);

		NUR_Logout_HP logout = new NUR_Logout_HP();
		logout.logout_Edge(driver);

		DOC_Login_HP DOC_Login = new DOC_Login_HP();
		DOC_Login.login_Edge(driver);

		DOC_Assign_and_Approve_Order approve = new DOC_Assign_and_Approve_Order();
		approve.Physicians_approve_Edge(driver);
	}

//	@AfterTest
//	public void close() {
//		
//	}

	@DataProvider
	public String[][] test_data() throws InvalidFormatException, IOException {

		read_excel_data_HP obj = new read_excel_data_HP();
		return obj.read_sheet();
	}
}
