package DOC_Pages;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class DOC_SelectPatientIP {

	public void selectpatientIP(WebDriver driver, String Patient_ID) {

		try {
			// Search for patient

			Thread.sleep(6000);

			By searchText = By
					.xpath("/html/body/app-root/app-crm/div/div/app-crm-leads/app-crm-header/div/div/div[1]/input");
			driver.findElement(searchText).sendKeys(Patient_ID + Keys.ENTER);

			Thread.sleep(8000);

			// Select the patient
			By patientName = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-crm-leads/div[2]/div/div[2]/div/div/app-crm-patients-list/div/div[2]/div/div/div[1]");
			driver.findElement(patientName).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(DOC_SelectPatientIP.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
