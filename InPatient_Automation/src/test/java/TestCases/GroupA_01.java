package TestCases;

import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;
import CMO_AssignBed_MarkPatientArrival.*;
import CMO_Pages.*;
import NUR_Intra_Ward_Patient_Transfer.*;
import NUR_Pages.*;
import NUR_Transfer_Patient_In.*;
import NUR_Transfer_Patient_Out.*;
import Utilities.*;

public class GroupA_01 {
	WebDriver driver;

	@Test(priority = 1)
	public void navigate_to_Login() {

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

	}

	// IP_TC_188_197_218

	@Test(dataProvider = "test_data", priority = 2)
	public void navigate_to_Verify_Assign_Bed_UI(String Patient_ID) {

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

		Assign_Bed_Verify_Encounter_ID_hyperlink_is_working bed = new Assign_Bed_Verify_Encounter_ID_hyperlink_is_working();
		bed.assign_bed(driver, Patient_ID);

	}

	// IP_TC_270

	@Test(dataProvider = "test_data", priority = 3)
	public void navigate_to_Assign_Bed_Mark_Patient_Arrival(String Patient_ID) {

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

		Assign_Bed_Mark_Patient_Arrival bed = new Assign_Bed_Mark_Patient_Arrival();
		bed.assign_bed(driver, Patient_ID);

//		driver.close();

	}

	// IP_TC_577

	@Test(dataProvider = "test_data", priority = 4)
	public void navigate_to_Nurse_Check_Intra_Ward_Patient_Transfer_UI(String Patient_ID) {

		// System Property for IE Driver
		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", InterExploPath);

		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();

		NUR_Login_EM login = new NUR_Login_EM();
		login.login(driver);

		NUR_Select_Form_EM form = new NUR_Select_Form_EM();
		form.select_form(driver);

		Nurse_Check_Intra_Ward_Patient_Transfer_UI UI = new Nurse_Check_Intra_Ward_Patient_Transfer_UI();
		UI.transfer(driver, Patient_ID);

//		driver.close();

	}

	// IP_TC_578

	@Test(priority = 5)
	public void navigate_to_Nurse_Search_Intra_Ward_Patient_Transfer_by_Nursing_Unit() {

		// System Property for IE Driver
		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", InterExploPath);

		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();

		NUR_Login_EM login = new NUR_Login_EM();
		login.login(driver);

		NUR_Select_Form_EM form = new NUR_Select_Form_EM();
		form.select_form(driver);

		Nurse_Search_Intra_Ward_Patient_Transfer_by_Nursing_Unit search = new Nurse_Search_Intra_Ward_Patient_Transfer_by_Nursing_Unit();
		search.transfer(driver);

		driver.close();

	}

	// IP_TC_579

	@Test(dataProvider = "test_data", priority = 6)
	public void navigate_to_Nurse_Search_Intra_Ward_Patient_Transfer_by_Patient_ID(String Patient_ID) {

		// System Property for IE Driver
		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", InterExploPath);

		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();

		NUR_Login_EM login = new NUR_Login_EM();
		login.login(driver);

		NUR_Select_Form_EM form = new NUR_Select_Form_EM();
		form.select_form(driver);

		Nurse_Search_Intra_Ward_Patient_Transfer_by_Patient_ID search = new Nurse_Search_Intra_Ward_Patient_Transfer_by_Patient_ID();
		search.transfer(driver, Patient_ID);

		driver.close();

	}

	// IP_TC_580

	@Test(priority = 7)
	public void navigate_to_Nurse_Search_Intra_Ward_Patient_Transfer_by_Specialty() {

		// System Property for IE Driver
		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", InterExploPath);

		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();

		NUR_Login_EM login = new NUR_Login_EM();
		login.login(driver);

		NUR_Select_Form_EM form = new NUR_Select_Form_EM();
		form.select_form(driver);

		Nurse_Search_Intra_Ward_Patient_Transfer_by_Specialty search = new Nurse_Search_Intra_Ward_Patient_Transfer_by_Specialty();
		search.transfer(driver);

//		driver.close();

	}

	// IP_TC_581

	@Test(priority = 8)
	public void navigate_to_Nurse_Search_Intra_Ward_Patient_Transfer_by_Encounter_ID() {

		// System Property for IE Driver
		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", InterExploPath);

		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();

		NUR_Login_EM login = new NUR_Login_EM();
		login.login(driver);

		NUR_Select_Form_EM form = new NUR_Select_Form_EM();
		form.select_form(driver);

		Nurse_Search_Intra_Ward_Patient_Transfer_by_Encounter_ID search = new Nurse_Search_Intra_Ward_Patient_Transfer_by_Encounter_ID();
		search.transfer(driver);

//		driver.close();

	}

