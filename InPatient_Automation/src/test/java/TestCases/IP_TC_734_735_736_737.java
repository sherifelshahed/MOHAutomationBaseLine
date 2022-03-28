package TestCases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DOC_Pages.*;
import DOC_Save_as_draft_and_Submit_operation_note.*;
import Utilities.read_excel_data_HP;

public class IP_TC_734_735_736_737 {

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

	@Test(dataProvider = "test_data")
	public void navigate_to_Doctor_Submit_after_save_as_draft_Operation_Note(String Patient_ID) {

		DOC_Login_HP Login = new DOC_Login_HP();
		Login.login_Edge(driver);

		DOC_SelectPatientIP select_patient = new DOC_SelectPatientIP();
		select_patient.selectpatientIP(driver, Patient_ID);

		SelectForm_Operation_Note Form = new SelectForm_Operation_Note();
		Form.select_form(driver);

		Save_as_draft_operation_note note = new Save_as_draft_operation_note();
		note.Physicians_operation_note_Edge(driver);

		Submit_after_save_as_draft submit = new Submit_after_save_as_draft();
		submit.select_form(driver);
	}

	@AfterTest
	public void close() {
		driver.close();
	}

	@DataProvider
	public String[][] test_data() throws InvalidFormatException, IOException {

		read_excel_data_HP obj = new read_excel_data_HP();
		return obj.read_sheet();
	}
}
