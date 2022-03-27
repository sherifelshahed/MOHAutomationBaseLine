package TestCases;

import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;
import DOC_Pages.*;
import DOC_Place_Rad_Order.SelectForm;
import DOC_Prescribe_Medications.Prescribe_Medications;
import PCY_Dispense_Medication.Deliver;
import PCY_Dispense_Medication.Fill;
import PCY_Dispense_Medication.Verification;
import PCY_Pages.Login_EM_IPD_Pharmacist;
import PCY_Pages.Login_EM_Pharmacy_Management;
import PCY_Return_Medication.Accept_Return_Medication;
import PCY_Return_Medication.Reject_Return_Medication;
import PCY_Stock_Availability_of_medications.Stock_Availability_of_medications;
import Utilities.*;

public class GroupM {
	WebDriver driver;

	// IP_TC_714

	@Test(dataProvider = "test_data", priority = 1)
	public void navigate_to_Prescribe_Medications(String Patient_ID) {

		// System Property for Edge Driver
		String EdgePath = System.getProperty("user.dir") + "\\Drivers\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", EdgePath);

		// Initialize Edge Driver
		driver = new EdgeDriver();
		driver.navigate().to("http://10.209.1.140/healthplug/#/user/leads");
		driver.manage().window().maximize();

		DOC_Login_HP Login = new DOC_Login_HP();
		Login.login_Edge(driver);

		DOC_SelectPatientIP select_patient = new DOC_SelectPatientIP();
		select_patient.selectpatientIP(driver, Patient_ID);

		SelectForm Form = new SelectForm();
		Form.select_form(driver);

		Prescribe_Medications Medication = new Prescribe_Medications();
		Medication.Physicians_Prescribe_Medications_Edge(driver);

//		driver.quit();
	}

	// IP_TC_842

	@Test(dataProvider = "test_data", priority = 2)
	public void navigate_to_Verification(String Patient_ID) {

		// System Property for IE Driver
		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", InterExploPath);

		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();

		Login_EM_IPD_Pharmacist login = new Login_EM_IPD_Pharmacist();
		login.login(driver);

		Verification dispense = new Verification();
		dispense.verification(driver, Patient_ID);

		driver.quit();
	}

	// IP_TC_846

	@Test(dataProvider = "test_data", priority = 3)
	public void navigate_to_Stock_Availability_of_medications(String Patient_ID) {

		// System Property for IE Driver
		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", InterExploPath);

		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();

		Login_EM_IPD_Pharmacist login = new Login_EM_IPD_Pharmacist();
		login.login(driver);

		Stock_Availability_of_medications stock = new Stock_Availability_of_medications();
		stock.Stock(driver, Patient_ID);

		driver.quit();
	}

	// IP_TC_843

	@Test(dataProvider = "test_data", priority = 4)
	public void navigate_to_Fill(String Patient_ID) {

		// System Property for IE Driver
		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", InterExploPath);

		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();

		Login_EM_IPD_Pharmacist login = new Login_EM_IPD_Pharmacist();
		login.login(driver);

		Fill dispense2 = new Fill();
		dispense2.fill(driver, Patient_ID);

//		driver.quit();
	}

	// IP_TC_845

	@Test(dataProvider = "test_data", priority = 5)
	public void navigate_to_Deliver(String Patient_ID) {

		// System Property for IE Driver
		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", InterExploPath);

		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();

		Login_EM_IPD_Pharmacist login = new Login_EM_IPD_Pharmacist();
		login.login(driver);

		Deliver dispense3 = new Deliver();
		dispense3.deliver(driver, Patient_ID);

		driver.quit();
	}

	// IP_TC_840

	@Test(dataProvider = "test_data", priority = 6)
	public void navigate_to_Accept_Return_Medication(String Patient_ID) {

		// System Property for IE Driver
		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", InterExploPath);

		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();

		Login_EM_Pharmacy_Management login = new Login_EM_Pharmacy_Management();
		login.login(driver);

		Accept_Return_Medication med = new Accept_Return_Medication();
		med.Medication(driver, Patient_ID);

		driver.quit();
	}

	// IP_TC_841

	@Test(dataProvider = "test_data", priority = 7)
	public void navigate_to_Reject_Return_Medication(String Patient_ID) {

		// System Property for IE Driver
		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", InterExploPath);

		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();

		Login_EM_Pharmacy_Management login = new Login_EM_Pharmacy_Management();
		login.login(driver);

		Reject_Return_Medication med = new Reject_Return_Medication();
		med.Medication(driver, Patient_ID);

		driver.quit();
	}

	@AfterTest
	public void close_browser() {
//		driver.close();
	}

	@DataProvider
	public String[][] test_data() throws InvalidFormatException, IOException {

		read_excel_data_HP obj = new read_excel_data_HP();
		return obj.read_sheet();
	}

}