	// IP_TC_582

	@Test(priority = 9)
	public void navigate_to_Nurse_Search_Intra_Ward_Patient_Transfer_by_Admission_Date() {

		// System Property for IE Driver
		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", InterExploPath);

		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();

		NUR_Login_EM login = new NUR_Login_EM();
		login.login(driver);

		NUR_Select_Form_EM form = new NUR_Select_Form_EM();
		form.select_form(driver);

		Nurse_Search_Intra_Ward_Patient_Transfer_by_Admission_Date search = new Nurse_Search_Intra_Ward_Patient_Transfer_by_Admission_Date();
		search.transfer(driver);

//		driver.close();

	}

	// IP_TC_583

	@Test(priority = 10)
	public void navigate_to_Nurse_Search_Intra_Ward_Patient_Transfer_by_Practitioner() {

		// System Property for IE Driver
		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", InterExploPath);

		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();

		NUR_Login_EM login = new NUR_Login_EM();
		login.login(driver);

		NUR_Select_Form_EM form = new NUR_Select_Form_EM();
		form.select_form(driver);

		Nurse_Search_Intra_Ward_Patient_Transfer_by_Practitioner search = new Nurse_Search_Intra_Ward_Patient_Transfer_by_Practitioner();
		search.transfer(driver);

//		driver.close();

	}

	// IP_TC_584

	@Test(dataProvider = "test_data", priority = 11)
	public void navigate_to_Transfer_patients_within_the_same_nursing_unit(String Patient_ID) {

		// System Property for IE Driver
		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", InterExploPath);

		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();

		NUR_Login_EM login = new NUR_Login_EM();
		login.login(driver);

		NUR_Select_Form_EM form = new NUR_Select_Form_EM();
		form.select_form(driver);

		Nurse_Transfer_patients_within_the_same_nursing_unit trans = new Nurse_Transfer_patients_within_the_same_nursing_unit();
		trans.transfer(driver, Patient_ID);

//		driver.close();

	}

	// IP_TC_591

	@Test(dataProvider = "test_data", priority = 12)
	public void navigate_to_Nurse_Check_Transfer_Patient_Out_UI(String Patient_ID) {

		// System Property for IE Driver
		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", InterExploPath);

		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();

		NUR_Login_EM login = new NUR_Login_EM();
		login.login(driver);

		NUR_Select_Form_EM form = new NUR_Select_Form_EM();
		form.select_form(driver);

		Nurse_Check_Transfer_Patient_Out_UI UI = new Nurse_Check_Transfer_Patient_Out_UI();
		UI.transfer(driver, Patient_ID);

//		driver.close();

	}

	// IP_TC_598

	@Test(dataProvider = "test_data", priority = 13)
	public void navigate_to_Nurse_Transfer_patients_to_another_nursing_unit(String Patient_ID) {

		// System Property for IE Driver
		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", InterExploPath);

		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();

		NUR_Login_EM login = new NUR_Login_EM();
		login.login(driver);

		NUR_Select_Form_EM form = new NUR_Select_Form_EM();
		form.select_form(driver);

		Nurse_Transfer_patients_to_another_nursing_unit trans = new Nurse_Transfer_patients_to_another_nursing_unit();
		trans.transfer(driver, Patient_ID);

//		driver.close();

	}

	// IP_TC_847

	@Test(dataProvider = "test_data", priority = 14)
	public void navigate_to_Nurse_Receive_Patient_from_another_Nursing_Unit(String Patient_ID) {

		// System Property for IE Driver
		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", InterExploPath);

		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();

		NUR_Login_EM login = new NUR_Login_EM();
		login.login(driver);

		NUR_Select_Form_EM form = new NUR_Select_Form_EM();
		form.select_form(driver);

		Nurse_Receive_Patient_from_another_Nursing_Unit trans = new Nurse_Receive_Patient_from_another_Nursing_Unit();
		trans.transfer(driver, Patient_ID);

	}

	@AfterTest
	public void close_browser() {
//		driver.close();
	}

	@DataProvider
	public String[][] test_data() throws InvalidFormatException, IOException {

		read_excel_data_EM_GroupA obj = new read_excel_data_EM_GroupA();
		return obj.read_sheet();
	}

}