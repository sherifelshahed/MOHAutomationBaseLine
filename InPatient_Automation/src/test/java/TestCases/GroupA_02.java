package TestCases;

import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;

import CMO_Bed_Availability.Bed_Availability_in_different_Nursing_Units;
import CMO_Bed_Availability.Bed_Availability_in_different_bed_classes;
import CMO_Bed_Availability.Bed_Availability_in_different_bed_types;
import CMO_Cancel_Admission.*;
import CMO_Pages.*;
import NUR_Block_Bed.*;
import NUR_Newborn_Registration_For_Patient.*;
import NUR_Pages.*;
import NUR_Release_Blocked.*;
import NUR_Transfer_Bulk_practitioner.*;
import NUR_Transfer_Practitioner.*;
import NUR_Ward_Occupancy.*;
import Utilities.*;

public class GroupA_02 {
	WebDriver driver;

	// IP_TC_664

	@Test(priority = 15)
	public void navigate_to_Nurse_Newborn_Registration_for_inpatient_UI() {

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

		Nurse_Newborn_Registration_for_inpatient_UI UI = new Nurse_Newborn_Registration_for_inpatient_UI();
		UI.newborn_registration(driver);

		driver.close();

	}

	// IP_TC_671

	@Test(dataProvider = "test_data", priority = 16)
	public void navigate_to_Nurse_Newborn_Registration_for_inpatient_form_UI(String Patient_ID) {

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

		Nurse_Newborn_Registration_for_inpatient_form_UI UI = new Nurse_Newborn_Registration_for_inpatient_form_UI();
		UI.newborn_registration(driver, Patient_ID);

//		driver.close();

	}

	// IP_TC_884

	@Test(dataProvider = "test_data", priority = 17)
	public void navigate_to_Nurse_Register_New_Born_to_Admitted_Mother(String Patient_ID) {

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

		Nurse_Register_New_Born_to_Admitted_Mother registr = new Nurse_Register_New_Born_to_Admitted_Mother();
		registr.newborn_registration(driver, Patient_ID);

//		driver.close();

	}

	// IP_TC_634 sss

	@Test(dataProvider = "test_data", priority = 18)
	public void navigate_to_Nurse_Transfer_practitioner(String Patient_ID) {

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

		Nurse_Transfer_practitioner trans = new Nurse_Transfer_practitioner();
		trans.Transfer(driver, Patient_ID);

//		driver.close();

	}

	// IP_TC_635

	@Test(priority = 19)
	public void Nurse_Transfer_Bulk_practitioner() {

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

		Nurse_Transfer_Bulk_practitioner trans = new Nurse_Transfer_Bulk_practitioner();
		trans.Transfer(driver);

//		driver.close();

	}

	// IP_TC_883

	@Test(priority = 20)
	public void navigate_to_Check_Ward_Occupancy() {

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

		Check_Ward_Occupancy Bed = new Check_Ward_Occupancy();
		Bed.View_Ward_Occupancy(driver);

//		driver.close();

	}

	// IP_TC_605

	@Test(priority = 21)
	public void navigate_to_Nurse_Check_Block_Bed_UI() {

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

		Nurse_Check_Block_Bed_UI UI = new Nurse_Check_Block_Bed_UI();
		UI.bed(driver);

//		driver.close();

	}

	// IP_TC_606

	@Test(priority = 22)
	public void navigate_to_Nurse_Check_Block_Bed_with_all_data_required() {

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

		Nurse_Check_Block_Bed_with_all_data_required bed = new Nurse_Check_Block_Bed_with_all_data_required();
		bed.bed(driver);

//		driver.close();

	}

	// IP_TC_615

	@Test(priority = 23)
	public void navigate_to_Nurse_Check_Unblock_Bed_UI() {

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

		Nurse_Check_Unblock_Bed_UI UI = new Nurse_Check_Unblock_Bed_UI();
		UI.bed(driver);

	}

	// IP_TC_616

	@Test(priority = 24)
	public void navigate_to_Nurse_Release_Blocked_Bed() {

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

		Nurse_Release_Blocked_Bed bed = new Nurse_Release_Blocked_Bed();
		bed.bed(driver);

	}

	// IP_TC_013_030_031_036_051

	@Test(priority = 25)
	public void navigate_to_Availability_in_different_bed_classes() {

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

		Bed_Availability_in_different_bed_classes view = new Bed_Availability_in_different_bed_classes();
		view.View_Bed_Availability(driver);

//		driver.close();

	}

	// IP_TC_014

	@Test(priority = 26)
	public void navigate_to_Availability_in_different_bed_types() {

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

		Bed_Availability_in_different_bed_types view = new Bed_Availability_in_different_bed_types();
		view.View_Bed_Availability(driver);

//		driver.close();

	}

	// IP_TC_015_018_020_025_026

	@Test(priority = 27)
	public void navigate_to_Availability_in_different_Nursing_Units() {

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

		Bed_Availability_in_different_Nursing_Units view = new Bed_Availability_in_different_Nursing_Units();
		view.View_Bed_Availability(driver);

//		driver.close();

	}

	// IP_TC_141_149_153_156_172_187

	@Test(dataProvider = "test_data", priority = 28)
	public void navigate_to_Cancel_Admission(String Patient_ID) {

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
		admission.cancel(driver, Patient_ID);

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