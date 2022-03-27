package TestCases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import NUR_Pages.*;
import Utilities.read_excel_data_EM_GroupA;
import NUR_Newborn_Registration_For_Patient.*;

public class IP_TC_884 {
	WebDriver driver;

	@BeforeTest
	public void setup() {

		// System Property for IE Driver
		String InterExploPath = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", InterExploPath);

		// Initialize InternetExplorer
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://10.209.1.5:7777/HIS/eSM/jsp/login.jsp");
		driver.manage().window().maximize();
	}

	@Test(dataProvider = "test_data")
	public void navigate_to_Nurse_Register_New_Born_to_Admitted_Mother(String Patient_ID) {

		NUR_Login_EM login = new NUR_Login_EM();
		login.login(driver);

		NUR_Select_Form_EM form = new NUR_Select_Form_EM();
		form.select_form(driver);

		Nurse_Register_New_Born_to_Admitted_Mother registr = new Nurse_Register_New_Born_to_Admitted_Mother();
		registr.newborn_registration(driver, Patient_ID);

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