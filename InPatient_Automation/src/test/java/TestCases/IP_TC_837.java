package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PCY_Pages.*;
import PCY_Transfer_Stock_Across_Facilities.Verify_Transfer_Stock_Across_Facilities;
//import PCY_Transfer_Stock_Across_Facilities.*;

public class IP_TC_837 {
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
	public void navigate_to_Pharmacist_Verify_Transfer_Stock_Across_Facilities() {

		Login_EM_Inventory_Management login = new Login_EM_Inventory_Management();
		login.login(driver);

		Verify_Transfer_Stock_Across_Facilities transfer = new Verify_Transfer_Stock_Across_Facilities();
		transfer.transfer_stock(driver);

	}

	@AfterTest
	public void close_browser() {
//		driver.close();
	}

}
