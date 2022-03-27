package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CMO_Admit_Patient.*;
import CMO_Pages.*;

public class IP_TC_053_054_055_056_059_061_070_071_073_074_077_079_081_083_093_094_095_098_099_100_102_110_119_122_127_129 {
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

	@Test
	public void navigate_to_CMO_Admit_and_Register_Patient() {

		CMO_Login_EM login = new CMO_Login_EM();
		login.login(driver);

		CMO_Select_Form form = new CMO_Select_Form();
		form.select_form(driver);

		CMO_Admit_and_Register_Patient admit = new CMO_Admit_and_Register_Patient();
		admit.admit_patient(driver);
	}

	@AfterTest
	public void close_browser() {
//		driver.close();
	}

}
