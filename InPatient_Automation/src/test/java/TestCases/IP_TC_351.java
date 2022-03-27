package TestCases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Discharge_Patient_Process.*;
import Utilities.*;

public class IP_TC_351 {
	WebDriver driver;

	@Test(dataProvider = "test_data", priority = 1)
	public void navigate_to_Initiate_discharge(String Patient_ID) {

		// System Property for Edge Driver
		System.setProperty("webdriver.edge.driver", "D:\\Automation testing tools\\Edgedriver\\msedgedriver.exe");
		// Initialize Edge Driver
		driver = new EdgeDriver();
		driver.navigate().to("http://10.209.1.140/healthplug/#/user/leads");
		driver.manage().window().maximize();

		DOC_Login_HP Login = new DOC_Login_HP();
		Login.login_Edge(driver);

		DOC_Initiate_Discharge in = new DOC_Initiate_Discharge();
		in.Initiate(driver, Patient_ID);

		driver.quit();

	}

	@Test(dataProvider = "test_data", priority = 2)
	public void navigate_to_Prepare_Discharge_Advice(String Patient_ID) {

		// System Property for IE Driver
		System.setProperty("webdriver.ie.driver",
				"D:\\Automation testing tools\\IEDriverServer\\IEDriver\\IE\\New folder\\IEDriverServer.exe");
		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();

		NUR_Login_EM login = new NUR_Login_EM();
		login.login(driver);

		NUR_Prepare_Discharge_Advice advice = new NUR_Prepare_Discharge_Advice();
		advice.Prepare_Discharge_Advice_Edge(driver, Patient_ID);

		driver.quit();
	}

	@Test(dataProvider = "test_data", priority = 3)
	public void navigate_to_Discharge_Summary(String Patient_ID) {

		// System Property for Edge Driver
		System.setProperty("webdriver.edge.driver", "D:\\Automation testing tools\\Edgedriver\\msedgedriver.exe");
		// Initialize Edge Driver
		driver = new EdgeDriver();
		driver.navigate().to("http://10.209.1.140/healthplug/#/user/leads");
		driver.manage().window().maximize();

		DOC_Login_HP Login = new DOC_Login_HP();
		Login.login_Edge(driver);

		DOC_Discharge_Summary summary = new DOC_Discharge_Summary();
		summary.Physicians_Discharge_Summary_Edge(driver, Patient_ID);

		driver.quit();

	}

	@Test(dataProvider = "test_data", priority = 4)
	public void navigate_to_ACC_Add_Service(String Patient_ID) {

		// System Property for IE Driver
		System.setProperty("webdriver.ie.driver",
				"D:\\Automation testing tools\\IEDriverServer\\IEDriver\\IE\\New folder\\IEDriverServer.exe");
		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();

		CMO_Login_EM login = new CMO_Login_EM();
		login.login(driver);

		ACC_AddSeparateService service = new ACC_AddSeparateService();
		service.Add_Separate_Service(driver, Patient_ID);

		driver.quit();
	}

	@Test(dataProvider = "test_data", priority = 5)
	public void navigate_to_Bill_Generation(String Patient_ID) {

		// System Property for IE Driver
		System.setProperty("webdriver.ie.driver",
				"D:\\Automation testing tools\\IEDriverServer\\IEDriver\\IE\\New folder\\IEDriverServer.exe");
		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();

		CMO_Login_EM login = new CMO_Login_EM();
		login.login(driver);

		CMO_Generate_Bill bill = new CMO_Generate_Bill();
		bill.generate_bill(driver, Patient_ID);

		driver.quit();
	}

	@Test(dataProvider = "test_data", priority = 6)
	public void navigate_to_Discharge_Patient(String Patient_ID) {

		// System Property for IE Driver
		System.setProperty("webdriver.ie.driver",
				"D:\\Automation testing tools\\IEDriverServer\\IEDriver\\IE\\New folder\\IEDriverServer.exe");
		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();

		CMO_Login_EM login = new CMO_Login_EM();
		login.login(driver);

		CMO_Discharge_Patient dis = new CMO_Discharge_Patient();
		dis.discharge_patient(driver, Patient_ID);

		driver.quit();
	}

	@AfterTest
	public void close_browser() {
//		driver.close();
	}

	@DataProvider
	public String[][] test_data() throws InvalidFormatException, IOException {

		read_excel_data_EM_GroupC obj = new read_excel_data_EM_GroupC();
		return obj.read_sheet();
	}

}
