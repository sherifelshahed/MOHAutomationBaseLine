package TestCases;

import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import CMO_Admit_Patient.CMO_Admit_and_Register_Patient;
import CMO_Cancel_Admission.*;
import CMO_Pages.*;

public class Group_Admit_Cancel_Admit extends CMO_Admit_and_Register_Patient {
	WebDriver driver;

	// test
	@Test(priority = 1)
	public void navigate_to_CMO_Admit_and_Register_Patient() {

		// System Property for IE Driver
		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", InterExploPath);

		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();

		CMO_Login_EM login = new CMO_Login_EM();
		login.login(driver);

		CMO_Select_Form form = new CMO_Select_Form();
		form.select_form(driver);

		CMO_Admit_and_Register_Patient admit = new CMO_Admit_and_Register_Patient();
		admit.admit_patient(driver);

		System.out.println("ID : " + PatientIDvalue);
	}

	// IP_TC_141_149_153_156_172_187

	@Test(dataProvider = "test_data", priority = 2)
	public void navigate_to_Cancel_Admission(String PatientIDvalue) {

		// System Property for IE Driver
		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", InterExploPath);

		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();

		CMO_Login_EM login = new CMO_Login_EM();
		login.login(driver);

		CMO_Select_Form form = new CMO_Select_Form();
		form.select_form(driver);

		Cancel_Admission admission = new Cancel_Admission();
		admission.cancel(driver, PatientIDvalue);

		driver.close();

	}

	@AfterTest
	public void close_browser() {
//		driver.close();
	}

	@DataProvider
	public String test_data() throws InvalidFormatException, IOException {

		CMO_Admit_and_Register_Patient obj = new CMO_Admit_and_Register_Patient();
		return obj.PatientIDvalue;
	}

}
