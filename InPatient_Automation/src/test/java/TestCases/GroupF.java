package TestCases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import NUR_Administer_Medication.Nurse_Record_Administer_Medication;
import NUR_Administer_Medication.Nurse_View_MAR_Chart;
import NUR_Charges_Patient_Issues.Nurse_Check_Dispense_Medication_UI;
import NUR_Charges_Patient_Issues.Nurse_Dispense_Medication;
import NUR_Pages.NUR_Login_EM;
import NUR_Pages.NUR_Select_Form_EM;
import NUR_Stock_Item_Consumption.Nurse_Record_Stock_Consumption;
import PCY_Cancel_Request.Cancel_request;
import PCY_Create_Review_Request.Create_Review_request;
import PCY_Issues_Return_Across_Facilities.Pharmacist_Issues_Return_Across_Facilities;
import PCY_Issues_Stock_To_Department.Stock_Item_Consumption;
import PCY_Pages.Login_EM_Inventory_Management;
import PCY_Pages.Login_EM_Pharmacy_Management;
import PCY_Scrappes_Medicine.Pharmacist_Scrappes_Medicine;
import PCY_Transfer_Stock_Across_Facilities.Verify_Transfer_Stock_Across_Facilities;
import Utilities.*;

public class GroupF {
	WebDriver driver;

	// IP_TC_687

	@Test(priority = 1)
	public void navigate_to_Nurse_View_MAR_Chart() {

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

		Nurse_View_MAR_Chart Medication = new Nurse_View_MAR_Chart();
		Medication.Medication(driver);

		driver.quit();
	}

	// IP_TC_685

	@Test(priority = 2)
	public void navigate_to_Nurse_Record_Administer_Medication() {

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

		Nurse_Record_Administer_Medication Medication = new Nurse_Record_Administer_Medication();
		Medication.Medication(driver);

		driver.quit();
	}

	// IP_TC_689

	@Test(priority = 3)
	public void navigate_to_Nurse_Record_Stock_Consumption() {

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

		Nurse_Record_Stock_Consumption Medication = new Nurse_Record_Stock_Consumption();
		Medication.Medication(driver);

		driver.quit();
	}

	// IP_TC_700

	@Test(priority = 4)
	public void navigate_to_Nurse_Check_Dispense_Medication_UI(String Patient_ID) {

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

		Nurse_Check_Dispense_Medication_UI UI = new Nurse_Check_Dispense_Medication_UI();
		UI.Medication(driver);

		driver.quit();
	}

	// IP_TC_696_701

	@Test(dataProvider = "test_data", priority = 5)

	public void navigate_to_Nurse_Dispense_Medication(String Patient_ID) {

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

		Nurse_Dispense_Medication Medication = new Nurse_Dispense_Medication();
		Medication.Medication(driver, Patient_ID);

		driver.quit();
	}

	// IP_TC_836

	@Test(dataProvider = "test_data", priority = 6)
	public void navigate_to_Stock_Item_Consumption(String Patient_ID) {

		// System Property for IE Driver
		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", InterExploPath);

		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();

		Login_EM_Inventory_Management login = new Login_EM_Inventory_Management();
		login.login(driver);

		Stock_Item_Consumption item = new Stock_Item_Consumption();
		item.stock_item(driver);

		driver.quit();
	}

	// IP_TC_837

	@Test(priority = 7)
	public void navigate_to_Verify_Transfer_Stock_Across_Facilities() {

		// System Property for IE Driver
		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", InterExploPath);

		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();

		Login_EM_Inventory_Management login = new Login_EM_Inventory_Management();
		login.login(driver);

		Verify_Transfer_Stock_Across_Facilities transfer = new Verify_Transfer_Stock_Across_Facilities();
		transfer.transfer_stock(driver);

		driver.quit();

	}

	// IP_TC_838

	@Test(priority = 8)
	public void navigate_to_Pharmacist_Issues_Return_Across_Facilities() {

		// System Property for IE Driver
		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", InterExploPath);

		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();

		Login_EM_Inventory_Management login = new Login_EM_Inventory_Management();
		login.login(driver);

		Pharmacist_Issues_Return_Across_Facilities isssue = new Pharmacist_Issues_Return_Across_Facilities();
		isssue.issue_return(driver);

		driver.quit();

	}

	// IP_TC_839

	@Test(priority = 9)
	public void navigate_to_navigate_to_Pharmacist_Scrappes_Medicine() throws InterruptedException {

		// System Property for IE Driver
		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", InterExploPath);

		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();

		Login_EM_Pharmacy_Management login = new Login_EM_Pharmacy_Management();
		login.login(driver);

		Pharmacist_Scrappes_Medicine med = new Pharmacist_Scrappes_Medicine();
		med.scrappes_medicine(driver);

		driver.quit();
	}

	// IP_TC_886

	@Test(priority = 10)
	public void navigate_to_Create_Review_request() throws InterruptedException {

		// System Property for IE Driver
		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", InterExploPath);

		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();

		Login_EM_Inventory_Management login = new Login_EM_Inventory_Management();
		login.login(driver);

		Create_Review_request create = new Create_Review_request();
		create.create_review(driver);

		driver.quit();

	}
	// IP_TC_887

	@Test(priority = 11)
	public void navigate_to_Cancel_request() throws InterruptedException {

		// System Property for IE Driver
		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", InterExploPath);

		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();

		Login_EM_Inventory_Management login = new Login_EM_Inventory_Management();
		login.login(driver);

		Cancel_request cancel = new Cancel_request();
		cancel.cancel(driver);

		driver.quit();

	}

	@AfterTest
	public void close_browser() {
//		driver.close();
	}

	@DataProvider
	public String[][] test_data() throws InvalidFormatException, IOException {

		read_excel_data_EM_GroupF obj = new read_excel_data_EM_GroupF();
		return obj.read_sheet();
	}

}
