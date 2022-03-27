package NUR_AssignBed_MarkPatientArrival;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Responsibility {
	public void responsibility(WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, 60);

//			Thread.sleep(10000);
//			Select Responsibility = new Select(driver.findElement(By.name("dhx_combo_list")));
//			Responsibility.selectByVisibleText("IPD Administration Office");
//
//			Thread.sleep(5000);
//
//			Select Facility = new Select(driver.findElement(By.name("dhx_selected_option")));
//			Facility.selectByVisibleText("El Zohour Hospital-UAT");

		By OKButton = By.id("loginID");
		driver.findElement(OKButton).click();

	}
}
