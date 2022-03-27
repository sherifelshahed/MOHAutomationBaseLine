package TestCases;

import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;
import DOC_Pages.*;
import DOC_Place_Lab_Order.*;
import DOC_Place_Rad_Order.*;
import DOC_Place_Rad_Order.SelectForm;
import Rad_Technician_Orders.*;
import Lab_Technician_Orders.*;
import Utilities.*;

public class GroupL {
	WebDriver driver;

	// IP_TC_693

	@Test(dataProvider = "test_data", priority = 1)
	public void navigate_to_Place_Lab_Order(String Patient_ID) {

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

		Place_Lab_Order order = new Place_Lab_Order();
		order.Physicians_order_Edge(driver);

//		driver.quit();
	}

	// IP_TC_520

	@Test(dataProvider = "test_data", priority = 2)
	public void navigate_to_Register_Lab_Order(String Patient_ID) {

		// System Property for IE Driver
		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", InterExploPath);

		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();

		Login_EM_Lab login = new Login_EM_Lab();
		login.login(driver);

		Select_Form_Lab form = new Select_Form_Lab();
		form.select_form(driver);

		Register_Lab_Order Order = new Register_Lab_Order();
		Order.register(driver, Patient_ID);

		driver.quit();
	}

	// IP_TC_694

	@Test(dataProvider = "test_data", priority = 3)
	public void navigate_to_Place_Rad_Order(String Patient_ID) {

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

		Place_Rad_Order order = new Place_Rad_Order();
		order.Physicians_order_Edge(driver);

//		driver.quit();
	}

	// IP_TC_522

	@Test(dataProvider = "test_data", priority = 3)
	public void navigate_to_Register_Rad_Order(String Patient_ID) {

		// System Property for IE Driver
		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", InterExploPath);

		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();

		Login_EM_Rad login = new Login_EM_Rad();
		login.login(driver);

		Select_Form_Rad form = new Select_Form_Rad();
		form.select_form(driver);

		Register_Rad_Order Order = new Register_Rad_Order();
		Order.register(driver, Patient_ID);

//		driver.quit();
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
